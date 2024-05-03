import java.util.Scanner;

public class main {
    public static void main(String[]args){
        System.out.println("Bienvenidos a la Inmercion en JAVA");
        //System.out.println("Pelicula Matrix");
        //declaracion de variables
        Scanner teclado=new Scanner(System.in);
        int fechaLanzamiento=1999;
        double evaluacion=4.5;
        boolean incluidoPlanBasico =true;
        String nombre="Matrix";
        String sinopsis= """
                Matrix pelicula sub realista 
                incomprendible
                """;
        double notaPelicula;
        double mediaEvaluacion=(4.5+4.8+2)/3;
        double mediaEvaluacionUsuario=0;
       System.out.println("Titulo de la Pelicula: "+ nombre);
        System.out.println("Lanzade en: "+ fechaLanzamiento);
        System.out.println("La impresion de los que la vieron "+ evaluacion);
        System.out.println("Condicion respecto a su plan "+ incluidoPlanBasico);
        System.out.println("La media de la evaluacion es: "+mediaEvaluacion);

        if (fechaLanzamiento>= 2023){
            System.out.println("pelicula popular del momento");
        }else {
            System.out.println("peliculas retro");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa nota de Pelicula");
           notaPelicula=teclado.nextDouble();
           mediaEvaluacionUsuario= (mediaEvaluacionUsuario+notaPelicula);
        }
        mediaEvaluacionUsuario = mediaEvaluacionUsuario/3;
        System.out.println("la evaluacion de los usuarios es: "+mediaEvaluacionUsuario);

        int i=0;

        while (i<3){
            System.out.println("Ingresa nota de Pelicula");
            notaPelicula=teclado.nextDouble();
            mediaEvaluacionUsuario= (mediaEvaluacionUsuario+notaPelicula);
           i=i+1;

        }
        mediaEvaluacionUsuario = mediaEvaluacionUsuario/3;
        System.out.println("la evaluacion de los usuarios es: "+mediaEvaluacionUsuario);






    }
}
