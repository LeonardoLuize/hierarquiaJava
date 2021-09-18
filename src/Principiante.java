public class Principiante extends Jogador {

    private double bonus;

    public Principiante(String nome, int score, double bonus){
        super(nome, score);
        this.bonus = bonus;
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf(" | Bonus: %2f\n", bonus);
    }

    @Override
    public void ganhar(int p){
        super.ganhar(p);
        this.bonus += p * 0.10;
    }

    @Override
    public void perder(int p){
        super.perder(p);
        this.bonus -= p * 0.10;
    }
}
