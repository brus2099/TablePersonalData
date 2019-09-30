
package fes.aragon.datos;

public class Datos {
	
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private String sexo;
	private double telefono;
	private int codPostal;
	private String estCivil;
	private String direccion;
	
	public Datos() {
		// TODO Auto-generated constructor stub
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getaPaterno() {
		return aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Datos [nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", sexo=" + sexo
				+ ", telefono=" + telefono + ", codPostal=" + codPostal + ", estCivil=" + estCivil + ", direccion="
				+ direccion + "]";
	}




}

