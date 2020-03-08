package AlaaSaied.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //TODO: member variables
    Button calculate;
    EditText mFirstNum;
    EditText mSecondNum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculate = (Button) findViewById(R.id.calculateButton);
        mFirstNum = (EditText) findViewById(R.id.firstNum);
        mSecondNum = (EditText) findViewById(R.id.secondNum);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(mFirstNum.getText().toString());
                int num2 = Integer.parseInt(mSecondNum.getText().toString());

                int add = num1 + num2;
                int sub = num1 - num2;
                int mul = num1 * num2;
                double div = (double) num1 / num2;

                Intent intent = new Intent(getApplicationContext(), TheResultActivity.class);
                intent.putExtra("MY_RESULT1", add);
                intent.putExtra("MY_RESULT2", sub);
                intent.putExtra("MY_RESULT3", mul);
                intent.putExtra("MY_RESULT4", div);
                startActivity(intent);
            }
        });
    }
}
