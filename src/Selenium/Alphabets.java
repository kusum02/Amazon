package Selenium;

public class Alphabets 
{
public static void main(String[]args)
{
	int space=3;
	int star=1;
String s1="DCBA";
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=space;j++)
	{
		System.out.print(" ");
	}
	for(int k=0;k<star;k++)
	{
		System.out.print(s1.charAt(k));
	}
	System.out.println();
	star++;
	space--;
	
}


	
}
}
