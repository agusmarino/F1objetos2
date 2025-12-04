public class Pieza implements Componente {
    private String nombre;
    private double costo;

    public Pieza(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public double obtenerCosto() {
        return this.costo;
    }

    @Override
    public void mostrarDetalle(String indentacion) {
        System.out.println(indentacion + this.nombre + ": $" + this.costo);
    }
}
