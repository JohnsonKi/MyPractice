package test.ki.mypractice;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity implements View.OnClickListener {

    int menu_id = R.menu.actionbar_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);

        Toolbar toolbar_1 = this.findViewById(R.id.toolbar_1);
        setSupportActionBar(toolbar_1);

        findViewById(R.id.hide_actionbar).setOnClickListener(this);
        findViewById(R.id.show_actionbar).setOnClickListener(this);
        findViewById(R.id.change_actionbar_content).setOnClickListener(this);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(menu_id, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_1:
                Toast.makeText(this, "action1 selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_2:
                Toast.makeText(this, "action2 selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_3:
                Toast.makeText(this, "action3 selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
                Intent it = new Intent(this, MainActivity.class);
                this.startActivity(it);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {

        ActionBar toolbar = getSupportActionBar();

        int id = v.getId();
        switch (id) {
            case R.id.hide_actionbar:

                toolbar.hide();
                break;
            case R.id.show_actionbar:
                toolbar.show();
                break;
            case R.id.change_actionbar_content:
                menu_id = R.menu.actionbar_menu_extra;
                invalidateOptionsMenu();
                break;
            default:
                break;
        }
    }
}
