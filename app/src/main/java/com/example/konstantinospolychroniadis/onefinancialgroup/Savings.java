package com.example.konstantinospolychroniadis.onefinancialgroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Savings extends AppCompatActivity {
    private static final String TAG = "Savings";
    DatabaseHelper mDatabaseHelper;
    private Button btnAdd, btnViewData;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);
        editText = (EditText) findViewById(R.id.editText);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnViewData = (Button) findViewById(R.id.btnView);
        mDatabaseHelper = new DatabaseHelper(this);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //view all the entries on the database
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { String newEntry = editText.getText().toString();
                if (editText.length() != 0) { AddData(newEntry); editText.setText("");
                } else { toastMessage("You must put something in the text field!"); } } });
        //moving to view data
        btnViewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Savings.this, ListDataActivity.class);
                startActivity(intent); } }); }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){ this.finish(); }
        return super.onOptionsItemSelected(item); }
    //adding data on database
    public void AddData(String newEntry) {
        boolean insertData = mDatabaseHelper.addData(newEntry);
        if (insertData) { toastMessage("Data Successfully Inserted!");
        } else { toastMessage("Something went wrong"); } }
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show(); }
}
