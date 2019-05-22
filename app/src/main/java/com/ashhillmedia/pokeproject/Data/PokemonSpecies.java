package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class PokemonSpecies {
    int id;
    String name;
    int order;
    int genderRate;
    int captureRate;
    int baseHappiness;
    boolean isBaby;
    int hatchCounter;
    boolean hadGenderDifferences;
    boolean formsSwitchable;
    GrowthRate growthRate;
    List<PokemonSpeciesDexEntry> pokedexNumbers;
    List<EggGroup> eggGroups;
    PokemonColor color;
    PokemonShape shape;
    PokemonSpecies evolvesFromSpecies;
    EvolutionChain evolutionChain;
    PokemonHabitat habitat;
    Generation generation;
    List<Name> names;
    PalParkEncounterArea palParkEncounters;
    FlavorText flavorTextEntries;
    List<Description> formDescriptions;
    Genus genera;
    List<PokemonSpeciesVariety> varieties;
}
