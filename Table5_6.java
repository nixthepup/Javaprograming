import java.text.DecimalFormat;

public class Table5_6 {
    public static void main(String[] args)
{


// Display Table
System.out.println("Fahrenheit" +"\t\t" + "Celsius");
System.out.println("--------------------------------");

// deciaml formatter
 DecimalFormat Cel = new DecimalFormat( "#0.000");
 DecimalFormat   fahr = new DecimalFormat("#0.0"); 

// fahrenheit loop
for (int i=0; i<21;i++)
{

System.out.println(fahr.format(i) + "             :           " + Cel.format(celsius(i)));

}

}
public static double celsius(double fahrenheit)
{
double c;
double a= 0.555556;
double g =32;
c = a*(fahrenheit - g);
return c;
}

} 
    


    
