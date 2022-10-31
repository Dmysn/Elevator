package de.uni.koeln.se;

public class Elv_States {
	
	public static String Moving_up = "Moving_up";
	public static  String Idle = "Idle";
	public static String Moving_down = "Moving_down";
	
	public String Current_State = Elv_States.Idle;
	
	private void go_up() {
		if(Elevator.current_Floor < Elevator.destination_floor) {
			String Current_State = Elv_States.Moving_up;
			if(Elevator.current_Floor < Elevator.destination_floor) {
				go_up();
			}
		}
		 
	}
	private void go_down() {
		if(Elevator.current_Floor > Elevator.destination_floor) {
			String Current_State = Elv_States.Moving_down;
			if(Elevator.current_Floor > Elevator.destination_floor) {
				go_down();
			}
		}
	}
	private void arrive_to_floor() {
		if(Elevator.current_Floor == Elevator.destination_floor) {
			String Current_State = Elv_States.Idle;
		}
	}

}
