
package taller.pkg2;

import java.util.ArrayList;

public class ListaUsuarios {
    //atributos
    private int posActual;
    public static ArrayList<Usuario> listaUsuarios;


   
//Constructor

    public ListaUsuarios(int posActual, ArrayList<Usuario> listaUsuarios ) {
        this.posActual = posActual;
        listaUsuarios= new ArrayList();}

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        ListaUsuarios.listaUsuarios = listaUsuarios;
    }
        }
