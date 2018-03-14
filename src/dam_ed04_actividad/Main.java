/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        cuenta1 miCuentaaa;
        double saldoActual;

        miCuentaaa = new cuenta1("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuentaaa.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(miCuentaaa);
    }

    private static void operativa_cuenta(cuenta1 miCuenta) {
        operativa_cuenta(miCuenta, 0);
    }

    private static void operativa_cuenta(cuenta1 miCuenta, float cantidad) {
        operativa_cuentaaa(miCuenta);
    }

    private static void operativa_cuentaaa(cuenta1 miCuenta) {
        try {
            miCuenta.retirar(2300);
        }catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        }catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
