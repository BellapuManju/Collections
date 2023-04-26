package com.ciq.practice;

import java.util.Comparator;

public class CostComparor implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.cost-o2.cost;
	}

}
