package de.uni.koeln.se;

public class Elevator{
	
	
	public static int current_Floor=5;
	public static int destination_floor;
	
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.destination_floor=dest_floor;
	System.out.println("*** Destination floor is: "+ destination_floor);
	elv();


	}
	
	public String Current_State = State.Idle;
	
	public void elv() {
		if(Elevator.current_Floor < Elevator.destination_floor) {
			go_up();
		}else if(Elevator.current_Floor > Elevator.destination_floor) {
			go_down();
		}else if(Elevator.current_Floor == Elevator.destination_floor) {
			arrive_to_floor();
		}
	}
	
	private void go_up() {
		String Current_State = State.Moving_up;
		System.out.println("Moving Up..." + "current level:" + current_Floor);
		current_Floor = current_Floor + 1;
		elv();
		
			 
	}
	private void go_down() {
			String Current_State = State.Moving_down;
			System.out.println("Moving Down..." + "current level:" + current_Floor);
			current_Floor = current_Floor - 1;
			elv();
		
	}
	private void arrive_to_floor() {
			String Current_State = State.Idle;
			System.out.println("Arrived at Floor:" + destination_floor);
	}
	

	
}
