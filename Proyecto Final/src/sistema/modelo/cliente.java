package sistema.modelo;
/**
 *
 * @author manua
 */
public class cliente {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    private String nombre;
    private String apellido;
    private String documento;
    private String direccion;
    private String correo;
    private String telefono;
    private String tipo_de_producto;

    public String getTipo_de_producto() {
        return tipo_de_producto;
    }

    public void setTipo_de_producto(String tipo_de_producto) {
        this.tipo_de_producto = tipo_de_producto;
    }

    
    
}
