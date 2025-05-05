package Model;

public abstract class FiguraGeometrica {
    private String cor;
    public FiguraGeometrica() {
    this("");    
}
public FiguraGeometrica (String cor) {
    this.cor = cor;
}
public String getCor () {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public abstract double getArea();
}
