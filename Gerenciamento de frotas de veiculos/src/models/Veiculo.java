package models;

public class Veiculo {
	
	private String Tipo;
	private int Placa;
	
	public Veiculo(String Tipo, int Placa) {
		
		this.setTipo(Tipo);
		this.setPlaca(Placa);
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public int getPlaca() {
		return Placa;
	}

	public void setPlaca(int placa) {
		Placa = placa;
	}
}
