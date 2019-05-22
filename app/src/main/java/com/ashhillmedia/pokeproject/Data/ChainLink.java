package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class ChainLink {
    boolean isBaby;
    PokemonSpecies species;
    List<EvolutionDetail> evolutionDetails;
    List<ChainLink> evolvesTo;
}
