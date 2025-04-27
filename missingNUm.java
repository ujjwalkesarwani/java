import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class missingNUm {
    public static int missingNo(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
        
    }
    public static List<Integer> AllmissingNo(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        List<Integer> missing = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
        return missing;
        
    }
    public static int missingNoSum(int arr[], int n){
        int sum1=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (sum1-sum);
    }
    public static int missingNoXor(int arr[], int n){
        int xor1=0;
        int xor2=0;
    //     for(int i=1;i<=n;i++)
    // {
    //     xor1^=i;
    // }    
    for(int i=0;i<arr.length;i++){
        xor2^=arr[i];
        xor1^=(i+1);
    }
        xor1=xor1^n;
    
    return(xor1^xor2);
}

    public static void main(String[] args) {
    int arr[]={1,2,4,6,3,8,7};
    int n=8;
    // List<Integer> missingNumbers = AllmissingNo(arr, n);

    // System.out.println(missingNumbers);
    System.out.println(missingNoXor(arr, n));
    
}
}
