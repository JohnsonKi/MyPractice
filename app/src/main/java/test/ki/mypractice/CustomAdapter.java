package test.ki.mypractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    LayoutInflater layoutInflater = null;
    List<CustomFoodList> foodList;

    public CustomAdapter (Context context) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setFoodList(List<CustomFoodList> data) {
        this.foodList = data;
    }

    static class ViewHolder {

        TextView content1;
        TextView content2;
        TextView content3;

        ViewHolder(View view) {
            this.content1 = view.findViewById(R.id.custom_list_row_col1);
            this.content2 = view.findViewById(R.id.custom_list_row_col2);
            this.content3 = view.findViewById(R.id.custom_list_row_col3);
        }
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public String getItem(int position) {
        CustomFoodList food = foodList.get(position);
        String showStr = food.getId() + "-" + food.getName() + "(" + food.getPrice() + ")";
        return showStr;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.custom_list_one_row_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.content1.setText(String.valueOf(foodList.get(position).getId()));
        holder.content2.setText(String.valueOf(foodList.get(position).getName()));
        holder.content3.setText(String.valueOf(foodList.get(position).getPrice()));

        return convertView;
    }
}
