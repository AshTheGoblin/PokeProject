package com.ashhillmedia.pokeproject.Data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import retrofit2.Response;

public class PokemonSprites {
    @SerializedName("front_default")
    private String frontDefault;
    @SerializedName("front_shiny")
    private String frontShiny;
    @SerializedName("front_female")
    private String frontFemale;
    @SerializedName("front_shiny_female")
    private String frontShinyFemale;
    @SerializedName("back_default")
    private String backDefault;
    @SerializedName("back_shiny")
    private String backShiny;
    @SerializedName("back_female")
    private String backFemale;
    @SerializedName("back_shiny_female")
    private String backShinyFemale;

    public String[] spriteUrls() {
        String[] sprites = {frontDefault, frontShiny,
                backDefault, backShiny,
                frontFemale, frontShinyFemale,
                backFemale, backShinyFemale};
        return sprites;
    }

    public String[] spriteDescriptions() {
        String[] descriptions = {"default front", "shiny front",
                "default back", "shiny back",
                "female front", "shiny female front",
                "female back", "shiny female back"};


        return descriptions;
    }

/*

    @SerializedName("back_female")
    public String getBackFemale() {
        return backFemale;
    }

    @SerializedName("back_female")
    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    @SerializedName("back_shiny_female")
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    @SerializedName("back_shiny_female")
    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    @SerializedName("back_default")
    public String getBackDefault() {
        return backDefault;
    }

    @SerializedName("back_default")
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    @SerializedName("front_female")
    public String getFrontFemale() {
        return frontFemale;
    }

    @SerializedName("front_female")
    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    @SerializedName("front_shiny_female")
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    @SerializedName("front_shiny_female")
    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    @SerializedName("back_shiny")
    public String getBackShiny() {
        return backShiny;
    }

    @SerializedName("back_shiny")
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    @SerializedName("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @SerializedName("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    @SerializedName("front_shiny")
    public String getFrontShiny() {
        return frontShiny;
    }

    @SerializedName("front_shiny")
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }
    */
}
