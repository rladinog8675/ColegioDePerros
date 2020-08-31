/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegiodeperros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ESTEBAN
 */
public class ColegioDePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ColegioDePerros();
    }
    
    	public static void ColegioDePerros() throws IOException {
        
        System.out.println("Seleccione una opción para iniciar\n 1: Agregar Perro. \n 2: Ver datos Perro.");
        System.out.println(" 3: Eliminar Perro. \n 4: Perros por dueño. \n 5: Total perros por raza. \n 6: Total perros por localidad.");
        
        BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
        String opcion = reader.readLine();
        CalcularVariables calCacularVariables = new CalcularVariables();
        int codigo;    
        int cedula;    
        String raza;
        String localidad;
        switch (opcion) {
		case "1":
			System.out.println("Ingrese el codigo: ");
			codigo = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese el nombre: ");
			String nombre = reader.readLine();
                        System.out.println("Ingrese la raza: ");
			raza = reader.readLine();
                        System.out.println("Ingrese la localidad: ");
			localidad = reader.readLine();
                        System.out.println("Ingrese la ccedula del dueño: ");
			cedula = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese el nombre del Dueño: ");
			String nombreDueno = reader.readLine();
                        Perro perro = new Perro(codigo, nombre, raza, localidad, cedula, nombreDueno);
                        calCacularVariables.SetPerro(perro);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			ColegioDePerros();
			break;
        
		case "2":
                        System.out.println("Ingrese el codigo el Perro: ");
			codigo = Integer.parseInt(reader.readLine());
                        System.out.println("Datos del perro: ");
                        calCacularVariables.GetPerro(codigo);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			ColegioDePerros();
			break;
			
		case "3":
                        System.out.println("Ingrese el codigo el Perro: ");
			codigo = Integer.parseInt(reader.readLine());
                        calCacularVariables.DeletePerro(codigo);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			ColegioDePerros();
			break;
			
		case "4":
                        System.out.println("Ingrese la cedula del dueño: ");
			cedula = Integer.parseInt(reader.readLine());
                        calCacularVariables.GetPerrosByCedula(cedula);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			ColegioDePerros();
			break;
                        
		case "5":
                        System.out.println("Ingrese la raza: ");
                        raza = reader.readLine();
                        calCacularVariables.GetTotalPerrosByRaza(raza);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			ColegioDePerros();
			break;
                        
		case "6":
                        System.out.println("Ingrese la localidad: ");
                        localidad = reader.readLine();
                        calCacularVariables.GetTotalPerrosByLocalidad(localidad);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			ColegioDePerros();
			break;
			
		default:
			break;
		}
	}
    
}
