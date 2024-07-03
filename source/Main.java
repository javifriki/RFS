public class Main {

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
		Location b8 = new BikeDeliveryLocation("BikeDepot8");
		Location b9 = new BikeDeliveryLocation("BikeDepot9");
		Location b10 = new BikeDeliveryLocation("BikeDepot10");
		Location b11 = new BikeDeliveryLocation("BikeDepot11");
		Location b12 = new BikeDeliveryLocation("BikeDepot12");
		Location b13 = new BikeDeliveryLocation("BikeDepot13");
		Location b14 = new BikeDeliveryLocation("BikeDepot14");
		Location b15 = new BikeDeliveryLocation("BikeDepot15");
		Location b16 = new BikeDeliveryLocation("BikeDepot16");
		
		sm.addLocation(b1);
		sm.addLocation(b2);
		sm.addLocation(b3);
		sm.addLocation(b4);
		sm.addLocation(b5);
		sm.addLocation(b6);
		sm.addLocation(b7);
		sm.addLocation(b8);
		sm.addLocation(b9);
		sm.addLocation(b10);
		sm.addLocation(b11);
		sm.addLocation(b12);
		sm.addLocation(b13);
		sm.addLocation(b14);
		sm.addLocation(b15);
		sm.addLocation(b16);
		
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
		Location t13 = new TruckDepot("TruckDepot13");
		Location t14 = new TruckDepot("TruckDepot14");
		Location t15 = new TruckDepot("TruckDepot15");
		Location t16 = new TruckDepot("TruckDepot16");
		Location t17 = new TruckDepot("TruckDepot17");
		Location t18 = new TruckDepot("TruckDepot18");
		Location t19 = new TruckDepot("TruckDepot19");
		Location t20 = new TruckDepot("TruckDepot20");
		Location t21 = new TruckDepot("TruckDepot21");
		Location t22 = new TruckDepot("TruckDepot22");
		Location t23 = new TruckDepot("TruckDepot23");
		
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
		sm.addLocation(t13);
		sm.addLocation(t14);
		sm.addLocation(t15);
		sm.addLocation(t16);
		sm.addLocation(t17);
		sm.addLocation(t18);
		sm.addLocation(t19);
		sm.addLocation(t20);
		sm.addLocation(t21);
		sm.addLocation(t22);
		sm.addLocation(t23);

		// airports
		Location a1 = new Airport("Airport1");
		Location a2 = new Airport("Airport2");
		Location a3 = new Airport("Airport3");
		Location a4 = new Airport("Airport4");
		Location a5 = new Airport("Airport5");
		Location a6 = new Airport("Airport6");
		Location a7 = new Airport("Airport7");
		Location a8 = new Airport("Airport8");
		Location a9 = new Airport("Airport9");
		Location a10 = new Airport("Airport10");
		
		sm.addLocation(a1);
		sm.addLocation(a2);
		sm.addLocation(a3);
		sm.addLocation(a4);
		sm.addLocation(a5);
		sm.addLocation(a6);
		sm.addLocation(a7);
		sm.addLocation(a8);
		sm.addLocation(a9);
		sm.addLocation(a10);
				
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
		sm.addLeg(new BikeLeg(t12, b5, 5, "MTWRFSU")); // end
		sm.addLeg(new BikeLeg(b8, b3, 40, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b8, t1, 35, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b8, t13, 35, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t13, t4, 60, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t13, t14, 50, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t14, t7, 250, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t14, a5, 70, "MTWRFSU"));
		sm.addLeg(new Flight(a5, a4, 1000, "MTWRFSU"));
		sm.addLeg(new Flight(a5, a3, 550, "MTWRFSU"));
		sm.addLeg(new Flight(a5, a6, 300, "MTWRFSU"));
		sm.addLeg(new Flight(a1, a6, 650, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a6, t15, 80, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t15, t9, 450, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t15, b9, 15, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b9, b10, 40, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b6, b10, 25, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b5, b10, 15, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b7, t16, 30, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b10, b11, 15, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b10, t17, 25, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t16, t18, 80, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t16, b12, 10, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b11, t18, 20, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t18, t17, 90, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b12, t17, 20, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t18, a7, 65, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t18, a9, 100, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t17, a9, 50, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t17, a10, 250, "MTWRFSU"));
		sm.addLeg(new Flight(a4, a7, 600, "MTWRFSU"));
		sm.addLeg(new Flight(a7, a9, 600, "MTWRFSU"));
		sm.addLeg(new Flight(a7, a8, 450, "MTWRFSU"));
		sm.addLeg(new Flight(a9, a8, 700, "MTWRFSU"));
		sm.addLeg(new Flight(a9, a10, 300, "MTWRFSU"));
		sm.addLeg(new Flight(a10, a8, 900, "MTWRFSU"));
		sm.addLeg(new Flight(a6, a8, 1600, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a7, t19, 500, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a8, t19, 150, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a8, t20, 65, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a10, t20, 150, "MTWRFSU"));
		sm.addLeg(new TruckLeg(a10, t21, 70, "MTWRFSU"));
		sm.addLeg(new TruckLeg(t19, t23, 85, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t20, b13, 45, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t21, b13, 30, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t23, b13, 75, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t23, b16, 5, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t23, b15, 10, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b13, t22, 15, "MTWRFSU"));
		sm.addLeg(new BikeLeg(b13, b14, 20, "MTWRFSU"));
		sm.addLeg(new BikeLeg(t22, b15, 15, "MTWRFSU"));
		
		
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

		// BikeDepot1 to BikeDepot5
		System.out.println("---b1 to b5---");
		Route rE = sm.findCheapestRoute(sm.findLocation("BikeDepot1"), sm.findLocation("BikeDepot5"), "S");
		System.out.println("Cheapest Route: ");
		System.out.println(rE);

		Route rF = sm.findShortestKmRoute(sm.findLocation("BikeDepot1"), sm.findLocation("BikeDepot5"), "S");
		System.out.println("Shortest Route in Km: ");
		System.out.println(rF);
		
		// BikeDepot10 to BikeDepot15
		System.out.println("---b10 to b15---");
		Route rG = sm.findCheapestRoute(sm.findLocation("BikeDepot10"), sm.findLocation("BikeDepot15"), "S");
		System.out.println("Cheapest Route: ");
		System.out.println(rG);
		
		Route rH = sm.findShortestKmRoute(sm.findLocation("BikeDepot10"), sm.findLocation("BikeDepot15"), "S");
		System.out.println("Shortest Route in Km: ");
		System.out.println(rH);
		
		// BikeDepot8 to BikeDepot16
		System.out.println("---b8 to b16---");
		Route rI = sm.findCheapestRoute(sm.findLocation("BikeDepot8"), sm.findLocation("BikeDepot16"), "S");
		System.out.println("Cheapest Route: ");
		System.out.println(rI);

		Route rJ = sm.findShortestKmRoute(sm.findLocation("BikeDepot8"), sm.findLocation("BikeDepot16"), "S");
		System.out.println("Shortest Route in Km: ");
		System.out.println(rJ);

		// BikeDepot1 to BikeDepot14
		System.out.println("---b1 to b14---");
		Route rK = sm.findCheapestRoute(sm.findLocation("BikeDepot1"), sm.findLocation("BikeDepot14"), "S");
		System.out.println("Cheapest Route: ");
		System.out.println(rK);

		Route rL = sm.findShortestKmRoute(sm.findLocation("BikeDepot1"), sm.findLocation("BikeDepot14"), "S");
		System.out.println("Shortest Route in Km: ");
		System.out.println(rL);
		
	}

}