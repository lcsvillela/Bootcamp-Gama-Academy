package Exerc1;

public class Televisao {

	//estado
	private boolean ligado;
	//controle
	private int volume = 0;
	private final int volumeMax = 100;
	private int canal = 0;
	
	public Televisao(int volume, int canal) {
		super();
		this.ligado = true;
		this.volume = volume;
		this.canal = canal;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getVolume() {
		return volume;
	}
	public int getCanal() {
		return canal;
	}

	public int incVol() {
		if(volume < volumeMax) {
			this.volume++; 
			return 1;
		}else {
			return 0;
		}
		
	}
	
	public int decVol() {
		if(volume > 0 ) {
			volume--;
			return 1;
		}else {
			return 0;
		}
	}
	
	public void incCanal() {
		this.canal++;
	}
	
	public int decCanal() {
		if(canal > 1) {
			canal--;
			return 1;
		}else {
			return 0;
		}
	}
	
	public int trocarCanal(int canal) {
		this.canal = canal;
		return canal;
	}
	
	
	
	
	
}