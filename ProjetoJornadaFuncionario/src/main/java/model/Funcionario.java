package model;

public class Funcionario {

    private String nome;
    private double horasDiarias;
    private int diasTrabalhados;
    private double valorHora;

    public Funcionario() {
        this("", 0, 0, 0);
    }

    public Funcionario(String nome, double jornada, int diasTrabalhados, double valorHora) {
        this.nome = nome;
        this.horasDiarias = horasDiarias;
        this.diasTrabalhados = diasTrabalhados;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getHorasDiarias() {
        return horasDiarias;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorasDiarias(double jornada) {
        this.horasDiarias = jornada;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalarioMensal() {
        return getValorHora() * getHorasDiarias() * getDiasTrabalhados();
    }
}
