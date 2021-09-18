public class Main {
    public static void main(String[] args) {

        Jogador meninoNey = new Principiante("Neymar", 0, 0);
        Jogador gaucho = new Profissional("Ronaldinho Gaúcho", 67, 30);
        Jogador pele = new Senior("Pelé", 60, 30);

        meninoNey.perder(10);
        meninoNey.ganhar(100);
        meninoNey.imprimir();

        gaucho.perder(40);
        gaucho.ganhar(100);
        gaucho.imprimir();

        pele.perder(32);
        pele.ganhar(120);
        pele.imprimir();


    }
}
