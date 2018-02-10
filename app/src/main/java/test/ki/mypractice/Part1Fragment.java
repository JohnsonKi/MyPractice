package test.ki.mypractice;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Part1Fragment extends Fragment {

    public Part1Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "onCreate.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "onCreateView.");
        return inflater.inflate(R.layout.fragment_part1, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "onAttach.");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "onDetach.");
    }
}
