package br.com.schumaker.gof.creational.factorymethod.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class ReadFileLogger implements Logger {

    @Override
    public void log(String mensagem) {
        System.err.println("Erro na leitura do arquivo: " + mensagem);
    }
}