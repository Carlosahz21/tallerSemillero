package com.clearminds.cmh.bdd.test;

import java.sql.SQLException;

import com.clearminds.cmh.dtos.Estudiante;
import com.clearminds.cmh.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) throws SQLException {
		ServicioEstudiante serv = new ServicioEstudiante();
		Estudiante estudiante = new Estudiante(15, "Esteban", "Lopez");
		serv.insertarEstudiante(estudiante);
	}
}
