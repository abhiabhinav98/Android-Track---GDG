package com.gdg.bhopal.gdgfeedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button submitBtn;
    EditText edt;
    RatingBar rb;
    Spinner spin;
    RadioButton studentRB, professionalRB;
    EditText suggestion;
    SeekBar age;
    CheckBox cb;
    String occupation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = (Button)findViewById(R.id.subBtn);

        edt = (EditText)findViewById(R.id.nameEdit);
        rb = (RatingBar) findViewById(R.id.ratingBar);
        spin = (Spinner)findViewById(R.id.qualification);
        suggestion = (EditText)findViewById(R.id.suggest);
        age = (SeekBar)findViewById(R.id.age);
        cb = (CheckBox)findViewById(R.id.consent);
        studentRB = (RadioButton) findViewById(R.id.studentRB);
        professionalRB = (RadioButton) findViewById(R.id.professional);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edt.getText().toString();
                String suggest = suggestion.getText().toString();
                String qualif = spin.getSelectedItem().toString();
                if(studentRB.isChecked()){
                    occupation = "Student";
                }
                if(professionalRB.isChecked()){
                    occupation = "Professional";
                }
                int age1 = age.getProgress();
                boolean isAgree = cb.isChecked();
                int rating = rb.getNumStars();

                GDGFeedback gdg = new GDGFeedback(name, occupation, rating, suggest, age1, qualif, isAgree);

                Intent i = new Intent(MainActivity.this, ThankyouActivity.class);
                i.putExtra("name", edt.getText().toString());
                i.putExtra("feedback", gdg);
                startActivity(i);

            }
        });

    }
}
