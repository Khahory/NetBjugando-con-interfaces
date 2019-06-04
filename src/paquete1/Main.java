
package paquete1;

public class Main {
    public static void main(String args[]){
        
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();
        
        
        c.avanzar();
        c.mostrarSillas();
        c.detenerse();
        
        System.out.println("\n");

        b.avanzar();
        b.mostrarSillas();
        b.detenerse();
        
        
        
    }
}
