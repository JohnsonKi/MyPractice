package test.ki.mypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity implements View.OnClickListener,ListView.OnItemClickListener {

    ListView listview1;
    CustomAdapter customAdapter;
    ArrayList<CustomFoodList> foods;
    TextView tv_SelectedShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listview1 = findViewById(R.id.custom_list_1);

        foods = new ArrayList<>();

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

        customAdapter = new CustomAdapter(CustomListViewActivity.this);
        customAdapter.setFoodList(foods);
        listview1.setAdapter(customAdapter);

        CustomFoodList cf3 = new CustomFoodList();
        cf3.setId(Long.valueOf(3));
        cf3.setName("オレンジ");
        cf3.setPrice(500);
        foods.add(cf3);

        CustomFoodList cf4 = new CustomFoodList();
        cf4.setId(Long.valueOf(4));
        cf4.setName("マンゴ");
        cf4.setPrice(290);
        foods.add(cf4);
        customAdapter.setFoodList(foods);
//        customAdapter.notifyDataSetChanged();

        tv_SelectedShow = this.findViewById(R.id.item_show);
        this.findViewById(R.id.add_item).setOnClickListener(this);
        this.findViewById(R.id.delete_item).setOnClickListener(this);
        listview1.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int btnId = v.getId();

        switch (btnId) {
            case R.id.add_item:

                CustomFoodList cf3 = new CustomFoodList();
                cf3.setId(Long.valueOf(foods.size() + 1));
                cf3.setName("オレンジ");
                cf3.setPrice(500);
                foods.add(cf3);

                break;
            case R.id.delete_item:
                foods.remove(foods.size() -1);
                break;
        }

        customAdapter.setFoodList(foods);
        customAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        ListView listView = (ListView) parent;

        // ここは、CustomeAdapterのgetItemが実装されます
        String item = (String) listView.getItemAtPosition(position);
        tv_SelectedShow.setText(item);
    }
}
