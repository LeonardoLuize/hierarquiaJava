public abstract class Jogador {

    private String nome;
    protected int score;

    public String getNome() {
        return nome;
    }

    public int getScore() {
        return score;
    }

    public Jogador(){

    }

    public Jogador(String nome, int score){
        this.nome = nome;
        this.score = score;
    }

    public void imprimir(){
        System.out.printf("Nome: %s | Score: %d", nome, score);
    }

    public void ganhar(int p){
        score += p;
    }

    public void perder(int p){
        score -= p;
    }

}
