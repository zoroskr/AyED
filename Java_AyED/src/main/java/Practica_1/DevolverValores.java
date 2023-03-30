/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_1;
public class DevolverValores {
    int[] arr;

    public int[] getArr() {
        return arr;
    }
    
    public int calcularValoresReturn (int[] arr){
        int max=-1;
        int min= 9999;
        int promedio= 0;
        int i=0;
        for (i=0; i< arr.length; i++){
            if (arr[i] > max){
                max= arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
            promedio = promedio + arr[i];
        }
        promedio = (promedio / i);
        return (promedio);
    }
    public int calcularValoresSinParametros (){ //a que se refiere el ejercicio 5b y 5c?
        int max=-1;
        int min= 9999;
        int promedio= 0;
        int i=0;
        for (i=0; i< getArr().length; i++){
            if (getArr()[i] > max){
                max= getArr()[i];
            }
            else if (getArr()[i] < min){
                min = getArr()[i];
            }
            promedio = promedio + getArr()[i];
        }
        promedio = promedio / i;
        return (promedio);
    }
    
    public int calcularValoresImprimir (){
        int max=-1;
        int min= 9999;
        int promedio= 0;
        int i=0;
        for (i=0; i< getArr().length; i++){
            if (getArr()[i] > max){
                max= getArr()[i];
            }
            else if (getArr()[i] < min){
                min = getArr()[i];
            }
            promedio = promedio + getArr()[i];
        }
        promedio = promedio / i;
        System.out.println(promedio);
    }
}
