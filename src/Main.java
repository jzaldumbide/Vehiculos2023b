// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido");

        Autos auto1=new Autos("Jeep","Kia","rojo",2021);
        Autos auto2=new Autos("Automovil","Chevrolet","Blanco",2019);
        auto1.imprimirDatos();
        auto2.imprimirDatos();

        System.out.println(auto1.getAnio()+ auto2.getAnio());


    }
}