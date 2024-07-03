import java.util.ArrayList;

public class SystemManager {
	private ArrayList<Location> locations = new ArrayList<Location>();
	private ArrayList<Leg> legs = new ArrayList<Leg>();

	public void addLocation(Location x) {
		locations.add(x);
	} // addLocation

	public void addLeg(Leg x) {
		if (!x.getDaysAvailable().equals("ERROR")) {
			legs.add(x);
		} // if
	} // addLeg
	
	public Location findLocation(String x) {
		for(int i = 0; i < locations.size(); i++) {
			if(locations.get(i).getName().equals(x)) {
				return locations.get(i);
			} // if
		} // for
		return null;
	} // findLocation
	
	// finds the route with the lowest number of steps
	public Route findMinStepsRoute(Location origin, Location destination, String day) {
		updateLocationLegs();
		return origin.minStepsRouteTo(destination, day);
	} // findMinStepsRoute
	
	// finds the route wit hthe lowest distance
	public Route findShortestKmRoute(Location origin, Location destination, String day) {
		updateLocationLegs();
		return origin.shortestKmRouteTo(destination, day);
	} // findShortestKmRoute
	
	// finds the route with the lowest cost
	public Route findCheapestRoute(Location origin, Location destination, String day) {
		updateLocationLegs();
		return origin.cheapestRouteTo(destination, day);
	} // findCheapestRoute

	// add connectingLegs to each location according to legs that are recorded
	public void updateLocationLegs() {
		for (int i = 0; i < locations.size(); i++) {
			for (int j = 0; j < legs.size(); j++) {
				if(legs.get(j).getOrigin().getName().equals(locations.get(i).getName())) {
					if (locations.get(i).getConnectingLegs() != null) {
						if (!locations.get(i).getConnectingLegs().contains(legs.get(j))) {
							locations.get(i).addConnection(legs.get(j));
						} // if
					} else {
						locations.get(i).setConnectingLegs(new ArrayList<Leg>());
						locations.get(i).addConnection(legs.get(j));
					} // else
				} // if
			} // for
		} // for
	} // updateLocationLegs
	
	// prints locations <=> legs in the following format:
	// location name: 
	// - leg type to destination
	public void printSystemDetails() {
		updateLocationLegs();
		System.out.println("------All Locations & Their Corresponding Legs------");
		for (Location l: locations) {
			System.out.println(l.getName() + ":");
			if (l.getConnectingLegs() != null) {
				for (Leg leg: l.getConnectingLegs()) {
					System.out.println("- " + leg.getClass().getName() + " connecting to " + leg.getDestination().getName());
				} // for
			} // if
			System.out.println();
		} // for
	} // printSystemDetails
	
}