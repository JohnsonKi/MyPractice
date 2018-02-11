package test.ki.mypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    ListView listview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listview1 = findViewById(R.id.custom_list_1);

        ArrayList<CustomFoodList> foods = new ArrayList<>();

        CustomFoodList cf1 = new CustomFoodList();
        cf1.setId(Long.valueOf(1));
        cf1.setName("リンゴ");
        cf1.setPrice(345);
        foods.add(cf1);

        CustomFoodList cf2 = new CustomFoodList();
        cf2.setId(Long.valueOf(2));
        cf2.setName("バナナ");
        cf2.setPrice(129);
        foods.add(cf2);

        CustomAdapter customAdapter = new CustomAdapter(this);
        customAdapter.setFoodList(foods);
        customAdapter.notifyDataSetChanged();

        listview1.setAdapter(customAdapter);

        customAdapter.notifyDataSetChanged();
    }
}
