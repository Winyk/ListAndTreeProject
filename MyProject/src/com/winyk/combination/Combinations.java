package com.winyk.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// n个元素取m个组合(n > m , n != 0 , m != 0)

public class Combinations {

	public void Combination(List<Integer>selected , List<Integer>data , int n ){
		if(n == 0){
			for(Integer i : selected){
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			return ;
		}
		if(data.isEmpty()){
			return ;
		}
		
		selected.add(data.get(0));
		Combination(selected,data.subList(1, data.size()),n-1);
		
		selected.remove(selected.size()-1);
		Combination(selected,data.subList(1, data.size()),n);
	}
	
	public static void main(String[] args) {
		Combinations com = new Combinations();
		com.Combination(new ArrayList<>(), Arrays.asList(1,2,3,4), 2);
	}

}
