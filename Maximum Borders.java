//Testcases
/*
10
2 15
.....####......
.....#.........

Output: 4
*/

// Write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
 
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            int c=0,r=0;
            for(int i=0;i<n;i++){ 
                String s=sc.nextLine(); 
                s=s.replaceAll("\\.",""); 
                c=s.length(); 
                r=Math.max(r,c); 
            } 
            System.out.println(r);
        }
