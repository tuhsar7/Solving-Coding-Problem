import java.util.Scanner;
class nthprimenumber{

    
     static boolean isPrime(int num){
        int c =0;
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                c++;
            }
        }
        if(c<=2){
            return true;
        }else{
            return false;
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 1;
        int count = 0;
        while(count <= n){
            if(nthprimenumber.isPrime(num)){
                count++; 
                if(count == n){
                    break;
                }  
            }
            num++;
        }

        System.out.println("The "+n+"th prime number is :"+ num);
    }
}