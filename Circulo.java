package app;

public class Circulo extends Figura {

    private double raio;



	public Circulo(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

}
