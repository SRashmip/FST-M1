package Activities;


public class Activity5 {

	public static void main(String[] args) {
		String Title = "hover car Racer";
		Book newNovel = new MyBook();
		newNovel.setTitle(Title);
		System.out.println("the Title is :"+ newNovel.getTitle());

	}

}
abstract class Book{
	String title;
	abstract void setTitle(String s);
	
	//concrete method
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String s) {
		title = s;
	}
}