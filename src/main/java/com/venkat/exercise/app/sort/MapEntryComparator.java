/**
 * 
 */
package com.venkat.exercise.app.sort;

import java.util.Comparator;
import java.util.Map.Entry;

/**
 * @author VenkaT
 *
 */
public class MapEntryComparator implements Comparator<Entry<String, Integer>> {

	private boolean ascendingOrder;

	public MapEntryComparator(boolean ascendingOrder) {
		this.ascendingOrder = ascendingOrder;
	}

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if (ascendingOrder) {
			return o1.getValue().compareTo(o2.getValue());
		} else {
			return o2.getValue().compareTo(o1.getValue());
		}
	}

}
