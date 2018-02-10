package test.ki.mypractice;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Part2Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param_background_color";
    private static final String ARG_PARAM2 = "param_font_size";

    private String mParam1;
    private String mParam2;

    public Part2Fragment() {
    }

    public static Part2Fragment newInstance(String param1, String param2) {
        Part2Fragment fragment = new Part2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

            getActivity().findViewById(R.id.part2_layout)
                    .setBackgroundColor(Color.parseColor(mParam1));

            Typeface paramFont = Typeface.createFromAsset(getActivity().getAssets(), mParam2);
            TextView tv1 = getActivity().findViewById(R.id.part2_textview);
            tv1.setTypeface(paramFont);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_part2, container, false);
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
