public class Programa2 {
    public static void main(String[] args) {
        Motorista mot = new Motorista(" Duda", "1234" ); 
        Carro car = new Carro("abc", 12345, mot);


    
   
    System.out.println("velocidade atual do carro" + car.getVelocidadeAtual());
    car.getMotorista().acelerar( 130);
    System.out.println("acelerando...");
    System.out.println("velocidade atual do carro" + car.getVelocidadeAtual());
    System.out.println("nome do motorista"+ car.getMotorista().getNome());
}
}
