package com.example.licznik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


class cout extends AppCompatActivity{
    public static void  onClick(){
        String name;

    }
    private double a,b,c;

    public double dodawanie(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        c=a+b;
        return c;
    }
    public double getC(){
        return c;

    }
    public class MainActivity extends cout {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);





            Button btn = (Button) findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {



                @Override
                public void onClick(View view) {

                    EditText mEdit1;
                    EditText mEdit2;
                    TextView mText;
                    Integer sum;
                    MainActivity suma = new MainActivity();



                    mEdit1   = (EditText)findViewById(R.id.editText);
                    //  mEdit1.getText().toString();
                    int a = Integer.parseInt(mEdit1.getText().toString());
                    mEdit2   = (EditText)findViewById(R.id.editText2);
                    //  mEdit2.getText().toString();
                    int b = Integer.parseInt(mEdit2.getText().toString());



                    ////mText = (TextView)findViewById(R.id.wynik);

                    //   mText.setText(""+mEdit1.getText().toString()+"!");
                    //   mText.setText(""+mEdit2.getText().toString()+"!");

                    TextView textView = (TextView) findViewById(R.id.editText3);
                    textView.setText(""+suma.getC());

                }
            });
        }
    }
}

