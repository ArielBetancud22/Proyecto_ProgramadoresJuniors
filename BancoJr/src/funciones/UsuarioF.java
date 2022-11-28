/*En ésta clase se creaán los métodos para registrar un nuevo usuario, modificar o eliminarlo
y almacenar una lista de todos los usuarios disponibles
*/
package funciones;

import java.util.ArrayList;
import java.util.List;

public class UsuarioF {
    private List<Usuario> usuarios; //Lista de usuarios

    public UsuarioF() { //Generamos un constructor vacío
        usuarios = new ArrayList<>(); //Creamos un Array
    }
    
    //Métodos para instertar, modificar o eliminar usuarios
    public int buscar(String usuario){ //Método que recorrerá el Array y devolverá la posición en la que se encuentra el elemento usuario de tipo String
        int n = -1; //Lista inicializada en -1 hasta que n sea igual a i
        for (int i = 0; i < usuarios.size(); i++){ //Método para recorrer toda la lista de usuarios. La función "usuarios.size" indicará el rango del recorrido
            if (usuarios.get(i).getUsuario().equals(usuario)){ //Recorremos cada objeto de tipo String , get obtendrá el valor del objeto Usuario y lo igualará de String a "usuario"
                n = i; //Si n encuentra la posición del usuario, es decir si se iguala a i entonces
                break; //Sale del bucle para dejar de recorrer el array
            }
        }
        return n;
    }
    public boolean insertar(Usuario usuario){ //Esto requerirá que indiquemos el objeto Usuario para que no se repita el mismo usuario al momento del registro
        if (buscar(usuario.getUsuario()) == -1){ //Método get para obtener el usuario, si el valor en la lista es igual a -1 
            usuarios.add(usuario); //El valor será verdadero e ingresará el nuevo usuario a la lista
            return true;
        }else{
            return false; //Si la posición en la lista no es igual a -1 entonces será falso y no agregará un nuevo usuario
        }
    }
    public boolean modificar(Usuario usuario){ //Lo mismo que el anterior pero para modificar los usuarios
        if (buscar(usuario.getUsuario()) != -1){ //En éste caso si el valor en la lista no es igual a -1, nos indicará que el usuario ya existe entonces podremos modificarlo
            
            Usuario usuarioaux = obtener(usuario.getUsuario()); //Utilizamos una variable de usuario auxiliar
            
            usuarioaux.setPassword(usuario.getPassword());
            usuarioaux.setNombre(usuario.getNombre());
            usuarioaux.setApellido(usuario.getApellido());
            usuarioaux.setEmail(usuario.getEmail()); //Con éstas funciones modificaremos los datos de un usuario ya establecido
            return true;
        } else{
            return false;
        }
    }
    public boolean eliminar(String usuario){ 
        if (buscar(usuario) != -1){ //Si buscar usuario es diferente a -1
            usuarios.remove(buscar(usuario)); //Con el método remove quitamos de la lista el usuario designado
            return true;
        } else{
            return false;
        }
    }
    public Usuario obtener(String usuario){ //Esto buscará la lista de usuarios disponibles, ver en que posición está y devolverá el objeto Usuario
        if (buscar(usuario) != -1) { //Si buscar usuario es diferente a -1
            return usuarios.get(buscar(usuario)); //Le pasamos el resultado de la busqueda
        }else{
            return null; //Con esto nos pasará un objeto vacío
        }
    }
}
