
package taller.pkg2;


public class Banda {
    //atributos
    String nombreBanda;
    ListaCanciones canciones;

    public Banda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public ListaCanciones getCanciones() {
        return canciones;
    }

    public void setCanciones(ListaCanciones canciones) {
        this.canciones = canciones;
    }
    
    
    
}
