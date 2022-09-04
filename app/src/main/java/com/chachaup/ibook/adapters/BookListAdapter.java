package com.chachaup.ibook.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chachaup.ibook.R;
import com.chachaup.ibook.models.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder> {
    private List<Result> mResults;
    private Context mContext;


    public BookListAdapter(Context context, List<Result> results){
        mContext = context;
        mResults = results;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.ImageViewBookCover)
        ImageView mImageBookCover;
        @BindView(R.id.textViewBookTitle)
        TextView mBookTitle;
        @BindView(R.id.textViewBookDescription) TextView mBookDescription;
        @BindView(R.id.textViewBookAuthor) TextView mBookAuthor;
        @BindView(R.id.textViewBookPublisher) TextView mBookPublisher;

        private Context mContext;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext = itemView.getContext();
        }

        public void bindBook(Result result){
            mBookTitle.setText(result.getTitle());
            mBookAuthor.setText(result.getAuthor());
            mBookDescription.setText(result.getDescription());
            mBookPublisher.setText(result.getPublisher());
        }

    }
    @NonNull
    @Override
    public BookListAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        BookViewHolder viewHolder = new BookViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookListAdapter.BookViewHolder holder, int position) {
        holder.bindBook(mResults.get(position));

    }

    @Override
    public int getItemCount() {
        return mResults.size();
    }
}
