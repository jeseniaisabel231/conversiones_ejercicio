public class Main {
    public static void main(String[]args){
        //Covertir del tipo de dato mas grande al pequeno
        //byte -> short -> char -> int -> long -> float -> double
        //Conversion implicita
        int x = 645;
        double y = x;
        System.out.println(y);

        //Conversion explicita
        int z = 345;
        double h = (double) z;
        System.out.println(h);

        //Convertir de pequeno a grande
        //double -> float -> long -> int -> char -> short -> long
        //Conversion explicita
        double p = 34.56;
        int s = (int) p;
        System.out.println(s);

        //Conversion de string a numero
        //primer metodo
        String palabra = "44";
        int end = Integer.valueOf(palabra);

        //para comprobar y se suma mas un numero entero
        System.out.println(end+1);

        //segundo metodo
        String palabra2 = "26";
        int cualquiera = Integer.parseInt(palabra2);
        System.out.println(cualquiera+2);

        //Conversion de tipos de datos a string
        int dos = 34;
        String tres = Integer.toString(dos);
        System.out.println(tres+ "casa");

    }
}
