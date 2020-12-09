package com.clearminds.cmh.servicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.cmh.bdd.ConexionBDD;
import com.clearminds.cmh.dtos.Estudiante;
import com.clearminds.cmh.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = ConexionBDD.obtenerConexion();

			// Ejecutar instruccion SQL
			System.out.println("Insertando registros a la tabla...");
			stmt = conn.createStatement();

			String sql = "INSERT INTO estudiantes " + "VALUES ('+" + estudiante.getNombre() + "','" + estudiante.getApellido() + "')";
			stmt.executeUpdate(sql);
		} catch (BDDException | SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
