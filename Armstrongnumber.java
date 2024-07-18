public class Armstrongnumber {

    static int count(int n){
        int c =0;
        while(n>0){
            n = n/10;
            c++;
        }
        return c;
    }

    static int power(int n,int p){
        int ans = 1;
        while (p>0){
            ans = ans * n;
            p--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 153;
        int n2 = n;
        int count = count(n);
        int ans =0;
        while(n>0){
            int rem = n%10;
            ans = ans + power(rem, count);
            n= n/10;
        }
        System.out.println(n2 == ans ? "ArmstrongNumber":"Not a ArmstrongNumber");
    }
}
