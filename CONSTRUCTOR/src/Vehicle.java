
public class Vehicle {
	
	String regNo;
	int noofWheels;
	String fueltype;
	
	public Vehicle() {
		System.out.println("No-arg constructor");
	}
	public Vehicle(String iregNo,int inoofWheels,String ifueltype)
	{
	   regNo=iregNo;
	   noofWheels=inoofWheels;
	   fueltype=ifueltype;
	}
	public Vehicle(String iregNo)
	{
		regNo=iregNo;
	   
	}
	public Vehicle(String iregNo,String ifueltype)
	{
		regNo=iregNo;
		fueltype=ifueltype;
	}
 
	 void running() {
		 System.out.println("Running the vehicle");
	 }
	 void applybrake(boolean brakes)
	 {
		 System.out.println("applying d brakes");
	 }
	public static void main(String[] args) 
	{
		System.out.println("start the prgm");
		Vehicle car=new Vehicle();
		System.out.println("regNo: "+car.regNo + "noofWheels: "+car.noofWheels + "fueltype: "+car.fueltype);
		
		String regNo="KA 05 ME 1834";
		int noofWheels=2;
		String fueltype="petrol";
		
		Vehicle bike=new Vehicle("KA 45JK3459",2,"petrol");
		System.out.println("regNo: "+bike.regNo + "noofWheels: "+bike.noofWheels + "fueltype: "+car.fueltype);
		
		Vehicle truck=new Vehicle("KAMK8954");
		System.out.println("regNo: "+truck.regNo);
		
		Vehicle scorpio=new Vehicle("TN 34LC9832",noofWheels,"Diesel");
		System.out.println("regNo: "+scorpio.regNo +"fueltype: "+scorpio.fueltype);
	

	}

}
