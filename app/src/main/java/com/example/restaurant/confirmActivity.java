package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class confirmActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        listView = (ListView) findViewById(R.id.listveiw);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("sadsa");
        arrayList.add("3131");
    }
}
