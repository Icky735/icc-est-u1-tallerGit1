import controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        int [] array= {-10,0,4,7,2,1,9,6,5};
        //instancia

        ShellSort sS = new ShellSort();
        int [] resultados = sS.ordenShell(array, false);
        //resultados = sS.ordenShell(array, true);
        sS.imprimirArreglo(array);

        
        //n = 4
        //gap = n/2
        //gap = gap/2
        //gap = gap/2

        /*Imprimir cada gap
        for(int gap = n/2; gap > 0; gap/=2){
            System.out.println("GAP: " +gap);
        }*/

        

    }

    
    
}
