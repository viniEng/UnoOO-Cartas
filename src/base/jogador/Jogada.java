package base.jogador;

public interface Jogada{
    /*Classe: jogada de compra;
        Função da classe: caso o jogador não detiver de nenhuma carta que combine com a que está na 
    mesa, ou outro jogador anterior lançar uma das cartas especiais (+2 ou +4), deve ser retirado uma 
    carta do baralho de compra e adicionada ao baralho do jogador em questão.*/  
    public void comprar(int quant);
    
    /*Classe: jogada de descarte; 
        Função da classe: caso o jogador detiver de alguma carta que combine com a que foi jogada 
    anteriormente, a carta deve ser selecionada e retirada do baralho do jogador e colocada no baralho 
    de descarte, caso o jogador detiver de mais uma carta que combine com a da mesa, ele deve 
    selecionar um das duas. */
    public void descartar();

}