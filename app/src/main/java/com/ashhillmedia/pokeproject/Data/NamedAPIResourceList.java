package com.ashhillmedia.pokeproject.Data;

import java.util.List;

public class NamedAPIResourceList {
    int count;
    String next;
    boolean previous;
    List<NamedAPIResource> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public boolean isPrevious() {
        return previous;
    }

    public List<NamedAPIResource> getResults() {
        return results;
    }
}
