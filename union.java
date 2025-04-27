import java.util.*;;

public class union {
    public static  List<Integer> BruteUnion(int arr1[],int arr2[]){
        Set<Integer> set= new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        List<Integer> result=new ArrayList<>(set);
        Collections.sort(result);
        return result;

    }
    public static  List<Integer> OptimalUnion(int arr1[],int arr2[]){
        int i=0,j=0;
        List<Integer> result=new ArrayList<>();
        while (i<arr1.length && j<arr2.length) {
            int val1=arr1[i];
            int val2=arr2[j];
            if(val1==val2){
                if(result.isEmpty() || result.get(result.size()-1)!=val1){
                    result.add(val1);
                }
                i++;
                j++;
            }
            if(val1<val2){
                if(result.isEmpty() || result.get(result.size()-1)!=val1){
                    result.add(val1);
                }
                i++;
                
            }
            else{
                if(result.isEmpty() || result.get(result.size()-1)!=val2){
                    result.add(val2);
                }
                
                j++;
            }
        }
            while(i<arr1.length){
                if(result.isEmpty() || result.get(result.size()-1)!=arr1[i]){
                    result.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(result.isEmpty() || result.get(result.size()-1)!=arr2[j]){
                result.add(arr2[j]);
        }
        j++;
    }
        
        return result;
    }
 public static void main(String[] args) {
    int arr1[]={1,4,5,8,9,10,12,14};
    int arr2[]={2,3,4,5,6,8,11};
    // List<Integer> unionList= BruteUnion(arr1,arr2);
    List<Integer> unionList1= OptimalUnion(arr1,arr2);
    System.out.println("union array is:"+ unionList1);

 }   
}
