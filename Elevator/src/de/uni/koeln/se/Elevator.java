package de.uni.koeln.se;

public class Elevator{
	
	public static final int current_Floor = 0;
	public static int current_Floor=5;
	public static int destination_floor;
	public static int current_Floor;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}

	private void arrive_atFloor() {
		
	}

	
}
