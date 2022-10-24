//UnoOO
//Disciplina de LPOO 2022.2
    
package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author Autores: Daniel Schutz, Felipe Pellissari, Fernanda Pessoa e José Lucas.
*Classe destinada a inicializar a partida e verificar seu término, bem como
*preparar o jogo - instanciando o baralho inicial, jogadores e passando estes por
*parâmero a classe 'Roda'
*/
public class Jogo{

    private Baralho baralho;
    private List<Jogador> jogadores = new ArrayList<>();
    private Roda roda;
    private int numeroJogadores;
    private Jogador jogadorAtual = new Jogador();//já tem essa no roda.java
    private Carta ultimaCarta = new Carta(); //já tem essa no baralho.java
    private int acumulo = 0;

    
    /**
    *Inicia o Baralho, lendo número de jogadores em 'numeroJogadores' e
    *lendo o nome dos jogadores em 'nome', passando por parâmetro para a classe Jogador
    *passando por parâmetro para a classe Roda(baralho, jogador)
    *@see Baralho.java
    *@see Jogador.java
    *@see Roda.java
    */


    int getAcumulo()
    {
        return this.acumulo;
    }
    int setAcumulo(int acumulo);
    {
        this.acumulo = acumulo;
    }

    Carta getUltimaCarta()
    {
        return this.ultimaCarta;
    }


    Jogador getJogadorAtual()
    {
        return this.jogadorAtual;
    }
    
    void setJogadorAtual(Jogador jogadorAtual)
    {
        this.jogadorAtual = jogadorAtual;
    }




    public void prepararJogo()
    {
        /**
        *Inicia o baralho
        */
        this.baralho = new Baralho();
        baralho.Baralho(inicial); /*para gerar cartas e embaralhar */

        /**
        *definir quantidade de  jogadores
        */
        System.out.println("Quantos jogadores?\n");
        Scanner sc = new Scanner(System.in);
        this.numeroJogadores = sc.nextInt();

        /**
        *instanciar jogadores
        */
        for(int i=0; i<numeroJogadores; i++)
        {
            Jogador jogador[i] = new Jogador(/*passar informações do jogador*/);
            jogadores.add(jogador[i]);

        }

        /**
        *instanciar a roda e mandar baralho e lista de jogadores
        */
        roda = new Roda(this.baralho, this.jogadores);

        /**definir o primeiro jogador do primeiro turno*/
        setJogadorAtual(proximoJogador());

    }

    public int confereFim(){
        if(baralho.quantCarta() == 0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        /**
        *inicializa baralho, roda, jogadores e define o primeiro jogador
        */
        prepararJogo();

        while(1){

            /*um exemplo de como seria definida a ultima carta */
            
            /**
            *ultima carta da pilha de descarte
            *@see Roda.java
            */
            baralho.ultimaCarta(); 
            

            /*por enquanto não temos acesso ao tipo de retorno das cartas para poder definir a comparação e os métodos para executar */
            
            /**
            *verificar AcaoAcumulada
            *@see Acao.java
            *@see Jogador.java
            */
            if(getAcumulo()==0)/*se não tem acumulo*/
            {
                jogadorAtual.realizarJogada();/*jogador joga uma carta ou compra UMA da pilha de compra */
                
                if(/*se a carta descartada for reverso, bloqueio ou troca cor*/)
                {
                    jogadorAtual.executarAcao(); /*executar a ação da carta, 
                    no caso das cartas +4 e escolher Cor, essa carta já é passada com uma cor definida pelo jogador*/
                }
                else if(/*se a carta descartada for +2 ou +4*/)
                {
                    setAcumulo( getAcumulo() + ultimaCarta.getValor());
                }
            } 

            else /*se tem acumulo*/
            {
                /**
                *Jogador decide se joga uma carta do mesmo tipo e acumula, 
                ou compra a quantidade acumulada 
                *@see Jogador.java
                *@see Acao.java
                */
                realizarJogada(); 
                if(/*se nao tem carta igual para jogar*/)
                    /**
                    *Roda executa a ação acumulada
                    *@see Roda.java
                    */
                    jogadorAtual.executaAcaoAcumulada(); 

                else
                {
                    /**
                    *Jogador joga carta
                    *@see Jogador.java
                    *@see Mao.java
                    */
                    jogadorAtual.realizarJogada();
                }
            }

            confereFim();
            /**
            *Verifica se a quantida de cartas na mão do jogador é igual a 0
            *e define o ganhador se for o caso
            *@see Mao.java
            */
            if(confereFim()==false)
            {
                System.out.print("O jogador %s ganhou.", jogadorAtual); /*printar o jogador que ficou sem cartas na mão*/
                exit(0);
            }

            /**
            *define o próximo jogador
            */
            setJogadorAtual(proximoJogador());

          }
           
     }

}
