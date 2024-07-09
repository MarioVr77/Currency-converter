package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.modulos.ConsultaConversor;
import com.aluracursos.conversor.modulos.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String menu = """
                ************Sea Bienvenido/a al conversor de Moneda******
                1.- Dólar =>> Peso Argentino
                2 - Peso Argentino =>> Dólar
                3 - Dólar =>> Real Brasileño
                4 - Real Brasileño =>> Dólar
                5 - Dólar =>> Peso Colombiano
                6 - Peso Colombiano =>> Dólar
                9 - Salir
                Elija una opción válida:
                ***********************************************************
                """;

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda(teclado, "USD", "ARS");
                    break;
                case 2:
                    convertirMoneda(teclado, "ARS", "USD");
                    break;
                case 3:
                    convertirMoneda(teclado, "USD", "BRL");
                    break;
                case 4:
                    convertirMoneda(teclado, "BRL", "USD");
                    break;
                case 5:
                    convertirMoneda(teclado, "USD", "COP");
                    break;
                case 6:
                    convertirMoneda(teclado, "COP", "USD");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }

        teclado.close();
    }

    private static void convertirMoneda(Scanner teclado, String monedaOrigen, String monedaDestino) {
        System.out.printf("Ingrese el valor en %s que desea convertir a %s:%n", monedaOrigen, monedaDestino);
        double valor = teclado.nextDouble();

        ConsultaConversor consulta = new ConsultaConversor();
        try {
            Conversor conversor = consulta.BuscaConversor(monedaOrigen, monedaDestino, valor);
            System.out.println(conversor.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
