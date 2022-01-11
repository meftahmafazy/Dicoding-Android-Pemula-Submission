package com.example.valoagent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_ROLE = "extra_role";
    ImageView imgAgent;
    TextView tvNameAgent;
    TextView tvRoleAgent;
    TextView tvDetailAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar back = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#53212B"));
        back.setBackgroundDrawable(colorDrawable);
        back.setDisplayHomeAsUpEnabled(true);
        tvNameAgent = findViewById(R.id.nameAgent);
        tvRoleAgent = findViewById(R.id.roleAgent);
        tvDetailAgent = findViewById(R.id.detailAgent);
        imgAgent = findViewById(R.id.imgReceived);
        tvNameAgent.setText(getIntent().getExtras().getString(EXTRA_NAME));
        tvRoleAgent.setText(getIntent().getExtras().getString(EXTRA_ROLE));
        tvDetailAgent.setText(getIntent().getExtras().getString(EXTRA_DETAIL));
        Glide.with(this)
                .load(getIntent().getIntExtra(EXTRA_IMG, 0))
                .apply(new RequestOptions().override(320, 500))
                .into(imgAgent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}