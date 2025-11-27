// Classe base abstrata
abstract class FiguraGeometrica {
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

// Classe Círculo
class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

// Classe Quadrado
class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Classe Triângulo (triângulo genérico)
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {

        FiguraGeometrica c = new Circulo(5);
        FiguraGeometrica q = new Quadrado(4);
        FiguraGeometrica t = new Triangulo(6, 4, 5, 5, 6);

        System.out.println("Círculo:");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());

        System.out.println("\nQuadrado:");
        System.out.println("Área: " + q.calcularArea());
        System.out.println("Perímetro: " + q.calcularPerimetro());

        System.out.println("\nTriângulo:");
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.calcularPerimetro());
    }
}
