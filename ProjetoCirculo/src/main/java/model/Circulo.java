package model;

public class Circulo {

    private double raio;

    public Circulo() {
        this(0);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return (getRaio() * getRaio()) * Math.PI;
    }

}
