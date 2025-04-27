public class bit {
    public static void OddEven(int n){
        int bitmask= 1;
        if((n & bitmask) == 0 ){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int getIthBit(int n,int i){
        int bitmask= 1<<i;
        if((n & bitmask) == 0 ){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitmask= 1<<i;
        return n | bitmask ;
    }
    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask ;
    }
    public static int updateIthBit(int n,int i,int newbit){
        // method 1(easy)
        // if(newbit==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        // m2(medium)
        n=clearIthBit(n,i);
        int bitmask= newbit<<i;
        return n | bitmask ;
    }
    public static int clearLastIthBit(int n,int i){
        int bitmask= ((~0)<<i);
        return n & bitmask ;
    }
     public static int clearBitsinRange(int n,int i, int j){
        int a= ((~0)<<j+1);
        int b=(1<<i)-1;
        int bitmask = a|b;
        return n & bitmask ;
    }
    public static boolean isPoweroftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static int CountSetBits(int n){
        int count = 0;
        while (n>0) {
            if((n&1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
        public static int fastExpo(int a,int n){
            int ans= 1;
            while(n>0){
                if((n&1)!=0){
                    ans= ans*a;
                }
                a=a*a;
                n = n>>1;
            }
            return ans;
        }
        public static void Swap(int a,int b){
            a=a^b;
            b=b^a;
            a=a^b;
            System.out.println("after swap a = "+ a +" and b = "+ b);
        }
    
    public static void main(String[] args) {
        // OddEven(14);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 4));
        // System.out.println(clearIthBit(10, 3));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearLastIthBit(15, 2));
        // System.out.println(clearBitsinRange(10, 2,4));
        // System.out.println(isPoweroftwo(16));
        //  System.out.println(CountSetBits(10))
        // System.out.println(fastExpo(5,3));
        // Swap(5,3);
        // int x = 10;
        // System.out.println(~(~x)+1);
        

    }
}
