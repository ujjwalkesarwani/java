import java.util.Scanner;
public class Solution {
    public static double average(double x,double y,double z)
         {
            return(x+y+z) /3;
        }
    public static void main(stringprob[]args) { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x=sc.nextDouble();
        System.out.print("Input the second number:");
        double y=sc.nextDouble();
        System.out.print("Input the third number: ");
        double z=sc.nextDouble();
        System.out.print("The average value is "+average(x,y,z)+"\n");}
        
    }