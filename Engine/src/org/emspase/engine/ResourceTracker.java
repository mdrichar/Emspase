package org.emspase.engine;

import java.util.HashMap;
import java.util.Map;

public class ResourceTracker {
	Map<PrizeType,Integer> resources;
	public ResourceTracker() {
		this.resources = new HashMap<PrizeType,Integer>();
		resources.put(PrizeType.BLUE,new Integer(0));
		resources.put(PrizeType.GREEN,new Integer(0));
		resources.put(PrizeType.RED,new Integer(0));
		resources.put(PrizeType.YELLOW,new Integer(0));
	}
	void addResource(Prize prize) {
		Integer current = resources.get(prize.getPrize());
		Integer updated = current.intValue() + prize.getQuantity();
		resources.put(prize.getPrize(), updated);
	}

}
