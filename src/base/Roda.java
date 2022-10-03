import java.util.ArrayList;
public class Roda {
	Baralho compra, descarte;// o baralho enviado pelo "jogo" nada mais é um baralho de compra, que retiramos
							 // as cartas iniciais dos jogadores
            
	ArrayList<Jogador> jogadores = new ArrayList<>();

	private int sentido;// é um valor, que varia entre positivo e negativo, e é somado á posição do
	// ultimo jogador para definir o próximo a jogar
    private int posicaoAtual;

  
  /**
   * 
   * @return
   */
  public Carta comprarCarta() {
	  return(compra.pegarCarta(0));
	}
  
	
	
	/**
	 * 
	 * @param recebido
	 * @param jogadoresRecebidos
	 */
   public Roda(Baralho recebido, Jogador jogadoresRecebidos[]){
	  compra = recebido;
      for(int i = 0; i < jogadoresRecebidos.length; i++){
        this.jogadores.add(jogadoresRecebidos[i]);
      }
	 for(int i = 0; i < jogadores.size(); i ++){
         for(int j = 0; j < 7; j++){
		 jogadores.get(i).adicionarCarta(comprarCarta());
         }
	   }
	 do{
	   descarte.adicionarCarta(comprarCarta());
	 }while(descarte.getCarta().getNumero() == -1);
  }
  	/**
	   * 
	   * @param recebida
	   */
	public void descartarCarta(Carta recebida) {
	  // recebe uma carta e coloca no "descarte"
	}
  
	public void verificarCompra() {
	  // verifica se já está na hora de "transformar" o "descarte" em compra, tipo, se
	  // tiver menos que 10 cartas na "compra" esta função chama a função
	  // tranformaDescarte
	}
  
	public void transformaDescarte() {
	  // pega as cartas de descarte, exceto a ultima, e coloca na "compra"
	}
	/**
	 * 
	 * @param sentido
	 */
	public void inverter(int sentido) {
        sentido *= -1;
	}
	/**
	 * 
	 * @param sentido
	 * @param idJogador
	 * @param numJogadores
	 */
	public void pular() {
	  
	}
	/**
	 * 
	 * @param sentido
	 * @param idJogador
	 * @param numJogadores
	 */
	public void circular() {

	}
  
  
	/**
	 * 
	 * @param sentido
	 * @param idJogador
	 * @param numJogadores
	 * @return
	 */
	public Jogador proximoJogador() {
        return jogadores.get(posicaoAtual + 1);
	}
	/**
	 * 
	 * @param idJogador
	 */




  }
