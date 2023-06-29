package week1.day1;

public class Car {
      public void driveCar() {
    	  System.out.println("Print driveCar Method");
      }
      public void applyBrake() {
    	  System.out.println("Print applyBrake Method");
      }
      public void soundHorn() {
    	  System.out.println("Print soundHornMethod ");
      }
      public void isPuncture() {
    	 System.out.println("Print isPuncture Method"); 
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c =new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
	}
}
