/*En �sta clase se crea�n los m�todos para registrar un nuevo usuario, modificar o eliminarlo
y almacenar una lista de todos los usuarios disponibles
*/
package funciones;

import java.util.ArrayList;
import java.util.List;

public class UsuarioF {
    private List<Usuario> usuarios; //Lista de usuarios

    public UsuarioF() { //Generamos un constructor vac�o
        usuarios = new ArrayList<>(); //Creamos un Array
    }
    
    //M�todos para instertar, modificar o eliminar usuarios
    public int buscar(String usuario){ //M�todo que recorrer� el Array y devolver� la posici�n en la que se encuentra el elemento usuario de tipo String
        int n = -1; //Lista inicializada en -1 hasta que n sea igual a i
        for (int i = 0; i < usuarios.size(); i++){ //M�todo para recorrer toda la lista de usuarios. La funci�n "usuarios.size" indicar� el rango del recorrido
            if (usuarios.get(i).getUsuario().equals(usuario)){ //Recorremos cada objeto de tipo String , get obtendr� el valor del objeto Usuario y lo igualar� de String a "usuario"
                n = i; //Si n encuentra la posici�n del usuario, es decir si se iguala a i entonces
                break; //Sale del bucle para dejar de recorrer el array
            }
        }
        return n;
    }
    public boolean insertar(Usuario usuario){ //Esto requerir� que indiquemos el objeto Usuario para que no se repita el mismo usuario al momento del registro
        if (buscar(usuario.getUsuario()) == -1){ //M�todo get para obtener el usuario, si el valor en la lista es igual a -1 
            usuarios.add(usuario); //El valor ser� verdadero e ingresar� el nuevo usuario a la lista
            return true;
        }else{
            return false; //Si la posici�n en la lista no es igual a -1 entonces ser� falso y no agregar� un nuevo usuario
        }
    }
    public boolean modificar(Usuario usuario){ //Lo mismo que el anterior pero para modificar los usuarios
        if (buscar(usuario.getUsuario()) != -1){ //En �ste caso si el valor en la lista no es igual a -1, nos indicar� que el usuario ya existe entonces podremos modificarlo
            
            Usuario usuarioaux = obtener(usuario.getUsuario()); //Utilizamos una variable de usuario auxiliar
            
            usuarioaux.setPassword(usuario.getPassword());
            usuarioaux.setNombre(usuario.getNombre());
            usuarioaux.setApellido(usuario.getApellido());
            usuarioaux.setEmail(usuario.getEmail()); //Con �stas funciones modificaremos los datos de un usuario ya establecido
            return true;
        } else{
            return false;
        }
    }
    public boolean eliminar(String usuario){ 
        if (buscar(usuario) != -1){ //Si buscar usuario es diferente a -1
            usuarios.remove(buscar(usuario)); //Con el m�todo remove quitamos de la lista el usuario designado
            return true;
        } else{
            return false;
        }
    }
    public Usuario obtener(String usuario){ //Esto buscar� la lista de usuarios disponibles, ver en que posici�n est� y devolver� el objeto Usuario
        if (buscar(usuario) != -1) { //Si buscar usuario es diferente a -1
            return usuarios.get(buscar(usuario)); //Le pasamos el resultado de la busqueda
        }else{
            return null; //Con esto nos pasar� un objeto vac�o
        }
    }
}
