public class mergerev {
    
        public static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void mergeSort(int arr[],int si, int ei){
            if(si>=ei){
                return;
            }
            int mid=si+(ei-si)/2;
            mergeSort(arr,si,mid);
            mergeSort(arr,mid+1,ei);
            merge(arr,si,mid,ei);
    
        }   
        public static void merge(int arr[],int si, int mid, int ei){      
            int temp[]=new int [ei-si+1];
            int i=si;
            int j=mid+1;
            int k=0;
            while(i<=mid && j<=ei){
                if(arr[i] < arr[j]){
                    temp[k++]=arr[i++];
                }
                else{
                    temp[k++]=arr[j++];
                }
            }
            while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=ei){
                temp[k++]=arr[j++];
            }
            for(k=0,i=si;k<temp.length;k++,i++){
                arr[i] = temp[k];
            }
        }
        public static void Reverse(int arr[],int mid,int ei){
            while(mid<ei){
            arr[mid]=arr[mid]^arr[ei];
            arr[ei]=arr[mid]^arr[ei];
            arr[mid]=arr[mid]^arr[ei];
            mid++;
            ei--;
            }
            
        }
        public static void main(String[] args){
            int arr[]={6,2,8,2,1,3,0,9};
            int k=3;
            mergeSort(arr,0,k);
            mergeSort(arr, k+1, arr.length-1);
            Reverse(arr,k+1 , arr.length-1);
            printarr(arr);
        }
    }
    