package test.ki.mypractice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.to_feature_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("### DEBUG TAG ###", this.getClass().toString() + " onClick. ");

                Context ct = v.getContext();

                Intent it = new Intent(ct, FragmentBaseActivity.class);
                ct.startActivity(it);

            }
        });
    }
}
