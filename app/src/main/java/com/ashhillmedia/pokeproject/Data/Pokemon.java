package com.ashhillmedia.pokeproject.Data;

import java.util.List;

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
    PokemonSprites sprites;
    PokemonSpecies species;
    List<PokemonStat> stats;
    List<PokemonType> types;

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
