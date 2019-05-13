package Main;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.util.*;

import java.util.List.*; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
	
		public class practice implements Pancake { 
			public static void main(String[] args) { 
			ArrayList<String> x = new ArrayList<String>(); 
			x.add("3"); x.add("7"); x.add("5"); 
			ArrayList<String> y = new practice().doStuff(x); 
			y.add("1"); 
			System.out.println(x); 
			} 
			public ArrayList<String> doStuff(ArrayList<String> z) { 
			z.add("9"); 
			return z; 
			}
			} 
			interface Pancake { 
			ArrayList<String> doStuff(ArrayList<String> s); 
			} 

	
	
//	public static void main(String[] args)
//	   {
//	      int num1, num2; // Two numbers for GCD calculation
//	      
//	      // Create a Scanner object for keyboard input.
//	      Scanner keyboard = new Scanner(System.in);
//	      
//	      // Get the first number from the user.
//	      System.out.print("Enter an integer: ");
//	      num1 = keyboard.nextInt();
//	      
//	      // Get the second number from the user.
//	      System.out.print("Enter another integer: ");
//	      num2 = keyboard.nextInt();
//	      
//	      // Display the GCD.
//	      System.out.println("The greatest common divisor " +
//	                         "of these two numbers is " + 
//	                         gcd(num1, num2));
//	   }
//
//	   /**
//	      The gcd method calculates the greatest common
//	      divisor of the arguments passed into x and y.
//	      @param x A number.
//	      @param y Another number.
//	      @returns The greatest common divisor of x and y.
//	   */
//	   
//	   public static int gcd(int x, int y)
//	   {
//	      if (x % y == 0)
//	         return y;
//	      else
//	         return gcd(y, x % y);
//	   }
//}


//
//	   public static void main(String[] args)
//	   {
//	      System.out.println("The first ten numbers in " +
//	                         "the Fibonacci series are:");
//
//	      for (int i = 0; i < 10; i++)
//	         System.out.print(fib(i) + " ");
//	      System.out.println();
//	   }
//	   
//	   /**
//	      The fib method calculates the nth
//	      number in the Fibonacci series.
//	      @param n The nth number to calculate.
//	      @return The nth number.
//	   */
//	   
//	   public static int fib(int n)
//	   {
//	      if (n == 0)
//	         return 0;
//	      else if (n == 1)
//	         return 1;
//	      else
//	         return fib(n - 1) + fib(n - 2);
//	   }
//}

//	
//	
//	
//	
//
//	   public void init()
//	   {
//	      getContentPane().setBackground(Color.white);
//	   }
//	   
//	   /**
//	      paint method
//	      @param g The applet's Graphics object.
//	   */
//	   
//	   public void paint(Graphics g)
//	   {
//	      // Draw 10 concentric circles. The outermost 
//	      // circle's enclosing rectangle should be at
//	      // (5, 5), and it should be 300 pixels wide
//	      // by 300 pixels high.
//	      drawCircles(g, 10, 5, 300);
//	   }
//
//	   /**
//	      The drawCircles method draws concentric circles.
//	      @param g A Graphics object.
//	      @param n The number of circles to draw.
//	      @param topXY The top left coordinates of the
//	             outermost circle's enclosing rectangle.
//	      @size The width and height of the outermost
//	            circle's enclosing rectangle.
//	   */
//	      
//	   private void drawCircles(Graphics g, int n,
//	                            int topXY, int size)
//	   {  
//	      if (n > 0)
//	      {
//	         g.drawOval(topXY, topXY, size, size);
//	         drawCircles(g, n - 1, topXY + 15, size - 30);
//	      }
//	   }	
//	
//	
//	
	
	
	

	
	
	
//
//	   public static void main(String[] args)
//	   {
//	      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//	      
//	      System.out.print("The sum of elements "+numbers.length +
//	                       "  is "+ rangeSum(numbers, 0, 8));
//	   }
//	   
//	   /**
//	      The rangeSum method calculates the sum of a specified
//	      range of elements in array. 
//	      @param start Specifies the starting element.
//	      @param end Specifies the ending element.
//	      @return The sum of the range.
//	   */
//	   
//	   public static int rangeSum(int[] array, int start, int end)
//	   {
//	      if (start > end)
//	         return 0;
//	      else
//	         return array[start] +
//	                    rangeSum(array, start + 1, end);
//	   }
//	
	
	
//
//	public static void main(String[] args)
//	   {
//	      String input;   // To hold user input 
//	      int number;     // To hold a number
//	      
//	      // Get a number from the user.
//	      input = JOptionPane.showInputDialog("Enter a " +
//	                               "nonnegative integer:");
//	      number = Integer.parseInt(input);
//	      
//	      // Display the factorial of the number.
//	      JOptionPane.showMessageDialog(null, 
//	                  number + "! is " + factorial(number));
//
//	      System.exit(0);
//	   }
//	   
//	   /**
//	      The factorial method uses recursion to calculate
//	      the factorial of its argument, which is assumed
//	      to be a nonnegative number.
//	      @param n The number to use in the calculation.
//	      @return The factorial of n.
//	   */
//	   
//	   private static int factorial(int n)
//	   {
//	      if (n == 0)
//	         return 1;   // Base case
//	      else
//	         return n * factorial(n - 1);
//	   }
//		   
//}


