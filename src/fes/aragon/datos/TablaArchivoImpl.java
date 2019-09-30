 package fes.aragon.datos;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TablaArchivoImpl extends AbstractTableModel {

	private ArrayList<Datos> datos;
	private String[] nombres = { "Nombre", "Apellido Paterno","Apellido Materno","Sexo","Telefono","CP","Estado Civil","Direccion" };

	public TablaArchivoImpl(String ruta) throws IOException {
		// TODO Auto-generated constructor stub
		Archivo arch = new Archivo(ruta);
		arch.llenarDatos();
		this.datos = arch.getDatos();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.nombres.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.datos.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		Datos temp = this.datos.get(arg0);
		String celda = "";
		if (arg1 == 0) {
			celda = temp.getNombre();
		} else if (arg1 == 1) {
			celda = temp.getaPaterno();
		} else if (arg1 == 2) {
			celda = temp.getaMaterno();
		} else if (arg1 == 3) {
			celda = temp.getSexo();
		} else if (arg1 == 4) {
			celda = String.valueOf(temp.getTelefono());
		} else if (arg1 == 5) {
			celda = String.valueOf(temp.getCodPostal());
		} else if (arg1 == 6) {
			celda = temp.getEstCivil();
		} else if (arg1 == 7) {
			celda = temp.getDireccion();
		} 
		return celda;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return super.getColumnName(column);
	}

	public ArrayList<Datos> getDatos() {
		return datos;
	}

	@Override
	public void fireTableDataChanged() {
		// TODO Auto-generated method stub
		super.fireTableDataChanged();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Datos info = datos.get(rowIndex);
		if (columnIndex == 0) {
			info.setNombre((String) aValue);
		} else if (columnIndex == 1) {
			info.setaPaterno((String) aValue);
		} else if (columnIndex == 2) {
			info.setaMaterno((String) aValue);
		} else if (columnIndex == 3) {
			info.setSexo((String) aValue);
		} else if (columnIndex == 4) {
			info.setTelefono(Double.parseDouble((String) aValue));
		} else if (columnIndex == 5) {
			info.setCodPostal(Integer.parseInt((String) aValue));
		} else if (columnIndex == 6) {
			info.setEstCivil((String) aValue);
		} else if (columnIndex == 7) {
			info.setDireccion((String) aValue);
		}
	}

	public void borrarFila(int row) {
		this.datos.remove(row);
	}

	public void almacenar(String ruta) {
		Archivo arch = new Archivo();
		arch.almacenar(ruta, datos);
	}

}