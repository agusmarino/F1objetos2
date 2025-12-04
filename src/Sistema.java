import java.util.ArrayList;
import java.util.List;

//Composite
public class Sistema implements Componente{
    private String nombre;
    private List<Componente> componentes = new ArrayList<>();

    public Sistema(String nombre){
        this.nombre = nombre;
    }

    //metodos para gestionar hijos
    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }

    public void eliminarComponente(Componente componente){
        componentes.remove(componente);
    }

    @Override
    public double obtenerCosto() {
        double costoTotal = 0;
        for (Componente componente : componentes) {
            costoTotal += componente.obtenerCosto();
        }
        return costoTotal;
    }

    @Override
    public void mostrarDetalle(String indentacion){
        System.out.println(indentacion + nombre);
        for (Componente componente : componentes) {
            componente.mostrarDetalle(indentacion + "  ");
        }
    }
}
