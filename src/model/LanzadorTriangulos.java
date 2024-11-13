package model;

import java.io.File;
import java.io.IOException;

public class LanzadorTriangulos {
    public static void main(String[] args) {
        //Creo un array con los numeros que se solicitan para solo crear un unico Proces Builder con distintos numeros
        int[] nums = {5,7,9};

        String path = System.getProperty("java.class.path");
        File fError = new File ("src/recursos/errores.txt");
        //Con solo un for recorremos el numero de valores que tiene el array
        //De esta forma cada iteracion ejecuta un Procces Builder con valores deistintos
        //Y outputs dedicados a cada iteracion.
        for (int numero : nums) {
            File f = new File("src/recursos/triangulo"+numero+".txt");
            ProcessBuilder pc = new ProcessBuilder("java", "-cp", path, "model.Triangulo", String.valueOf(numero) );

            pc.redirectOutput(f);
            pc.redirectError(fError);

            try {
                pc.start();
            } catch (IOException e) {
                System.out.println("Error IO " + e.getMessage());
            }
        }
    }
}
