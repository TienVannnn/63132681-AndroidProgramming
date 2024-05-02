package tienlv.example_bottomnavigationview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigationView = findViewById(R.id.bnv);
        navigationView.setOnNavigationItemSelectedListener(xuLy);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener xuLy = item -> {
        Fragment selected = null;
        int idItem = item.getItemId();
        if(idItem == R.id.home){
            selected =  new HomeFragment();
        }
        else if(idItem == R.id.profile) selected = new ProfileFragment();
        else if(idItem == R.id.setting) selected = new SettingFragment();
        if(selected != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, selected).commit();
        }
        return true;
    };
}