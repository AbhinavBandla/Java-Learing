/*
    String Builder 

    for example 

    String s = "";
    for(int i = 0; i < 1000; i++){
        s = s + "A";
    }

    for itteration java creates the new String Object 

    iteration 1  - s = "A";
              2  - s= "AA";
              
              to Avoid this creation 1000
        the StringBuilder comes into Action uses the same buffer not creating new object
*/

class  stringBuilderDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        System.out.println("String Builder : "+sb);
        System.out.println(sb.charAt(4));

        String s  = sb.toString();
        System.out.println(s);
        System.out.println(" s String Length "+ s.length());
        System.out.println(sb.length());

        StringBuffer sbf = new StringBuffer();
        sbf.append("Abhinav ");
        sbf.append("Kumar");

        System.out.println("String Buffer : "+sbf);
    }
}