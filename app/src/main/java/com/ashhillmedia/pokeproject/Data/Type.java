package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Type {
    int id;
    String name;
    TypeRelations damageRelations;
    List<GenerationGameIndex> gameIndices;
    Generation generation;
    MoveDamageClass moveDamageClass;
    List<Name> names;
    List<TypePokemon> pokemon;
    List<Move> moves;
}
