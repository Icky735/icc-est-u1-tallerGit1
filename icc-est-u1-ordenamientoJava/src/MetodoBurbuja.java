public class MetodoBurbuja {

    public int[] ordenadoBurbuja(int[] arreglo, boolean isDes, boolean pasos){

        int aux = 0;
        int contComparaciones =0;
        int cambios = 0;

        for(int i = 0; i < arreglo.length - 1; i++){

            for (int j = 0; j < arreglo.length - 1; j++){
                int verificadorCambios = cambios;
                contComparaciones++;
                if (pasos){
                    System.out.println("Comparacion: " +contComparaciones + ":  " +arreglo[j] + "  ->  " +arreglo[j + 1]);

                }
                if(isDes){ //si retorna true está ordenado de forma Ascendente
                    if(arreglo [j] > arreglo[j + 1]){
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        cambios++;
                        if(pasos){
                            System.out.println("Intercambio: " +arreglo[j] + "  <->  " +arreglo[j + 1]);
                        }
                    }
                    
                } else { //ordenado de forma descendente
                    if(arreglo [j] < arreglo[j + 1]){
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        cambios++;
                        if(pasos){
                            System.out.println("Intercambio: " +arreglo[j] + "  <->  " +arreglo[j + 1]);
                        }
                    }
                }

                if(pasos){ //si el verificador de cammbios aumenta en +1, significa que se han realizado cambios, si no, se imprime
                    if (verificadorCambios == cambios){
                        System.out.println("No hay cambios por realizar");
                    }
                    System.out.println("Estado actual");
                    imprimirArreglo(arreglo);
                    System.out.println();
                }
            }
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
