package com.ashhillmedia.pokeproject;

import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.Data.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeAPIClient {

    @GET("pokemon/")
    Call<NamedAPIResourceList> getPokemon();
}
