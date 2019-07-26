package com.ashhillmedia.pokeproject.UI;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ashhillmedia.pokeproject.Data.Pokemon;
import com.ashhillmedia.pokeproject.Data.PokemonSprites;
import com.ashhillmedia.pokeproject.R;
import com.ashhillmedia.pokeproject.REST.PokeAPIClient;
import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class InfoActivity extends AppCompatActivity {

    private Pokemon pokemon;
    private PokemonSprites sprites;
  //  private HorizontalScrollView scrollView;
  //  private Response<Pokemon> response;
    LinearLayout layout;
    private static String TAG = "InfoActivity.class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        setTitle(capitalize(name));

        httpCalls(intent);
    }


    private String capitalize(String string) {
        String capitalized = "";
        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                capitalized += string.toUpperCase().charAt(i);
            } else {
                capitalized += string.toLowerCase().charAt(i);
            }
        }
        return capitalized;
    }

    private void httpCalls(Intent intent) {

        String name = intent.getExtras().getString("name");
        PokeAPIClient.getInstance()
                .getApi()
                .getPokemonInfo(name)
                .enqueue(new Callback<Pokemon>() {
                    @Override
                    public void onResponse(@NonNull Call<Pokemon> call, @NonNull Response<Pokemon> response) {
                        if (response.body() != null) {
                            pokemon = new Pokemon(response);
                            sprites = response.body().getSprites();
                            Toast.makeText(getApplicationContext(),
                                    "Something went right",
                                    Toast.LENGTH_SHORT)
                                    .show();
                            TextView textView = findViewById(R.id.text_view);
                            textView.setText("Sprites");

                            for (String s : sprites.spriteUrls()) {
                                if (s != null) {
                                    ImageView image = new ImageView(getApplicationContext());
                                    TextView text = new TextView(getApplicationContext());
                                    String[]des=sprites.spriteDescriptions();
                                    text.setText(des[s.indexOf(s)]);
                                    Glide.with(getApplicationContext())
                                            .load(s)
                                            .override(300)
                                            .placeholder(R.drawable.ic_launcher_foreground)
                                            .into(image);
                                    layout.addView(image);
                                    layout.addView(text);

                                    ConstraintSet set =new ConstraintSet();



                                }
                            }


                        }
                    }

                    @Override
                    public void onFailure(Call<Pokemon> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),
                                "Something went wrong",
                                Toast.LENGTH_SHORT)
                                .show();
                    }
                });


        layout = findViewById(R.id.linear_layout);

    }

}
