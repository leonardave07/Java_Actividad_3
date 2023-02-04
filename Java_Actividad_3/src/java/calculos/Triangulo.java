/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

/**
 *
 * @author leonardo
 */
public final class Triangulo {

    private int base;
    private int altura;
    private int area;
    private int perimetro;

    public Triangulo(String base, String altura) {
        this.setBase(Integer.parseInt(base));
        this.setAltura(Integer.parseInt(altura));
    }

    public void calcularArea() {
        this.setArea((getBase() * getAltura()) / 2);
    }

    public void calcularPerimetro() {
        this.setPerimetro(3 * getBase());
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
}
