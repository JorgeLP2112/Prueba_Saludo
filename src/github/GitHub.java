package github;

public class GitHub {

    public static void main(String[] args) {
        String N = "Jorge Alejandro Martínez Espinoza"; //Oración 
        String cad = N.substring(0,1); //Variable cad que es igual a los caracteres de la posicion X a Y de la variable String N
        String cad1 = N.substring(6,7); //Además se debe de especificar el inicio de lo que necesitas hasta el final + 1, es decir, quiero la J, por eso es 0
        String cad2 = N.substring(16,17); //Pero hay que decir hasta el final más 1, 0 + 1 = 1, por eso que vaya de la posición 0 a la 1
        String cad3 = N.substring(25,26);

        System.out.println("Hola, mi nombre es: " + cad + cad1 + cad2 + cad3);
    }

}
