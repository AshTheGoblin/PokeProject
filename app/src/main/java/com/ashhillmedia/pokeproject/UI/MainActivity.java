package com.ashhillmedia.pokeproject.UI;

import android.app.Application;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.R;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        PokemonListViewModel pokemonListViewModel = new ViewModelProviders().of(this).get(PokemonListViewModel.class);
        final RecyclerViewAdapter adapter = new RecyclerViewAdapter();

        pokemonListViewModel.pokemonPagedList.observe(this, new Observer<PagedList<NamedAPIResource>>() {
            @Override
            public void onChanged(@Nullable PagedList<NamedAPIResource> namedAPIResources) {
                adapter.submitList(namedAPIResources);
            }
        });

        recyclerView.setAdapter(adapter);
    }

}
