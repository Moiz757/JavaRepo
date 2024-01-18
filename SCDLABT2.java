import java.util.InputMismatchException; 
import java.util.Scanner; 
public class SCDLABT2 {
	public static void main(String[] args) {
		int n1, n2, ans; 
		Scanner obj = new Scanner(System.in); 
		try { 
			System.out.print("Enter First number: ");  	            
			n1 = obj.nextInt(); 
			System.out.print("Enter Second number: ");  	            
			n2 = obj.nextInt();  	            
			ans = n1/n2; 
			System.out.println(n1+"/"+n2+" = "+ans); 
		} 
		catch (ArithmeticException e){ 
			System.out.println("Cannot divide number by zero"); 
		} 
		catch (InputMismatchException e){ 
			System.out.println("Input is invalid, please give integer number"); 
		}  	        
		finally { 
			System.out.println("Game Has been Ended"); 
		}
	}
}
