//x = 'z' and y = 'o'
//2x=y


// Write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int z=0,o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z')
              z++;
            else
              o++;
        }
        if((double)o/2==z)
          System.out.println("Yes");
        else
          System.out.println("No");
