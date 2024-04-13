package trigCalc;

import java.util.Scanner;

public class TrigCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
		        System.out.println("1- Pythagoras Theorem"
		        		+ "\n2- Sin"
		        		+ "\n3- Cos"
		        		+ "\n4- tan\n\n"
		        		+ "Choose (1/2/3/4):");
		        int choice = sc.nextInt();
		        Double x;
		        if (choice == 1) {
		        	System.out.println("If ABC is a right angle tringle at angle B");
		        	System.out.print("AB = ");
		        	Double ab = sc.nextDouble();
		        	System.out.print("BC = ");
		        	Double bc = sc.nextDouble();
		        	System.out.println("AC = " + Math.sqrt(Math.pow(ab, 2) + Math.pow(bc, 2)));
		        	
		        }else if (choice == 2) {
		        	System.out.println("If Sin X = Y");
		    		System.out.print("X = ");
		    		x = sc.nextDouble();
		        	System.out.println("Y = " + Math.sin(x));
		        	
		        } else if (choice == 3) {
		        	System.out.println("If Cos X = Y");
		    		System.out.print("X = ");
		    		x = sc.nextDouble();
		        	System.out.println("Y = " + Math.cos(x));
		        	
		        }else if (choice == 4) {
		        	System.out.println("If Tan X = Y");
		    		System.out.print("X = ");
		    		x = sc.nextDouble();
		        	System.out.println("Y = " + Math.tan(x));
		        } else {err();}
			} catch (Exception e) {err();break;}
			System.out.println("\n");
		}
	}

	private static void err() {
		System.out.println("Invalid Input!");
	}
}
