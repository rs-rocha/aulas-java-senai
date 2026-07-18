package aulas.objeto;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public char genero;
    public String cor;

    public Pessoa(String nome, int anoNascimento, char genero, String cor) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.genero = genero;
        this.cor = cor;
    }


    @Override
    public String toString() {
        return  "["+
                nome + ", " +
                anoNascimento + ", " +
                genero + ", " +
                cor +
                "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
