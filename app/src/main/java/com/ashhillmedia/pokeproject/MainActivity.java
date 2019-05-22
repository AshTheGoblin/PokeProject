package com.ashhillmedia.pokeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.ashhillmedia.pokeproject.Data.NamedAPIResource;
import com.ashhillmedia.pokeproject.Data.NamedAPIResourceList;
import com.ashhillmedia.pokeproject.Data.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();
        PokeAPIClient client = retrofit.create(PokeAPIClient.class);
        Call<NamedAPIResourceList> call = client.getPokemon();

        call.enqueue(new Callback<NamedAPIResourceList>() {
            @Override
            public void onResponse(Call<NamedAPIResourceList> call, Response<NamedAPIResourceList> response) {
                List<NamedAPIResource> pokemonList = response.body().getResults();
                listView.setAdapter(new PokemonListAdapter(MainActivity.this, pokemonList));
            }

            @Override
            public void onFailure(Call<NamedAPIResourceList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something bad happened", Toast.LENGTH_SHORT).show();
            }
        });
    }
}