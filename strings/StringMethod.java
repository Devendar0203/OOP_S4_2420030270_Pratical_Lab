package strings;

public class StringMethod {

    public static void main(String[] args) {
        // 3. Program to work with multiple string methods.

    	String str = "Hello World";
    	String str1="cse department";
    	String str2="    object   ";
    	String str3="";
    	System.out.println("The Entered string is: "+str);
    	System.out.println("The Entered string is: "+str1);
    	System.out.println("The Entered string is: "+str2);
    	System.out.println("The Entered string is: "+str3);


    	System.out.println("The Length of the string is: "+str.length());
    	System.out.println("The Char at the index is:"+str.charAt(4));
    	System.out.println("Substring from index 5 is:"+str.substring(5));
    	System.out.println("Substring from index 5 to index 11 is:"+str.substring(5,11));
    	System.out.println("Substring from index 5 is:"+str.substring(5));
    	System.out.println("Checking the equality of str and str1 :"+str.equals(str1));
    	System.out.println("Checking the equality ignore case of str and str1 :"+str.equalsIgnoreCase(str1));
    	System.out.println("Comparing the str and str1 :"+str.compareTo(str1));
    	System.out.println("Compare  to Ignore case str and str1 :"+str.compareToIgnoreCase(str1));
    	System.out.println("To check if the char sequence is there are not:"+str.contains("o"));
    	System.out.println("To check whether the string is starting with particular char:"+str.startsWith("H"));
    	System.out.println("To Find the Index of char:"+str.indexOf("o"));
    	System.out.println("To check whether the string is Ending with particular char:"+str.lastIndexOf("l"));
    	System.out.println("After trimming string str2:"+str2.trim());
    	System.out.println("Replacing the charcters :"+str.replace('H','h'));
    	System.out.println("Replacing All 'l' with 'i' :"+str.replaceAll("l","i"));
    	System.out.println("Replacing The first 'l' with 'i' :"+str.replaceFirst("l","i"));
    	System.out.println("Converting string in lowercase :"+str.toLowerCase());
    	System.out.println("Converting string in Uppercase :"+str1.toUpperCase());
    	System.out.println("The value of the string str :"+str1.valueOf(str));
    	System.out.println("check whether the string is empty is not :"+str3.isEmpty());


    	
    }
}

