package learning;
import java.util.*;

abstract class Person{
	public int age=19;
    public String name="Miguel";
    public abstract void study();
}
class Student extends Person{
	public int graduationYear=2018;
	public void study() {
		System.out.println("Studying all day long");
	}
}
public class Learning {
      
      
      
      
	

	public static void main(String[] args) {
		
		Student myObj=new Student();
		System.out.println("name= " + myObj.name);
		myObj.study();
		
		
		
		
		
		
	}

}
