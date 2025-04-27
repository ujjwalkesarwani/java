public class zero {
    public static void move_zeroes(int arr[],int n) 
    {
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index+1;i<n;i++){
            arr[i]=0;
        }
    } 
        public static void main(String[] args) {
        int []arr={1,2,8,0,3,3,0,3,6,0,7,7};
        int n=arr.length;
        move_zeroes(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}}
