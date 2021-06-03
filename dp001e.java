import java.util.Scanner;


public class dp001e {
	public static void main (String[] args) {
		String name="";
		String user="";
		int age=0;
		Scanner entry = new Scanner(System.in);

		System.out.println("Please enter your name:");
		System.out.print("> ");
		name = entry.nextLine();
		
		System.out.println("Please enter your age:");
		System.out.print("> ");
		age = entry.nextInt();
		
		System.out.println("Please enter your username:");
		System.out.print("> ");
		user = entry.nextLine();
		
		System.out.println("Your name is "+name+", you are "+age+" years old, and your username is "+user);
		
		System.exit(0);
	}
}
