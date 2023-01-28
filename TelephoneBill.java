import java.util.Scanner;
public class TelephoneBill {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total calls you made : ");
		int totalCalls = scanner.nextInt();
		int bill = 0;
		if(totalCalls <= 100) 
		{
			bill+=200;
			System.out.println("Your bill Amount : "+bill);
		}
		else if(totalCalls >100 && totalCalls <=150) 
		{	
			int balance = totalCalls - 100;
			bill+=200;
			bill+= balance * 0.60;
			System.out.println("Your bill Amount : "+bill);
		}
		else if (totalCalls > 150 && totalCalls <=200) 
		{
			int balance = totalCalls - 100;
			bill+=200;
			bill+= balance * 0.50;
			System.out.println("Your bill Amount : "+bill);
		}
		else 
		{
			int balance = totalCalls - 100;
			bill += 200;
			bill += balance * 0.40;
			System.out.println("Your bill Amount : "+bill);
		}
}
}