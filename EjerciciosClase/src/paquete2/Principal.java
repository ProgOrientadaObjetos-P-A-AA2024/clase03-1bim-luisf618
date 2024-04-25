/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/

        InstitucionEducativa i1 = new InstitucionEducativa();
        String nombre = "UTPL";
        String tipo = "Privada";
        int numeroA = 3650;
        int numeroD = 100;
        int numeroS = 8;

        i1.establecerNombre(nombre);
        i1.establecerTipoInstitucion(tipo);
        i1.establecerNumeroALumnos(numeroA);
        i1.establecerNumeroDocentes(numeroD);
        i1.establecerNumeroSedes(numeroS);

        System.out.printf("Nombre de Institucion: %s\nTipo de Institucion: %s\n"
                + "Numero de Alumnos: %d\nNumero de Docentes: %d\nNumero de "
                + "Sedes: %d\n", i1.obtenerNombre(),
                i1.obtenerTipoInstitucion(), i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(), i1.obtenerNumeroSedes());
    }
}
