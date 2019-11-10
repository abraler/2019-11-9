import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[n];
        int t=4;
        int p=a.length;

            for (int i = 0; i <a.length ; i++) {
                a[i]=in.nextInt();
            }
        int num= priority(a,n-1,t);
        System.out.println(num);
    }

    private static int priority(int[] a, int i, int t) {
        int num=0;
        if(t==0){
            num++;
        }else if(i==0&&a[i]==t){
            num++;
        }else if(a[i]>t){
            return priority(a,i-1,t);
        }else{
            if(priority(a,i-1,t-a[i])>priority(a,i-1,t)){
                return priority(a,i-1,t-a[i]);
            }else
                return priority(a,i-1,t);
        }
        return num;
    }
}
