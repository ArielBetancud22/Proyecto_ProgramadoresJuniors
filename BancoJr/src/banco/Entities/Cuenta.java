/*En ésta clase se crearán las variables de los parámetros del usuario

 */
package banco.Entities;

//Creamos las variables privadas
public class Cuenta {

    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private String email;
    private int saldo;
    private boolean admin;

    //Constructores generados con la opción Insert Code Constructor para todas las variables
    public Cuenta(String usuario, String password, String nombre, String apellido, String email) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.saldo = saldo;
        this.admin = false; //Cuando el registro de usuario sea cualquier valor que no sea "admin", el usuario será regular. Si en el registro el usuario es "admin", tendrá acceso a las funciones de administrador
        //Constructores generados con la opción Insert Code Constructor para todas las variables
    }

    public Cuenta() {

    }

    //Generamos los get and set de las variables
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

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
        //Getters and Setters generados sin encapsulamiento
    }
    
  

}
