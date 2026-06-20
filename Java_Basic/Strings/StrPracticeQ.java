class strDemo {
    public static void main(String[] args){
        String s = "RaceCar"; 
        System.out.println("Original : "+s);
        String SLower = s.toLowerCase();
        System.out.println("LowerCase : "+SLower);

        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + SLower.charAt(i);
        }
        System.out.println("Reversed String : "+ reverse);

        if(SLower.equals(reverse)){
            System.out.println("Palindrome : yes ");
        }else{
            System.out.println("Palindrome : No");
        }

        int Vowels = 0;
        int constants = 0;
        for(int i = 0; i < SLower.length(); i++){
            char ch = SLower.charAt(i);
            if(ch == 'a'||ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                Vowels ++;
            }else {
                constants ++;
            }
        }
        System.out.println("Vowels : "+ Vowels);
        //System.out.println("Constants : "+ constants);

        // 2 

        String sentence = "Java Is Very Powerful";
        String[] Sentence = sentence.split(" ");

        int largest = 0;
        int shortest = Sentence[0].length();
        for(String x  : Sentence){
            System.out.println(x + "  -  " + x.length());
            if(largest < x.length()){
                largest = x.length();
            }
            if(shortest > x.length()){
                shortest = x.length();
            }
        }
        System.out.println("Shortest : "+shortest);
        //System.out.println("Largest "+largest);
        for(String y  : Sentence){
            if(y.length() == shortest){
                System.out.println("Shortest Word : "+y);
            }
            if(y.length() == largest){
                System.out.println("Longest Word : "+y);
            }
        }
        /* 
        for(int i = 0; i < Sentence.length; i++){
            if(largest < Sentence[i].length()){
                largest = Sentence[i].length();
            } 
        }
            */
    }

}