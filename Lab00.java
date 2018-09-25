import java.util.*;

public class Lab00
{
     private static int x = 5;
     private static String y = "hello";
     private static double z = 9.8;


   public static void main(String[] args)
   {
     System.out.println("x: " + x + " " + "y: " + y + " " + "z: " + z); 
     
     int[] nums = {3, 6, -1,2};
     for(int num : nums)
	    System.out.println(num);

     int numFound = char_count(y, 'l');
     System.out.println("Found: " + numFound);

     int i = 1;
     for(i = 1; i < 11; i++)
	     System.out.print(i + " ");

     System.out.println();
   }

   public static int char_count(String y, char c)
   {
     int count = 0;
     char[] yArray = y.toCharArray();
     for(char x : yArray)
	{
	   	if (x == c)
		     count++;
	} 
     return count;

   }

}
