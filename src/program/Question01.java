package program;

public class Question01 {
	private Integer indice = 13;
	private Integer soma = 0;
	private Integer k = 0;
	
	public Question01() {
	}	
	public Question01(Integer indice, Integer soma, Integer k) {
		this.indice = indice;
		this.soma = soma;
		this.k = k;
	}

	public Integer getIndice() {
		return indice;
	}
	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	public Integer getSoma() {
		return soma;
	}
	public void setSoma(Integer soma) {
		this.soma = soma;
	}
	public Integer getK() {
		return k;
	}
	public void setK(Integer k) {
		this.k = k;
	}
	
	public Integer nextNumber() {
		while (k < indice) {
			k = k + 1;
			soma = soma + k;
		}
		return  soma;
	}
}