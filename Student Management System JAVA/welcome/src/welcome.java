package studentsmanagementsystem;
import java.util.*;
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Welcome to students Management System ");
		System.out.println("Press enter to continue..... ");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		new Login();
		sc.close();
	}

}