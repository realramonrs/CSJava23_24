package misClases;

import java.util.Comparator;

public class ComparaVehiculo implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o1.getCodigo().compareTo(o2.getCodigo());
	}

}
