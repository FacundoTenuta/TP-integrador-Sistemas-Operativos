/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpintegrador;

import java.util.ArrayList;

/**
 *
 * @author facuu
 */
public class FCFS extends Estrategia {

    @Override
    public Proceso sigProceso(ArrayList <Proceso> lista, ParametrosForm ejecucion) {

        lista.get(0).setEstado("Corriendo");

        System.out.println();
        if (this.getAnterior() == null) {
            this.setAnterior(lista.get(0));
        }
        if (!(this.getAnterior() == lista.get(0))) {
            ejecucion.setConmutacion(ejecucion.getTcp());
        }
        this.setAnterior(lista.get(0));
        return lista.get(0);
    }

    public FCFS() {
        this.setTipo("FCFS");
        this.setAnterior(null);
    }
    
}
