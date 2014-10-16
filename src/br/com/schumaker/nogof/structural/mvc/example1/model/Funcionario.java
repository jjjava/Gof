package br.com.schumaker.nogof.structural.mvc.example1.model;

import br.com.schumaker.nogof.structural.mvc.example1.controller.FuncionarioController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Hudson Schumaker
 */
public class Funcionario extends AbstractModel {

    private String nome;
    private double salario;
    private FuncionarioController controller;

    public Funcionario(FuncionarioController controller) {
        this.controller = controller;
        this.controller.setModel(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void save() {
        String row;
        row = this.nome;
        row += ";";
        row += this.salario;

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("C:/test/text.txt"));
            writer.write(row);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (writer != null) {
                try {
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }

    @Override
    public void alter() {
        String row;
        row = this.nome;
        row += ";";
        row += this.salario;

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("C:\test\text.txt"));
            writer.write(row);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (writer != null) {
                try {
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }

    @Override
    public void delete() {
        File file = new File("C:/test/text.txt");
        if (file.exists()) {
            file.delete();
        }
    }

    @Override
    public void select() {
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader("infilename"));
            String str;
            while ((str = read.readLine()) != null) {
                process(str);
            }
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }

    private void process(String str) {
        String[] args = str.split(";");
        if (args.length > 0) {
            this.nome = args[0];
            this.salario = Double.parseDouble(args[1]);
        }
    }
}
