package refat.com.androidrefactor.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import refat.com.androidrefactor.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);
    }
}
