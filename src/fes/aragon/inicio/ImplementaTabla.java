package fes.aragon.inicio;

import javax.swing.table.*;

public class ImplementaTabla extends AbstractTableModel {
	private String[][] matriz = { { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8" }, { "B1", "B2", "B3" } };
	private String[] nombre= {"C1","C2","C3"};
	
	public ImplementaTabla(){
		
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return nombre[column];
	}

	@Override
	public int getColumnCount() { // columnas

		// TODO Auto-generated method stub
		return matriz[0].length;
	}

	@Override
	public int getRowCount() { // filas
		// TODO Auto-generated method stub
		return matriz.length;
	}

	@Override
	public Object getValueAt(int row, int column) { // agarra celda por celda lo que tiene que agarrar
		String celda = matriz[row][column];
		// TODO Auto-generated method stub
		return celda;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setValueAt(Object data, int row, int column) {
		// TODO Auto-generated method stub
		String con= (String)data;
		matriz[row][column]=con;
	}
	

}