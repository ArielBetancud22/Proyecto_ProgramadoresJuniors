/*
En �sta clase se utilizar�n todas las funciones l�gicas
 */
package funciones;

public class UsuarioL {
    private static final UsuarioF usuarioF = new UsuarioF(); //Objeto est�tico creado desde clase UsuarioF
    
    
    public static boolean autentificar(String usuario, String password){ //M�todo para validar el usuario, le pedimos dos par�metos: usuario y password tipo String
        if(obtener(usuario)!=null){ //El m�todo obtener usuario no debe ser nulo, con �sto verificaremos si existe un usuario registrado
            Usuario usuarioConsulta = obtener(usuario); //Creamos un nuevo objeto usuarioConsulta para usarlo en �ste m�todo y lo igualamos al m�todo obtener(usuario)
            return usuarioConsulta.getUsuario().equals(usuario) && usuarioConsulta.getPassword().equals(password); //Entonces si existe el usuario y coincide con la contrase�a de dicho usuario retorna verdadero
            //Si no coincide retorna falso
            
        }else{ 
            return false; //Caso contrario del primer if: el usuario no existe y retorna falso
        }
        
    }
    
    //Creamos los mismos m�todos que en la clase UsuarioF pero est�ticos, no necesitaremos crear nuevos objetos para acceder a �stos
    public static boolean insertar(Usuario usuario){ //Requerimos el par�metro usuario tipo objeto
        return usuarioF.insertar(usuario);
}
    
    public static boolean modificar(Usuario usuario){ //Aqu� es igual que el m�todo insertar
        return usuarioF.modificar(usuario);
    }
    
    public static boolean eliminar(String usuario){ //Aqu� solicitamos el par�metro usuario tipo String
        return usuarioF.eliminar(usuario);
    }
    
    public static Usuario obtener(String usuario){ //Aqu� requerimos lo mismo que en el m�todo "eliminar"
        return usuarioF.obtener(usuario);
    }
    /*En los 4 m�todos anteriores simplemente utilizamos los m�todos creados en la clase "UsuarioF"
    y los retornamos
    */
    
    public static boolean validarSiEsAdmin(String usuario, String password) {
        return usuarioF.validarSiEsAdmin(usuario, password);
    }
    
}


