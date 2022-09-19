public class Jogo{

    private Baralho baralho;
    private Jogador[] jogadores = new Jogador[n];
    private Roda roda;

    public void iniciarBaralho(); //instancia baralho 
        //Baralho baralho =  new Baralho();

    public void iniciarJogadores(); //instancia jogadores 
        //Jogador[] jogadores;
        //(estrutura de repeticao){jogadores[index++] = new Jogador(atributos);

    public void iniciarRoda();
        //enviar para a roda o baralho e os jogadores
        //roda = new Roda(baralho, jogadores)

    public void definirCartaInicial(); //chama a função da roda para decidir a primeira carta do monte de descarte
        //algo como roda.definirCartaInicial(); , ou essa função já vai automática na criação da roda

    public void iniciarPartida();
        //parte que define a dinâmica entre os jogadores
        //chama a Roda com alguma funcao dela para fazer isso
        //ex:
        // roda.iniciarJogada();
        // roda.proximoJogador();
        //ou serão funções executadas automaticamente pela própria roda

    public boolean confereFim();
        //confere se a mão de algum jogador está vazia para ver se inicia outra partida ou se declara Fim do jogo e o vencedor

    public void FimDoJogo();
        //declara o vencedor e fecha o programa de acordo com o retono da funcao confereFim()
}
