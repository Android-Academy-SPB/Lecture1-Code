package ru.androidacademy.spb.btcmainer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * @author Artur Vasilov
 */
public class SecondActivity extends AppCompatActivity {

    private static final String KEY_BTC = "KEY_BTC";

    public static void start(Activity activity, int btcCounter) {
        Intent secondActivityIntent = new Intent(activity, SecondActivity.class);
        secondActivityIntent.putExtra(KEY_BTC, btcCounter);
        activity.startActivity(secondActivityIntent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int btcCount = getIntent().getIntExtra(KEY_BTC, 0);
        String btc = String.valueOf(btcCount);
        Toast.makeText(this, btc, Toast.LENGTH_LONG).show();
    }
}
