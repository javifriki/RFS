public class Leg {

	private Location origin;
	private Location destination;
	private String daysAvailable;
	private int distance;
	private double costPerKm;
	
	public Leg (Location origin, Location destination, int distanceInKm, String days, double costPerKm) {
		this.origin = origin;
		this.destination = destination;
		this.daysAvailable = days;
		this.distance = distanceInKm;
		this.costPerKm = costPerKm;
	}

	public Location getOrigin() {
		return origin;
	}

	public void setOrigin(Location origin) {
		this.origin = origin;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	public String getDaysAvailable() {
		return daysAvailable;
	}

	public void setDaysAvailable(String daysAvailable) {
		this.daysAvailable = daysAvailable;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getCostPerKm() {
		return costPerKm;
	}

	public void setCostPerKm(double costPerKm) {
		this.costPerKm = costPerKm;
	}
	
	public boolean equals(Leg x) {
		if(this.origin.equals(x.origin) && this.destination.equals(x.destination) && this.daysAvailable.equals(x.daysAvailable) && this.distance == x.distance && this.costPerKm == x.costPerKm) {
			return true;
		}
		return false;
	}
	
}