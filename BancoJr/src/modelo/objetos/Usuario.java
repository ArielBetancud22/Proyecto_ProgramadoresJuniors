/*En ésta clase se crearán las variables de los datos de los usuarios

*/
package modelo.objetos;

//Creamos las variables privadas
public class Usuario {
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private String email;

    //Constructores generados con la opción Insert Code Constructor para todas las variables
    public Usuario(String usuario, String password, String nombre, String apellido, String email) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    //Constructores generados con la opción Insert Code Constructor para todas las variables
    }
    //Getters and Setters generados sin encapsulamiento
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    //Getters and Setters generados sin encapsulamiento
    }
}
