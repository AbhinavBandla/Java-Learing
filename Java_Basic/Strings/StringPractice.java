class stringMethods{
    public static void main(String[] args){
        //1
        String name = "   Abhinav   ";
        System.out.print("1 - ");
        System.out.println(name.trim().toUpperCase());

        //2
        String eMail = "abhinav@gmail.com";
        System.out.print("2 - ");
        if(eMail.contains("@") == true){
            System.out.println("Valid");
        }else{
            System.out.println("In-valid");
        }
        //3
        System.out.print("3 - ");
        String language = "Java Programming";
        System.out.println(language.substring(5));
        //4
        System.out.print("4 - ");
        String file = "resume.pdf";
        if(file.endsWith(".pdf") == true){
            System.out.println("PDF file");
        }
        //5
        System.out.print("5 - ");
        String text = "banana";
        System.out.print("firstIndex of 'a' : "+ text.indexOf('a') + " Last Index of 'a' : "+text.lastIndexOf('a')+"\n" );
        //6
        System.out.println("6 - ");
        String sentence = "Java,Python,C++";
        String[] arr = sentence.split(",");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //7
        System.out.print("7 - ");
        String username = "ADMIN";
        String input = "admin";
        if(input.equalsIgnoreCase(username) == true){
            System.out.println("Login SuccessFull");
        }

        System.out.print("8 - ");
        String fullName = "abhinav kumar";
        System.out.println(fullName.toUpperCase()+ " Length : " + fullName.length());

         System.out.print("8 - ");
         String name1 = "Abhinav";
         System.out.println(name1.replace('a', 'v'));

    }
}