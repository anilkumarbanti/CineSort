package com.cinesort.comparator.comparators;

import java.util.Comparator;

import com.cinesort.comparator.Cine;

//Comparator to sort by Cine rating
public class CineRatingComparator implements Comparator<Cine> {
 @Override
 public int compare(Cine m1, Cine m2) {
     return Double.compare(m1.getCineRating(), m2.getCineRating());
 }
}
