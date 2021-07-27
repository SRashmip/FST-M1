package Activities;

public class Activity3 {

	public static void main(String[] args) {
		double seconds = 1000000000;
		double Earth = 31557600;
		double Mercury = 0.2408467;
		double Venus = 0.61519726;
		double Mars = 1.8808158;
		double Jupiter = 11.862615;
		double Saturn = 29.447498;
		double Uranus = 84.016846;
		double Neptune = 164.79132;
		
		
		System.out.println("Age of Earth:" + seconds/Earth);
		System.out.println("Age of Mercury:"+ seconds/Mercury);
		System.out.println("Age of Venus:"+ seconds/Venus);
		System.out.println("Age of Mars:"+ seconds/Mars);
		System.out.println("Age of jupiter:" + seconds/Jupiter);
		System.out.println("Age of Saturn:" + seconds/Saturn);
		System.out.println("Age of Uranus:"+ seconds/Uranus);
		System.out.println("Age of neptune:"+ seconds/Neptune);

	}

}
