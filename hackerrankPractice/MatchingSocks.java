package com.hackerrankPractice;

import java.util.HashMap;
import java.util.Map;

public class MatchingSocks {

	public static void main(String[] args) {

	}

	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		
		for(int i=0; i < ar.length; i++) {
			if(map.containsKey(ar[i])) map.put(ar[i], map.get(ar[i]) + 1);
			else map.put(ar[i], 1);
		}
		
		for(Integer i : map.values()) {
			count  =+ i/2;
		}
		
		return count;
	}

}
