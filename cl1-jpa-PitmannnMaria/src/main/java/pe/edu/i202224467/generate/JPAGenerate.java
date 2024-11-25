package pe.edu.i202224467.generate;

import jakarta.persistence.Persistence;

public class JPAGenerate {

    public static void main(String[] args) {

        // generar esquema
        Persistence.generateSchema("world", null);
    }
}
