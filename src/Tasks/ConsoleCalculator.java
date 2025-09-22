package Tasks;
import java.util.Scanner;
public class ConsoleCalculator {
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean Running = true;
		
		System.out.println("=======================");
		System.out.println("JAVA CONSOLE CALCULATOR");
		System.out.println("=======================");
		
		while(Running) {
			System.out.println("\nChoose An Operator");
			System.out.println("------------------");
			System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.println("Enter Choice :");
            int choice = input.nextInt();
            if(choice<1 || choice >5) {
            	System.out.println("Invalid Choice! Try Again");
            	continue;
            }
            if(choice==5) {
            	Running = false;
            	System.out.println("Exiting Console Calculator ....");
            	break;
            }
            
            System.out.println("Enter First Number : ");
            double num1 = input.nextDouble();
            System.out.println("Enter Second Number : ");
            double num2 = input.nextDouble();
            
           
            double result = 0;
            
            switch(choice) {
            
            	case 1: result = add(num1,num2); break;
            	case 2: result = subtract(num1,num2); break;
            	case 3: result = multiply(num1,num2); break;
            	case 4: result = divide(num1,num2); break;
            	
            	
            }
            
            if(!Double.isNaN(result)) {
            	System.out.println("Result : "+result);
            	
            }
		}
		
		input.close();
		
	}
	
	
	
	public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; 
        }
        return a / b;
    }

}
