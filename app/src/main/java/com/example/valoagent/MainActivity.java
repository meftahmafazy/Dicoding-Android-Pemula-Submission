package com.example.valoagent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAgent;
    private ArrayList<Agent> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#53212B"));
        actionBar.setBackgroundDrawable(colorDrawable);

        rvAgent = findViewById(R.id.rv_agent);
        rvAgent.setHasFixedSize(true);
        list.addAll(AgentData.getListData());
        rvAgent.setLayoutManager(new LinearLayoutManager(this));
        CardViewAgentAdapter cardViewAgentAdapter = new CardViewAgentAdapter(list);
        rvAgent.setAdapter(cardViewAgentAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        Intent moveIntent;
        if(item_id == R.id.rv_agent){
            moveIntent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(moveIntent);
        }else if(item_id == R.id.aboutActivity){
            moveIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
        return true;
    }
}