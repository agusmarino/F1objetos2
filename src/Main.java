public class Main {
    public static void main(String[] args) {
        System.out.println("Reporte de daños de Red Bull GP Brasil 2025");

        // piezas (Leaves)
        Pieza aleronDelantero = new Pieza("Alerón Delantero", 150000);
        Pieza aleronTrasero = new Pieza("Alerón Trasero", 120000);

        Pieza turbo = new Pieza("Turbo Híbrido", 500000);
        Pieza mguK = new Pieza("MGU-K", 250000);
        Pieza bateria = new Pieza("Batería ES", 180000);

        Pieza suspensionDel = new Pieza("Suspensión Delantera", 80000);
        Pieza neumaticos = new Pieza("Juego Neumáticos Soft", 3000);

        // compuestos (Composites)
        Sistema unidadDePotencia = new Sistema("Unidad de Potencia (Motor)");
        unidadDePotencia.agregarComponente(turbo);
        unidadDePotencia.agregarComponente(mguK);
        unidadDePotencia.agregarComponente(bateria);

        Sistema paqueteAerodinamico = new Sistema("Aerodinámica");
        paqueteAerodinamico.agregarComponente(aleronDelantero);
        paqueteAerodinamico.agregarComponente(aleronTrasero);

        Sistema chasis = new Sistema("Chasis y Estructura");
        chasis.agregarComponente(suspensionDel);
        chasis.agregarComponente(neumaticos);
        chasis.agregarComponente(paqueteAerodinamico);

        // objeto (El Auto Completo)
        Sistema autoMax = new Sistema("Red Bull RB20 de Max Verstappen");
        autoMax.agregarComponente(chasis);
        autoMax.agregarComponente(unidadDePotencia);

        // solo se llama a obtenerCosto() desde el objeto "raiz"
        autoMax.mostrarDetalle("");

        System.out.println("COSTO DE REPARACIÓN: $" + String.format("%,.2f", autoMax.obtenerCosto()));

        System.out.println("----------------------");

        //--------segundo auto

        // piezas (Leaves)
        Pieza aleronDelanteroYuki = new Pieza("Alerón Delantero", 150000);
        Pieza neumaticosYuki = new Pieza("Juego Neumáticos Soft", 3000);

        // compuestos (Composites)
        Sistema paqueteAerodinamicoYuki = new Sistema("Aerodinámica");
        paqueteAerodinamicoYuki.agregarComponente(aleronDelanteroYuki);

        Sistema chasisYuki = new Sistema("Chasis y Estructura");
        chasisYuki.agregarComponente(neumaticosYuki);
        chasisYuki.agregarComponente(paqueteAerodinamicoYuki);

        // objeto (El Auto Completo)
        Sistema autoYuki = new Sistema("Red Bull RB20 de Yuki Tsunoda");
        autoYuki.agregarComponente(chasisYuki);

        // solo se llama a obtenerCosto() desde el objeto "raiz"
        autoYuki.mostrarDetalle("");

        System.out.println("COSTO DE REPARACIÓN: $" + String.format("%,.2f", autoYuki.obtenerCosto()));

        System.out.println("----------------------");

        System.out.println("COSTO TOTAL DE REPARACIÓN: $" + String.format("%,.2f", autoYuki.obtenerCosto() +autoMax.obtenerCosto()));
    }
}