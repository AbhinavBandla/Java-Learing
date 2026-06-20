class vowels{
    public static void main(String[] args){
        String name = "Abhinav";
        String Vowels = "AEIOU";

        String Upper = name.toUpperCase();
        System.out.println(Upper);

        int vowelCount = 0;
        int ConstantsCount = 0;
        /* 
        for(int i = 0; i < Upper.length() ; i++){
            boolean isVowel = false;
            for(int j = 0; j < Vowels.length() ; j++){
                char x = Upper.charAt(i);
                char y = Vowels.charAt(j);
                
                if(x == y){
                    isVowel = true;
                    vowelCount++;
                    break;
                }
            }
            if(isVowel == false){
                ConstantsCount++;
            }
        }

        System.out.println("vowelCount : "+ vowelCount);
        System.out.println("ConstantsCount : "+ ConstantsCount);

        */
        
        // 2nd appraoch 

        for(int i = 0; i < Upper.length(); i++){
            char ch = Upper.charAt(i);

            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                vowelCount++;
            }
            else{
                ConstantsCount++;
            }
        }
        System.out.println("Vowels : "+vowelCount);
        System.out.println("Constants : "+ConstantsCount);

        // counting Words in a String (Split)

        String Sentance = "Hey Man Java is Easy";

        String[] sentance = Sentance.split(" "); // when every you see the space Split it 
        System.out.println(sentance.length);
        for(String x  : sentance){
            System.out.println(x);
        }
    }
}