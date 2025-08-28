/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2.pkg1;

/**
 *
 * @author poo02alu19
 */
public class POOP21 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo abreviado");
        System.out.println("##### if #####");
        int a;
        a=5;
        int b=3;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual que b");
        } else {
            System.out.println("a es mayor que b");
        }
        
        System.out.println("########### if en funcion / metodo ########");
        if(menor(a,b)){
            System.out.println("metodo retorna true");
        }else{
            System.out.println("metodo retorna false");
        }
        System.out.println("###### switch #####");
        int dia= 7;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("No es un dia de la semana");
        }
        System.out.println("##### while ####");
        int n=0;
        while (n<10){
            System.out.println("Contando hacia arriba n="+n);
            n++; //n=n+1;
        } do{
            System.out.println("Contando hacia abajo n="+n);
            n--; //n=n-1;
            
        }
        while (n>0);
            System.out.println("n="+n);
            
            System.out.println("###### for ######");
            for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba i="+i);
        }
        for ( int i = 10; i > 0; i--){
            System.out.println("###### for ######");
        }        
            int[] arreglo = {1,2,3,4,5};
            int tamanio = arreglo.length;
            System.out.println("tamanio");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("arrreglo["+i+"]"+arreglo[i]);
                    }
            System.out.println("###### for-each #####");
            for(int temp:arreglo){
                System.out.println("Elemento de arreglo="+temp);
            }
        }    
    

    private static boolean menor(int a, int b) {
        return a<b;
    }
    
}
