public abstract class Shape {
    protected String shapeName;

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

   
    public String toString() {
        String resposta = "";
       
        resposta = getShapeName() + "\n"; 

        return resposta;
    }

}