package edu.gsu.csci5338.geoquizelite;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mQuestions = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initImageBitmaps();
    }

    private void initImageBitmaps(){



        mQuestions.add("Seattle is more northerly than New York City");
        mQuestions.add("Rhode Island has a greater population than Mongolia");
        mQuestions.add("Memphis is the state capital of Tennessee");
        mQuestions.add("The currency of Switzerland is the Euro");
        mQuestions.add("China boarders the same number of countries as Russia");
        mQuestions.add("The Indian Ocean is the third largest ocean in the world");
        mQuestions.add("There are more countries in Africa than Asia");
        mQuestions.add("Brazilia is the capital city of Brazil");
        mQuestions.add("Mount Kilimanjaro is higher than Denali");
        mQuestions.add("The Sahara Desert has a greater area than USA");

        initRecyclerView();
    }

    private void initRecyclerView(){

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mQuestions);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






