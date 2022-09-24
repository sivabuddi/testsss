package okg.test;

public class Testing {

    public static String convert(String arr){
        String result="";
        for(char ch:arr.toCharArray()){

            if(Character.isAlphabetic(ch)) {

                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else if (Character.isLowerCase(ch))
                    result += Character.toUpperCase(ch);
                else
                    result += ch;

            }
            else
                result+=ch;

        }
        return result;
    }


    public static void main(String[] args) {
        String string="Hello World Siva";
        String result = convert(string); // hELLO wORLD sIVA
        System.out.println(result);

    }
}
