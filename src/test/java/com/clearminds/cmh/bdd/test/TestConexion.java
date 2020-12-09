package com.clearminds.cmh.bdd.test;

import java.sql.Connection;

import com.clearminds.cmh.bdd.ConexionBDD;
import com.clearminds.cmh.excepciones.BDDException;

public class TestConexion {
	public static void main(String[] args) {
		try {
			Connection conn = ConexionBDD.obtenerConexion();
			if (conn!=null) {
				System.out.println("Conexio Exitosa...");
			} 
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
