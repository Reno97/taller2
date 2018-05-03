
package taller.pkg2;

public class Usuario {
    //atributos
    private String nickname;
    private String nombreCompleto;
    private String password;
    private String banda;
    
   
    //public boolean tieneBanda() {
   
    //constructor usuario

    public Usuario(String nickname, String nombreCompleto, String password, String banda) {
        this.nickname = nickname;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.banda = banda;
    }
    // getter and setter

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    
    }
    
    
    
    
       

