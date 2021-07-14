package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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


    public void addition(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double n2=Double.parseDouble(e2.getText().toString());
        double sum=n1+n2;
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void sine(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double c=Math.toRadians(n1);
        double sum= Math.sin(c);
        sum=(double)Math.round(sum * 1000d) / 1000d;
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void cosine(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double c=Math.toRadians(n1);
        double sum= Math.cos(c);
        sum=(double)Math.round(sum * 1000d) / 1000d;
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void tangent(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double c=Math.toRadians(n1);
        double sum=Math.tan(c);
        sum=(double)Math.round(sum * 1000d) / 1000d;
        if(n1==90||n1==270){
            t.setText("infinity");
        }else {
            String result = Double.toString(sum);
            t.setText(result);
        }
    }
    public void ln(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double sum=Math.log(n1);
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void log(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double sum=Math.log10(n1);
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void subtraction(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double n2=Double.parseDouble(e2.getText().toString());
        double sub=n1-n2;
        String result=Double.toString(sub);
        t.setText(result);
    }
    public void product(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double n2=Double.parseDouble(e2.getText().toString());
        double sum=n1*n2;
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void division(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double n2=Double.parseDouble(e2.getText().toString());
        double sum=n1/n2;
        String result=Double.toString(sum);
        t.setText(result);
    }
    public void power(View v){
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);
        TextView t=(TextView)findViewById(R.id.answer);
        double n1=Double.parseDouble(e1.getText().toString());
        double n2=Double.parseDouble(e2.getText().toString());
        double sum=Math.pow(n1,n2);
        String result=Double.toString(sum);
        t.setText(result);
    }
}