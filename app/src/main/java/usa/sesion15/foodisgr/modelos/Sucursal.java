package usa.sesion15.foodisgr.modelos;

public class Sucursal {
    private int id;
    private String name;
    private String descripcion;
    private String ubicacion;
    private byte[] image;

    public Sucursal(int id, String name, String descripcion, String ubicacion, byte[] image) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.image = image;
    }

    public Sucursal() {}

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
