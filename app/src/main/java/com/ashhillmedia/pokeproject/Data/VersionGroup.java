package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class VersionGroup {
    int id;
    String name;
    int order;
    Generation generation;
    List<MoveLearnMethod> moveLearnMethods;
    List<Pokedex> pokedexes;
    List<Region> regions;
    List<Version> version;
}
