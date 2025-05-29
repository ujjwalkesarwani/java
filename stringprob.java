
public class stringprob {
    public static float short_path(String path)  {
        int x = 0,y=0;
            for(int i=0;i<path.length();i++)
            {
                char dir=path.charAt(i);
                if (dir=='N')
                {
                    y++;
                }else if(dir=='S'){
                    y--;
                }
                else if(dir =='W')
                {
                    x--;
                }
                else{
                    x++;
                }
            }
            int X2=x*x;
            int Y2=y*y;
            return (float) Math.sqrt(X2+Y2);
    }
    public static boolean palindrom(String palin) {
        int n=palin.length();
        for(int i=0;i<=n/2;i++)
        {
            if(palin.charAt(i)!=palin.charAt(n-i-1)){
            return false;
            }      
        }
        return true;

    }
    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String Compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        // String path= "WNEENESENNN";
        // String palin= "raccr";
        // String str="hi, i am ujjwal";
        String str="aaaabbcdd";

        // System.out.println(short_path(path));
        // System.out.println(palindrom(palin));
        // System.out.println(toUpperCase(str));
        System.out.println(Compress(str));

    }
}
