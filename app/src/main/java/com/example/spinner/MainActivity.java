package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner ,spinner1;
    ArrayList<String> arrayList,arrayList1,arrayList2,arrayList3;
    ArrayAdapter arrayAdapter;
    EditText editText,editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext1);
        editText1=findViewById(R.id.edittext2);
        spinner=findViewById(R.id.spinner);
        spinner1=findViewById(R.id.spinner1);
        arrayList=new ArrayList<>();
        arrayList.add("");
        arrayList.add("toshkent");
        arrayList.add("xorazim");
        arrayList.add("Q-Q Reasp");

        
        arrayList1=new ArrayList<>();
        arrayList1.add("mirobod");
        arrayList1.add("yakkasaroy");
        arrayList1.add("chilonzor");

        arrayList2=new ArrayList<>();
        arrayList2.add("urganch");
        arrayList2.add("xiva");
        arrayList2.add("yangiariq");

        arrayList3=new ArrayList<>();
        arrayList3.add("beruniy");
        arrayList3.add("ellikqal'a");
        arrayList3.add("tortkol");

        arrayAdapter=new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayList);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayList.get(i), Toast.LENGTH_SHORT).show();
                editText.setText(arrayList.get(i));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}