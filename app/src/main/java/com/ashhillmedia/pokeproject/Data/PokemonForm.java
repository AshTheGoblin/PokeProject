package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class PokemonForm {
    int id;
    String name;
    int order;
    int formOrder;
    boolean isDefault;
    boolean isBattleOnly;
    boolean isMega;
    String formName;
    Pokemon pokemon;
    PokemonFormSprites sprites;
    VersionGroup versionGroup;
    List<Name> names;
    List<Name> formNames;
}
