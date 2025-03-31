public class MetodoBurbujaMejorado {

    public int[] odenadoBurbujaMejorado(int[] arreglo, boolean isDes, boolean pasos){
        int aux = 0;
        int contComparaciones = 0;
        int cambios = 0;

        for(int i = 0; i < arreglo.length; i++){
            int verificadorCambios = cambios;

            for (int j = 0; j < arreglo.length - i - 1; j++){
                contComparaciones++;
                if (pasos){
                    System.out.println("Comparacion: " +contComparaciones + "->" +arreglo[j] + ">" +arreglo[j+1]);

                }
                if(isDes){
                    if(arreglo[j] > arreglo[j + 1]){
                        aux = arreglo[j]; 
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux; 
                        cambios++;
                        if(pasos){
                            System.out.println("Intercambio: " +arreglo[j] + "<->" +arreglo[j + 1]);
                        }
                    }
                        
                } else {
                    if(arreglo[j] < arreglo[j + 1]){
                        aux = arreglo[j]; 
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux; 
                        cambios++;
                        if(pasos){
                            System.out.println("Intercambio: " +arreglo[j] + "<->" +arreglo[j + 1]);
                        }
                    }
                }
                if(pasos){ //si el verificador de cammbios aumenta en +1, significa que se han realizado cambios, si no, se imprime
                    if (verificadorCambios == cambios){
                        System.out.println("No hay cambios por realizar");
                    }
                }
                if (pasos){
                    System.out.println("Estado actual");
                    imprimirArreglo(arreglo);
                    System.out.println();
                }
            }
            System.out.println("Estado Actual ->");
            //imprimirArreglo(arreglo);

        }
        int[] resultados = {contComparaciones, cambios};

        return resultados;
    }

    public void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + "\t");  
        }
        System.out.println();
    }

}
