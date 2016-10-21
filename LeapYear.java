import java.util.*;
class LeapYear
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(year>0)
{
if(year%4==0)
{
System.out.println("The entered year is Leap year");
}
else if(year%4!=0)
{
System.out.println("The entered year is not Leap year");
}
}
else
{
System.out.println("Invalid data");
}
}
} 
