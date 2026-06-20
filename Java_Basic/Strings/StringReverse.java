class strReverse {
    public static void main (String[] args){
        String strEle = "Abhinav";
        for(int i = strEle.length() -1; i >= 0; i--){
            System.out.print(strEle.charAt(i));
        }

        String strEle1 = "Vyshnavi";
        String reverse = "";
        System.out.println();
        for(int i = strEle1.length() - 1; i >= 0; i--){
            reverse = reverse + strEle1.charAt(i);
        }
        System.out.println("Reverse : "+reverse);

        // palindrome

        String strEle2 = "racecar";
        String reverse2 = "";

        for(int i = strEle2.length() - 1; i >= 0 ; i--){
            reverse2 = reverse2 + strEle2.charAt(i);
            System.out.println("revser "+ reverse2);
        }
        System.out.println("Final reverse : "+ reverse2);
        System.out.println("is the 2 String are same : "+strEle2.equals(reverse2));

        String vowels = "AEIOU";
        String StrEle3 = "Abhinav";

        int vowelCount = 0;
        int constant = 0;
        String UpperStr = strEle3.toUpperCase();
        
        for(int i = 0; i < )
        System.out.println("Vowels : " +vowelsCount );
        System.out.println("Constants : "+constants);
    }
}