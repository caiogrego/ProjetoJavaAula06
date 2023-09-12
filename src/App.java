import java.text.NumberFormat;
import java.util.Locale;

import MinhasClasses.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instâncias criadas pela ativação dos métodos construtores.
        Pessoa novaPessoa = new Pessoa("Ana");
        Pessoa pessoa02 = new Pessoa("Paula", 67);
        Pessoa pessoa03 = new Pessoa("João", 1.8);
        Pessoa pessoa04 = new Pessoa("Zeca", 36,  1.8);

        // Exibição dos atributos
        System.out.println("O nome da pessoa é: " + novaPessoa.getNome());
        System.out.println("O idade da pessoa é: " + pessoa02.getIdade());
        System.out.println("A altura da pessoa é: " + pessoa03.getAltura());

        // Definição de um atributo por um método set.
        pessoa04.setSalario(2560.0);

        // Exibição do valor de um atributo por um método get.
        System.out.println("\nO nome da pessoa é: " + pessoa04.getNome());

        // Exemplo de processamento/formatação de um dado recedibo de um método get.
        Locale localBrasil = new Locale("pt", "BR");
        String formatoBrasil = NumberFormat.getCurrencyInstance(localBrasil).format(pessoa04.getSalario());
        
        // Exite a informação após a formatação do valor.
        System.out.println("O salário do " + pessoa04.getNome() + " é: " + formatoBrasil);

        // Exite a informação formatada pela própria classe.
        System.out.println("O salário do " + pessoa04.getNome() + " é: " + pessoa04.exibeSelario());
    }
}
