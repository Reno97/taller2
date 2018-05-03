
package taller.pkg2;
import ucn.*;
import java.io.IOException;
import java.util.ArrayList;

public class Taller2 {
    //lista Usuarios(nickname,nombreCompleto,password,banda)
//public static ArrayList<Usuario> User= new ArrayList();

   //lista Banda(nombreBanda,canciones)
public static ArrayList<Banda> band= new ArrayList();

    //CARGAR LISTA DE USUARIOS
    //leemos el archivo usuarios.txt y almacenamos a los usuarios en el array User
public static void leerArchivoUsuario() throws IOException{
        //atributos usuario
        String nickname;
        String nombreCompleto;
        Usuario usuario;
        String password;
        String banda;
        
        //Inicializamos list
        ArrayList<Usuario> list = null;
        //creamos el objeto Lista
        ListaUsuarios lista = new ListaUsuarios(0,list);
        
        //Inicializamos el archivo de entrada
        ArchivoEntrada archivo= new ArchivoEntrada("usuarios.txt");
        while(!archivo.isEndFile()) {
			//Leemos el siguiente registro
			Registro regEnt = archivo.getRegistro();
			//Tomamos los datos del registro,
			nickname = regEnt.getString();
			nombreCompleto=regEnt.getString();
                        password=regEnt.getString();
                        banda=regEnt.getString();
                        //creamos un nuevo usuario
			usuario= new Usuario(nickname,nombreCompleto,password,banda);
                        //asignamos el los atributos correspondientes a cada usuario
			usuario.setNickname(nickname);
                        usuario.setNombreCompleto(nombreCompleto);
                        usuario.setPassword(password);
                        usuario.setBanda(banda);
                        //se agrega el nuevo usuario "aux" al array "user"
                        
		        //Cerramos el archivo
		        archivo.close();}



    //leemos el archivo bandas.txt y almacenamos a los usuarios en el array bandas
public static void leerArchivoBandas() throws IOException {
    String nombreBanda;

    ArchivoEntrada Banda= new ArchivoEntrada("bandas.txt");
    while(!Banda.isEndFile()) {
			//Leemos el siguiente registro
			Registro regEnt = Banda.getRegistro();
			//Tomamos los datos del registro,
			nombreBanda= regEnt.getString();
                        
    }    
        		        Banda.close();}

public static void leerArchivoCancion(){
}          
        
   
}
    //
