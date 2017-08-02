package com.example.arunmannuru.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import static com.example.arunmannuru.simpletodo.R.id.btnSubmit;
import static com.example.arunmannuru.simpletodo.R.id.editText;
import static com.example.arunmannuru.simpletodo.R.id.lvItems;

public class EditItemActivity extends AppCompatActivity {


    EditText editText;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
    }
    public void onAddItem(View v){
        editText = (EditText) findViewById(R.id.editText);
        Intent editedItem = new Intent(EditItemActivity.this,AddItemAcitivity.class);
        editedItem.putExtra("EditedText",editText.getText().toString());
        startActivity(editedItem);
    }

    public void onSubmit(View v){
        this.finish();
    }
}
