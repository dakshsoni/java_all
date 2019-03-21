import java.util.Arrays;
import java.util.Scanner;
public class Test 
{
	public String sortString(String s0)
	{
		char ch[]=s0.toCharArray();
		 Arrays.sort(ch);
		
		
	return new String(ch);	
	}
    public static void main(String s[])
    {
		Test t=new Test();
		Scanner scr = new Scanner(System.in);
		System.out.println("enter string :");
		
    String s1=scr.next();
	System.out.println("enter another String :");
    String s2= scr.next();
	
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
    //String s3[]=
    //String s4[]= {"p","p","a","l","e"};


    s1=t.sortString(s1);
	s2=t.sortString(s2);
      
    
 boolean b=s1.equalsIgnoreCase(s2) ;
    if(b == true)
	{
		  System.out.println( "your Entered string is match :"+b);
	}
	else
	{
		  System.out.println( "your Entered string cann't match please entered a valid string :"+b);
	}
	
	


	}

    }

    
    
    
    

