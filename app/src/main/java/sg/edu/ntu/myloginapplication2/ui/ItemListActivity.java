package sg.edu.ntu.myloginapplication2.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import sg.edu.ntu.myloginapplication2.R;
import sg.edu.ntu.myloginapplication2.adapter.ListAdapter;

public class ItemListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.gallery), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportActionBar().hide();
        ListView listView = findViewById(R.id.list_view);

        Intent intent = getIntent();
        String item = intent.getStringExtra("item");
        List<Integer> imageList = this.getImageList(item);
        List<Integer> audioList = this.getAudioList(item);
        List<String> nameList = this.getNameList(item);
        List<String> priceList = this.getPriceList(item);
        boolean canBuy = this.isCanBuy(item);
        ListAdapter adapter = new ListAdapter(this, nameList, priceList, imageList, audioList, canBuy);

        listView.setAdapter(adapter);

    }

    private List<Integer> getImageList(String item) {
        List<Integer> list = new ArrayList<>();
        switch (item) {
            case "UK":
                list.add(R.drawable.self_portrait);
                list.add(R.drawable.starry_night);
                list.add(R.drawable.sunflowers);
                list.add(R.drawable.the_bedroom);
                list.add(R.drawable.wheatfield);
                break;

            case "Ode":
                list.add(R.drawable.streetmarket_1);
                list.add(R.drawable.coffee2);
                list.add(R.drawable.abundant_loads3);
                list.add(R.drawable.oldriver4);
                list.add(R.drawable.huaji5);
                break;

            case "Ning":
                list.add(R.drawable.mess);
                list.add(R.drawable.firstlove);
                list.add(R.drawable.daydream);
                list.add(R.drawable.graffiti);
                break;

            case "wheat":
                list.add(R.drawable.wheatfield);
                break;

            case "old":
                list.add(R.drawable.oldriver4);
                break;

            case "harvest":
                list.add(R.drawable.season_of_harvest);
                break;

            default:
                for (int i = 0; i < 10; i++) {
                    list.add(R.drawable.wheatfield);
                }
                break;

            case "van":
                list.add(R.drawable.self_portrait);
                list.add(R.drawable.starry_night);
                list.add(R.drawable.sunflowers);
                list.add(R.drawable.the_bedroom);
                list.add(R.drawable.wheatfield);
                break;

            case "lim":
                list.add(R.drawable.streetmarket_1);
                list.add(R.drawable.coffee2);
                list.add(R.drawable.abundant_loads3);
                list.add(R.drawable.oldriver4);
                list.add(R.drawable.huaji5);
                break;

            case "ning":
                list.add(R.drawable.mess);
                list.add(R.drawable.firstlove);
                list.add(R.drawable.daydream);
                list.add(R.drawable.graffiti);
                break;

            case "post":
                list.add(R.drawable.self_portrait);
                list.add(R.drawable.starry_night);
                list.add(R.drawable.sunflowers);
                list.add(R.drawable.the_bedroom);
                list.add(R.drawable.wheatfield);
                break;

            case "expressionist":
                list.add(R.drawable.streetmarket_1);
                list.add(R.drawable.coffee2);
                list.add(R.drawable.abundant_loads3);
                list.add(R.drawable.oldriver4);
                list.add(R.drawable.huaji5);
                break;

            case "abstract":
                list.add(R.drawable.mess);
                list.add(R.drawable.firstlove);
                list.add(R.drawable.daydream);
                list.add(R.drawable.graffiti);
                break;

            case "europe":
            list.add(R.drawable.self_portrait);
            list.add(R.drawable.starry_night);
            list.add(R.drawable.sunflowers);
            list.add(R.drawable.the_bedroom);
            list.add(R.drawable.wheatfield);
            break;

            case "asia":
                list.add(R.drawable.streetmarket_1);
                list.add(R.drawable.coffee2);
                list.add(R.drawable.abundant_loads3);
                list.add(R.drawable.oldriver4);
                list.add(R.drawable.huaji5);
                list.add(R.drawable.mess);
                list.add(R.drawable.firstlove);
                list.add(R.drawable.daydream);
                list.add(R.drawable.graffiti);
                break;
        }
        return list;
    }

    private List<Integer> getAudioList(String item) {
        List<Integer> list = new ArrayList<>();
        switch (item) {
            case "UK":
                list.add(R.raw.selfportrait);
                list.add(R.raw.starry_night);
                list.add(R.raw.sunflower);
                list.add(R.raw.bedroom);
                list.add(R.raw.wheat);
                break;

            case "Ode":
                list.add(R.raw.lim1);
                list.add(R.raw.coffee2);
                list.add(R.raw.abundant_loads3);
                list.add(R.raw.oldriver4);
                list.add(R.raw.huaji5);
                break;

            case "Ning":
                list.add(R.raw.mess1);
                list.add(R.raw.firstlove2);
                list.add(R.raw.daydream3);
                list.add(R.raw.graffi4);
                break;

            case "wheat":
                list.add(R.raw.wheat);
                break;

            case "old":
                list.add(R.raw.oldriver4);
                break;

            case "harvest":
                list.add(R.raw.wheat);
                break;

            case "van":
                list.add(R.raw.selfportrait);
                list.add(R.raw.starry_night);
                list.add(R.raw.sunflower);
                list.add(R.raw.bedroom);
                list.add(R.raw.wheat);
                break;

            case "lim":
                list.add(R.raw.lim1);
                list.add(R.raw.coffee2);
                list.add(R.raw.abundant_loads3);
                list.add(R.raw.oldriver4);
                list.add(R.raw.huaji5);
                break;

            case "ning":
                list.add(R.raw.mess1);
                list.add(R.raw.firstlove2);
                list.add(R.raw.daydream3);
                list.add(R.raw.graffi4);
                break;

            case "post":
                list.add(R.raw.selfportrait);
                list.add(R.raw.starry_night);
                list.add(R.raw.sunflower);
                list.add(R.raw.bedroom);
                list.add(R.raw.wheat);
                break;

            case "expressionist":
                list.add(R.raw.lim1);
                list.add(R.raw.coffee2);
                list.add(R.raw.abundant_loads3);
                list.add(R.raw.oldriver4);
                list.add(R.raw.huaji5);
                break;

            case "abstract":
                list.add(R.raw.mess1);
                list.add(R.raw.firstlove2);
                list.add(R.raw.daydream3);
                list.add(R.raw.graffi4);
                break;

            case "europe":
                list.add(R.raw.selfportrait);
                list.add(R.raw.starry_night);
                list.add(R.raw.sunflower);
                list.add(R.raw.bedroom);
                list.add(R.raw.wheat);
                break;

            case "asia":
                list.add(R.raw.lim1);
                list.add(R.raw.coffee2);
                list.add(R.raw.abundant_loads3);
                list.add(R.raw.oldriver4);
                list.add(R.raw.huaji5);
                list.add(R.raw.mess1);
                list.add(R.raw.firstlove2);
                list.add(R.raw.daydream3);
                list.add(R.raw.graffi4);
                break;

            default:
                for (int i = 0; i < 10; i++) {
                    list.add(R.raw.wheat);
                }
                break;
        }
        return list;
    }

    private List<String> getNameList(String item) {
        List<String> list = new ArrayList<>();
        switch (item) {
            case "UK":
                list.add("Self Portrait");
                list.add("Starry Night over the Rhône");
                list.add("Sunflowers");
                list.add("The Bedroom");
                list.add("A wheatfield with Cypresses");
                break;
            case "Ode":
                list.add("Street Market Wholesalers");
                list.add("Coffee Shop At China Town");
                list.add("Abundant Loads");
                list.add("Old River");
                list.add("Hua Ji");
                break;
            case "Ning":
                list.add("Mess Around");
                list.add("First Love");
                list.add("Daydream");
                list.add("Graffiti");
                break;
            case "wheat":
                list.add("A wheatfield with Cypresses");
                break;

            case "old":
                list.add("Old River");
                break;

            case "harvest":
                list.add("Season Of Harvest");
                break;

            case "van":
                list.add("Self Portrait");
                list.add("Starry Night over the Rhône");
                list.add("Sunflowers");
                list.add("The Bedroom");
                list.add("A wheatfield with Cypresses");
                break;

            case "lim":
                list.add("Street Market Wholesalers");
                list.add("Coffee Shop At China Town");
                list.add("Abundant Loads");
                list.add("Old River");
                list.add("Hua Ji");
                break;
            case "ning":
                list.add("Mess Around");
                list.add("First Love");
                list.add("Daydream");
                list.add("Graffiti");
                break;
            case "post":
                list.add("Self Portrait");
                list.add("Starry Night over the Rhône");
                list.add("Sunflowers");
                list.add("The Bedroom");
                list.add("A wheatfield with Cypresses");
                break;

            case "expressionist":
                list.add("Street Market Wholesalers");
                list.add("Coffee Shop At China Town");
                list.add("Abundant Loads");
                list.add("Old River");
                list.add("Hua Ji");
                break;
            case "abstract":
                list.add("Mess Around");
                list.add("First Love");
                list.add("Daydream");
                list.add("Graffiti");
                break;
            case "europe":
                list.add("Self Portrait");
                list.add("Starry Night over the Rhône");
                list.add("Sunflowers");
                list.add("The Bedroom");
                list.add("A wheatfield with Cypresses");
                break;

            case "asia":
                list.add("Street Market Wholesalers");
                list.add("Coffee Shop At China Town");
                list.add("Abundant Loads");
                list.add("Old River");
                list.add("Hua Ji");
                list.add("Mess Around");
                list.add("First Love");
                list.add("Daydream");
                list.add("Graffiti");
                break;

            default:
                for (int i = 0; i < 10; i++) {
                    list.add("wheatfield");
                }
                break;
        }

        return list;
    }

    private List<String> getPriceList(String item) {
        List<String> list = new ArrayList<>();
        switch (item) {
            case "UK":
                list.add("100USD");
                list.add("100USD");
                list.add("100USD");
                list.add("100USD");
                list.add("100USD");
                list.add("100USD");
                break;
            case "Ning":
                list.add("100SGD");
                list.add("500SGD");
                list.add("200SGD");
                list.add("150SGD");
            case "ning":
                list.add("100SGD");
                list.add("500SGD");
                list.add("200SGD");
                list.add("150SGD");
            case "abstract":
                list.add("100SGD");
                list.add("500SGD");
                list.add("200SGD");
                list.add("150SGD");
            default:
                for (int i = 0; i < 10; i++) {
                    list.add("100SGD");
                }
                break;
        }
        return list;
    }

    private boolean isCanBuy(String item) {
        boolean canBuy;
        switch (item) {
            case "UK":
                canBuy = false;
                break;
            case "Ode":
                canBuy = false;
                break;
            case "wheat":
                canBuy = false;
                break;
            case "old":
                canBuy = false;
                break;
            case "harvest":
                canBuy = false;
                break;
            case "van":
                canBuy = false;
                break;
            case "lim":
                canBuy = false;
                break;
            case "post":
                canBuy = false;
                break;
            case "expressionist":
                canBuy = false;
                break;
            case "europe":
                canBuy = false;
                break;
            case "asia":
                canBuy = false;
                break;

            default:
                canBuy = true;
        }
        return canBuy;
    }
}