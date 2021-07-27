package JunitActivities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;




public class Activity1 {
	static ArrayList<String> list;
	@BeforeEach
	void setUp() throws Exception{
     list = new ArrayList<String>();
     list.add("alpha");
     list.add("beta");
	}
@Test
public void insertTest() {
	assertEquals(2,list.size(),"Wrong size");
	//add new element
	list.add("ray");
	//assert with new element
	assertEquals(3,list.size(),"Wrong size");
	
	//to check each value in arraylist
	assertEquals("alpha",list.get(0),"Wrong element");
	assertEquals("beta",list.get(1),"Wrong element");
	assertEquals("ray",list.get(2),"Wrong element");
}
@Test
public void replaceTest() {
	//replace
	list.set(1,"ray");
	assertEquals(2,list.size(),"Wrong size");
	assertEquals("alpha",list.get(0),"Wrong element");
	assertEquals("beta",list.get(1),"Wrong element");
	
}

}
