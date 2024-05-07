public class ClienteBanco {
    //variables de instancia
    private String nombre;
    private String apellido;
    private Integer numeroCueta;
    private Integer nip;

    //constructor
    public ClienteBanco(String nombre, String apellido, Integer numeroCuenta, Integer nip){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroCueta=numeroCuenta;
        this.nip=nip;
    }

    public ClienteBanco(){}

    //métodos de acceso
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

    public Integer getNumeroCueta() {
        return numeroCueta;
    }

    public void setNumeroCueta(Integer numeroCueta) {
        this.numeroCueta = numeroCueta;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }
}
