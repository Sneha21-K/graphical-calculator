

interface Vehicles{
	public void gearChange();
	public void speedUp();
	public void applyBreaks();
	
}
class Bicycle implements Vehicles{
	public void gearChange(){
	System.out.println("Gear changed for Bicycle");	
	}
	public void speedUp() {
	System.out.println("Speed up for Bicycle");		
	}
	public void applyBreaks() {
	System.out.println("Applied breaks for Bicycle");		
	}
}
class Bike implements Vehicles{
	public void gearChange(){
	System.out.println("Gear changed for Bike");	
	}
	public void speedUp() {
	System.out.println("Speed up for Bike");		
	}
	public void applyBreaks() {
	System.out.println("Applied breaks for Bike");		
	}
}
class Car implements Vehicles{
	public void gearChange(){
	System.out.println("Gear changed for Car");	
	}
	public void speedUp() {
	System.out.println("Speed up for Car");		
	}
	public void applyBreaks() {
	System.out.println("Applied breaks for Car");		
	}
}
    public class Interfaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicles v;
v=new Bicycle();
    
    v.gearChange();
    v.speedUp();
    v.applyBreaks();
    
v=new Bike();
    
    v.gearChange();
    v.speedUp();
    v.applyBreaks();
v=new Car();
    
    v.gearChange();
    v.speedUp();
    v.applyBreaks();    
    
	}

}
