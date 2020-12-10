package com.clearminds.cmh.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.cmh.bdd.ConexionBDD;
import com.clearminds.cmh.excepciones.BDDException;

public class ServicioBase {
	Connection conexion;

	public Connection getConexion() {
		return conexion;
	}

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {
		try {
			conexion.close();
			System.out.println("Conexion Cerrada");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}
	}
}
