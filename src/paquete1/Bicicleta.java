
package paquete1;

public class Bicicleta extends Vehiculo implements Rueda, Silla{
    public Bicicleta(){
        
    }


    public void avanzar() {
        System.out.println("La bicicleta esta avanzando");
     
    }


    public void detenerse() {
       System.out.println("La bicicleta esta detenida");
    }


    public void mostrarSillas() {
        System.out.println("La bicicleta tiene un asiento");
    }
    
    
    
}
