/*
 *En el main lo único que haremos, es instanciar las clases y llamar a los métodos para su ejecución.
 */
package bancoJr;

import banco.Entities.Base;
import banco.Entities.Cuenta;

public class bancoJr {

    public static void main(String[] args) {
        Cuenta Cuenta1 = new Cuenta("Julian", "1234", "JulianKiko", "Alvarez", "emirmayamail.com");
        Cuenta Cuenta2 = new Cuenta("Jose", "afff", "joseChavo", "Paradela", "pajadela.com");
        Base base1 = new Base();
        base1.insertar(Cuenta1);
        base1.insertar(Cuenta2);
        base1.mostrarUsuarios();
        
    }

}
