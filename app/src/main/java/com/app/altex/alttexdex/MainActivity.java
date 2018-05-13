package com.app.altex.alttexdex;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.app.altex.alttexdex.fragments.HistoryFragment;
import com.app.altex.alttexdex.fragments.ProfileFragment;
import com.app.altex.alttexdex.fragments.RechangeFragment;
import com.app.altex.alttexdex.fragments.SettingsFragment;
import com.app.altex.alttexdex.fragments.WalletsFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            findViewById(R.id.mainLO).setBackground(getDrawable(R.drawable.bckg));
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_wallets: {
                    fragment = new WalletsFragment();
                    break;
                }
                case R.id.navigation_rechange: {
                    fragment = new RechangeFragment();
                    break;
                }
                case R.id.navigation_history: {
                    fragment = new HistoryFragment();
                    break;
                }
                case R.id.navigation_profile: {
                    fragment = new ProfileFragment();
                    break;
                }
                case R.id.navigation_settings: {
                    fragment = new SettingsFragment();
                    break;
                }
            }

            if(fragment!=null){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();
                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
