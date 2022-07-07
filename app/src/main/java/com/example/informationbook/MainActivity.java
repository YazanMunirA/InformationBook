package com.example.informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private  ArrayList<card_list> arrayList;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the recyclerView in the activity.main.xml layout with the ID version_name
        recyclerView= findViewById(R.id.recycleView);
        // how the data will appearance in your app
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
       // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //Create a List of words
        arrayList = new ArrayList<>();
        ArrayList<card_list> card_lists = new ArrayList<card_list>();

        card_list card_list =new card_list("country","The countries");
        card_list card_list1 = new card_list("leaders","The Leaders ");
        card_list card_list2 = new card_list("museum","The museum");
        card_list card_list3 = new card_list("wonders","The Seven wonders");

        arrayList.add(card_list);
        arrayList.add(card_list1);
        arrayList.add(card_list2);
        arrayList.add(card_list3);


     WordAdabter adapter = new WordAdabter(card_lists,this);
     recyclerView.setAdapter(adapter);
    }
}