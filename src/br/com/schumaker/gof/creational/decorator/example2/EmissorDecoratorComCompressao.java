package br.com.schumaker.gof.creational.decorator.example2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/**
 *
 * @author hudson.sales
 */
public class EmissorDecoratorComCompressao extends EmissorDecorator {

    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println(" Enviando mensagem comprimida : ");
        String mensagemComprimida;
        mensagemComprimida = comprime(mensagem);
        this.getEmissor().envia(mensagemComprimida);
    }

    private String comprime(String mensagem) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
        try {
            dout.write(mensagem.getBytes());
            dout.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return new String(out.toByteArray());
    }
}
