// (1) um círculo de raio 7 com preenchimento azul
// (2) um quadrado de lado 5 sem preenchimento
// (3) um retângulo de lados 3x6 com preenchimento preto
// (4) uma forma (Shape) com preenchimento verde. Em 
// (5) seguida remova o preenchimento do retângulo. 

import util.Shape;

public class Main {
    public static void main(String[] args) {

        Circle circulo = new Circle("Azul", true, 7);
        Square quadrado = new Square("Null", false, 5.0);
        Rectangle retangulo = new Rectangle("Preto", true, 3, 6);
        Shape forma = new Shape("Verde", true);
        System.out.println(forma.showInfo(retangulo));
        retangulo.setFilled(false);
        System.out.println(forma.showInfo(retangulo));

        System.out.println(forma.showInfo(circulo));
        System.out.println(forma.showInfo(quadrado));

    }
}