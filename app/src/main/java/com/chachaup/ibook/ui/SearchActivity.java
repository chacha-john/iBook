package com.chachaup.ibook.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chachaup.ibook.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.buttonSearch)
    Button mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        mSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mSearch){
            Intent intent = new Intent(SearchActivity.this,ResponseActivity.class);
            Toast.makeText(getApplicationContext(),"Populating results...",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }

    }
}