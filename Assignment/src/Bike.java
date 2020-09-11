
public class Bike {

    String color;
    String model;
    int price;
    
    Bike( ) {
    	System.out.println("Creating object Bike");
    }
    
    void Travel() {
    	System.out.println("To travel");
    }
    void Ride() {
    	System.out.println("To go bike ride");
    }
	public static void main(String[] args) {
	   Bike HondaBike =new Bike();
	   
	   HondaBike.color="Black";
	   HondaBike.model="Shine";
	   HondaBike.price= 85000;
	   
	   System.out.println("color:"+HondaBike.color);
	   System.out.println("model:"+HondaBike.model);
	   System.out.println("price:"+HondaBike. price);
	   
	   HondaBike.Travel();
	   HondaBike.Ride();
	   


	}

}
