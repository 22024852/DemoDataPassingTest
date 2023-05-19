package sg.edu.rp.c346.id22024852.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv4 = findViewById(R.id.textView3);
        double value = getIntent().getDoubleExtra("value",99.99);
        tv4.setText("Double value received is " + value);
    }
}