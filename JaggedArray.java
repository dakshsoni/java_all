class JaggedArray
{
public static void main(String s[])
{
int jaggedArr[][]=new int[2][];
jaggedArr[0]=new int[2];
jaggedArr[1]=new int[3];
jaggedArr[0][0]=10;
jaggedArr[0][1]=20;
jaggedArr[1][0]=30;
jaggedArr[1][1]=30;
jaggedArr[1][2]=30;

for(int i=0;i<2;i++)
{
System.out.println(jaggedArr[0][i]);
}
System.out.println();
for(int i=0;i<3;i++)
{
System.out.println(jaggedArr[1][i]);
}
}
}