package app;

		public class Piramide extends Poligono3d{

	    public Piramide(double base, double altura, double profundidade) {
	        super(base, altura, profundidade);
	    }

	    
	    
	    public Piramide(){
	        super();
	    }

	    @Override
	    public double calcularArea() {
	        return getBase() * getAltura() / 2;
	    }

	    @Override
	    public double calcularPerimetro() {
	        return 3 * getBase();
	    }
	    
	    @Override
	    public double calcularVolume() {
	        return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
	    }

	}

