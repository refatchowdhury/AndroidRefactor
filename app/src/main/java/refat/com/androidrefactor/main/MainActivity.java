package refat.com.androidrefactor.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import refat.com.androidrefactor.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}
