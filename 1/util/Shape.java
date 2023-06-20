package util;

public class Shape {
    protected String color;
    protected boolean filled;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String showInfo(Shape s) {
        System.out.println("\nRodando showInfo:\n");
        return s.toString();

    }

    public String toString() {
        String resposta = "";
        if (isFilled()) {
            resposta = "Preenchido: Sim\nCor: "; 
            resposta += getColor();
            resposta += "\n";
        } else {
            resposta = "Preenchido: Não\n"; 
        }

        return resposta;
    }

}