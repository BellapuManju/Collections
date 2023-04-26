package com.ciq.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class comparabletest {
	public static void main(String[] args) {
		Student st=new Student();
		st.name="Manju";
		st.age= 05;
		
		Student st1=new Student();
		st1.name="Raj";
		st1.age= 21;
		
		Student st2=new Student();
		st2.name="Anu";
		st2.age=20;
		
		Student st3=new Student();
		st3.name="Varsha";
		st3.age=24;
		
//->first-1	this is the first way 
		
ArrayList<Student> list=new ArrayList<>();
list.add(st);
list.add(st1);
list.add(st2);
list.add(st3);

list.forEach(x-> {System.out.println(x.age+" "+x.name);
});

//->first-2	this is the first way 

System.out.println("===============before sorting=====");
//Collections.sort(list);
list.forEach(x-> {System.out.println(x.age+" "+x.name);
});


// Age Comparator test


Agecomparator ag=new Agecomparator();
System.out.println("=====age comparator sorting work======");
Collections.sort(list, ag);
list.forEach(x-> {System.out.println(x.age+" "+x.name);
});

//  Name comparator test

NameComparator na=new NameComparator();
System.out.println("========Name comparator test=======");
Collections.sort(list, na);
list.forEach(x-> {System.out.println(x.age+" "+x.name);

});
}
}
