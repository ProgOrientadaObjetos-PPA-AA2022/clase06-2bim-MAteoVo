/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        int op;
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        Auto a = new Auto();
        do {
            System.out.println("Ingrese placa del auto:");
            String p = sc.nextLine();
            System.out.println("Ingrese valor matricula:");
            double v = sc.nextFloat();
            a.establecerPlaca(p);
            a.establecerValorMatricula(v);
            c.insertarAuto(a);
            System.out.println("Desea ingresar otro auto ?? SI[1]NO[0]");
            op = sc.nextInt();
        } while (op != 0);

    }
}
