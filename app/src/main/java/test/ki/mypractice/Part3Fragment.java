package test.ki.mypractice;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Part3Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    private String mParam1;
    private String mParam2;
    private int mParam3;

    public Part3Fragment() {
    }

    public static Part3Fragment newInstance(String param1, String param2, int param3) {
        Part3Fragment fragment = new Part3Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getInt(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_part3, container, false);

        int screen_id = mParam3;

        if (screen_id < 1) {
            // childFragment 1
            int sc1 = screen_id + 1;
            Part3Fragment p1 = newInstance("#FE642E", "15", sc1);
            getChildFragmentManager().beginTransaction()
                    .add(R.id.child_area, p1, String.valueOf(sc1))
                    .commit();

            // childFragment 2
            int sc2 = screen_id + 2;
            Part3Fragment p2 = newInstance("#64FE2E", "15", sc2);
            getChildFragmentManager().beginTransaction()
                    .add(R.id.child_area, p2, String.valueOf(sc2))
                    .commit();

            // childFragment 3
            int sc3 = screen_id + 3;
            Part3Fragment p3 = newInstance("#2E64FE", "15", sc3);
            getChildFragmentManager().beginTransaction()
                    .add(R.id.child_area, p3, String.valueOf(sc3))
                    .commit();

        }

        TextView tv = view.findViewById(R.id.part3_textview);
        tv.setText(String.valueOf(screen_id));

        tv.setBackgroundColor(Color.parseColor(mParam1));
        Log.e(mParam1, String.valueOf(mParam3));

//        int colorId = ((screen_id & 1) == 1) ? android.R.color.holo_green_light : android.R.color.white;
//        view.setBackgroundColor(getResources().getColor(colorId));

        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
