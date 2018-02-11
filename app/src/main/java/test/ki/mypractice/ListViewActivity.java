package test.ki.mypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    TextView titleView;

    private static final String[] names = {
            "あいうえお","有吉ジャポン","NHKニュース","中野ホール"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        if (savedInstanceState == null) {
            listView = this.findViewById(R.id.sample_list_1);
            titleView = this.findViewById(R.id.list_view_textview1);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_view_one_row_item, names);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                String item = (String) listView.getItemAtPosition(position);
                titleView.setText(item);
            }
        });
    }
}
