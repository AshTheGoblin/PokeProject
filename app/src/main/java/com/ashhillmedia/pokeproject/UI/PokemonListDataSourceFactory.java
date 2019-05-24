package com.ashhillmedia.pokeproject.UI;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;
import android.arch.paging.PageKeyedDataSource;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.PokemonListDataSource;

public class PokemonListDataSourceFactory extends DataSource.Factory {

    private MutableLiveData<PageKeyedDataSource<Integer, NamedAPIResource>>  pokemonListLiveDataSource = new MutableLiveData<>();

    @Override
    public DataSource create() {
        PokemonListDataSource pokemonListDataSource = new PokemonListDataSource();
        pokemonListLiveDataSource.postValue(pokemonListDataSource);
        return pokemonListDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, NamedAPIResource>> getPokemonListLiveDataSource() {
        return pokemonListLiveDataSource;
    }
}
