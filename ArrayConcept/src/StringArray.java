
public class StringArray {

	public static void main(String[] args) {
		
	         String[] StrArray=new String[5];
	         
	         StrArray[1]="Ferrari";
	         StrArray[4]="lambhorgini";
	         StrArray[3]="Porsche";
	         
	         System.out.println("The values of the StrArray:");
	         
	         
	          for(int i=0;i<StrArray.length;i++){
	           System.out.println("StrArray[i]");
	          }
	          
	          for(String s:StrArray) {
	        	  if(s!=null) {
	        		  System.out.println("==="+ s +"***");
	        	  }
	          }
	
	
	
	}
	
}


