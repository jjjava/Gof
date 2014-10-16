package br.com.schumaker.gof.structural.flyweight.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Remessa remessa = new Remessa();
        //...
        remessa.setEstado(FactoryFlyweight.getEstado("São Paulo"));
        remessa.setEstado(FactoryFlyweight.getEstado("Rio de Janeiro"));
        remessa.setEstado(FactoryFlyweight.getEstado("Minas Gerais"));
    }
}
