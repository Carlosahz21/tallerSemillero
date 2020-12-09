package com.clearminds.cmh.bdd.test;

import com.clearminds.cmh.dtos.Estudiante;
import com.clearminds.cmh.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) {
		ServicioEstudiante serv = new ServicioEstudiante();
		Estudiante estudiante = new Estudiante("Carlos", "Meneses");
		serv.insertarEstudiante(estudiante);
	}
}
