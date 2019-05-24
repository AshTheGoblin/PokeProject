package com.ashhillmedia.pokeproject.UI;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PageKeyedDataSource;
import android.arch.paging.PagedList;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.PokemonListDataSource;

public class PokemonListViewModel extends ViewModel {

    LiveData<PagedList<NamedAPIResource>> pokemonPagedList;
    LiveData<PageKeyedDataSource<Integer, NamedAPIResource>> liveDataSource;

    public PokemonListViewModel(){
        PokemonListDataSourceFactory dataSourceFactory = new PokemonListDataSourceFactory();
        liveDataSource = dataSourceFactory.getPokemonListLiveDataSource();

        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(PokemonListDataSource.PAGE_SIZE)
                .build();

        pokemonPagedList = (new LivePagedListBuilder(dataSourceFactory, config)).build();
    }
}
