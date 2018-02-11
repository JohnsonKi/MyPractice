package test.ki.mypractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater = null;
    ArrayList<CustomFoodList> foodList;

    public CustomAdapter (Context cont) {
        context = cont;

        // 以下2種類のinflater作成方法同じです
//        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater = LayoutInflater.from(context);
    }

    public void setFoodList(ArrayList<CustomFoodList> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.custom_list_one_row_item, parent, false);

        TextView tv1 = convertView.findViewById(R.id.custom_list_row_col1);
        tv1.setText(String.valueOf(foodList.get(position).getId()));

        TextView tv2 = convertView.findViewById(R.id.custom_list_row_col2);
        tv2.setText(foodList.get(position).getName());

        TextView tv3 = convertView.findViewById(R.id.custom_list_row_col3);
        tv3.setText(foodList.get(position).getPrice());

        return convertView;
    }
}
