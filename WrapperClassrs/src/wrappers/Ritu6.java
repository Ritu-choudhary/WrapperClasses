package wrappers;

public class Ritu6 {

	public static void main(String[] args) {
	StringBuffer name= new StringBuffer("Rajat");
	
                      name.append(" Taya");
                 System.out.println("NAME = "+name);
                 
                 name.reverse();
                 System.out.println("REVERSE = "+name);
                 
                 
                 System.out.println("NAME = "+name.toString().toLowerCase());
                 
                
                 System.out.println("NAME = "+ name.toString().toUpperCase());
                 
                 
                 System.out.println("NAME = "+name.substring(2, 6));
	}

}
