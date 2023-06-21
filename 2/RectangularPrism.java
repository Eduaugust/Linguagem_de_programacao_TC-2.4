public class RectangularPrism extends Shape {

    private double altura;
    private double largura;
    private double comprimento;

    public RectangularPrism(double altura, double largura, double comprimento) {
        super();
        setShapeName("RectangularPrism");
        setAltura(altura);
        setLargura(largura);
        setComprimento(comprimento);
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    @Override
    public double area() {
        double a = getAltura();
        double b = getLargura();
        double c = getComprimento();
        
        return 2*(a*b)+2*(a*c)+2*(b*c) ;
    }


    @Override
    public String toString() {
        return super.toString() + "Altura: " + Double.toString(getAltura()) + "\nlargura: " + Double.toString(getLargura()) + "\nComprimento: " + Double.toString(getComprimento());
    }
}