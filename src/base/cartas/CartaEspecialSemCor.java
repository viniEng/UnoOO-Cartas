package cartas;

public class CartaEspecialSemCor extends CartaComAcao {

	public CartaEspecialSemCor(String ac){//Carta especial sem cor
		super.setCor(null);
		super.setNumero(-1);
		super.setAcao(ac);
	}
	
	public String getCor() {
		return "Esta carta não possui uma cor";
	}
}
