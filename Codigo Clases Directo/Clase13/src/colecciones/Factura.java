package colecciones;

import java.util.Objects;

public class Factura implements Comparable<Factura> {

	private String id;
	private float precio;

	public Factura(String id, float precio) {
		super();
		this.id = id;
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", precio=" + precio + "]";
	}

	// Añadir criterio de igualdad --> Equals , HashCode

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override

	public boolean equals(Object o) {
		Factura f = (Factura) o;

		return f.id.equals(this.id);

	}

	@Override
	public int compareTo(Factura o) {
		// TODO Auto-generated method stub
		return Float.valueOf(precio).compareTo(o.precio);
	}

}
