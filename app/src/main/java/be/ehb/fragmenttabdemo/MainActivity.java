package be.ehb.fragmenttabdemo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import be.ehb.fragmenttabdemo.utilities.AgendaTabAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wat zit er in het scherm
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TabLayout tabLayout = findViewById(R.id.main_tabs);
        ViewPager viewPager = findViewById(R.id.main_viewpager);

        //actionbar laten werken
        setSupportActionBar(toolbar);

        //tabs laten werken
        //1 - adapter om viewpager te vullen
        AgendaTabAdapter adapter = new AgendaTabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        //2 viewpager gebruiken om tablayout in te stellen
        tabLayout.setupWithViewPager(viewPager);



    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mi_settings) {
            Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
