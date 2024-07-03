public class Flight extends Leg {
	public Flight(Location origin, Location destination, int distanceInKm, String days) {
		super(origin, destination, distanceInKm, days, 0.23);
		
		boolean valid = false;
		
		if(origin instanceof Airport && destination instanceof Airport) {
			valid = true;
		}
		
		for(int i = 0; i < days.length(); i++) {
			if(!("MTWRFSU".contains(days.substring(i, i + 1)))) {
				valid = false;
			}
		}
		
		if(distanceInKm < 0) {
			valid = false;
		}
		
		if(!valid) {
			super.setDaysAvailable("ERROR");
		} 
	}
}