package com.example.satellite;

public class SatelliteModel
{
    private String altitude;

    public SatelliteModel(String x)
    {
        this.altitude = x;
    }

    public String orbitalPeriod()
    {
        double K = 0.00995;
        double R = 6378.0;
        double A = Double.parseDouble(this.altitude);
        double P = K * (Math.pow((A + R), (1.5)));
        double hours = Math.floor((P/3600));
        double minutes = Math.floor((P - hours*3600)/ 60);
        double seconds = (((P - hours*3600)/60) - minutes) * 60  ;
        String secondconvert = String.format("%.1f", seconds);
        return(hours + " hours, " + minutes + " minutes, and " + secondconvert + " seconds");

    }
}

