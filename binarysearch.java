import java.util.*;
public class binarysearch {
    public static int search(int num[] , int target)
    {
        int n = num.length;
        int start=0;
        int end=n-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(num[mid]>num[end])
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        int shift=start;
        start=0;
        end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int realMid=(mid+shift)%n;
            if(num[realMid]==target)
            {
                return realMid;
            }
            else if(num[realMid]>target)
            {
                end=mid-1;
               
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(stringprob args[])
    {
        int num[]={4,7,9,0,1,2,3};
        int target=9;
        System.out.println(search(num,target));
    }

    
}
