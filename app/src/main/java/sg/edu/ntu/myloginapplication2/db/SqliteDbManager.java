package sg.edu.ntu.myloginapplication2.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import java.util.Objects;

import sg.edu.ntu.myloginapplication2.ui.MainActivity;
import sg.edu.ntu.myloginapplication2.ui.Tab_Navigation_Activity;

public class SqliteDbManager {
    private static SqliteDbManager mInstance = null;
    private SQLiteDatabase mDb = null;
    private DBOpenHelper mDbHelper = null;

    public static SqliteDbManager getInstance() {
        if (mInstance == null) {
            mInstance = new SqliteDbManager();
        }
        return mInstance;
    }

    public void setSqliteDbOpen(Context context) {
        mDbHelper = new DBOpenHelper(context.getApplicationContext(), "users.db", null, 1);
        mDb = mDbHelper.getWritableDatabase();
    }

    public void insertUser(String email, String password) {
        openDb();
        ContentValues values = new ContentValues();
        values.put("email", email);
        values.put("password", password);
        mDb.insert("user", null, values);
        closeDb();
    }

    public boolean queryPassword(String email, String password) {
        openDb();
        Cursor rawQuery = mDb.rawQuery("select * from user where email=?", new String[]{email});
        boolean result = false;
        if (null != rawQuery) {
            while (rawQuery.moveToNext()) {
                @SuppressLint("Range") String password1 = rawQuery.getString(rawQuery.getColumnIndex("password"));
                result = result | Objects.equals(password1, password);
            }
            rawQuery.close();
        }
        closeDb();
        return result;
    }

    private void openDb() {
        if (this.mDbHelper != null) {
            try {
                mDb = mDbHelper.getWritableDatabase();
            } catch (Exception e) {
                mDb = mDbHelper.getReadableDatabase();
                e.printStackTrace();
            }
        }
    }

    private void closeDb() {
        try {
            if (mDb != null) {
                mDb.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
