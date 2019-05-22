package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Move {
    int id;
    String name;
    int accuracy;
    int effecChance;
    int pp;
    int priority;
    int power;
    ContestComboSets contestCombos;
    ContestType contestType;
    ContestEffect contestEffect;
    MoveDamageClass damageClass;
    List<VerboseEffect> effectEntries;
    List<AbilityEffectChange> effectChanges;
    List<MoveFlavorText> flavorTextEntries;
    Generation generation;
    List<MachineVersionDetail> machines;
    MoveMetaData meta;
    List<Name> names;
    List<PastMoveStatValues> pastValues;
    List<MoveStatChange> statChanges;
    SuperContestEffect superContestEffect;
    MoveTarget target;
    Type type;
}
