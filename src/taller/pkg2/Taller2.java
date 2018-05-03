
package taller.pkg2;
import ucn.*;
import java.io.IOException;
import java.util.ArrayList;
public class Taller2 {
    //lista Usuarios(nickname,nombreCompleto,password,banda)
public static ArrayList<Usuario> User= new ArrayList();

   //lista Banda(nombreBanda,canciones)
public static ArrayList<Banda> band= new ArrayList();

    //CARGAR LISTA DE USUARIOS
    //leemos el archivo usuarios.txt y almacenamos a los usuarios en el array User
public static void leerArchivoUsuario() throws IOException{
        //atributos
        String nickname;
        String nombreCompleto;
        Usuario aux;
        String password;
        String banda;
        //Inicializamos el archivo de entrada
        ArchivoEntrada us= new ArchivoEntrada("usuarios.txt");
        while(!us.isEndFile()) {
			//Leemos el siguiente registro
			Registro regEnt = us.getRegistro();
			//Tomamos los datos del registro,
			nickname = regEnt.getString();
			nombreCompleto=regEnt.getString();
                        password=regEnt.getString();
                        banda=regEnt.getString();
                        //creamos un nuevo usuario
			aux= new Usuario(nickname,nombreCompleto,password,banda);
                        //asignamos el los atributos correspondientes a cada usuario
			aux.setNickname(nickname);
                        aux.setNombreCompleto(nombreCompleto);
                        aux.setPassword(password);
                        aux.setBanda(banda);
                        //se agrega el nuevo usuario "aux" al array "user"
                        User.add(aux);}
		        //Cerramos el archivo
		        us.close();}


    //leemos el archivo bandas.txt y almacenamos a los usuarios en el array band
public static void leerArchivoBanda() throws IOException {
    String nombreBanda;

    ArchivoEntrada Banda= new ArchivoEntrada("bandas.txt");
    while(!Banda.isEndFile()) {
			//Leemos el siguiente registro
			Registro regEnt = Banda.getRegistro();
			//Tomamos los datos del registro,
			nombreBanda= regEnt.getString();
                        
    }    
        		        Banda.close();}

          
        
   
}
    //
