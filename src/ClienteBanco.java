public class ClienteBanco {
    //variables de instancia
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private Integer numeroCueta;
    private Integer nip;
    private Double saldoDisponible;


    //constructor
    public ClienteBanco(String nombre, String apellido, Integer numeroCuenta, Integer nip){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroCueta=numeroCuenta;
        this.nip=nip;
    }

    public ClienteBanco(){
        this.saldoDisponible = 50000.0;
    }

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

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void imprimirDatosCliente(){
        System.out.printf("Nombre completo %s\nnip: %d\nnumero de cuenta: %d\nsaldo disponible: %f\n ",this.nombre+" "+this.segundoNombre+" "+this.apellido, this.nip, this.numeroCueta, this.saldoDisponible );
        System.out.println("---------------------------------------------------------");

    }
}
