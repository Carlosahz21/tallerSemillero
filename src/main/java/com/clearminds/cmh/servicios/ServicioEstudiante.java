package com.clearminds.cmh.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.cmh.dtos.Estudiante;
import com.clearminds.cmh.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
		
	public void insertarEstudiante(Estudiante estudiante) throws SQLException {
		Statement stmt = null;

		try {
			abrirConexion();
			// Ejecutar instruccion SQL
			System.out.println("Insertando registros a la tabla...");
			stmt = getConexion().createStatement();

			String sql = "INSERT INTO estudiantes " + "VALUES ('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "', '"+ estudiante.getEdad()+ "', '"+  estudiante.getFecha()+"')";
			System.out.println("Insertado estudiante: " + estudiante);
			stmt.executeUpdate(sql);
			System.out.println("Script: " + sql);
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		} finally {
			cerrarConexion();
		}
	}

	public void actualizarEstudiante(Estudiante estudiante) {
		Statement stmt = null;

		try {
			// Ejecutar instruccion SQL
			System.out.println("Modificando registros de la tabla...");
			stmt = getConexion().createStatement();

			String sql = "UPDATE estudiantes SET nombre='" + estudiante.getNombre() + "', apellido='" + estudiante.getApellido() + 
					     "' WHERE id=" + estudiante.getId() + "', '"+ estudiante.getEdad()+ "')";
			System.out.println("Actualizando estudiante: " + estudiante);
			stmt.executeUpdate(sql);
			System.out.println("Script: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		} finally {
			cerrarConexion();
		}
	}

}
