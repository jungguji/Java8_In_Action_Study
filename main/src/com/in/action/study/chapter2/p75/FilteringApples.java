package com.in.action.study.chapter2.p75;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.ApplePredicate;

import java.util.*;

public class FilteringApples{
	public List<Apple> filter(List<Apple> inventory, ApplePredicate p){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory){
			if(p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}       
}