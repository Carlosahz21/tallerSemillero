package com.clearminds.cmh.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return p.getProperty(propiedad);
	}
}
