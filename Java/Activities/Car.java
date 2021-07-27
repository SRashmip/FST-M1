package Activities;

public class Car {
String color;
String transmission;
int make;
int tyres;
int doors;

public Car() {
	tyres=4;
	doors=4;
	
}
public void displayCharacteristics() {
	System.out.println("value of color:"+color);
	System.out.println("value of transmission:"+transmission);
	System.out.println("value of make:"+make);
	System.out.println("value of tyres:"+tyres);
	System.out.println("value of doors:"+doors);
}
public void accelarate() {
	System.out.println("Car is moving forward");
}
public void brake() {
	System.out.println("Car has stopped");
}
}
