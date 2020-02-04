package javamethods;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	structureprogram row1=new structureprogram();
	//non return type(void)-without parameters
	row1.add(); 
	
	//non return type(void)-with parameters
	row1.multiply(5, 10);
	
	
	//return type-without parameters
	int S=row1.subtract();
	System.out.println(S);
	
	//return type-with parameters
	int V=row1.subtract(100, 55);
	System.out.println(V);

	}  

}
