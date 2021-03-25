
public class Programa {

    public static void main(String[] args) {
       Carro car = new Carro("abc", "mmm");
       Motorista mot = new Motorista("duda", "123456");

        System.out.println("velocidade atual do carro" + car.getVelocidadeAtual());
        mot.acelerar(120);
        System.out.println("acelerando...");
        System.out.println("velocidade atual do carro" + car.getVelocidadeAtual());

    }
    
}
