
package paquete1;


public class Carro extends Vehiculo implements Rueda, Silla{
    public Carro(){
        
    }


    public void avanzar(){
    System.out.println("El carro esta avanzando");
}
    
    public void detenerse(){
        System.out.println("El carro se detuvo");
    }
    
    public void mostrarSillas() {
        System.out.println("El carro tiene cuatros asientos");
    }
    
}
