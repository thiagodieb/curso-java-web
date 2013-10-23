package exercicio;

public class Calculadora {
	
	private double valor1;
	private double valor2;
	
	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public double getSomar(){
		return this.valor1+this.valor2;
	}
	public double getSubtrair(){
		return this.valor1-this.valor2;
	}
	public double getMultiplicar(){
		return this.valor1*this.valor2;
	}
	
	public double getDividir(){
		return this.valor1/this.valor2;
	}
	

}
