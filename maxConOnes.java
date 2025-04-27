public class maxConOnes {
    public static int Max_Con_Ones(int arr[]){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max, count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static int num_only_once(int arr[]){
       
        int xor2=0;
    //     for(int i=1;i<=n;i++)
    // {
    //     xor1^=i;
    // }    
    for(int i=0;i<arr.length;i++){
        xor2^=arr[i];
       
    }
        
    
    return(xor2);
}
    public static void main(String[] args) {
        // int arr[]={1,1,0,1,1,1,0,0,1,1,1,1};
        // System.out.println(Max_Con_Ones(arr));
        int arr[]={1,1,2,2,3,3,4,4,8,8};
        System.out.println(num_only_once(arr));
    }
}
