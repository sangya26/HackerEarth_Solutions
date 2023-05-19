//You have been given an array A of size N consisting of positive integers. You need to find and print the product of all the number in this array Modulo 10^9+7.


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        long product=1;
        long mod=(long)Math.pow(10,9)+7;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            product=(product*arr[i])%mod;
        }
        System.out.println(product);
 
    }
}
