import java.util.ArrayList;

public class Route {
	private ArrayList<Leg> legs;

	public int totalSteps() {
		return legs.size();
	}
	
	public int totalDistance() {
		int sum = 0;
		for (Leg l: legs) {
			sum += l.getDistance();
		}
		return sum;
	}
	
	public double totalCost() {
		double sum = 0;
		for (Leg l: legs) {
			sum += l.getDistance() * l.getCostPerKm();
		}
		return sum;
	}
	
	public void addLeg(Leg l) {
		legs.add(l);
	}
	
	public ArrayList<Leg> getLegs() {
		return legs;
	}

	public void setLegs(ArrayList<Leg> legs) {
		this.legs = legs;
	}
	
	public String toString() {
		String output = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		output += "Steps: " + totalSteps() + " Distance: " + totalDistance() + " Cost " + totalCost() + "\n";
		
		for (int i = legs.size() - 1; i >= 0; i--) {
			output += "Origin: " + legs.get(i).getOrigin().getName() + " Destination: " + legs.get(i).getDestination().getName() + "\n";
		}
		output += "Route End.\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
		return output;
	} // toString
	
}
