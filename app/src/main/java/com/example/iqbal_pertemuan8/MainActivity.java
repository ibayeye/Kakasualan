package com.example.iqbal_pertemuan8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation meowBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meowBottomNavigation = findViewById(R.id.bottomNavigation);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.adidas));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.nike));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.puma));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.nb));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.asics));


        meowBottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;

                switch (item.getId()){
                    case 1 :
                        fragment = new AdidasFragment();
                        break;
                    case 2 :
                        fragment = new NikeFragment();
                        break;
                    case 3 :
                        fragment = new PumaFragment();
                        break;
                    case 4 :
                        fragment = new NewBalanceFragment();
                        break;
                    case 5 :
                        fragment = new AsicsFragment();
                        break;
                }
                loadFragment(fragment);
            }

        });
        //default
        meowBottomNavigation.show(1, true);

        meowBottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(), " You Clicked " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }


}