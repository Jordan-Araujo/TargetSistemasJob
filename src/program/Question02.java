package program;

public class Question02 {
	private Integer numero;

	Question02() {
	}

	public Question02(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public boolean fibonacci(int numero) {
		int num1 = 1;
		int num2 = 0;
		boolean test = false;

		while (num1 <= numero) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			if (num1 == numero) {
				test = true;
			}
		}
		if (test == true) {
			return true;
		}else {
			return false;	
		}
	}
}