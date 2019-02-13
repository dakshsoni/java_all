
class Substring_match_String
{
public static void main(String s[])
{
int	index =0;
int count=0;
String str="dakdasshdakso";
String str1="dak";
char ch[]=str.toCharArray();
char[] ch1=str1.toCharArray();

for(int i=0;i<str1.length();)
{
	
for(int j=0;j<str.length();j++)
{
	index =j;

	
	
		if(j==(str.length()-1))
	{break;}
	
		
		if(ch1[i]  == ch[j])
	
	{
		
	count++;
		 
		
						if(count == 3)
						{
							
							
							
							i=0;
							System.out.println("index:"+index);
							count=0;
							
							
							
						}
						else
						{
							
							
							i++;
							
							
							
						}
	
	}
	else
		{
			
			
			i=0;
			
			count=0;
			
			
		}
		
	
}
i=str1.length();
}
}
}