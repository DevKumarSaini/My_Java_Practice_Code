package com.example.bmiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This line is connecting our java file to xml file
        TextView tv1;
        EditText Weight,H_In,H_Ft;
        Button Bt1,Bt2;
        LinearLayout linerL;

        Bt1=findViewById(R.id.Button);
        Bt2=findViewById(R.id.BigButton);
        tv1=findViewById(R.id.tv1);
        Weight=findViewById(R.id.et1Weight);
        H_Ft=findViewById(R.id.et2Height_In_Ft);
        H_In=findViewById(R.id.et3Height_In_Inch);
        linerL=findViewById(R.id.lv);

        Bt1.setOnClickListener(new View.OnClickListener() {  // Perform all over the task on pressing button
            @Override
            public void onClick(View view) {
                int weight=Integer.parseInt(Weight.getText().toString());
                int Height_F=Integer.parseInt(H_Ft.getText().toString());
                int Height_I=Integer.parseInt(H_In.getText().toString());

                int totalIn =  Height_F*12+Height_I; // Extract Height In Total Inch
                float totalCm = totalIn*2.53f;
                float totalMtr = totalCm/100;
                float BMI =  weight/(totalMtr*totalMtr);

                if(BMI >1 && BMI <18.5){
                    tv1.setText("Under Weight ");
                    linerL.setBackgroundColor(Color.parseColor("#FF0000"));
                    Bt2.setText("U");
                }
                else if(BMI>18.5 && BMI < 24.9){
                    tv1.setText("Healthy");
                    linerL.setBackgroundColor(Color.parseColor("#00FF00"));
                    Bt2.setText("H");
                }
                else if(BMI >25 && BMI < 40 ){
                    tv1.setText("Obese");
                    linerL.setBackgroundColor(Color.parseColor("#0000FF"));
                    Bt2.setText("O");
                }
                else {
                    tv1.setText("Invalid Range");
                    Bt2.setText("I");
                }
            }
        });
    }
}