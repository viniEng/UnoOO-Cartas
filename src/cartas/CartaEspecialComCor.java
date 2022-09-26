package cartas;

public class CartaEspecialComCor extends CartaComAcao {
	

	public CartaEspecialComCor(Cor c, String ac){
		
		super.setCor(c);
		//super.setNumero(-1);
		super.setAcao(ac);
	}

	@Override
	public Cor getCor() {
		// TODO Auto-generated method stub
		return super.getCor();
	}

	@Override
	public String getAcao() {
		// TODO Auto-generated method stub
		return super.getAcao();
	}

	@Override
	public void setCor(Cor c) {
		// TODO Auto-generated method stub
		super.setCor(c);
	}

	@Override
	public void setAcao(String ac) {
		// TODO Auto-generated method stub
		super.setAcao(ac);
	}

	@Override
	public void setNumero(int n) {
		// TODO Auto-generated method stub
		super.setNumero(n);
	}
	
	

}
