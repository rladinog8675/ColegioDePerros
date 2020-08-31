package colegiodeperros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CalcularVariables {

public List<Perro> ViewPerros() {
            List<Perro> listPerros = new ArrayList<>();
            try {
               FileInputStream fis = new FileInputStream("t.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                 listPerros = (List<Perro>) ois.readObject();
                ois.close();
               
            } catch (Exception e) {
                e.getMessage();
            }
		
         return listPerros;
	
}

public void SetPerro(Perro perro) {
            try {
                List<Perro> perros = ViewPerros();
                perros.add(perro);
                 FileOutputStream fos = new FileOutputStream("t.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(perros);
                oos.close();
               
            } catch (Exception e) {
                e.getMessage();
            }      
	}
    
public void DeletePerro(int codigo) {
            try {
                List<Perro> perros = ViewPerros();
                List<Perro> newPerros = ViewPerros();
                for (Perro perro : perros) {
                if (perro.getCodigo()!= codigo ) {
                    newPerros.add(perro);
                }                
            }
                
                 FileOutputStream fos = new FileOutputStream("t.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(newPerros);
                oos.close();
               
            } catch (Exception e) {
                e.getMessage();
            }      
	}

public void GetPerro(int codigo){
        List<Perro> perros = ViewPerros();
            for (Perro perro : perros) {
                if (perro.getCodigo()== codigo ) {
                    System.out.println("Codigo : " + perro.getCodigo() + "\n" +
                            "Nombre: " + perro.getNombre()+ "\n" + 
                            "Raza: " + perro.getRaza()+ "\n" + 
                            "Localidad: " + perro.getLocalidad()+ "\n" + 
                            "Cedula dueño: " + perro.getCeldulaDueno() + "\n" +      
                            "Dueño: " + perro.getNombreDueno()
                    );
                }                
            }
        }

public void GetPerrosByCedula(int cedula){
        List<Perro> perros = ViewPerros();
            for (Perro perro : perros) {
                if (perro.getCeldulaDueno()== cedula ) {
                    System.out.println("Codigo : " + perro.getCodigo() + "\n" +
                            "Nombre: " + perro.getNombre()+ "\n" + 
                            "Raza: " + perro.getRaza()+ "\n" + 
                            "Localidad: " + perro.getLocalidad()+ "\n" + 
                            "Cedula dueño: " + perro.getCeldulaDueno() + "\n" +      
                            "Dueño: " + perro.getNombreDueno() + "\n" + "\n" 
                    );
                }                
            }
}

public void GetTotalPerrosByRaza(String raza){
        List<Perro> perros = ViewPerros();
        int countPerros = 0;
            for (Perro perro : perros) {
                if (perro.getRaza().equals(raza)) {
                    countPerros = countPerros + 1;
                }                
            }
        System.out.println("Hay " + countPerros + " de la raza " + raza);
}

public void GetTotalPerrosByLocalidad(String localidad){
        List<Perro> perros = ViewPerros();
        int countPerros = 0;
            for (Perro perro : perros) {
                if (perro.getLocalidad().equals(localidad)) {
                    countPerros = countPerros + 1;
                }                
            }
        System.out.println("Hay " + countPerros + " en la localidad " + localidad);
}
}
