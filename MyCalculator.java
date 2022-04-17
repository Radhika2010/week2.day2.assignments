package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator obj = new Calculator ();
	int addition = obj.add(5,6,7);
	 System.out.println(addition);
	 
	 int subtraction = obj.sub(8,7);
	 System.out.println(subtraction);
	 
	 double multiplication = obj.mul(2.0,4.0);
	System.out.println(multiplication);		 
	
	float division = obj.divide(8.0f,2.0f);
	System.out.println(division);
}
}
