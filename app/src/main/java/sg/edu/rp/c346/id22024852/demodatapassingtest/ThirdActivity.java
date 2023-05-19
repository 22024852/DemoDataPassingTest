package sg.edu.rp.c346.id22024852.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvDisplay = findViewById(R.id.textView3);
        char value = getIntent().getCharExtra("value", 'a');
        tvDisplay.setText("Character value received is: "+ value);


    }
}