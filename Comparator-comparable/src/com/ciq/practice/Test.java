package com.ciq.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
public static void main(String[] args) {
	Product p=new Product();
	p.name="Book";
	p.cost=120;
	Product p1=new Product();
	p1.name="pen";
	p1.cost=25;
	Product p2=new Product();
    p2.name="slatepen";
    p2.cost=15;
    
    ArrayList<Product> list=new ArrayList<>();
    list.add(p);
    list.add(p1);
    list.add(p2);
    list.forEach(x->{System.out.println(x.name+" "+x.cost);});
    System.out.println("====natural 2====");
    Collections.sort(list);
    list.forEach(x->{System.out.println(x.name+" "+x.cost);});
    
     System.out.println("====name comparator=====");
     NameComparator na=new NameComparator();
     Collections.sort(list,na);
     list.forEach(x->{System.out.println(x.name+" "+x.cost);});
     
     System.out.println("===cost compare====");
     CostComparor co=new CostComparor();
     Collections.sort(list,co);
     list.forEach(x->{System.out.println(x.name+" "+x.cost);});
}

}
