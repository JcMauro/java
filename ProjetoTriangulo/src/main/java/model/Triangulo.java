package model;

/**se tem parentese é método, se não tem parentese é atributo;
 * todo nome de classe é um substantivo no singular;
 * 
 * por definição, todo atributo é privado
 * por definição, todo método é público
 * 
 * por definição, tudo que é diferente de void tem que ter um return
 * 
 * new é um operador que procura um espaço em memória para alocar algo (classe);

 */
public class Triangulo {
    private double base;
    private double altura;

        public Triangulo() {
        this(0,0);
    }
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
        public double getArea() {
        return ((getBase() * getAltura())/2.0);
    }
 
}
