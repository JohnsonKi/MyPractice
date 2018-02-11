package test.ki.mypractice;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TopMenuFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    public TopMenuFragment() {
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

        View view =  inflater.inflate(R.layout.fragment_top_menu, container, false);

        Button btn1 = view.findViewById(R.id.top_btn_1);
        btn1.setOnClickListener(this);

        Button btn2 = view.findViewById(R.id.top_btn_2);
        btn2.setOnClickListener(this);

        Button btn3 = view.findViewById(R.id.top_btn_3);
        btn3.setOnClickListener(this);

        Button btn4 = view.findViewById(R.id.top_btn_4);
        btn4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.e("### DEBUG TAG ###", this.getClass().toString() + "onAttach.");

        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "onDetach.");
        mListener = null;
    }

    @Override
    public void onClick(View v) {

        if (null == mListener) {
            return;
        }

        int btn_id = v.getId();

        switch (btn_id) {
            case R.id.top_btn_1:
                mListener.onBtn1Click();
                break;
            case R.id.top_btn_2:
                mListener.onBtn2Click();
                break;
            case R.id.top_btn_3:
                mListener.onBtn3Click();
                break;
            case R.id.top_btn_4:
                mListener.onBtn4Click();
            default:
                break;
        }

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onBtn1Click();
        void onBtn2Click();
        void onBtn3Click();
        void onBtn4Click();
    }
}
