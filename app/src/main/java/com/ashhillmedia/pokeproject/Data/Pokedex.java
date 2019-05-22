package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Pokedex {
    int id;
    String name;
    boolean isMainSeries;
    List<Description> descriptions;
    List<Name> names;
    List<PokemonEntry> pokemonEntries;
    Region region;
    List<VersionGroup> versionGroups;
}
