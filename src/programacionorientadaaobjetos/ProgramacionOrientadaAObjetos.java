/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionorientadaaobjetos;

/**
 *
 * @author Toshiba
 */
public class ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        
        Billete quinientosLPS = new Billete();
        
        /*quinientosLPS.nombre = "Lempiras";
        quinientosLPS.valor = 500;*/
        quinientosLPS.setBillete("Lempira", 500);
        quinientosLPS.MostrarValor();
        
        Billete docientosLPS = new Billete();
        docientosLPS.setBillete("Lempira", 200);
        docientosLPS.MostrarValor();
        
        ATM CajeroBanpais = new ATM();
        CajeroBanpais.setATM("11202212", "Villanueva", "Lunes a Viernes 06:00AM-06:00PM");
        CajeroBanpais.MostrarDatosATM();
    }   
}
