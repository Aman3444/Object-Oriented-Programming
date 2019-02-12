import java.util.Comparator;
/**
 *  Vehicle Comparator  class use to  implements comparator vehicle class .
 * 
 *
 */
public class VehicleComparator implements Comparator<Vehicle> {
	/**
	 *  overriding compare method . in  here mainly we are taking  vehicles and comparing them.
	 */
	@Override	
	public int compare(Vehicle v1,Vehicle v2){
		if(v1 instanceof Bicycle && v2 instanceof Car )
		{
			return -1;
		}else if(v1 instanceof Car && v2 instanceof Bicycle)
		{
			return 1;
		}else {
			return 0;
		}

	}

}
