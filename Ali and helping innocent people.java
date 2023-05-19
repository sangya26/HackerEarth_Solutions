//The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.
//Print "valid" if the tag is valid, print "invalid" otherwise
//Test case: 12X345-67 output: invalid

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        List<Character> vowel = new ArrayList<Character>();
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        vowel.add('Y');
        if(name.length()==9){
            if (((Character.getNumericValue(name.charAt(0)) + Character.getNumericValue(name.charAt(1))) % 2 == 0 ) &&
        ((Character.getNumericValue(name.charAt(3)) + Character.getNumericValue(name.charAt(4))) % 2 == 0 ) &&
        ((Character.getNumericValue(name.charAt(4)) + Character.getNumericValue(name.charAt(5))) % 2 == 0 ) && ((Character.getNumericValue(name.charAt(7)) + Character.getNumericValue(name.charAt(8))) % 2 == 0 ) && !vowel.contains(name.charAt(2)) )
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
        
    }
}
