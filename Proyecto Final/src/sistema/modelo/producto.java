package sistema.modelo;
/**
 *
 * @author manua
 */
public class producto {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCostocomp() {
        return costocomp;
    }

    public void setCostocomp(int costocomp) {
        this.costocomp = costocomp;
    }

    public int getCostovent() {
        return costovent;
    }

    public void setCostovent(int costovent) {
        this.costovent = costovent;
    }
      
    private int id;
    private String tipo;
    private int costocomp;
    private int costovent;
      
    
}
