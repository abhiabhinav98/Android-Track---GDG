package com.gdg.bhopal.gdgfeedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThankyouActivity extends AppCompatActivity {

    TextView thankyou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        thankyou = findViewById(R.id.thankyou);
        String name = getIntent().getStringExtra("name");
        thankyou.setText("Thank you "+name);

    }
}
