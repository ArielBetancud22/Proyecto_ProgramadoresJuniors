/*
Esta es la clase cuenta, que basicamente tiene como atributos los datos de la cuenta del usuario
tiene sus respectivos getters y setters.
 */
package bank.entidades;

import java.util.Scanner;

public class Cuenta {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private double saldo;

    public Cuenta() {

    }

    public Cuenta(String nombre, String apellido, String email, String password, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.saldo = saldo;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

 
    public void depositarDinero(double ingreso) {
        System.out.print("Cantidad de dinero a ingresar: ");
        ingreso = sc.nextDouble(); //escribo el dinero a ingresar
        saldo = saldo + ingreso; //se lo sumo al saldo actual, y ahora tendr� un nuevo saldo actual.

    }

    public void retirarDinero(double retiro) {
        System.out.print("Cantidad de dinero a retirar: ");
        retiro = sc.nextDouble();
        if (retiro > saldo) {
            saldo = 0;
        } else {
            saldo = saldo - retiro;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo Actual: " + saldo);
    }

}
