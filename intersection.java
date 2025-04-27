import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersection {
    public static List<Integer> Intersection_brute(int arr1[],int arr2[]){
        Set<Integer> resultSet = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    resultSet.add(arr1[i]);
                    break;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
    public static  List<Integer> OptimalIntersection(int arr1[],int arr2[]){
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
            else if(val1<val2){
                i++;
            }
            else{
                j++;
            }
    }
    return result;
}
     public static void main(String[] args) {
    int arr1[]={1,2,2,3,4,6,9,11};
    int arr2[]={2,3,4,5,6,8,11};
    // List<Integer> intersectList1= Intersection_brute(arr1,arr2);
    List<Integer> intersectList1= OptimalIntersection(arr1,arr2);
    System.out.println("Intersection array is:"+ intersectList1);
}
}
