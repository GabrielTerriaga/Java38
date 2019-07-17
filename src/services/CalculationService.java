package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		
		if(list.isEmpty()) {
			throw new IllegalStateException("List cant1 be empty");
		}
		//Varaivel max do tipo T(generic) recebe primeiro elemento na lista
		T max = list.get(0);
		//percorrer lista
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
