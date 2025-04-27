public class rotete {
    public static void leftrotate(int arr[],int n,int d){
        d=d%n;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,3,6,7,7};
        int n=arr.length;
        int d=5;
        leftrotate(arr, n, d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
}
