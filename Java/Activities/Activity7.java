package Activities;

public class Activity7 {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(4,0,25);
		System.out.println(mb.bicycleDescription());
		mb.speedUp(25);
		mb.applyBrake(6);

	}

}
