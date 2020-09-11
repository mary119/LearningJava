
public class Baby {
    String color;
    double height;
    int weight;
    
    Baby(){
    	System.out.println("Creating object Baby");
    }
    
    void Crying() {
    	System.out.println("Baby Crying");
    }
    void Laughing() {
    	System.out.println("Baby Laughing");
    }
    void Dancing() {
    	System.out.println("Baby Dancing");
    }
    
	public static void main(String[] args) {
		Baby FemaleBaby=new Baby();
		
		 FemaleBaby.color="fair";
		 FemaleBaby.height=(double)2.8;
		 FemaleBaby.weight=18;
	     			 
		 System.out.println("color:"+FemaleBaby.color);
		 System.out.println("height:"+FemaleBaby.height);
		 System.out.println("weight:"+FemaleBaby.weight);
          
		 FemaleBaby.Crying();
		 FemaleBaby.Laughing();
		 FemaleBaby.Dancing();
		 
	}
}