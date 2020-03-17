package app;

public abstract class Poligono extends Figura {

    private double base;
    private double altura;
  


    public Poligono(double base2, double altura2) {
		// TODO Auto-generated constructor stub
	}

	public Poligono() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



}
