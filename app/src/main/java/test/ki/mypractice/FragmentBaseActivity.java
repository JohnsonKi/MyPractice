package test.ki.mypractice;

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

        Part2Fragment p2 = Part2Fragment.newInstance("#FF9872","30");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.left_content_fragment, p2, "left_part2")
                .commit();
    }

    @Override
    public void onBtn3Click() {
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "Top Menu Fragment onBtn3Click.");

        Part3Fragment p3 = Part3Fragment.newInstance("#FFFF00", "20", 0);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.right_content_fragment, p3, "right_content_fragment")
                .commit();

    }

    @Override
    public void onBtn4Click() {
        Log.e("### DEBUG TAG ###", this.getClass().toString() + "Top Menu Fragment onBtn4Click.");

        Part4Fragment p4 = new Part4Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.right_content_fragment, p4, "right_part4")
                .commit();
    }
}
