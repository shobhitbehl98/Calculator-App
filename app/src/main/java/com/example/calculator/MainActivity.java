package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t;
    double n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plus=findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addition(v);
            }
        });
        Button minus=findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtraction(v);
            }
        });
        Button multiply=findViewById(R.id.mul);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product(v);
            }
        });
        Button div=findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                division(v);
            }
        });
        Button pow=findViewById(R.id.pow);
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                power(v);
            }
        });
        Button sine=findViewById(R.id.sine);
        sine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sine(v);
            }
        });
        Button cosine=findViewById(R.id.cosine);
        cosine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cosine(v);
            }
        });Button tangent=findViewById(R.id.tangent);
        tangent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tangent(v);
            }
        });Button ln=findViewById(R.id.natural_log);
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln(v);
            }
        });Button log=findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log(v);
            }
        });

    }

    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t = (TextView) findViewById(R.id.answer);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {
            String result = "Please enter a value";
            t.setText(result);
            return false;
        } else {
            n1 = Double.parseDouble(s1);
            n2 = Double.parseDouble(s2);
        }
        return true;
    }

    public void addition(View v){
       if(getNumbers()){
           double sum=n1+n2;
           String result=Double.toString(sum);
           t.setText(result);
       }
    }
    public void sine(View v){
        if(getNumbers()){
            double sum=Math.sin(Math.toRadians(n1));
            sum=(double)Math.round(sum * 1000d) / 1000d;
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void cosine(View v){
        if(getNumbers()){
            double sum=Math.cos(Math.toRadians(n1));
            sum=(double)Math.round(sum * 1000d) / 1000d;
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void tangent(View v){
        if(getNumbers()){
            double sum=Math.tan(Math.toRadians(n1));
            sum=(double)Math.round(sum * 1000d) / 1000d;
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void ln(View v){
        if(getNumbers()){
            double sum=Math.log(n1);
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void log(View v){
        if(getNumbers()){
            double sum=Math.log10(n1);
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void subtraction(View v){
        if(getNumbers()){
            double sum=n1-n2;
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void product(View v){
        if(getNumbers()){
            double sum=n1*n2;
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void division(View v){
        if(getNumbers()){
            double sum=n1/n2;
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
    public void power(View v){
        if(getNumbers()){
            double sum=Math.pow(n1,n2);
            String result=Double.toString(sum);
            t.setText(result);
        }
    }
}