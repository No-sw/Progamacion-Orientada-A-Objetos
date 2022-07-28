/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionorientadaaobjetos;

/**
 *
 * @author Toshiba
 */
public class ATM {
    private String codigoinventario;
    private String ubicacion;
    private String horario;
    
    public void setATM(String _codigoinventario, String _ubicacion, String _horario){
        codigoinventario = _codigoinventario;
        ubicacion = _ubicacion;
        horario = _horario;
    }
    public void MostrarDatosATM(){
        System.out.println("codigoinventario: "+codigoinventario);
        System.out.println("ubicacion: "+ubicacion);
        System.out.println("horario: "+horario);
}
}

