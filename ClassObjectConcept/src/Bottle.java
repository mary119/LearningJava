
public class Bottle {
	
	String color;
	String material;
	int liters;
	
	Bottle(){
		System.out.println("Creating the bottle objecct");
	}
	
	void pourwater() {
		System.out.println("Pour water");
	}
	void opencap() {
		System.out.println("Opening cap of bottle");
	}
	
	void closecap() {
		System.out.println("Closing cap of bottle");
	}

	public static void main(String[] args) {
		Bottle prestigeBottle=new Bottle();//instance or object
		
		prestigeBottle.color="blue";
		prestigeBottle.material="Steel";
		prestigeBottle.liters=1;
		
		System.out.println("color:"+prestigeBottle.color);
		System.out.println("material:"+prestigeBottle.material);
		System.out.println("liters:"+prestigeBottle.liters);
		
		prestigeBottle.pourwater();
		prestigeBottle.closecap();
		prestigeBottle.opencap();
		
		

	}

}
