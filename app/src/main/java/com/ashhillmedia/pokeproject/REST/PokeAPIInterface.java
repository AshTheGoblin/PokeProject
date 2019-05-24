package com.ashhillmedia.pokeproject.REST;

import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeAPIInterface {

    @GET("pokemon/")
    Call<NamedAPIResourceList> getPokemon(
            @Query("limit") int limit,
            @Query("offset") int offset
    );
}
