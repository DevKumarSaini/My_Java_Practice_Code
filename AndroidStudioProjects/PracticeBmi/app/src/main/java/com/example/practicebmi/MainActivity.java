package com.example.practicebmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        LinearLayout ll1;
        TextView tv1;
        EditText H_in,H_ft,W_kg;

        button=findViewById(R.id.btn1);
        ll1= findViewById(R.id.ll1);
        tv1=findViewById(R.id.txt1);
        H_ft=findViewById(R.id.edt_Hf);
        H_in=findViewById(R.id.edt_HI);
        W_kg=findViewById(R.id.edt_Weight);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight=Integer.parseInt(W_kg.getText().toString());
                double Height_In=Integer.parseInt(H_in.getText().toString());
                double Height_Ft=Integer.parseInt(H_ft.getText().toString());

                double totalInch = (Height_Ft * 12 )+Height_In;
                double totalCm = totalInch * 2.53;
                double totalMtr = totalCm/100;
                int BMI =(int) (weight/(totalMtr*totalMtr));

//                if(BMI < 24.9){
//                    tv1.setText("Under Weight Weak");
//                    ll1.setBackgroundColor(Color.parseColor("#00FF00"));
//                }
//                else if(BMI>25 && BMI<29.9){
//                    tv1.setText("Your are Healthy");
//                    ll1.setBackgroundColor(Color.parseColor("FF0000"));
//                }
//                else if(BMI>30 && BMI <40){
//                    tv1.setText("OverWeight");
//                    ll1.setBackgroundColor(Color.parseColor("0000FF"));
//                }
//                else {
//                    tv1.setText(BMI+" Your are Obese");
//                    ll1.setBackgroundColor(Color.parseColor("#FF67FF"));
//                }
                if(BMI >1 && BMI <18.5){
                    tv1.setText("Under Weight ");
                    ll1.setBackgroundColor(Color.parseColor("#FF0000"));
//                    Bt2.setText("U");
                }
                else if(BMI>18.5 && BMI < 24.9){
                    tv1.setText("Healthy");
                    ll1.setBackgroundColor(Color.parseColor("#00FF00"));
//                    Bt2.setText("H");
                }
                else if(BMI >25 && BMI < 40 ){
                    tv1.setText("Obese");
                    ll1.setBackgroundColor(Color.parseColor("#0000FF"));
//                    Bt2.setText("O");
                }
                else {
                    tv1.setText("Invalid Range");
//                    Bt2.setText("I");
                }
            }
        });

    }
}