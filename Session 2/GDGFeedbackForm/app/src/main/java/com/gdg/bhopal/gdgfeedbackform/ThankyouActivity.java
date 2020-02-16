package com.gdg.bhopal.gdgfeedbackform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ThankyouActivity extends AppCompatActivity {

    TextView thankyou;
    ArrayList<GDGFeedback> gfList;
    RecyclerView rc;
    FeedbackAdapter fadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        thankyou = findViewById(R.id.thankyou);
        String name = getIntent().getStringExtra("name");
        thankyou.setText("Thank you "+name);
        gfList = new ArrayList<GDGFeedback>();
        //String name = getIntent().getStringExtra("name");
        GDGFeedback gf = (GDGFeedback)getIntent().getSerializableExtra("feedback");
        gfList.add(gf);
        fadapter = new FeedbackAdapter(this.gfList);
        rv = (RecyclerView)findViewById(R.id.feed)
        thankyou.setText(thankyou.getText()+" "+name);

    }

    public void  setGlist(ArrayList<GDGFeedback> gFList){
        gfList = gFList;
    }
}
