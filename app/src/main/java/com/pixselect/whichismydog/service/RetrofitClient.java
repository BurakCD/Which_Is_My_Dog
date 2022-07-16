package com.pixselect.whichismydog.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseURL){
        if (retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            //BreedsDAOInterface service = retrofit.create(BreedsDAOInterface.class);
        }
        return retrofit;
    }
}
