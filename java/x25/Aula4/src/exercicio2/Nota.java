package exercicio2;

public class Nota {

	private String materia;
	private double ponto;
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public double getPonto() {
		return ponto;
	}
	public void setPonto(double ponto) {
		this.ponto = ponto;
	}
	
	public Nota(){
		
	}
	
	public Nota(String materia, double ponto) {
		super();
		this.materia = materia;
		this.ponto = ponto;
	}
	
	
	
	
}
