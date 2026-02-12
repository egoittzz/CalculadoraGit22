package calculadora22;
/**este el metodo de dividir*/
public class Calculadora22 {
	public int sumar(int a, int b) {
		return a + b;
		
	}
	public int restar(int a, int b) { 
		return a - b;
	}
	public int multiplicar(int a, int b) { 
		return a * b;
	}
/**este el metodo de dividir*/
	public double dividir(int a, int b) { 
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
		}
		
		return (double) a / b;
	}
	public int potencia(int base, int exponente) {
		int resultado = 1;
	for (int i = 0; i < exponente; i++) { 
		resultado *= base;
	}
	return resultado;
	}
/**este el metodo de dividir*/
	public int modulo(int a, int b) { 
		return a % b;
	}

}
