public class BikeLeg extends Leg{
	public BikeLeg (Location origin, Location destination, int distanceInKm, String days) {
		super(origin, destination, distanceInKm, days, 1.0);
		boolean valid = false;
		
		if((origin instanceof BikeDeliveryLocation || destination instanceof BikeDeliveryLocation) && !(origin instanceof Airport || destination instanceof Airport)) {
			valid = true;
		}
		
		for(int i = 0; i < days.length(); i++) {
			if(!("MTWRFSU".contains(days.substring(i,i+1)))) {
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