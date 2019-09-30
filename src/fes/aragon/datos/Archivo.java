package fes.aragon.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
	
	private ArrayList<Datos> datos= new ArrayList<>();
	
	private String ruta="";
	public Archivo() {
		// TODO Auto-generated constructor stub
	}
	public Archivo(String ruta) {
		super();
		this.ruta = ruta;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public ArrayList<Datos> getDatos() {
		return datos;
	}
	
	public void llenarDatos() throws IOException {
		File file = new File (this.ruta);
		if(file.exists()) {
		FileReader fr = new FileReader(file);
		BufferedReader buf = new BufferedReader(fr);
		String cad = "";
		while ((cad=buf.readLine())!=null) {
			String[] arg= cad.split(";");
			Datos dat= new Datos();
			dat.setNombre(arg[0]);
			dat.setaPaterno(arg[1]);
			dat.setaPaterno(arg[2]);
			dat.setSexo(arg[3]);
			dat.setTelefono(Double.parseDouble(arg[4]));
			dat.setCodPostal(Integer.parseInt(arg[5]));
			dat.setEstCivil(arg[6]);
			dat.setDireccion(arg[7]);
			
			this.datos.add(dat);
			
		}
		}else {
			//System.out.println("No existe el archivo");
			new IOException("No existe archivo");
		}
	}
	
	public void almacenar( String ruta, ArrayList<Datos> datos) {
		File file= new File(ruta);
		try {
			FileWriter fw= new  FileWriter(file);
			PrintWriter pw= new PrintWriter(fw);
			for (Datos info : datos) {
				pw.print(info.getNombre()+";");
				pw.print(info.getaPaterno()+";");
				pw.print(info.getaMaterno()+";");
				pw.print(info.getSexo()+";");
				pw.print(info.getTelefono()+";");
				pw.print(info.getCodPostal()+";");
				pw.print(info.getEstCivil()+";");
				pw.print(info.getDireccion()+";");

			}
			pw.close();
			fw.close();
		} catch( IOException e) {
			e.printStackTrace();
		}
	}
	
	
}