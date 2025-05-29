import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] opt2sum(int[]nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int [] {map.get(rem),i};
            }
            map.put(nums[i],i);
        }
        return new int [] {};
    }
     
    public static void main(String[] args) {
    int nums[]={1,5,4,3,2,7,6,12};
    int target = 13;
    System.out.print(Arrays.toString(opt2sum(nums, target)));
    //   int[]result = opt2sum(nums, target);
    // if(result.length==0){
    //     System.out.print("no pair found");
    // }
    // else{
    //     System.out.print("indices "+ Arrays.toString(result));
    // }
}
}