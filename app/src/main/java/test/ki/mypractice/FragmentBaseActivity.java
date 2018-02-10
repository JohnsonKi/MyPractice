package test.ki.mypractice;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FragmentBaseActivity extends AppCompatActivity implements TopMenuFragment.OnFragmentInteractionListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_base);

        FragmentTransaction tran = getSupportFragmentManager().beginTransaction();

        TopMenuFragment tmf = new TopMenuFragment();
        tran.replace(R.id.top_menu_fragment, tmf, "top_menu");

        tran.commit();
    }

    @Override
    public void onBtn1Click() {
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "Top Menu Fragment onBtn1Click.");

        Part1Fragment p1 = new Part1Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.left_content_fragment, p1, "left_part1")
                .commit();

    }

    @Override
    public void onBtn2Click() {
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "Top Menu Fragment onBtn2Click.");

        Part2Fragment p2 = Part2Fragment.newInstance("#FF9872","fonts/Roboto-Regular.ttf");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.left_content_fragment, p2, "left_part2")
                .commit();
    }

    @Override
    public void onBtn3Click() {
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "Top Menu Fragment onBtn3Click.");
    }
}
