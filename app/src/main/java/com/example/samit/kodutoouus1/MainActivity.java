package com.example.samit.kodutoouus1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Deklarerin variables
    private EditText editText, editText2, editText3, editText4, editText5;
    private RadioButton excl, incl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        RadioButton excl = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton incl =  (RadioButton) findViewById(R.id.radioButton2);


        if (view.getId() == R.id.btnClr) {
            editText.setText("");
            editText2.setText("");

            //if the button that user clicked is ok we will
        } else if (view.getId() == R.id.btnOK) {

            if (editText.getText().length() == 0) {
                Toast.makeText(this, this.getResources().getString(R.string.enter), Toast.LENGTH_SHORT).show();
                return;}
            if (editText2.getText().length() == 0){
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return;}




            double num1 = Double.parseDouble(editText.getText().toString());
            double num2= Double.parseDouble(editText2.getText().toString());
            double exclText= (num1*num2)* 0.8;
            double inclText= (num1*num2)* 1.2;
            double VatText= 0.2*(num1*num2);
            if (excl.isChecked()) {

                editText3.setText(Double.toString(exclText));

                editText4.setText(Double.toString(VatText));
            } else editText5.setText(String.valueOf(""));


            if (incl.isChecked()) {

                editText5.setText(Double.toString(inclText));

                editText4.setText(Double.toString(VatText));
            } else editText3.setText(String.valueOf(""));


        }
    }
}
