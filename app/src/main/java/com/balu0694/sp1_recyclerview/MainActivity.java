package com.balu0694.sp1_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;

    private List<ListItem> listItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0 ; i < 15 ; i++){
            ListItem listItem = new ListItem("Heading"+(i+1), "Description"+(i+1));

            listItems.add(listItem);
        }

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
}
