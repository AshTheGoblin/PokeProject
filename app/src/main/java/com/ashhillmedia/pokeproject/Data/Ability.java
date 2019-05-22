package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Ability {
    int id;
    String name;
    boolean isMainSeries;
    Generation generation;
    List<NamedAPIResource> names;
    List<VerboseEffect> effectEntries;
    List<AbilityEffectChange> effectChanges;
    List<AbilityFlavorText> flavorTextEntries;
    List<AbilityPokemon> pokemon;
}
