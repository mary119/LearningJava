
public class Method {

	public static void main(String[] args) {
		
		int a=10, b=20;
		SumOfTwo(a,b);
		
		int c=60, d=30;
		SubOfTwo(c,d);
		
		
		int res=MulOfTwo(40,20);
		System.out.println("Mul of 40 & 20 is:"+res);
		
		double g=30.00, h=75.00;
		DivOfTwo(g,h);
		
		double i=80.00, j=30.00;
		ModOfTwo(i,j);

	}
	public static void SumOfTwo(int a,int b) {
		int Sum=a+b;
		System.out.println("The sum of "+a+ "&"+b+" is "+Sum);
	}
	public static void SubOfTwo(int c,int d) {
		int Sub=c-d;
		System.out.println("The sub of "+c+ "&"+d+" is "+Sub);
	}
	public static int MulOfTwo(int e,int f) {
		int Mul=e*f;
		return Mul;
	}
	public static void DivOfTwo(double g,double h) {
		double Div=g/h;
		System.out.println("The div of "+g+ "&"+h+" is "+Div);
	}
	public static void ModOfTwo(double i,double j) {
		double Mod=i%j;
		System.out.println("The mod of "+i+ "&"+j+" is "+Mod);
		
		
		
		
	}

}
