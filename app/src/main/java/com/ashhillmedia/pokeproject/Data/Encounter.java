package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Encounter {
    int minLevel;
    int maxLevel;
    List<EncounterConditionValue> conditionValues;
    int chance;
    EncounterMethod method;

}
