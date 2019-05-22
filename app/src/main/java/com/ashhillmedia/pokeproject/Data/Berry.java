package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class Berry {
    int id;
    String name;
    int growthTime;
    int maxHarvest;
    int naturalGiftPower;
    int size;
    int smoothness;
    int soilDryness;
    BerryFirmness firmness;
    List<BerryFlavorMap> flavors;
    Item item;
    Type naturalGiftType;
}
