/*
En ésta clase se utilizarán todas las funciones lógicas
 */
package modelo.logica;

//Importamos las clases para hacer uso de los objetos
import modelo.func.UsuarioF;
import modelo.objetos.Usuario;

public class UsuarioL {
    private static UsuarioF usuarioF = new UsuarioF(); //Objeto estático creado desde clase importada tipo privado
    
    
    public static boolean autentificar(String usuario, String password){ //Método para validar el usuario, le pedimos dos parámetos: usuario y password tipo String
        if(obtener(usuario)!=null){ //El método obtener usuario no debe ser nulo, con ésto verificaremos si existe un usuario registrado
            Usuario usuarioConsulta = obtener(usuario); //Creamos un nuevo objeto usuarioConsulta para usarlo en éste método y lo igualamos al método obtener(usuario)
            if(usuarioConsulta.getUsuario().equals(usuario) && usuarioConsulta.getPassword().equals(password)){
                return true; //Entonces si existe el usuario y coincide con la contraseña de dicho usuario retorna verdadero
            }else{
                return false; //Si no coincide retorna falso
            }
            
        }else{ 
            return false; //Caso contrario del primer if: el usuario no existe y retorna falso
        }
        
    }
    
    //Creamos los mismos métodos que en la clase UsuarioF pero estáticos, no necesitaremos crear nuevos objetos para acceder a éstos
    public static boolean insertar(Usuario usuario){ //Requerimos el parámetro usuario tipo objeto
        return usuarioF.insertar(usuario);
}
    
    public static boolean modificar(Usuario usuario){ //Aquí es igual que el método insertar
        return usuarioF.modificar(usuario);
    }
    
    public static boolean eliminar(String usuario){ //Aquí solicitamos el parámetro usuario tipo String
        return usuarioF.eliminar(usuario);
    }
    
    public static Usuario obtener(String usuario){ //Aquí requerimos lo mismo que en el método "eliminar"
        return usuarioF.obtener(usuario);
    }
    /*En los 4 métodos anteriores simplemente utilizamos los métodos creados en la clase "UsuarioF"
    y los retornamos
    */
    
}


