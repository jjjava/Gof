package br.com.schumaker.gof.creational.decorator.example2;

/**
 *
 * @author hudson.sales
 */
public class Client {

    public static void main(String[] args) {
        String mensagem = "Hudson Schumaker";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(
                new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.envia(mensagem);
    }
}
