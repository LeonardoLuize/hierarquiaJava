public class Profissional extends Jogador{

    private double capital;

    public Profissional(String nome, int score, double capital){
        super(nome, score);
        this.capital = capital;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf(" | Capital: %2f\n", capital);
    }

    @Override
    public void ganhar(int p){
        super.ganhar(p);
        this.capital += p * 4;
    }

    @Override
    public void perder(int p){
        super.perder(p);
        this.capital -= p * 4;
    }
}
