package com.example.demo;

public class Test {
public static  void main(String[] args) {
	//System.out.println((double)1/8);
	//System.out.println(isStringPalindrome("a"));
	
	String s = "dfdg";
	System.out.println(removeX(s));

}

public static String removeX(String input) {
	
    if(input.length() == 0){
        return input;
    } 
    
    String smallAns = removeX(input.substring(1));
    if(input.charAt(0) == 'x') {
    	return smallAns;
    }
    return input.charAt(0) + smallAns;
	}
	}

