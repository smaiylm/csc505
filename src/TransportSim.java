import java.util.ArrayList;

public class TransportSim {

  private ArrayList<Vehicle> cars;
  

  
  /*
  Auto k = new Auto(9,9,9);//NO variables - remove
  */
  public TransportSim()
  {
    //complete the constructor - creating the new array list
	  cars = new ArrayList<Vehicle>();
	  
	 
  }

  public void loadTrucks(String item)
  {
	for(Vehicle k: cars)  
		((Truck) k).load(item);
  }
    //load the param item into all trucks in the simulation
  //works


  public void step()
  {
	  
	  for(Vehicle k:cars){
	  k.move();
	  }
	  
    //instruct all vehicles in the simulation to move once 
	  
	  //works
  }
 

  public void run(int steps)
  {
	 
	  for(int x = 0; x< steps; x++){
		 
		  for(Vehicle k:cars){
			  k.move();
			  }
    //run the simulation 'steps' times
		//works - running is the same as moving
	  }
  }
  
  
  public void addVehicle(Vehicle v){
	  //puts v into the array list
	  cars.add(v);
  }
  
  
  
  public String toString()//overriding the toString() method  
  {
	//  
	    
    //What do you think this should look like?
	  
   // 
    
	  //if it's a car, to string in auto. If it's a truck, to string in Truck 
	  String all = "";
    for(Vehicle k:cars){
    	
    	if(k instanceof Truck){
    		//cast k to a truck
    		
    	
    	 all = all + ((Truck) k).toString();
    	}
    	if(k instanceof Auto){
		//cast k to an Auto
		  all = all + ((Auto) k).toString();
		  }
    }
    //Return the big string
    return all;
  }
}