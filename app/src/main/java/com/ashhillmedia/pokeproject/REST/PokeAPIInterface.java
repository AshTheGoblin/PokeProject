package com.ashhillmedia.pokeproject.REST;

import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.Data.Pokemon;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeAPIInterface {

    @GET("pokemon/")
    Call<NamedAPIResourceList> getPokemon(
            @Query("limit") int limit,
            @Query("offset") int offset
    );

    @GET("pokemon/{name}")
    Call<Pokemon> getPokemonInfo(
            @Path("name") String name);
}
