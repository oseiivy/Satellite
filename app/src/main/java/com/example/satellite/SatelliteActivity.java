package com.example.satellite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SatelliteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satellite);
    }

    public void buttonClicked(View v)
    {
        EditText altitudeView = (EditText) findViewById(R.id.altitudeBox);
        String altitude = altitudeView.getText().toString();

        SatelliteModel myModel = new SatelliteModel(altitude);
        String orbitalPeriod = myModel.orbitalPeriod();

        ((TextView) findViewById(R.id.conversion)).setText(orbitalPeriod);

    }
}
