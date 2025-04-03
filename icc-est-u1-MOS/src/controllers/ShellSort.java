package controllers;

public class ShellSort{
    
    public int[] ordenShell(int[] array, boolean isDes){
        int cambios = 0;

        int n = array.length;
        for(int gap = n/2; gap > 0; gap/=2){

            System.out.println("GAP: " +gap);

            for(int i= gap; i < n; i++){
                int aux = array[i];
                int j = i;
                if(isDes){
                    //se desplaza aux a su posicion correcta 
                    while(j >= gap && array[j - gap] > aux){
                        array[j] = array[j - gap];
                        j -= gap;
                        cambios++;
                    }
                }else{
                    while(j >= gap && array[j - gap] < aux){
                        array[j] = array[j - gap];
                        j -= gap;
                        cambios++;
                    }
                }
                array[j] = aux;
        

            }
        }

        int[] resultados = {cambios};
        return resultados;
    }

    public void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + "\t");  
        }
        System.out.println();
    }

    
}