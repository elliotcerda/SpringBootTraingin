package com.training.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	//Sorting Array
	//Search array
	//Return the result
	
	@Autowired
	private SortAlgorithm sortAlgorithm;


	
//	Autowiring via constructor
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}


//	Autowiring via setter
//	@Autowired
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}



	public int binarySeach(int[] numbers, int numberToSearchFor) {
		int [] sortNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Implementing sorting logic
			
		//search the array
		
		return 3;
}
}
