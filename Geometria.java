package app;

import java.util.ArrayList;

public class Geometria {


		public static void main(String[] args) {
			ArrayList<Figura> lista = new ArrayList<Figura>();
			
	        Circulo c = new Circulo(6);
	        lista.add(c);
	        Losango l = new Losango(2, 3);
	        lista.add(l);
	        Quadrado q = new Quadrado(5, 5);
	        lista.add(q);
	        Retangulo r = new Retangulo(3, 4);
	        lista.add(r);
	        Triangulo t = new Triangulo(3, 3);
	        lista.add(t);

	        for (int i = 0; i < lista.size(); i++) {
	            System.out.println(lista.get(i).getClass().toString());
	            System.out.println("Área: " + lista.get(i).calcularArea());
	            System.out.println("Perímetro: " + lista.get(i).calcularPerimetro() + "\n");
	            //System.out.println("Diametro: " + lista.get(i).calcularDiagonal() + "\n");
	        }

	    
			
		}

		
	}


