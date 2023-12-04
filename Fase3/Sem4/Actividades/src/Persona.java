public class Persona {
    private Integer id;
    private String username;
    private Integer puntuacion;

    public Persona(){
        this.id = null;
        this.username = null;
        this.puntuacion = null;
    }

    public Persona(String username) {
        this.id = null;
        this.username = username;
        this.puntuacion = 0;
    }

    public Integer getId() {
        return id;
    }
   
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    

    @Override
    public String toString(){
        return "Id: "+id+"\n"+
                "Username: " + username +"\n"+
                "Puntuacion: " + puntuacion +"\n"
        ;
    }
}
