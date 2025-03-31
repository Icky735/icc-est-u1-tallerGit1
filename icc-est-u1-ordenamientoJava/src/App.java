/*
 MÉTODOS DE ORDENAMIENTO 
 Estructura de Datos
 Victoria Andrade
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; 

        while(continuar){
            int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};

            MetodoBurbuja metodoBurbuja = new MetodoBurbuja(); //creamos un objeto
            MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
            MetodoInsercion metodoInsercion = new MetodoInsercion();
            MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();

            System.out.println("Seleccione el método de Ordenamiento que desee");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");

            int opcion = getPositive(scanner, "Ingrese una opción");

            if(opcion == 5){// al ingresar 5 se termina 
                continuar = false;
                break;
            }

            char elegir = validaOrden(scanner);

            boolean pasos = escribirCorrecto(scanner);
            int[] resultados = null; 

            switch (opcion) {
                case 1:
                    System.out.println("BURBUJA");
                    System.out.println("Arreglo original");
                    metodoBurbuja.imprimirArreglo(arreglo);
                    System.out.println();

                    switch (elegir) {
                        case 'A':
                            resultados = metodoBurbuja.ordenadoBurbuja(arreglo, true, pasos);
                            System.out.println("Orden Ascendente: ");
                            break;
                    
                        case 'D':
                            resultados = metodoBurbuja.ordenadoBurbuja(arreglo, false, pasos);
                            System.out.println("Orden Descendente: ");
                            break;
                    }
                    metodoBurbuja.imprimirArreglo(arreglo);
                    System.out.println("Total de comparaciones: " +resultados[0]);
                    System.out.println("Total de cambios: " +resultados[1]);
                    break;
            
                case 2:
                    System.out.println("SELECCION");
                    System.out.println("Arreglo original");
                    metodoBurbuja.imprimirArreglo(arreglo);
                    System.out.println();

                    switch (elegir) {
                        case 'A':
                            resultados = metodoSeleccion.ordenadoSeleccion(arreglo, true, pasos);
                            System.out.println("Orden Ascendente: ");
                            break;
                    
                        case 'D':
                            resultados = metodoSeleccion.ordenadoSeleccion(arreglo, false, pasos);
                            System.out.println("Orden Descendente: ");
                            break;
                    }
                    metodoSeleccion.imprimirArreglo(arreglo);
                    System.out.println("Total de comparaciones: " +resultados[0]);
                    System.out.println("Total de cambios: " +resultados[1]);
                    break;

                case 3:
                    System.out.println("INSERCION");
                        System.out.println("Arreglo original");
                        metodoBurbuja.imprimirArreglo(arreglo);
                        System.out.println();

                        switch (elegir) {
                            case 'A':
                                resultados = metodoInsercion.ordenadoInsercion(arreglo, true, pasos);
                                System.out.println("Orden Ascendente: ");
                                break;
                        
                            case 'D':
                                resultados = metodoInsercion.ordenadoInsercion(arreglo, false, pasos);
                                System.out.println("Orden Descendente: ");
                                break;
                        }
                        metodoSeleccion.imprimirArreglo(arreglo);
                        System.out.println("Total de comparaciones: " +resultados[0]);
                        System.out.println("Total de cambios: " +resultados[1]);
                    break;

                case 4:
                    System.out.println("BURBUJA MEJORADO");
                    System.out.println("Arreglo original");
                    metodoBurbuja.imprimirArreglo(arreglo);
                    System.out.println();

                    switch (elegir) {
                        case 'A':
                            resultados = metodoBurbujaMejorado.odenadoBurbujaMejorado(arreglo, true, pasos);
                            System.out.println("Orden Ascendente: ");
                            break;
                    
                        case 'D':
                            resultados = metodoBurbujaMejorado.odenadoBurbujaMejorado(arreglo, false, pasos);
                            System.out.println("Orden Descendente: ");
                            break;
                    }
                    metodoBurbuja.imprimirArreglo(arreglo);
                    System.out.println("Total de comparaciones: " +resultados[0]);
                    System.out.println("Total de cambios: " +resultados[1]);
                    break;
            }
        }
        scanner.close();
    }

    public static char validaOrden(Scanner scanner){
        char letra;

        while(true){
            System.out.println("Desea ordenar Ascendente o Descendente (Escribir A o D)");
            String entradaString = scanner.next().toUpperCase();

            if(entradaString.length() == 1 && (entradaString.charAt(0) == 'A' || entradaString.charAt(0) == 'D')){
                letra = entradaString.charAt(0);
                break;
            }else{
                System.out.println("Error. Solo puede ingresar A o D. Intente nuevamente");
            }
        }
        
        return letra;
    }

    public static int getPositive(Scanner scanner, String message){
        int numero; 
        do {
            System.out.print(message + ":");
            numero = scanner.nextInt();
            if((numero <= 0) || (numero > 5)){
                System.out.println("Debe ingresar un número entre 1 - 5.");
                System.out.println("Intente nuevamente");
            }
            
        } while ((numero <= 0) || (numero > 5));

        return numero;
    }

    public static boolean escribirCorrecto(Scanner scanner){
        boolean validar = false; 
        boolean escribir = false; 

        while(!validar){
            System.out.println("Desea ver los pasos? (true/false): ");
            if (scanner.hasNextBoolean()){
                escribir = scanner.nextBoolean();
                validar = true;
            } else {
                System.out.println("Entrada ni válida, escribir true o false");
                scanner.next();
            }
        }
        return escribir;
    }  
}
