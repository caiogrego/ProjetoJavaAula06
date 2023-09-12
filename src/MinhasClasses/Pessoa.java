package MinhasClasses;

import java.text.NumberFormat;
import java.util.Locale;

public class Pessoa {
    // Atributos da classe Pessoa.
    private String nome;
    private int idade;
    private Double altura;
    private Double salario;
    
    // Método construtor da classe pessoa.
    public Pessoa(String novoNome) {
        this.nome = novoNome;
    }
    public Pessoa(String novoNome, int novaIdade) {
        this.nome = novoNome;
        this.idade = novaIdade;
    }
    public Pessoa(String novoNome, Double novaAltura) {
        this.nome = novoNome;
        this.altura = novaAltura;
    }
    public Pessoa(String novoNome, int novaIdade, Double novaAltura) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.altura = novaAltura;
    }

    public String exibeSelario() {
        Locale localBrasil = new Locale("pt", "BR");
        String formatoBrasil = NumberFormat.getCurrencyInstance(localBrasil).format(this.getSalario());
        return formatoBrasil;
    }

    // Definição dos métodos Getters e Setters
    public String getNome() {
        return this.nome.toUpperCase();
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int valorIdade) {
        this.idade = valorIdade;
    }

    public Double getAltura() {
        return this.altura;
    }
    public void setAltura(Double novaAltura) {
        this.altura = novaAltura;
    }

    public Double getSalario() {
        return this.salario;
    }
    public void setSalario(Double novoSalario) {
        this.salario = novoSalario;
    }

}
