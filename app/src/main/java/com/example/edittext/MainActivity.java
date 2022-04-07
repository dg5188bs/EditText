package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();

    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    EditText ed1, ed2, ed3;
    ImageView iv1, iv2, iv3;
    Button btn1, btn2, btn3, btn4;
    int a, j, i, k, f;
    int sum1=0;
    double percent=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        tv6 = (TextView) findViewById(R.id.textView6);
        ed1 = (EditText) findViewById(R.id.editTextNumber1);
        ed2 = (EditText) findViewById(R.id.editTextNumber2);
        ed3 = (EditText) findViewById(R.id.editTextNumber3);
        iv1 = (ImageView) findViewById(R.id.imageView1);
        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv3 = (ImageView) findViewById(R.id.imageView3);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        j = rnd.nextInt(99-10) + 10;
        tv1.setText(Integer.toString(j));
        i = rnd.nextInt(99-10) + 10;
        tv2.setText(Integer.toString(i));
    }


    public void change1(View view) {
        String st1 = ed1.getText().toString();
        a = (Integer.parseInt(st1));
        if (a == i + j) {
            iv1.setImageResource(R.drawable.correct);
            sum1++;
            percent=percent+33.3;
        }
        else {
            iv1.setImageResource(R.drawable.wrong);
        }
        tv3.setText(Integer.toString(i+j));
        k = rnd.nextInt(99-10) + 10;
        tv4.setText(Integer.toString(k));
    }
    public void change2(View view) {
        String st2 = ed2.getText().toString();
        a = (Integer.parseInt(st2));
        if (a == i + j + k) {
            iv2.setImageResource(R.drawable.correct);
            sum1++;
            percent=percent+33.3;
        }
        else {
            iv2.setImageResource(R.drawable.wrong);
        }
        tv5.setText(Integer.toString(i+j+k));
        f = rnd.nextInt(99-10) + 10;
        tv6.setText(Integer.toString(f));

    }

    public void change3(View view) {
        String st3 = ed3.getText().toString();
        a = (Integer.parseInt(st3));
        if (a == i + j + k + f) {
            iv3.setImageResource(R.drawable.correct);
            sum1++;
            percent=percent+33.3;
        } else {
            iv3.setImageResource(R.drawable.wrong);

        }
        Toast.makeText(this,sum1+"/3 "+percent+"%",Toast.LENGTH_LONG).show();
    }

    public void change4(View view) {
        j = rnd.nextInt(99-10) + 10;
        tv1.setText(Integer.toString(j));
        i = rnd.nextInt(99-10) + 10;
        tv2.setText(Integer.toString(i));
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        iv1.setImageResource(0);
        iv2.setImageResource(0);
        iv3.setImageResource(0);
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
    }
}



