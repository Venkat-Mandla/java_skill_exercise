/**
 * 
 */
package com.venkat.exercise.app.sort;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author VenkaT
 *
 */
public class CollectionUtils {

	/**
	 * This method returns sorted List
	 * 
	 * @param Map map
	 * @param boolean ascendingOrder
	 * @return List
	 */
	public static List<Entry<String, Integer>> sortedList(Map<String, Integer> map, boolean ascendingOrder) {

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> listToOrder = new LinkedList<>(entrySet);

		Collections.sort(listToOrder, new MapEntryComparator(ascendingOrder));
		return listToOrder;
	}
	
	/**
	 * This method returns sorted map
	 * 
	 * @param Map map
	 * @param boolean ascendingOrder
	 * @return Map
	 */
	public static Map<String,Integer> sort(Map<String, Integer> map, boolean ascendingOrder) {

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> listToOrder = new LinkedList<>(entrySet);

		Collections.sort(listToOrder, new MapEntryComparator(ascendingOrder));
		Map<String, Integer> sortedMap=new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : listToOrder) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
