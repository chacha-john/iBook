package com.chachaup.ibook.network;

import com.chachaup.ibook.models.BookReviewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookAPI {
    @GET("best-sellers/history.json")
    Call<BookReviewsResponse> getClient(
            @Query("api-key") String pApiKey,
            @Query("author") String pAuthor,
            @Query("title") String pTitle,
            @Query("price") String pPrice,
            @Query("publisher") String pPublisher
    );
}
