package com.cinesort.comparator.comparators;

import java.util.Comparator;

import com.cinesort.comparator.Cine;

//Comparator to sort by Cine name
public class CineNameComparator implements Comparator<Cine> {
 @Override
 public int compare(Cine m1, Cine m2) {
     return m1.getCineName().compareTo(m2.getCineName());
 }
}