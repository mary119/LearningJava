
public class DisplayValue {
	
	
	DisplayValue(){
		System.out.println("this is my no-arg constructor");
	}
	void DisplayValue(String strValue)
	{
		System.out.println("The received string value is: "+strValue);
	}
	void Display(char charValue,boolean booleanValue) {
		System.out.println("The received string value is: "+charValue);
		System.out.println("The received string value is:"+ booleanValue);
	}

	public static void main(String[] args) 
   {
		DisplayValue disp=new DisplayValue();
		disp.DisplayValue("mary");
		System.out.println("=========");
		disp.Display('n',false );
		
		
	}
		
	

}
