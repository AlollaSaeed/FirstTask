package AlaaSaied.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class TheResultActivity extends AppCompatActivity {

    //TODO: member variables
    TextView mAdd;
    TextView mSub;
    TextView mMul;
    TextView mDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_result);

        mAdd = (TextView) findViewById(R.id.add);
        mSub = (TextView) findViewById(R.id.sub);
        mMul = (TextView) findViewById(R.id.mul);
        mDiv = (TextView) findViewById(R.id.div);


       int add = getIntent().getIntExtra("MY_RESULT1", 0);
       int sub = getIntent().getIntExtra("MY_RESULT2", 0);
       int mul = getIntent().getIntExtra("MY_RESULT3", 0);
       double div = getIntent().getDoubleExtra("MY_RESULT4", 0);



        mAdd.setText("* The Addition = " + String.valueOf(add));
        mSub.setText("* The Subtraction = " + String.valueOf(sub));
        mMul.setText("* The Multiplication = " + String.valueOf(mul));
        mDiv.setText("* The Division = " + String.valueOf(div));

    }
}
