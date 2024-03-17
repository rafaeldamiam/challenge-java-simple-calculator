import java.util.Scanner;

public class Code{
	public static void main(String args[]){
		String result = "+";
		float numberOne = askNumber();
		String operation = askOperation();
		float numberTwo = askNumber();

		switch(operation){
			case "+":
				result = addition(numberOne,numberTwo);
				break;
			case "-":
				result = subtraction(numberOne,numberTwo);
				break;
			case "x":
				result = multiplication(numberOne,numberTwo);
				break;
			case "/":
				result = division(numberOne,numberTwo);
				break;
			default:
				System.out.println("Insert a valid operator");
				System.exit(0);
		}

		System.out.println("The operation calculed is: "+numberOne + operation + numberTwo + " = " + result);		
	}

	public static String addition(float n1, float n2){
		Float sum = n1 + n2;

		return Float.toString(sum);
	}
	public static String subtraction(float n1, float n2){
		Float minus = n1 - n2;

		return Float.toString(minus);
	}
	public static String multiplication(float n1, float n2){
		Float times = n1 * n2;

		return Float.toString(times);
	}
	public static String division(float n1, float n2){
		Float divide = n1 / n2;

		return Float.toString(divide);
	}

	public static String askOperation(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the operator (+,-,x,/):");

		String operation = input.nextLine();

		return operation;
	}

	public static float askNumber(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter with a number:");

		float number = Float.parseFloat(input.nextLine());

		return number;
	}
}