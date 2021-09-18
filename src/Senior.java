public class Senior extends Jogador{
    private double premio;

    public Senior(String nome, int score, double premio){
        super(nome, score);
        this.premio = premio;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf(" | Prêmio: %2f\n", premio);
    }

    @Override
    public void ganhar(int p){
        super.ganhar(p);
        this.premio += p * 2;

    }

    @Override
    public void perder(int p){
        super.perder(p);
        this.premio -= p * 0.5;
    }
}
