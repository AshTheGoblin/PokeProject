package com.ashhillmedia.pokeproject.REST;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokeAPIClient {
    public static final String baseUrl = "https://pokeapi.co/api/v2/";
    public static PokeAPIClient instance;
    public static Retrofit retrofit;

    public PokeAPIClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized PokeAPIClient getInstance(){
        if (instance==null){
            instance=new PokeAPIClient();
        }
        return instance;
    }

    public PokeAPIInterface  getApi(){
        return retrofit.create(PokeAPIInterface.class);
    }
}
