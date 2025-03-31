public class MetodoSeleccion {

    public int[] ordenadoSeleccion(int[] arreglo, boolean isDes, boolean pasos){

        int aux = 0;
        int indiceMin = 0;
        int contComparaciones =0;
        int cambios = 0;

        for(int i = 0; i < arreglo.length - 1; i++){ //no necesitamos llegar hasta el final del arreglo

            int verificadorCambios = cambios;
            indiceMin = i; //guarda la posicion del numero menor

            for(int j = i + 1; j < arreglo.length; j++){ //dentro del bucle se busca al numero menor comparado con el de la posicion i, hacia la derecha
                contComparaciones++;
                if (pasos){
                    System.out.println("Comparacion: " +contComparaciones + ":  " +arreglo[indiceMin] + "  ->  " +arreglo[j]);

                }
                if(isDes){ //orden ascendente
                    if(arreglo[j] < arreglo[indiceMin]){
                        indiceMin = j; 
                        
                    }
                } else{ //orden descendente
                    if(arreglo[j] > arreglo[indiceMin]){
                        indiceMin = j; 
                    }
                }
            }
            
            //en el if se intercambia unicamente cuando es necesario
            if(indiceMin != i){ // hay veces en las que no se tendra que encontrar el minimo ni intercambiar posiciones para eso es el if
                aux = arreglo[i]; 
                arreglo[i] = arreglo[indiceMin];
                arreglo[indiceMin] = aux;
                cambios++;
                if(pasos){
                    System.out.println("Intercambio: " +arreglo[i] + "  <->  " +arreglo[indiceMin]);
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
