package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Stat {
    int id;
    String name;
    int gameIndex;
    boolean isBattleOnly;
    MoveStatAffectSets affectingMoves;
    NatureStatAffectSets affectingNatures;
    Characteristic characteristics;
    MoveDamageClass moveDamageClass;
    List<Name> names;

}
