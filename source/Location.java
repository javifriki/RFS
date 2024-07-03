import java.util.ArrayList;

public class Location {
	private ArrayList<Leg> connectingLegs;
	private String name;
	
	public Location() {
		name = "";
	}
	
	public Location(String s) {
		name = s;
	}
	
	public void addConnection(Leg l) {
		connectingLegs.add(l);
	}
	
	// finds the route with the lowest number of steps
	public Route minStepsRouteTo(Location d, String day) {
		Route minStepsRoute = new Route();
		minStepsRoute.setLegs(new ArrayList<Leg>());
		Route currentRoute;
		int minSteps = Integer.MAX_VALUE;
		int currentSteps;
		
		// minimum finding algorithm
		if (this.connectingLegs != null) {
			for (Leg leg: this.connectingLegs) {
				if (leg.getDaysAvailable().contains(day)) {
					currentRoute = new Route();
					currentRoute.setLegs(new ArrayList<Leg>());
					
					// if destination of leg is final destination
					if (leg.getDestination().getName().equals(d.getName())) {
						currentRoute.addLeg(leg);
						currentSteps = currentRoute.totalSteps();
					} 
					// call recursive method starting from destination of leg to final destination
					else {
						currentRoute = leg.getDestination().minStepsRouteTo(d, day);
						currentRoute.addLeg(leg);
						currentSteps = currentRoute.totalSteps();
					} // else
					
					// if current step is minimum
					if (currentSteps <= minSteps) {
						minSteps = currentSteps;
						minStepsRoute = currentRoute;
					} // if
				} //if
			} // for
		} // if
		
		return minStepsRoute;
	} // findMinStepsRoute
	
	// finds the route wit hthe lowest distance
	public Route shortestKmRouteTo(Location d, String day) {
		Route minKmRoute = new Route();
		minKmRoute.setLegs(new ArrayList<Leg>());
		Route currentRoute;
		int minKm = Integer.MAX_VALUE;
		int currentKm;
		
		// minimum finding algorithm
		if (this.connectingLegs != null) {
			for (Leg leg: this.connectingLegs) {
				if (leg.getDaysAvailable().contains(day)) {
					currentRoute = new Route();
					currentRoute.setLegs(new ArrayList<Leg>());
					
					// if destination of leg is final destination
					if (leg.getDestination().getName().equals(d.getName())) {
						currentRoute.addLeg(leg);
						currentKm = currentRoute.totalDistance();
					} 
					// call recursive method starting from destination of leg to final destination
					else {
						currentRoute = leg.getDestination().shortestKmRouteTo(d, day);
						currentRoute.addLeg(leg);
						currentKm = currentRoute.totalDistance();
					} // else
					
					// if current step is minimum
					if (currentKm <= minKm) {
						minKm = currentKm;
						minKmRoute = currentRoute;
					} // if
				} //if
			} // for
		} else {
			minKmRoute.addLeg(new BikeLeg(d, this, 100000000, "MTWRFSU"));
		}
		
		return minKmRoute;
	} // findShortestKmRoute
	
	// finds the route with the lowest cost
	public Route cheapestRouteTo(Location d, String day) {
		Route minCostRoute = new Route();
		minCostRoute.setLegs(new ArrayList<Leg>());
		Route currentRoute;
		double minCost = Double.MAX_VALUE;
		double currentCost;
		
		// minimum finding algorithm
		if (this.connectingLegs != null) {
			for (Leg leg: this.connectingLegs) {
				if (leg.getDaysAvailable().contains(day)) {
					currentRoute = new Route();
					currentRoute.setLegs(new ArrayList<Leg>());
					
					// if destination of leg is final destination
					if (leg.getDestination().getName().equals(d.getName())) {
						currentRoute.addLeg(leg);
						currentCost = currentRoute.totalCost();
					} 
					// call recursive method starting from destination of leg to final destination
					else {
						currentRoute = leg.getDestination().cheapestRouteTo(d, day);
						currentRoute.addLeg(leg);
						currentCost = currentRoute.totalCost();
					} // else
					
					// if current step is minimum
					if (currentCost <= minCost) {
						minCost = currentCost;
						minCostRoute = currentRoute;
					} // if
				} //if
			} // for
		} else {
			minCostRoute.addLeg(new BikeLeg(d, this, 100000000, "MTWRFSU"));
		}
		
		return minCostRoute;
	} // findCheapestRoute
	
	// accessor & mutator methods
	
	public ArrayList<Leg> getConnectingLegs() {
		return connectingLegs;
	}

	public void setConnectingLegs(ArrayList<Leg> connectingLegs) {
		this.connectingLegs = connectingLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
