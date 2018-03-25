package ru.androidacademy.spb.btcmainer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Artur Vasilov
 */
public class MainActivity extends AppCompatActivity {

    private int btcCounter = 0;

    private TextView btcText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcText = findViewById(R.id.btc_text);
        btcText.setText(R.string.initial_btc);

        Button addBtcButton = findViewById(R.id.add_btc_button);
        addBtcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btcCounter++;
                String btc = String.valueOf(btcCounter);
                btcText.setText(btc);
            }
        });
    }

    private void openSecondActivity() {
        SecondActivity.start(this, btcCounter);
    }
}


















