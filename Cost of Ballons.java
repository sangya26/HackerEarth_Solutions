//Cost of Ballons
/*
Test case
2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
*/

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int gb=sc.nextInt();
            int pb=sc.nextInt();
            int n=sc.nextInt();
            int[][] arr=new int[n][2];
            int gc=0,pc=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i][0]==1)
                    gc++;
                if(arr[i][1]==1)
                    pc++;
            }
            int result;
            if(gb>pb){
                 if(gc>pc)
                     result=gb*pc+pb*gc;  
                 else        
                     result=gb*gc+pb*pc;             
            }  
            else 
            {     
              if(gc>pc) 
                result=pb*pc+gb*gc;    
             else                 
                result=pb*gc+gb*pc;  
            }           
          System.out.println(result);
        }
 
    }
}
