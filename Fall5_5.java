import java.util.Scanner;

public class Fall5_5 {

public static void main(String[] args)
{
Scanner input= new Scanner(System.in);

double time;
double distance;
System.out.println("Enter the time!");
time =input.nextDouble();
fallingDistance(time);

for (int i=1; i<11;i++)
{

System.out.println(fallingDistance(i));

}

}
public static double fallingDistance(double time)
{
double d;
double a= 0.5;
double g=9.8;
d = (g*a)*(time * time);
return d;
}

}
