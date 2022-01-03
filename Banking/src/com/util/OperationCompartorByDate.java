package com.util;

import java.util.Comparator;

import com.model.Operation;

public class OperationCompartorByDate implements Comparator<Operation>{

	@Override
	public int compare(Operation o1, Operation o2) {
		return o1.getDate().compareTo(o2.getDate());
		
	}

}
