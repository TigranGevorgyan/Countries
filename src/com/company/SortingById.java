package com.company;

import java.util.Comparator;

/**
 * Created by Taron on 04/10/17.
 */
public class SortingById implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o1.id - o2.id;
    }
}
