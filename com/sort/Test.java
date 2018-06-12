package com.sort;

public class Test {
	
	public static void main(String[] args) {
		//假设要判断的字符串str="qwer"
        String str = "qwer";
        //使用length()方法判断这个字符串的长度
        int i = str.length();
        //使用String类的substring方法显示最后一个字符
        System.out.println(str.substring(i-1));
        
        String last = str.substring(i-1);
        
        if("r".equals(last)) {
        	System.out.println("true");
        	System.out.println("str.substring(0, i-1) = " + str.substring(0, i-1));
        }
        
        if (str.contains("w")) {
        	int indexE = str.indexOf("w");
        	System.out.println(indexE);
        	
        	System.out.println(str.substring(indexE, str.length()));
        }
	}

}
