
package com.course.objects;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author rafiul
 * There are two general way for comparing of objects in java
 * First: Implement Comparable Interface in your object which
 * have an abstract method name compareTo(Object o). Which will 
 * allow your object to compare with other same class objects
 * 
 * Second: Use Comparator Interface which which allow you to create
 * an instant compare functionality with its abstract method name
 * compare(Object o1, Object o2)
 */
class Box implements Comparable<Box>{
	public int h;
	public int w;
	public int l;

	public Box(int h, int w, int l){
		this.h = h;
		this.w = w;
		this.l = l;
	}
	public int compareTo(Box o){
		if(o.h > this.h) return 1;
		if(o.h < this.h) return -1;
		return 0;
	}

	public String toString(){
		return String.format("h: %d, w: %d, l: %d",h,w,l);
	}

}
public class ObjectCompare{

	public static void main(String[] args) {
		ArrayList<Box> list1 = new ArrayList<Box>();

		list1.add(new Box(2,4,6));
		list1.add(new Box(1,2,3));
		list1.add(new Box(4,8,12));
                Collections.sort(list1);
		
                System.out.println("First Example");
		for(Box b : list1){
			System.out.println(b);
		}

		/*-----------------------------------------------*/
		Comparator<Box> c = new Comparator<Box>(){
			public int compare(Box o1, Box o2){
				if(o1.h > o2.h) return 1;
				if(o1.h < o2.h) return -1;
				return 0;
			}
		};
		ArrayList<Box> list2 = new ArrayList<Box>();

		list2.add(new Box(2,4,6));
		list2.add(new Box(1,2,3));
		list2.add(new Box(4,8,12));

		list2.sort(c);
                
                System.out.println("Second Example");
		for(Box b : list2){
			System.out.println(b);
		}
	}
}