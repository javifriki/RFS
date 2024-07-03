public class SampleTestCases {

	public static void main(String[] args) {
SystemManager sm = new SystemManager();
		
		// bikeDeliveryLocations
		Location b1 = new BikeDeliveryLocation("BikeDepot1");
		Location b2 = new BikeDeliveryLocation("BikeDepot2");
		Location b3 = new BikeDeliveryLocation("BikeDepot3");
		Location b4 = new BikeDeliveryLocation("BikeDepot4");
		Location b5 = new BikeDeliveryLocation("BikeDepot5");
		Location b6 = new BikeDeliveryLocation("BikeDepot6");
		Location b7 = new BikeDeliveryLocation("BikeDepot7");
		
		sm.addLocation(b1);
		sm.addLocation(b2);
		sm.addLocation(b3);
		sm.addLocation(b4);
		sm.addLocation(b5);
		sm.addLocation(b6);
		sm.addLocation(b7);
		
		// truckDepot 
		Location t1 = new TruckDepot("TruckDepot1");
		Location t2 = new TruckDepot("TruckDepot2");
		Location t3 = new TruckDepot("TruckDepot3");
		Location t4 = new TruckDepot("TruckDepot4");
		Location t5 = new TruckDepot("TruckDepot5");
		Location t6 = new TruckDepot("TruckDepot6");
		Location t7 = new TruckDepot("TruckDepot7");
		Location t8 = new TruckDepot("TruckDepot8");
		Location t9 = new TruckDepot("TruckDepot9");
		Location t10 = new TruckDepot("TruckDepot10");
		Location t11 = new TruckDepot("TruckDepot11");
		Location t12 = new TruckDepot("TruckDepot12");
		
		sm.addLocation(t1);
		sm.addLocation(t2);
		sm.addLocation(t3);
		sm.addLocation(t4);
		sm.addLocation(t5);
		sm.addLocation(t6);
		sm.addLocation(t7);
		sm.addLocation(t8);
		sm.addLocation(t9);
		sm.addLocation(t10);
		sm.addLocation(t11);
		sm.addLocation(t12);

		// airports
		Location a1 = new Airport("Airport1");
		Location a2 = new Airport("Airport2");
		Location a3 = new Airport("Airport3");
		Location a4 = new Airport("Airport4");
		
		sm.addLocation(a1);
		sm.addLocation(a2);
		sm.addLocation(a3);
		sm.addLocation(a4);
				
	    // legs
		sm.addLeg(new BikeLeg(b1, t3, 10, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t3, b2, 15, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b2, t6, 20, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t6, a2, 65, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b1, t5, 25, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b3, t2, 10, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t2, b2, 30, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t2, t5, 20, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t5, a1, 40, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t1, b4, 25, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b4, t5, 10, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t1, t4, 50, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t4, t5, 20, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t4, a1, 80, "MTWRFSU"));
		sm.addLeg(new Flight(a2, a4, 450, "MTWRFSU"));
		sm.addLeg(new Flight(a2, a3, 400, "MTWRFSU"));
		sm.addLeg(new Flight(a1, a3, 500, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a1, t7, 75, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t7, t11, 350, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a4, t9, 20, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a4, t8, 35, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a3, t8, 25, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a3, t10, 50, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t10, t11, 150, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t8, b6, 15, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t8, t12, 100, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t9, t12, 40, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t11, b7, 14, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t11, b6, 10, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b6, b5, 12, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t12, b5, 5, "MTWRFSU"));

		// BikeDepot1 to TruckDepot8
		System.out.println("---b1 to t8---");
		Route rA = sm.findCheapestRoute(sm.findLocation("BikeDepot1"), sm.findLocation("TruckDepot8"), "S");
		System.out.println("Cheapest Route: ");
		System.out.println(rA);

		Route rB = sm.findShortestKmRoute(sm.findLocation("BikeDepot1"), sm.findLocation("TruckDepot8"), "S");
		System.out.println("Shortest Route in Km: ");
		System.out.println(rB);

		// TruckDepot1 to BikeDepot5
		System.out.println("---t1 to b5---");
		Route rC = sm.findCheapestRoute(sm.findLocation("TruckDepot1"), sm.findLocation("BikeDepot5"), "S");
		System.out.println("Cheapest Route: ");
		System.out.println(rC);

		Route rD = sm.findShortestKmRoute(sm.findLocation("TruckDepot1"), sm.findLocation("BikeDepot5"), "S");
		System.out.println("Shortest Route in Km: ");
		System.out.println(rD);

	}

}