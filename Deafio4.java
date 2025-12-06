package NivelIntermediario.Desafios.Desafio4;

public class Deafio4 {
    public static void main(String[] args) {

        NinjaBasico Tenten = new NinjaBasico("Tenten", 18, TipoHabilidade.TAIJUTSU);
        Tenten.mostrarInformacoes();

        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 18, TipoHabilidade.NINJUTSU, "Shidori!");
        Sasuke.mostrarInformacoes();
    }
}

interface Ninja1{

    void mostrarInformacoes();

    void executarHabilidades();
}

class NinjaBasico implements Ninja1{

    String nome;
    int idade;
    TipoHabilidade habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Habilidade: " + habilidade + "\n");
    }

    @Override
    public void executarHabilidades() {
        System.out.println(nome + " está executando a habilidade " + habilidade + "\n");
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}

class NinjaAvancado implements Ninja1{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Habilidade: " + habilidade + "\n" + "Habilidade Especial: " + especialidade + "\n");
    }

    @Override
    public void executarHabilidades() {
        System.out.println(nome + " está executando a habilidade " + habilidade + " e a habilidade especial " + especialidade + "\n");
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
}

enum TipoHabilidade {

    TAIJUTSU,
    NINJUTSU,
    GENJUTSU,
    KATON,
    RINNENGAN;
}