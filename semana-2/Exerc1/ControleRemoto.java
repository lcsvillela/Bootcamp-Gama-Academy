package Exerc1;

public class ControleRemoto {

	private Televisao tv;
	public ControleRemoto(Televisao tv) {
		super();
		this.tv = tv;
	}
	
	public void aumentarVolume() {
		if(tv.incVol() == 1) {
			System.out.println("volume aumentado para "+tv.getVolume());
		}else {
			System.err.println("volume j� est� no m�ximo: "+tv.getVolume()+", informe outra op��o.");
		}
	}
	
	public void diminuirVolume() {
		if(tv.decVol() == 1) {
			System.out.println("volume diminuido para "+tv.getVolume());
		}else {
			System.err.println("n�o poss�vel diminuir o volume, informe outra op��o.");
		}
	}
	
	public void aumentarCanal() {
		tv.incCanal();
		System.out.println("Novo Canal: "+tv.getCanal());
	}
	
	public void diminuirCanal() {
	   if(tv.decCanal() == 1) {
		   System.out.println("Novo Canal: "+tv.getCanal());   
	   }else {
		   System.err.println("canal 0 n�o existente, informe outra op��o.");
	   }
	}
	
	public void trocarCanal(int canal) {
		  System.out.println("Canal trocado com sucesso para "+tv.trocarCanal(canal));
	}
	
	public int volume() {
		return tv.getVolume();
	}
	
	public int canal() {
		return tv.getCanal();
	}
	
	public void desligar() {
		tv.setLigado(false);
	}
}