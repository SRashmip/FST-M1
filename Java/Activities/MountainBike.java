package Activities;

public class MountainBike extends Bicycle {
	public int seatHeight;
	public MountainBike(int gears, int currentSpeed, int startHeight) {
		super(gears, currentSpeed);
		seatHeight = startHeight;
	}
public void setHeight(int newValue) {
	seatHeight = newValue;
}
public String bicycleDescription() {
	return (super.bicycleDescription()+ "\n Seat height is "+ seatHeight);
}
}
