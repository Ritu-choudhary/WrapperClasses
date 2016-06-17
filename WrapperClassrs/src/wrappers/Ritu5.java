package wrappers;

public class Ritu5 {

	public static void main(String[] args) {
		String name ="Ritu";
		String name1=" Choudhary";
		String name2=name+name1;
		
		System.out.println(name2);
		
	     String name3= name.toLowerCase();//String is an immutable class
	     System.out.println(name);
	     
			
	      System.out.println(name3);
	      
	      char[] CharArray=name.toCharArray();
	       int n=name.length();
	       
	       System.out.println("Length of name ::"+n);
	       
	       for(int i= CharArray.length-1;i>=0;i--)
	       {
	    	 System.out.print(CharArray[i]);  
	       }
	}
}
