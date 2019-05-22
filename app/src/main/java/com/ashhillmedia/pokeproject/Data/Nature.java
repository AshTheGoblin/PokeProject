package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Nature {
    int id;
    String name;
    Stat decreasedStat;
    Stat increasedStat;
    BerryFlavor hatesFlavor;
    BerryFlavor likesFlavor;
    List<NatureStatChange> pokeathalonStatChanges;
    List<MoveBattleStylePreference> moveBattleStylePreferences;
    List<Name> names;

}
