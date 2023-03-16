package bytebank;

public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;

    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        if (this.clave == clave){
            return true;
        }
        else {
            return false;
        }


    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }
}
