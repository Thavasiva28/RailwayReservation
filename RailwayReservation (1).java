
import java.util.*;
public class RailwayReservation {
		public static void main(String args[])
		{	
			Scanner a=new Scanner(System.in);

		      System.out.println("Welcome to railway ");

		      System.out.print("please enter ur name: ");

		      String b=a.nextLine();

		      System.out.print("welcome " + b + " please enter no of persons");

		      int c=a.nextInt();

		      a.nextLine();

		      

		      String[] q=new String[c];

		      for(int i=0;i<c;i++)

		      {

		       System.out.println("plese enter "+ i + " out of " + c + " names" );

		       q[i]=a.nextLine();

		      }

		        

		      System.out.print("hey " + b + " could u please enter where u travel from ");

		      String f=a.nextLine();

		      

		      System.out.print("good " + b + "please enter to which place");

		      String g=a.nextLine();

		      

		      System.out.println( f + " to " + g + " ok done " + b);

		      

		      System.out.println(b + ",can u please enter ur coach details");

		      int d=a.nextInt();

		      a.nextLine();

		      

		     switch (d) 

		     {

		      

		      case 1:

		         int k =c*1000;

		         int v=k;

		          System.out.println("total cost is " + k);

		      break;

		      

		      case 2:

		       int l =c*500;

		          System.out.println("total cost is " + l);

		          break;

		          

		      case 3:

		       int z =c*250;

		      

		          System.out.println("total cost is " + z);

		          break;

		          

		      case 4:

		       int x =c*100;

		          System.out.println("total cost is " + x);

		          break;

		          

		         default:

		          System.out.println(b + ",please enter between 1 to 4");

		     }

		      

		     System.out.println(b);

		     System.out.println("no of persons: " + c);

		     System.out.println("ur travling from " + f + " to " + g );  

		     for (int i=0;i<c;i++)

		     {

		      System.out.println("names "+q[i]);

		     }
		}
		}