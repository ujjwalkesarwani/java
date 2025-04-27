import java.util.Scanner;
public class sol2 {
    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(stringprob[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(isEven(n)==true)
        {
            System.out.println("no."+n+" is even");
        }
        else{
            System.out.println("no."+n+" is odd");
        }
    }
}
