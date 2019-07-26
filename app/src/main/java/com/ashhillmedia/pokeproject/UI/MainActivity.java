package com.ashhillmedia.pokeproject.UI;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.R;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PokemonListViewModel pokemonListViewModel = new ViewModelProviders().of(this).get(PokemonListViewModel.class);
        final PokemonListAdapter adapter = new PokemonListAdapter(this);

        pokemonListViewModel.pokemonPagedList.observe(this, new Observer<PagedList<NamedAPIResource>>() {
            @Override
            public void onChanged(@Nullable PagedList<NamedAPIResource> namedAPIResources) {
                adapter.submitList(namedAPIResources);
            }
        });

        recyclerView.setAdapter(adapter);


    }

}
