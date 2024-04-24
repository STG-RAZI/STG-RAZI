package helloJenkins.java8;

public class ClaculatorJava8 {

	public static float cal( float a, float b, CalInterface cal) {
		return cal.oprate(a, b);
	}

	public static void main(String[] args) {

		// Addition
		// Multiple lines [Correct]
		CalInterface add = (a, b) -> {
		 	return a + b;
		 	 
		};

		// CalInterface ad = (a,b)-> a + b;  //... In one line [Correct]
		
		// Substraction
		CalInterface subtract = (a, b) -> a - b;
		
		// Multiplication
		CalInterface multiply = (a,b) -> a * b;
		
		// Divide
		CalInterface divide = (a,b) -> {
			if(b !=0) {
				return a/b; 
			}else {
				throw new ArithmeticException("Can not divide by zero : ");
			}
			
		};
		
		// Example usage
		float num1 = 10;
		float num2 = 2;

        System.out.println("Addition: " + cal(num1, num2, add));
        System.out.println("Subtraction: " + cal(num1, num2, subtract));
        System.out.println("Multiplication: " + cal(num1, num2, multiply));
        System.out.println("Division: " + cal(num1, num2, divide));

	}
}
