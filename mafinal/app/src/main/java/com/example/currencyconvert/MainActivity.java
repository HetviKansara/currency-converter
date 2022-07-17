package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner sp1,sp2;
    EditText ed1,ed2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);
        ed2 = findViewById(R.id.convamount);


        String[] from = {"Indian Rupees","US Dollar","Canadian Dollar","Euro"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Indian Rupees","US Dollar","Canadian Dollar","Euro"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double tot;
                String tst;

                Double amount = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() =="Indian Rupees" && sp2.getSelectedItem().toString()== "US Dollar")
                {
                    tot = amount / 76;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Indian Rupees" && sp2.getSelectedItem().toString() == "Canadian Dollar")
                {
                    tot = amount / 60.5;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Indian Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amount ;
                    tst = "Same Currency Selected";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Indian Rupees" && sp2.getSelectedItem().toString()== "Euro")
                {
                    tot = amount / 82.5 ;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }



                else if(sp1.getSelectedItem().toString() =="US Dollar" && sp2.getSelectedItem().toString()== "Indian Rupees")
                {
                    tot = amount * 76;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="US Dollar" && sp2.getSelectedItem().toString() == "Canadian Dollar")
                {
                    tot = amount * 1.26;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="US Dollar" && sp2.getSelectedItem().toString()== "Euro")
                {
                    tot = amount * 0.92;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="US Dollar" && sp2.getSelectedItem().toString()== "US Dollar")
                {
                    tot = amount ;
                    tst = "Same Currency Selected";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }


                else if(sp1.getSelectedItem().toString() =="Euro" && sp2.getSelectedItem().toString()== "Indian Rupees")
                {
                    tot = amount * 82;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Euro" && sp2.getSelectedItem().toString() == "Canadian Dollar")
                {
                    tot = amount * 1.4;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Euro" && sp2.getSelectedItem().toString()== "Euro")
                {
                    tot = amount ;
                    tst = "Same Currency Selected";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Euro" && sp2.getSelectedItem().toString()== "US Dollar")
                {
                    tot = amount * 1.08 ;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }


                else if(sp1.getSelectedItem().toString() =="Canadian Dollar" && sp2.getSelectedItem().toString()== "Indian Rupees")
                {
                    tot = amount * 60.5;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Canadian Dollar" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amount * 0.73;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Canadian Dollar" && sp2.getSelectedItem().toString()== "Canadian Dollar")
                {
                    tot = amount ;
                    tst = "Same Currency Selected";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }

                else if(sp1.getSelectedItem().toString() =="Canadian Dollar" && sp2.getSelectedItem().toString()== "US Dollar")
                {
                    tot = amount * 0.8 ;
                    tst = "Value Updated";
                    Toast.makeText(getApplicationContext(),tst.toString(),Toast.LENGTH_LONG).show();
                    ed2.setText(String.valueOf(tot));
                }
            }
        });



    }
}