# F1 Team & Race Management - Java OOP 

Este proyecto consiste en un sistema de gestión y simulación de escuderías de Fórmula 1, desarrollado íntegramente en **Java**. El objetivo principal fue aplicar conceptos avanzados de la **Programación Orientada a Objetos** para modelar la complejidad de la competición automovilística.

##  Características Principales

* **Gestión de Monoplazas:** Modelado detallado de autos de F1, incluyendo componentes críticos (motor, chasis, neumáticos).
* **Simulación de Carreras:** Lógica de rendimiento basada en atributos técnicos y decisiones estratégicas.
* **Arquitectura Escalable:** Diseño pensado para la fácil adición de nuevas reglas de competición o tipos de componentes.

##  Tecnologías y Patrones Aplicados

Para este desarrollo se utilizaron las siguientes herramientas y conceptos:

* **Lenguaje:** Java (JDK 11+).
* **Entorno de Desarrollo:** IntelliJ IDEA (JetBrains Toolbox).
* **Patrones de Diseño:**
    * **Builder:** Utilizado para la construcción compleja de los monoplazas, permitiendo diferentes configuraciones de componentes de manera fluida.
    * **Composite:** Aplicado para la jerarquía de partes del motor y sistemas del auto, permitiendo tratar componentes individuales y grupos de piezas de manera uniforme.
* **Control de Versiones:** Git.

##  Estructura del Proyecto

El código está organizado siguiendo principios de **Clean Code** y encapsulamiento:
- `src/model`: Clases base y lógica de negocio (Autos, Pilotos, Escuderías).
- `src/patterns`: Implementación específica de los patrones de diseño mencionados.
- `src/test`: (Opcional: si tenés pruebas unitarias, mencionalo aquí).

##  Cómo Ejecutarlo

1. Clona el repositorio:
   `git clone https://github.com/agusmarino/F1objetos2.git`
2. Abre el proyecto en tu IDE preferido (recomendado IntelliJ IDEA).
3. Ejecuta la clase `Main` para iniciar la demostración/simulación.

---
Desarrollado por **Agustin Marino** - Estudiante de Licenciatura en Sistemas.
