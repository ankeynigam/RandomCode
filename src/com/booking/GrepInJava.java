package com.booking;

import java.util.LinkedList;
import java.util.List;

/*
 * Class to test Grep functionality in Java
 * https://www.careercup.com/question?id=5147882054221824
 * 
 */
public class GrepInJava {
	
	public static void solve(String[] input, String word, int k) {

	    List<String> cappedList = new LinkedList<String>() {
		private static final long serialVersionUID = 1L;
		@Override
	      public boolean add(String s) {
	        if (size() > k) {
	          super.removeFirst();
	        }
	        return super.add(s);
	      }
	    };

	    for(String s : input) {
	      
	      if (s.equals(word)) {
	        break;
	      }
	      cappedList.add(s);
	    }
	    cappedList.stream().forEach(System.out::println);
	  }
	
	public static void main(String[] args) {
		solve(new String[] {"aaa","bbb", "ccc", "booking"}, "booking", 3);
		solve(new String[] {"booking", "alpha", "beta"}, "beta", 2);
	}
}
