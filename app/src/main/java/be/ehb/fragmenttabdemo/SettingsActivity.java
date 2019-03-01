package be.ehb.fragmenttabdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import be.ehb.fragmenttabdemo.utilities.SettingsFragment;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.settings_container, SettingsFragment.newInstance())
                .commit();
    }
}
