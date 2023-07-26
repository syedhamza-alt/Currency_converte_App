package com.example.projectconvertdollar;

import static com.example.projectconvertdollar.R.id;
import static com.example.projectconvertdollar.R.layout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        Spinner sp1,sp2;
    TextView txt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        txt1=findViewById(id.etx1);
        sp1=findViewById(id.sp1);
        sp2=findViewById(id.sp2);
        btn1=findViewById(id.btnConvert);

        String[] from= {"USD"};
        ArrayAdapter<String> ad1= new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad1);

        String[] to={"PKR","INR","BHD","KWD","OMR"};
        ArrayAdapter<String> ad2= new ArrayAdapter<>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad2);

        btn1.setOnClickListener(view -> {
            double tot;
            double givenAmount=Double.parseDouble(txt1.getText().toString());

            if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("PKR")){
                tot=givenAmount*285;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("INR")){
                tot=givenAmount*82.46;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("KWD")){
                tot=givenAmount*0.31;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("BHD")){
                tot=givenAmount*0.38;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }
            else if(sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("OMR")){
                tot=givenAmount*0.38;
                Toast.makeText(getApplicationContext(), Double.toString(tot),Toast.LENGTH_LONG).show();
            }

        });
    }
}