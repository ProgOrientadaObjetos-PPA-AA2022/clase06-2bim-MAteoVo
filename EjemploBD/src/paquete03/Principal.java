/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        int op;
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        Ciudad ciudad = new Ciudad("Machala", 400121);
        c.insertarCiudad(ciudad);
        do {            
            System.out.println("Ingrese nombre de la ciudad");
            String n = sc.nextLine();
            System.out.println("Ingrese poblacion:");
            int p = sc.nextInt();
            Ciudad cc = new Ciudad(n,p);
            c.insertarCiudad(cc);
            System.out.println("Desea ingresar otra ciudad??");
            op = sc.nextInt();
        } while (op!=0);
        

    }
}
