package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Item {
    int id;
    String name;
    int cost;
    int flingPower;
    ItemFlingEffect flingEffect;
    List<ItemAttribute> attributes;
    ItemCategory category;
    List<VerboseEffect> effectEntries;
    List<VersionGroupFlavorText> flavorTextEntries;
    List<GenerationGameIndex> gameIndices;
    List<Name> names;
    ItemSprites sprites;
    List<ItemHolderPokemon> heldByPokemon;
    EvolutionChain babyTriggerFor;
    List<MachineVersionDetail> machines;
}
