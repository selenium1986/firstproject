
public class Audi extends Car{
	
	public int seats = 4;
	public int fuels = 100;
	
	public void displays(int seats,int fuels){
		System.out.println("Number of seats to sit ="+ seats);
		System.out.println("Fuel tank capacity ="+ fuels);
	}
    public void safety(){
    	System.out.println("saftested");
    }
	
}

