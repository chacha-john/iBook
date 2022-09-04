package com.chachaup.ibook.network;

import static com.chachaup.ibook.Constants.API_KEY;
import static com.chachaup.ibook.Constants.BASE_URL;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BookClient {
    public static Retrofit retrofit = null;
    public static BookAPI getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(BookAPI.class);
    }
}
