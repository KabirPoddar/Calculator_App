package calculator_app;

import java.util.Scanner;

public class Main {
	

	  public static void main(String[] args) {

	    char operator;
	    Double firstnumber, secondnumber, answer;

	    // create an object of Scanner class
	    Scanner dave = new Scanner(System.in);
	    
	    
	    // ask users to enter an operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = dave.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter the first number");
	    firstnumber = dave.nextDouble();

	    System.out.println("Enter the second number");
	    secondnumber = dave.nextDouble();

	    switch (operator) {

	      // adds the numbers
	      case '+':
	        answer = firstnumber + secondnumber;
	        System.out.println(firstnumber + " + " + secondnumber + " = " + answer);
	        break;

	      // subtracts the numbers
	      case '-':
	        answer = firstnumber - secondnumber;
	        System.out.println(firstnumber + " - " + secondnumber + " = " + answer);
	        break;

	      // multiplies the numbers
	      case '*':
	        answer = firstnumber * secondnumber;
	        System.out.println(firstnumber + " * " + secondnumber + " = " + answer);
	        break;

	      // divides the numbers
	      case '/':
	        answer = firstnumber / secondnumber;
	        System.out.println(firstnumber + " / " + secondnumber + " = " + answer);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    dave.close();
	  }
	}

