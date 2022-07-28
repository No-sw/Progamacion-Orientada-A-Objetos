/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionorientadaaobjetos;

/**
 *
 * @author Toshiba
 */
public class Billete{

//Propiedades 
private String nombre;
private int valor;

public void setBillete(String _nombre, int _valor){
    nombre=_nombre;
    valor=_valor;
}

public void MostrarValor(){
    System.out.println("Moneda: "+ nombre);
    System.out.println("Valor: "+ valor);  
}
}
