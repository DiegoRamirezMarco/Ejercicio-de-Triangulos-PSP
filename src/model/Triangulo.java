package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Triangulo {
        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Se requiere un argumento");
                return;
            }

            int filas = Integer.parseInt(args[0]);
            System.out.println("Hora de inicio " + hora());
            for (int i = filas; i >= 1; i--) {
                for (int n = 1; n <= i; n++) {
                    System.out.print(n);
                }
                System.out.println();
            }
            System.out.println("hora de inicio " + hora());


        }
        //He creado aqui la fucion para el formateo de la hora
    private static String hora() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
            return fecha.format(formato);
    }
}

