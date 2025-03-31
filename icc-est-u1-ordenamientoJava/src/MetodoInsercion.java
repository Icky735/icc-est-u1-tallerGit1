public class MetodoInsercion {

    public int[] ordenadoInsercion(int[] arreglo, boolean isDes, boolean pasos){

        int pasajero = 0;
        int contComparaciones = 0;
        int cambios = 0;

        for(int i = 1; i < arreglo.length; i++){
            pasajero = arreglo[i];
            int j = i - 1; 
            int verificadorCambios = cambios; 

            contComparaciones++;
            if (pasos){
                System.out.println("Comparacion " +i + ": " +arreglo[i] + "  ->  " +arreglo[j]);
            }

            if(isDes){ //ordena ascendente
                while(j >=  0 && (arreglo[j] > pasajero)){ // si el arreglo[j] es mayor a pasajeros, entra dentro del bucle
                    arreglo[j + 1] = arreglo[j];
                    j--; 
                }
            }else{ //descendente
                while(j >=  0 && (arreglo[j] < pasajero)){
                    arreglo[j + 1] = arreglo[j];
                    j--; 
                } 
            }

            if(arreglo[j + 1] != pasajero){
                arreglo[j + 1] = pasajero;
                cambios++;
            }


            if(pasos){ //si el verificador de cammbios aumenta en +1, significa que se han realizado cambios, si no, se imprime
                if (verificadorCambios == cambios){
                    System.out.println("No hay cambios por realizar");
                }
                System.out.println("Cifra: " +pasajero + "  <-> colocado en la posición " +(j + 1));
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
