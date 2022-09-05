package com.chachaup.ibook.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.chachaup.ibook.R;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.buttonSearch)
    Button mSearch;
    @BindView(R.id.autoCompleteTextViewTitle) AutoCompleteTextView mTitle;
    @BindView(R.id.autoCompleteTextViewAuthor) AutoCompleteTextView mAuthor;
    @BindView(R.id.autoCompleteTextViewPublisher)
    AutoCompleteTextView mPublisher;
    @BindView(R.id.autoCompleteTextViewPrice) AutoCompleteTextView mPrice;

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
            intent.putExtra("title",mTitle.getText().toString().trim());
            intent.putExtra("author", mAuthor.getText().toString().trim());
            intent.putExtra("publisher", mPublisher.getText().toString().trim());
            intent.putExtra("price", mPrice.getText().toString().trim());
            startActivity(intent);
        }

    }
}