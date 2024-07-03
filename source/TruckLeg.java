public class TruckLeg extends Leg {

	public TruckLeg(Location origin, Location destination, int distanceInKm, String days) {
		super(origin, destination, distanceInKm, days, 0.58);
		
		boolean valid = false;
		
		if((origin instanceof TruckDepot || destination instanceof TruckDepot) && !(origin instanceof BikeDeliveryLocation || destination instanceof BikeDeliveryLocation)) {
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