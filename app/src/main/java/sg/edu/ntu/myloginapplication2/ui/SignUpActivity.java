package sg.edu.ntu.myloginapplication2.ui;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

import sg.edu.ntu.myloginapplication2.R;
import sg.edu.ntu.myloginapplication2.db.DBOpenHelper;
import sg.edu.ntu.myloginapplication2.db.SqliteDbManager;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportActionBar().hide();

        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);
        TextView confirmPassword = (TextView) findViewById(R.id.confirm_password);
        MaterialButton signupButton = (MaterialButton) findViewById(R.id.signup_button);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText() != null && Objects.equals(confirmPassword.getText().toString(), password.getText().toString()) && password.getText().toString().matches("^(?![a-zA-Z]+$)(?!\\d+$)(?![^\\da-zA-Z\\s]+$).{12,}$")) {
                    SqliteDbManager.getInstance().insertUser(email.getText().toString(), password.getText().toString());
                    Toast.makeText(SignUpActivity.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(SignUpActivity.this, Tab_Navigation_Activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(v.getContext(), "Please enter password of at least 12 characters", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}