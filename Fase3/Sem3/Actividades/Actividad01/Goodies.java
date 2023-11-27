public class Goodies implements Contenedora <Integer> {
    private int id;
    private String descripcion;
    private float price;

    public Goodies (int id, String descripcion, float price) {
        this.id = id;
        this.descripcion = descripcion;
        this.price = price;
    }
    public int getId () {
        return id;
    }
    public String getDescripcion () {
        return descripcion;
    }
    public float getPrice () {
        return price;
    }
    public void setId (int id) {
        this.id = id;
    }
    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrice (float price) {
        this.price = price;
    }

    @Override
    public boolean contiene (Integer valor) {
        return valor.equals(getId());
    }
       

    @Override
    public String toString () {
        return "Id: " + id + "\n" +
               "Descripción: " + descripcion + "\n" +
               "Precio: " + price + "\n";
    }
}
