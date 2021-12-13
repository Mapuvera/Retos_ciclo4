package usa.sesion15.foodisgr.modelos;

public class Producto {
    private int id;
    private String name;
    private String descripcion;
    private String precio;
    private byte[] image;

    public Producto(int id, String name, String descripcion, String precio, byte[] image) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.precio = precio;
        this.image = image;
    }

    public Producto() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
