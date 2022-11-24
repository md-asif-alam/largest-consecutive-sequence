package com.asif.map;

import java.util.HashMap;
import java.util.Map;

public class LargestConsecutiveSequenece {

	public static void main(String[] args) {
		
		int[] arr= {10,5,9,1,11,8,6,15,3,12,2};
		
		Map<Integer,Boolean> map=new HashMap<>();
		
		for(int val:arr)
		{
			map.put(val, true);
		}
		
		for(int val:arr)
		{
			if(map.containsKey(val-1)) {
				map.put(val, false);
			}
		}
		
		int ml=0;
		int msp=0;
		for(int val:arr)
		{
			if(map.get(val)==true)
			{
				int tl=1;
				int tsp=val;
				while(map.containsKey(tsp+tl))
				{
					tl++;
				}
				if(tl>ml)
				{
					msp=tsp;
					ml=tl;
				}
			}
		}
		
		for(int i=0;i<ml;i++)
		{
			System.out.println(msp+i);
		}

	}

}
