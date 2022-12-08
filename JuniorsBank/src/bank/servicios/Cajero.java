package bank.servicios;

import bank.entidades.Cuenta;
import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Cuenta> cuentas = new ArrayList(); //arraylist que guardara las cuentas
    private String valorMenu1; //valor para el switch del menu1
    private String valorMenu2; //valor para el switch del menu2
    private boolean salir;
    private boolean volver;

    //constructor vacio para instanciar en el main
    public Cajero() {
    }

    //metodo crear una cuenta
    public void crearCuenta() {
        //pido los datos al usuario y se van seteando
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Apellido: ");
        String apellido = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        double saldo = 0; //el saldo es 0 por defecto
        Cuenta cuenta = new Cuenta(nombre, apellido, email, password, saldo); //crea la cuenta
        cuentas.add(cuenta); //la agrega al array de tipo cuenta

    }
//menu del cajero
    public void menuDelCajero() {
        salir = false;
        while (salir == false) { //mientras salir sea falso
            System.out.println("---JUNIORS-BANK---"); //muestro el menu
            System.out.println("1.Nueva cuenta: ");
            System.out.println("2.Ingresar");
            System.out.println("3.Salir");
            System.out.println("4.Mostrar cuentas");
            System.out.print("Seleccione: ");
            valorMenu1 = sc.next(); //elijo la opcion y depende eso hara las cosas del switch
            switch (valorMenu1) {
                case "1":
                    crearCuenta();
                    System.out.println("CUENTASS");

                    break;
                case "2":
                    ingresar();
                    break;
                case "3":
                    salir = true;
                    break;
                case "4":
                    System.out.println("-----CUENTAS-----");
                    for (int i = 0; i < cuentas.size(); i++) {//recorre el array mostrando las cuentas, solo el nombre y el saldo
                        System.out.println("Nombre: " + cuentas.get(i).getNombre() + " Saldo: " + cuentas.get(i).getSaldo());
                    }
                    break;

            }
        }

    }
//ingresar a la cuenta
    public void ingresar() {
        System.out.print("Nombre: "); //pide el nombre y el password
        String name = sc.next();
        System.out.print("Password: ");
        String passw = sc.next();
        Cuenta cuenta = null; //cuenta en null
        for (Cuenta a : cuentas) { //este for va recorriendo las cuentas del arraylist
            //System.out.println(a.getApellido() + "  acaaa");
            if (name.equals(a.getNombre()) && passw.equals(a.getPassword())) { //si el nombre y el password son iguales a los de la cuenta que está en el array 
                cuenta = a; //cuenta pasa a ser la cuenta del array
                //System.out.println(" llegaste aca ACA");
                menuCuenta(cuenta);//llamo al menu cuenta, es decir inicio sesion en el cajero en mi cuenta
                break;
            } else {
                System.out.println("Incorrecto, pruebe otra vez"); //si no lo hace de nuevo
            }
        }
    }
//eliminar cuenta
    public void eliminarCuenta() {
        System.out.print("Nombre de la cuenta a eliminar: ");//pido nombre y contraseña para eliminar
        String name = sc.next();
        System.out.print("Ingrese password para eliminar la contraseña: ");
        String passw = sc.next();
        Cuenta cuenta = null;
        for (Cuenta a : cuentas) {
            //System.out.println(a.getApellido() + "  acaaa");
            if (name.equals(a.getNombre()) && passw.equals(a.getPassword())) { //si coinciden con la cuenta del array 
                cuenta = a;
                //System.out.println(" llegaste aca ACA");
                cuentas.remove(cuenta); //se remueve del array, la cuenta ya no existe
                menuDelCajero();//como ya no existe vuelve al menu principal
                break;
            } else {
                System.out.println("Incorrecto, pruebe otra vez");
            }
        }
    }
//menu de mi cuenta
    public void menuCuenta(Cuenta cuenta1) {
        volver = false; 
        while (volver == false) {//mientras volver sea false muestro el menu de opciones
            System.out.println("---JUNIORS-BANK---");
            System.out.println("-----BIENVENIDO-----");
            System.out.println("1.Depositar");
            System.out.println("2.Retirar");
            System.out.println("3.Consultar saldo");
            System.out.println("4.Eliminar cuenta");
            System.out.println("5.Salir de la cuenta");
            System.out.print("Seleccione: ");
            valorMenu2 = sc.next(); //segun lo que selecciones llama a los metodos de la clase cuenta o a algunos de esta misma clase
            switch (valorMenu2) {
                case "1":
                    cuenta1.depositarDinero(0);
                    break;
                case "2":
                    cuenta1.retirarDinero(0);
                    break;
                case "3":
                    cuenta1.consultarSaldo();
                    break;
                case "4":
                    eliminarCuenta();
                    break;
                case "5":
                    volver = true;
                    menuDelCajero();// vuelve al menu del cajero
                    break;

            }
        }
    }

}
