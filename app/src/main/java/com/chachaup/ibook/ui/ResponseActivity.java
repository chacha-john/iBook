package com.chachaup.ibook.ui;

import static com.chachaup.ibook.Constants.API_KEY;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chachaup.ibook.R;
import com.chachaup.ibook.adapters.BookListAdapter;
import com.chachaup.ibook.models.BookReviewsResponse;
import com.chachaup.ibook.models.Result;
import com.chachaup.ibook.network.BookAPI;
import com.chachaup.ibook.network.BookClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResponseActivity extends AppCompatActivity {
    @BindView(R.id.recyclerViewResponse)
    RecyclerView mResponseRV;
    @BindView(R.id.textViewError)
    TextView mErrorTV;
    private BookListAdapter mAdapter;

    public List<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);
        ButterKnife.bind(this);

        BookAPI client = BookClient.getClient();
        Call<BookReviewsResponse> call = client.getClient(API_KEY,"Mark");
        call.enqueue(new Callback<BookReviewsResponse>() {
            @Override
            public void onResponse(Call<BookReviewsResponse> call, Response<BookReviewsResponse> response) {
                if (response.isSuccessful()){
                    results = response.body().getResults();
                    mAdapter = new BookListAdapter(ResponseActivity.this, results);
                    mResponseRV.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ResponseActivity.this);
                    mResponseRV.setLayoutManager(layoutManager);
//                    mResponseRV.setHasFixedSize(true);

                    showBooks();
                }
            }

            @Override
            public void onFailure(Call<BookReviewsResponse> call, Throwable t) {

            }
        });
    }

    private void showBooks(){
        mResponseRV.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage(){
        mErrorTV.setText("Kuna shida mahali");
        mErrorTV.setVisibility(View.VISIBLE);
    }
}