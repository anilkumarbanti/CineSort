package com.cinesort.comparator.comparators;

import java.util.Comparator;

import com.cinesort.comparator.Cine;

//Comparator to sort by Cine ID
public class CineIdComparator implements Comparator<Cine> {
 @Override
 public int compare(Cine m1, Cine m2) {
     return Integer.compare(m1.getCineId(), m2.getCineId());
 }
}