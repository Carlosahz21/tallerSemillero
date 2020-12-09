package com.clearminds.cmh.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.clearminds.cmh.excepciones.BDDException;

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
	
	public static Connection obtenerConexion() throws BDDException {
		String user = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");
		Connection conn = null;

		//Abrir una conneccion
		System.out.println("Conectando a la base de datos...");
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new BDDException("No se pudo conectar a la base de datos...");
		} 
		
		return conn;
	}
}
