//Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.

/*
Test case:
Input
2
1
0
Output
1
111
*/

 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String num=sc.next();
            int count=0;
            for(int j=0;j<num.length();j++){
                char n=num.charAt(j);
                if(n=='9'||n=='6'||n=='0')
                    count+=6;
                if(n=='1')
                    count+=2;
                if(n=='2'||n=='3'||n=='5')
                    count+=5;
                if(n=='4')
                    count+=4;
                if(n=='7')
                    count+=3;
                if(n=='8')
                    count+=7;
            }
            if(count%2==0){
                for(int k=0;k<count/2;k++){
                    System.out.print(1);
                }
            }
            else{
                System.out.print(7);
                count-=3;
                for(int l=0;l<count/2;l++){
                    System.out.print(1);
                }
            }
            System.out.println();
        }
 
    }
}
