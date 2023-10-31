package wolvesofwallstreet.UFS.ufsclinic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationBarView;

import wolvesofwallstreet.UFS.ufsclinic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ReplaceFragment(new DashboardFragment());
        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.btnDashboard:
                        ReplaceFragment(new DashboardFragment());
                        break;
                    case R.id.btnAppointment:
                        ReplaceFragment(new AppointmentsFragment());
                        break;
                    case R.id.btnNotifications:
                        ReplaceFragment(new NotificationsFragment());
                        break;
                    case R.id.btnSettings:
                        ReplaceFragment(new SettingsFragment());
                        break;
                }
                return true;
            }
        });
    }
    public void ReplaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_dashboard, fragment);
        fragmentTransaction.commit();
    }
}