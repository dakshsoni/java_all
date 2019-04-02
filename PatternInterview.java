
/**
 * Write a description of class PatternInterview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatternInterview
{
   public static void main(String s[])
   {
   int c=9;
   for(int i=1;i<=5;i++)
   {
   int j=1;
   for(;j<=i;j++)
   {
    System.out.print(j);
   }
   int space=j;
   for(;space<=c;space++)
   {
   System.out.print( " " ); 
   }
   int back=i;
   for(int last=space;last<=10;last++)
   {
    System.out.print(back);
    back--;
    }
    System.out.println();
    c--;
   }
    
   }

    
    

    
}
