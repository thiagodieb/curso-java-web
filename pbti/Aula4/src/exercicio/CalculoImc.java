
package exercicio;

public class CalculoImc {

	
	private double peso;
	private double altura;
	private double imc;
	private String comentario;
	
	public CalculoImc(){
		
	}
	
	public CalculoImc(double peso, double altura, double imc, String comentario) {
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.comentario = comentario;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public double getCalculoimc(){
		this.setImc(this.peso / (this.altura*this.altura));
		return this.getImc();
	}
	
	
}
