package Activities;



public class Activity6 extends Plane {

	public Activity6(int maxPassengers) {
		super(maxPassengers);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Steve");
		plane.onboard("nesin");
		plane.onboard("Lee");
		System.out.println("Plane took off at:"+ plane.takeOff());
	   //people on board
		System.out.println("People on plane:"+ plane.getPassengers());
		//Flight on Air
		Thread.sleep(5000);
		//plane landed
		plane.land();
		System.out.println("Plane landed at :"+ plane.getLastTimeLanded());
		System.out.println("People on plane after landing:"+ plane.getPassengers());

	}

}

