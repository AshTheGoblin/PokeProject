package com.ashhillmedia.pokeproject;

import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.REST.PokeAPIClient;
import com.ashhillmedia.pokeproject.REST.PokeAPIInterface;
import com.ashhillmedia.pokeproject.UI.RecyclerViewAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PokemonListDataSource extends PageKeyedDataSource<Integer, NamedAPIResource> {

    public static final int PAGE_SIZE = 20;
    public static final int OFFSET = 0;


    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull final LoadInitialCallback<Integer, NamedAPIResource> callback) {
        PokeAPIClient.getInstance()
                .getApi()
                .getPokemon(20, 0)
                .enqueue(new Callback<NamedAPIResourceList>() {
                    @Override
                    public void onResponse(Call<NamedAPIResourceList> call, Response<NamedAPIResourceList> response) {
                        if (response.body() != null) {
                            callback.onResult(response.body().getResults(), null, OFFSET + 20);
                        }
                    }

                    @Override
                    public void onFailure(Call<NamedAPIResourceList> call, Throwable t) {

                    }
                });
    }

    @Override
    public void loadBefore(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, NamedAPIResource> callback) {
        PokeAPIClient.getInstance()
                .getApi()
                .getPokemon(PAGE_SIZE, params.key)
                .enqueue(new Callback<NamedAPIResourceList>() {
                    @Override
                    public void onResponse(Call<NamedAPIResourceList> call, Response<NamedAPIResourceList> response) {

                        if (response.body() != null) {
                            Integer key = (params.key > 0) ? params.key - 20 : null;

                            callback.onResult(response.body().getResults(), key);
                        }
                    }

                    @Override
                    public void onFailure(Call<NamedAPIResourceList> call, Throwable t) {

                    }
                });
    }

    @Override
    public void loadAfter(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, NamedAPIResource> callback) {

        PokeAPIClient.getInstance()
                .getApi()
                .getPokemon(20, params.key)
                .enqueue(new Callback<NamedAPIResourceList>() {
            @Override
            public void onResponse(Call<NamedAPIResourceList> call, Response<NamedAPIResourceList> response) {


                if (response.body() != null) {
                    if (response.body().getNext() != null) {
                        Integer key = params.key + 20;
                        callback.onResult(response.body().getResults(), key);
                    }
                }
            }

            @Override
            public void onFailure(Call<NamedAPIResourceList> call, Throwable t) {

            }
        });
    }
}
