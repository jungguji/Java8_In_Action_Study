package com.in.action.study.chapter2.p78;

import com.in.action.study.chapter2.Predicate;

import java.util.ArrayList;
import java.util.List;

public class FilteringApples<T> {

	public static <T> List<T> filter(List<T> inventory, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for(T e : inventory){
			if(p.test(e)){
				result.add(e);
			}
		}

		return result;
	}
}