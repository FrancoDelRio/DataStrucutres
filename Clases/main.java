package Clases;

public class main {
    public static void main(String[] args) {
        
        Galletita galletaAzul = new Galletita("Azul");
        Galletita galletaVerde = new Galletita("Verde");

        galletaAzul.setColor("AzulConVerde");
        System.out.println(galletaAzul.getColor());
        galletaVerde.setColor("AzulConRojo");
        System.out.println(galletaVerde.getColor());

    }
}
