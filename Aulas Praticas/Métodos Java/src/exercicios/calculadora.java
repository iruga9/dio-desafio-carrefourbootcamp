	package exercicios;
	import java.util.Scanner;
	
	public class calculadora {
		
		public static void main(String [] args) {
			
			Scanner keyboardInput = new Scanner(System.in);
			
			System.out.print("Entre com um numero: ");
			double num1 = keyboardInput.nextDouble();
			
			System.out.print("Entre com um operador: ");
			String op = keyboardInput.next();
			
			System.out.print("Entre com outro numero: ");
			double num2 = keyboardInput.nextDouble();
			
			
			if(op.equals("+")){
				System.out.println(num1 + num2);
			}else if(op.equals("-")) {
				System.out.println(num1 - num2);
			}else if(op.equals("/")) {
				System.out.println(num1 / num2);
			}else if(op.equals("*")) {
				System.out.println(num1 * num2);
			}else {
				System.out.println("Operador Invalido!");
			}
		}
	
	}
	
	
	
