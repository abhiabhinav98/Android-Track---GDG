package com.gdg.bhopal.gdgfeedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button submitBtn;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = (Button)findViewById(R.id.subBtn);
        edt = (EditText)findViewById(R.id.nameEdit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ThankyouActivity.class);
                i.putExtra("name", edt.getText().toString());
                startActivity(i);
            }
        });

    }
}
