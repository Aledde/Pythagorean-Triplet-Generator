import java.util.Scanner;

public class Pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Aledde's Pythagorean Triplet Generator! Enter Two Numbers to Create a Pythagorean Triplet!");
		System.out.println("Acknowledgements: Some Code Taken From Tyocean's Calculator, Idea Borrowed (Stolen) from @Tommsy64 from the Geometry Textbook of Death.");
		System.out.println("If You Would like To Improve This Program to Accept Decimals/Tell the User that He/She failed when inputting text, please use GitHub.");
		System.out.println("Please Enter the First Number:");
		Scanner scanner1 = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner1.next());
		System.out.println("Please Enter the Second Number:");
		Scanner scanner2 = new Scanner(System.in);
		int num2 = Integer.parseInt(scanner2.next());
		if(num2 > num1){
			System.out.println("The Two Numbers That You Have Entered Do Not Form a Pythagorean Triplet! The First Must be Greater than the Second!");
		}
		else{
			int a = num1 * num1 - num2 * num2;
			int b = 2 * num1 * num2;
			int c = num2 * num2 + num1 * num1;
			System.out.println("This is Your Pythagorean Triplet! ");
			System.out.println(a + ", " + b + ", " + c + ". "); 
		}
	}

}