class StringExample{
    public static void main(String[] args){
        String firstName = "Abhinav";
        String lastName = "Kumar";

        System.out.print(firstName +"\n"+ lastName);
        System.out.println();
        System.out.println("Length of firstName - "+firstName.length());
        System.out.println(" charAt - "+firstName.charAt(0));

        System.out.println();
        System.out.println("************** concat ***************");
        //concat() joins two Strings together.
        //Syntax - string1.concat(String2);
        String surname = "Bandla";
        String firName = "Abhinav";
        System.out.println(surname.concat( firName));
        System.out.println();

        System.out.println("*******  replaceFirst()  **********");
        // replaceFirst() replaces only the first occurrence of a character sequence.
        String str = "Banana";
        System.out.println(str.replaceFirst("a", "x"));
        System.out.println();

        System.out.println("******  replaceAll()  *******");
        //replaceAll() replaces all matching occurrences in a String.
        String str1 = "racecar";
        System.out.println(str1.replaceAll("a", "e"));
        System.out.println();

        System.out.println("######  Difference b/w replace() and replaceAll()   #######");
        String s1 = "a1b2c3";
        System.out.println(s1.replace("[0-9]", "X"));
        //replace Search for the Exact same string to replace 
        System.out.println(s1.replaceAll("[0-9]", "X"));
        // is a regex(regularExpression) pattern meaning:
        // Any digit from 0 to 9.

        System.out.println();
        System.out.println("***********  Split   *************");
        // split() is used to split a String into multiple Strings
        String name = "Abhinav-Bandla"; 
        String name1 = "Abhinav&kumar&bandla";
        // here we have to use the Symbols where you want to split the array
        String[] arr1 = name1.split("&"); 
        String[] arr = name.split("-");
         // and here no need to initilise length 1st,for split java Automatically create it.
        System.out.println(arr.length);// for strings we have to use lenght(), for array we have to use the .lenght;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Arr1 Length - "+arr.length);
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println();
        System.out.println("*********  comapreTo() *********");
        String myName = "Abhinav";
        String myName1 = "Abhi";
        System.out.println("CompareTO = "+ myName.compareTo(myName1));

        System.out.println();
        System.out.println("  ********  CharArray()  ********* ");
        String s4 = "Dog";

        char[] strArr = s4.toCharArray();
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }
        

        /*
                   ***** STRING METHODS ******
         *** Charecter.isUpperCase(String variable);
             Character.isLowerCase(String variable);
         
             
          .toCharArray() - to convert the String into char Array 

         *** equals() method - check the if the 2 strings have same Content 
          StringVariable.equals(another stringVaribale); - "case-Sensitive".
         *** (==) - this equal checks the whether two Strings Are refered to one String element.

          ***equalsIgnoreCase() - it ignores the Upper and Lower cases of the string elements 
                                 and say is they are equal or not - not a "Case-Sensitive".
        
         ***contains() - to check whether the word there in string Element 
            StringVar.contains("word");
        
         *** startsWith() checks whether a String begins with a specified text.
             stringVariable.startsWith("text");
             endsWith("text");
         *** isEmpty(); check's whether the String varibale is Empty or not 
         *** s.indexOf() - returns the index of the first occurrence of a character or String.
                           Syntax - StringVariable.indexOf("string" or 'c');
                           if the element is not found it return -1  
         

         *** lastIndexOf() - return's the Last occurance opposite to the indexOf
         *** replace() replaces a character or String with another character or String.
            Syntax - stringVariable.replace('old', 'new'); - replaces all occurrences, not just the first one.

         *** 

         *** StringVariable.length(); - to know thw length of the varibale 
         *** StringVariable.charAt(index); - return the element at that index
         *** StringVariable.toUpperCase(); - to convert the String to UpperCase
         *** StringVariable.toLowerCase(); - converts the string elements into Lowwer case
         *** StringVariable.trim();        - removes the Spaces at starting and Ending of the String element.
         *** compareTo(); - compareTo() compares two Strings alphabetically (lexicographically).
                      ** Java compares the two Strings character by character from left to right.
                      uses the Ascii or Unicode values Of alphabet 
        */ 


        /* here java have the String pool where the string elements is stored 
            whenEver we try to use the string java check's it in the Pool if the element there the 
            varibale ie refered to that var 

            String element = "Java"; //  don't create the String element just refer to the element inside the String pool.
            String element = new String("Java"); //  create's the New object.

            | Code                                            | Result  |
            | ----------------------------------------------- | ------- |
            | `"Java" == "Java"`                              | `true`  |
            | `new String("Java") == new String("Java")`      | `false` |
            | `new String("Java").equals(new String("Java"))` | `true`  |

            # 1 
            String s1 = "Java";
            String s2 = new String("Java");

            System.out.println(s1.equals(s2));


            and we can use single array many times but every time we use the elemnt stores it value no going to update it 

         */

            System.out.println();
        String s = "Java";
        s = s +"8";
        s = s + "Easy";
        System.out.println(s);

        //SubString
        String java = "Java Programming";
        System.out.println(java.substring(5).toUpperCase());
        // it is like slicing Syntax(starting, end-1);
        System.out.println(java.substring(5, 9).toUpperCase());
        
        /* 
        String name ;
        name = "Abhinav";
        String city = "London";

        System.out.println(city);
        System.out.println(name);
        */
    }
}