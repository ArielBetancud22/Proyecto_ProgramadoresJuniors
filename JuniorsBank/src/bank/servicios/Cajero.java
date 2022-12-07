package bank.servicios;

import bank.entidades.Cuenta;
import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Cuenta> cuentas = new ArrayList();
    private String valorMenu1;
    private String valorMenu2;
    private boolean salir;
    private boolean volver;

    public Cajero() {
    }

    public void menuDelCajero() {
        salir = false;
        while (salir == false) {
            System.out.println("---JUNIORS-BANK---");
            System.out.println("1.Nueva cuenta: ");
            System.out.println("2.Ingresar");
            System.out.println("3.Salir");
            System.out.print("Seleccione: ");
            valorMenu1 = sc.next();
            switch (valorMenu1) {
                case "1":
                    Cuenta cuenta1 = new Cuenta();
                    cuenta1.crearCuenta();
                    cuentas.add(cuenta1);
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println("CUENTA " + i + 1);
                        System.out.println(cuentas.get(i).getNombre() + " " + cuentas.get(i).getSaldo() + " " + cuentas.get(i).getPassword());
                        System.out.println("-----------");
                    }
                    break;
                case "2":
                    cuenta1 = cuentas.get(0);
                    String name;
                    String passw;
                    System.out.print("Nombre: ");
                    name = sc.next();
                    if (name.equals(cuentas.get(0).getNombre())) {
                        System.out.print("Password: ");
                        passw = sc.next();
                        if (passw.equals(cuentas.get(0).getPassword())) {
                            menuCuenta(cuenta1);
                        }
                    }

                    break;
                case "3":
                    salir = true;
                    break;
            }
        }

    }

    public void menuCuenta(Cuenta cuenta1) {
        volver = false;
        while (volver == false) {
            System.out.println("---JUNIORS-BANK---");
            System.out.println("-----BIENVENIDO-----");
            System.out.println("1.Depositar");
            System.out.println("2.Retirar");
            System.out.println("3.Consultar saldo");
            System.out.println("4.Eliminar cuenta");
            System.out.println("5.Salir de la cuenta");
            System.out.print("Seleccione: ");
            valorMenu2 = sc.next();
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
                    cuentas.remove(cuenta1);
                    break;
                case "5":
                    volver = true;
                    menuDelCajero();
                    break;

            }
        }
    }

}
