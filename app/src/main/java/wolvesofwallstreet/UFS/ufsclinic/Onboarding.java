package wolvesofwallstreet.UFS.ufsclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageSwitcher;

public class Onboarding extends AppCompatActivity {
    private ImageSwitcher imgSwitcher;
    private Button btnSkipTour, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        imgSwitcher = findViewById(R.id.imgSwitcherONB);
        btnSkipTour = findViewById(R.id.btnSkipTour);
        btnNext = findViewById(R.id.btnNext);
    }
}