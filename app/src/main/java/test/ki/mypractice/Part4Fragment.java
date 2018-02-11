package test.ki.mypractice;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class Part4Fragment extends ListFragment {

    public Part4Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_part4, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

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

        CustomAdapter customAdapter = new CustomAdapter(this.getActivity());
        customAdapter.setFoodList(foods);
        setListAdapter(customAdapter);
    }
}
