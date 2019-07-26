package com.ashhillmedia.pokeproject.Data;

import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;

public class Pokemon {
    int id;
    String name;
    int baseExperience;
    int height;
    boolean isDefault;
    int order;
    int weight;
    List<PokemonAbility> abilities;
    List<PokemonForm> forms;
    List<VersionGameIndex> gameIndices;
    List<PokemonHeldItem> heldItems;
    String locationAreaEncounters;
    List<PokemonMove> moves;
   private PokemonSprites sprites;
    PokemonSpecies species;
    List<PokemonStat> stats;
    List<PokemonType> types;

    public Pokemon(Response<Pokemon> pokemon){
        this.id=pokemon.body().id;
        this.name=pokemon.body().name;
        this.baseExperience = pokemon.body().baseExperience;
        this.height=pokemon.body().height;
        this.isDefault=pokemon.body().isDefault;
        this.order=pokemon.body().order;
        this.weight=pokemon.body().weight;
        this.abilities = pokemon.body().abilities;
        this.forms = pokemon.body().forms;
        this.gameIndices= pokemon.body().gameIndices;
        this.heldItems= pokemon.body().heldItems;
        this.locationAreaEncounters = pokemon.body().locationAreaEncounters;
        this.moves=pokemon.body().moves;
        this.sprites=pokemon.body().sprites;
        this.species=pokemon.body().species;
        this.stats= pokemon.body().stats;
        this.types = pokemon.body().types;



    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public void setForms(List<PokemonForm> forms) {
        this.forms = forms;
    }

    public void setGameIndices(List<VersionGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public void setHeldItems(List<PokemonHeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public void setMoves(List<PokemonMove> moves) {
        this.moves = moves;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public void setSpecies(PokemonSpecies species) {
        this.species = species;
    }

    public void setStats(List<PokemonStat> stats) {
        this.stats = stats;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public int getOrder() {
        return order;
    }

    public int getWeight() {
        return weight;
    }

    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    public List<PokemonForm> getForms() {
        return forms;
    }

    public List<VersionGameIndex> getGameIndices() {
        return gameIndices;
    }

    public List<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public List<PokemonMove> getMoves() {
        return moves;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public PokemonSpecies getSpecies() {
        return species;
    }

    public List<PokemonStat> getStats() {
        return stats;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

}
