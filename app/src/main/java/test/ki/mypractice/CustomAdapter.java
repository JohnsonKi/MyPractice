package test.ki.mypractice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    LayoutInflater layoutInflater = null;
    List<CustomFoodList> foodList;

    public CustomAdapter (Context context, List<CustomFoodList> data) {
        foodList = data;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public String getItem(int position) {
        return foodList.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.custom_list_one_row_item, null);
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "getView.");

        TextView conView1 = view.findViewById(R.id.custom_list_row_col1);
        conView1.setText(String.valueOf(foodList.get(position).getId()));

        TextView conView2 = view.findViewById(R.id.custom_list_row_col2);
        conView2.setText(foodList.get(position).getName());

        TextView conView3 = view.findViewById(R.id.custom_list_row_col3);
        conView3.setText(String.valueOf(foodList.get(position).getPrice()));

        return view;
    }
}
