public class JogadaCompra{
    private String comprar;
    private String jogar;
    private int qtdCompras;
    int acumularCompras = 1;

    //private int acumularCompras;
    //private String passarVez;
    public JogadaCompra(String compra, int qtdCompras){ //Comprar uma carta, porém não é uma carta possível de se jogar ou compra forçada por carta especial
        this.comprar = compra;
        this.jogar = null;
        this.qtdCompras = qtdCompras;
    }
    public JogadaCompra(String jogada, String compra){ //Comprar uma carta, que é possível de se jogar
        this.comprar = compra;
        this.jogar = jogada;
        this.qtdCompras = 1;
        //this.acumularCompras = 0;
    }
    public JogadaCompra(String jogada, int qtdCompras, String compra){// Não comprar, mas acumular compra com outra carta especial ou simplesmente joga uma carta.
        this.comprar = null;
        this.jogar = jogada;
        this.qtdCompras += qtdCompras;
    }
    
    public int getqtdCompras(){
        return this.qtdCompras;
    }
    public String getcomprar(){
        return this.comprar;
    }
    public String getjogar(){
        return this.jogar;
    }
    public void setqtdCompras(int compra){
		this.qtdCompras = compra;
	}
	public void setcomprar(String comprar){
		this.comprar = comprar;
	}
	public void setjogar(String jogada){
		this.jogar = jogada;
	}
public static void main(String[] args){
    //JogadaCompra apenasCompra = new JogadaCompra(null, 0);
    //JogadaCompra compraEJogada = new JogadaCompra(null, null);
    //JogadaCompra acumularCompra = new JogadaCompra(null, 0, null);
    

    }
}




//quando tiver método @return p/ o que ele retorna| pesquisar javadocs tags|    @author separando nomes por vírgulas| parâmetro e retorno são os mais importantes   
/*public JogadaCompra(String compra, int qtdCompras){ //Comprar cartas acumuladas por cartas especiais de compra
    this.comprar = compra;
    this.jogar = null;
    this.qtdCompras = qtdCompras;
}*/

/**
*embrarlhar caso o baralho de  compra ==0
*(embaralhar as cartas do vetor de descarte com excessao da posição 0)
*/
