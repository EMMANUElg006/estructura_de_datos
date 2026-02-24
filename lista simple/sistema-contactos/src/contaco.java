public class contaco {
    private String Nombre;
    private String Telefono;
    private String email;

    public contaco ( String Nombre, String Telefono, String email) {
        this.Nombre= Nombre;
        this.Telefono = Telefono;
        this.email = email;
    }

    public java.lang.String getNombre() {
        return Nombre;
    }

    public void setNombre(java.lang.String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "contaco{" +
                "Nombre='" + Nombre + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public contaco(String nombre ,String telefono, String email ) {
        Nombre = nombre;
        Telefono = telefono;
        email = email;
    }
}
}