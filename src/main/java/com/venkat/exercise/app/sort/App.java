package com.venkat.exercise.app.sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author VenkaT
 *
 */
public class App {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		LOGGER.info("App starting..");
		
		Map<String, Integer> unsortedMap=new HashMap<String, Integer>();
		
		unsortedMap.put("a", 5);
		unsortedMap.put("b", 1);
		unsortedMap.put("c", 2);
		unsortedMap.put("d", 3);
		unsortedMap.put("e", 4);
		unsortedMap.put("f", 6);
		
		Map<String, Integer> ascendingOrderMap=CollectionUtils.sort(unsortedMap, true);
		LOGGER.info("AscendingOrderMap: {}", ascendingOrderMap);
		Map<String, Integer> descendingOrderMap=CollectionUtils.sort(unsortedMap, false);
		LOGGER.info("DescendingOrderMap: {}", descendingOrderMap);
		
		
		List<Entry<String, Integer>> ascendingOrderList=CollectionUtils.sortedList(unsortedMap, true);
		LOGGER.info("AscendingOrderList: {}", ascendingOrderList);
		List<Entry<String, Integer>>  descendingOrderList=CollectionUtils.sortedList(unsortedMap, false);
		LOGGER.info("DescendingOrderList: {}", descendingOrderList);
		
		LOGGER.info("Second largest: {}", descendingOrderList.get(1));
		

	}
}
