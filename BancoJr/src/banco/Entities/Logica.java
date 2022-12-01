/*
En ésta clase se utilizarán todas las funciones lógicas
 */
package banco.Entities;

public class Logica {
    private static final Base usuarioF = new Base(); //Objeto estático creado desde clase Base
    
    
    public static boolean autentificar(String usuario, String password){ //Método para validar el usuario, le pedimos dos parámetos: usuario y password tipo String
        if(obtener(usuario)!=null){ //El método obtener usuario no debe ser nulo, con ésto verificaremos si existe un usuario registrado
            Cuenta usuarioConsulta = obtener(usuario); //Creamos un nuevo objeto usuarioConsulta para usarlo en éste método y lo igualamos al método obtener(usuario)
            return usuarioConsulta.getUsuario().equals(usuario) && usuarioConsulta.getPassword().equals(password); //Entonces si existe el usuario y coincide con la contraseña de dicho usuario retorna verdadero
            //Si no coincide retorna falso
            
        }else{ 
            return false; //Caso contrario del primer if: el usuario no existe y retorna falso
        }
        
    }
    
    //Creamos los mismos métodos que en la clase Base pero estáticos, no necesitaremos crear nuevos objetos para acceder a éstos
    public static boolean insertar(Cuenta usuario){ //Requerimos el parámetro usuario tipo objeto
        return usuarioF.insertar(usuario);
}
    
    public static boolean modificar(Cuenta usuario){ //Aquí es igual que el método insertar
        return usuarioF.modificar(usuario);
    }
    
    public static boolean eliminar(String usuario){ //Aquí solicitamos el parámetro usuario tipo String
        return usuarioF.eliminar(usuario);
    }
    
    public static Cuenta obtener(String usuario){ //Aquí requerimos lo mismo que en el método "eliminar"
        return usuarioF.obtener(usuario);
    }
    /*En los 4 métodos anteriores simplemente utilizamos los métodos creados en la clase "Base"
    y los retornamos
    */
    
    public static boolean validarSiEsAdmin(String usuario, String password) {
        return usuarioF.validarSiEsAdmin(usuario, password);
    }
    
}


