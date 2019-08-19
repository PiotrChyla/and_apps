package com.example.calcdelta;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String ifEmptyVar1, ifEmptyVar2, ifEmptyVar3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clr = (Button) findViewById(R.id.button2);
        clr.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                EditText var1;
                EditText var2;
                EditText var3;
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                TextView textView8 = (TextView) findViewById(R.id.textView8);
                TextView textView9 = (TextView) findViewById(R.id.textView9);
                TextView textView10 = (TextView) findViewById(R.id.textView10);
                var1 = (EditText) findViewById(R.id.editText);
                var2 = (EditText) findViewById(R.id.editText2);
                var3 = (EditText) findViewById(R.id.editText3);
                Toast.makeText(MainActivity.this, "Okna wyczyszczone !", Toast.LENGTH_SHORT).show();
                textView2.setText("Uwagi: ");
                textView4.setText("X2: ");
                textView3.setText("X1: ");
                textView.setText("Delta: ");
                textView8.setText("a");
                textView9.setText("b");
                textView10.setText("c");
                var1.setText("");
                var2.setText("");
                var3.setText("");

            }
        });
        RelativeLayout bck;


        final Button cnt = (Button) findViewById(R.id.button);
        cnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText var1;
                EditText var2;
                EditText var3;

                Double delta, x1, x2;
                var1 = (EditText) findViewById(R.id.editText);
                ifEmptyVar1 = var1.getText().toString().trim();
                var2 = (EditText) findViewById(R.id.editText2);
                ifEmptyVar2 = var2.getText().toString().trim();
                var3 = (EditText) findViewById(R.id.editText3);
                ifEmptyVar3 = var3.getText().toString().trim();


                if (TextUtils.isEmpty(ifEmptyVar1) || TextUtils.isEmpty(ifEmptyVar2) || TextUtils.isEmpty(ifEmptyVar3) ) {
                    Toast.makeText(MainActivity.this, "Pola nie mogą być puste!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Uzupełnij je !", Toast.LENGTH_SHORT).show();

                } else {

                    Double a = Double.parseDouble(var1.getText().toString());
                    Double b = Double.parseDouble(var2.getText().toString());
                    Double c = Double.parseDouble(var3.getText().toString());

                    TextView textView = (TextView) findViewById(R.id.textView);
                    TextView textView2 = (TextView) findViewById(R.id.textView2);
                    TextView textView3 = (TextView) findViewById(R.id.textView3);
                    TextView textView4 = (TextView) findViewById(R.id.textView4);
                    TextView textView8 = (TextView) findViewById(R.id.textView8);
                    TextView textView9 = (TextView) findViewById(R.id.textView9);
                    TextView textView10 = (TextView) findViewById(R.id.textView10);


                    delta = b * b - (4 * a * c);

                    if (delta > 0) {

                        x1 = -b - Math.sqrt(delta) / 2 * a;
                        x2 = -b + Math.sqrt(delta) / 2 * a;

                        textView3.setText("X1: " + x1);
                        textView4.setText("X2: " + x2);
                        textView2.setText("Uwagi: ");
                        textView.setText("Delta wynosi: " + delta);
                        Toast.makeText(MainActivity.this, "DELTA DODATNIA", Toast.LENGTH_SHORT).show();
                    } else {
                        textView2.setText("Delta ujemna, brak rozwiążać w zbiorze liczb rzeczywistych !");
                        textView4.setText("X2");
                        textView3.setText("X1");
                        Toast.makeText(MainActivity.this, "DELTA UJEMNA", Toast.LENGTH_SHORT).show();




                        textView8.setText("" + a);
                        textView9.setText("" + b);
                        textView10.setText("" + c);
                    }
                }
            }
        });
    }


    }























/*

package com.example.calcdelta;

import static java.lang.Math.sqrt;

public class calc {

    private double a,b,c,delta,x1,x2,sum;

    public double Delta(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.delta = delta;

        delta = b * b - (4 * a * c);
        return delta;
    }
    public double getDelta(){
        return delta;
    }

    public double example1(double a, double b,double delta){
        this.a=a;
        this.b=b;
        this.delta=delta;
        this.x1=x1;
        x1=-b-sqrt(delta)/2*a;
        return x1;
    }
    public double getX1(){
        return x1;
    }
    public double example2(double a, double b,double delta){
        this.a=a;
        this.b=b;
        this.delta=delta;
        this.x2=x2;
        x2=-b+sqrt(delta)/2*a;
        return x2;
    }
    public double getX2(){
        return x2;
    }

}

 */