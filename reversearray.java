import java.util.*;
public class reversearray {
    // public static void reverse(int num[])
    // {
    //     int first=0,last=num.length-1;
    //     while(first<last)
    //     {
    //         int temp=num[last];
    //         num[last]=num[first];
    //         num[first]=temp;
    //         first++;
    //         last--;
    //     }
    // }
    // public static void SubArrays(int num[])
    // {
    //     // int ts=0;
    //     int sum=0;
    //     int maxsum =Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++)
    //     {
    //         int start = i;
    //         for(int j=i;j<num.length;j++)
    //         {
    //             int end=j;
    //             sum=0;
                
    //             for(int k=start;k<=end;k++)
    //             {
    //                 // System.out.print(num[k]+" ");
    //                 sum=sum+num[k];
    //             }
    //             System.out.println(sum);
    //             if(maxsum<sum)
    //                 {
    //                     maxsum=sum;
    //                 }
                
    //             // ts++;
                
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Maxsum of Sub Array ="+ maxsum );

    //     // System.out.print("total SubArarys =" + ts);
    // }
    public static void kadanes(int num[]) {
        int ms= Integer.MIN_VALUE;
        int cs=0;
       
        for(int i=0;i<num.length;i++)
        {
            cs= cs+num[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maxsum of Sub Array ="+ ms );
        
    }
    public static void main(stringprob[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        // reverse(num);
        // for(int i=0;i<num.length;i++)
        // {
        //     System.out.print(num[i]+" ");
        // }
        kadanes(num);
    }
}
