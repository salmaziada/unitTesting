package singleChar;

public class ReplaceChar {
	public  String ReplaceMultipleSpaces (String str) {
         
        //replace one or more spaces with one space
        String resultStr = str.replaceAll("[ ]+", " ");
         
        return resultStr;
    }
	
 
}

