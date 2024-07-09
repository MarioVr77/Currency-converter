package com.aluracursos.conversor.modulos;

public record Conversor(String base_code,
                        String target_code,
                        double conversion_result) {
    public String toString(){
        return "[" + base_code + "]" + " corresponde al valor final de =>>> " +
                conversion_result + " [" + target_code + "]";
    }
}
