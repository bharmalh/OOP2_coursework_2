import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList <String> student  = new ArrayList();
		ArrayList <Integer> OOP  = new ArrayList();   
		ArrayList <Integer> statistics  = new ArrayList();
		ArrayList <Integer> web_design  = new ArrayList();
		ArrayList <Integer> operating_systems  = new ArrayList();
		ArrayList <Integer> networking  = new ArrayList();
		ArrayList <Integer> system_analysis  = new ArrayList();

		Scanner scan = new Scanner(System.in);
		int counter=0;
		int average=0;
		String name;
		int marks=0;
		
		
		
		while(true)
		{
			//ENTERING THE STUDENT'S NAME
			System.out.println("Please enter the name of the student \nOR \nType 'exit'if you wish to quit");
			name=scan.next();
			if(name.toLowerCase().equals("exit"))
			{
				System.out.println("\nYou have quit successfully");
				break;
			}
			else {
				student.add(name);
			}

			//ENTERING MARKS
			System.out.println("Enter marks for OOP");
			marks=scan.nextInt();
			if(marks>=0 && marks<=100) 
			{
				OOP.add(marks);
			}
			else
			{
				System.out.println("ERROR! Enter marks between 0 and 100");
				marks=scan.nextInt();
				OOP.add(marks);
			}


			System.out.println("Enter marks for statistics");
			marks=scan.nextInt();
			if(marks>=0 && marks<=100) 
			{
				statistics.add(marks);
			}
			else
			{
				System.out.println("ERROR! Enter marks between 0 and 100");
				marks=scan.nextInt();
				statistics.add(marks);
			}
			
			System.out.println("Enter marks for Web Design");
			marks=scan.nextInt();
			if(marks>=0 && marks<=100) 
			{
				web_design.add(marks);
			}
			else
			{
				System.out.println("ERROR! Enter marks between 0 and 100");
				marks=scan.nextInt();
				web_design.add(marks);
			}
			
			System.out.println("Enter marks for Operating Systems");
			marks=scan.nextInt();
			if(marks>=0 && marks<=100) 
			{
				operating_systems.add(marks);
			}
			else
			{
				System.out.println("ERROR! Enter marks between 0 and 100");
				marks=scan.nextInt();
				operating_systems.add(marks);
			}
			
			System.out.println("Enter marks for networking");
			marks=scan.nextInt();
			if(marks>=0 && marks<=100) 
			{
				networking.add(marks);
			}
			else
			{
				System.out.println("ERROR! Enter marks between 0 and 100");
				marks=scan.nextInt();
				networking.add(marks);
			}
			
			System.out.println("Enter marks for Systems analysis");
			marks=scan.nextInt();
			if(marks>=0 && marks<=100) 
			{
				system_analysis.add(marks);
			}
			else
			{
				System.out.println("ERROR! Enter marks between 0 and 100");
				marks=scan.nextInt();
				system_analysis.add(marks);
			}

			average= (OOP.get(counter)+statistics.get(counter)+web_design.get(counter)+operating_systems.get(counter)+networking.get(counter)+system_analysis.get(counter))/6;
			System.out.println("\n\n*** Your average mark is: "+average+"% ***\n");
			counter++;

		}
	}

}
