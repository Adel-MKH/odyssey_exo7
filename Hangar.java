package wcs_quetes.java7;

public class Hangar {

	public static void main(String[] args) {
		Car mini = new Car("Mini", 88);
		System.out.println(mini.doStuff());
		
		Boat zodiac = new Boat("Zodiac", 12);
		System.out.println(zodiac.doStuff());
	}

}
