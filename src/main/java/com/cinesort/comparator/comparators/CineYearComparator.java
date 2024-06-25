package com.cinesort.comparator.comparators;

import java.util.Comparator;

import com.cinesort.comparator.Cine;

//Comparator to sort by Cine year
public class CineYearComparator implements Comparator<Cine> {
 @Override
 public int compare(Cine m1, Cine m2) {
     return Integer.compare(m1.getCineYear(), m2.getCineYear());
 }
}