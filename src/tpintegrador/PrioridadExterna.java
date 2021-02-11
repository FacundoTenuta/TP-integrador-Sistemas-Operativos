/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpintegrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author facuu
 */
public class PrioridadExterna extends Estrategia {

    @Override
    public Proceso sigProceso(ArrayList <Proceso> lista, ParametrosForm ejecucion) {
        Collections.sort(lista, new Comparator<Proceso>() {
            @Override
            public int compare(Proceso p1, Proceso p2) {
            	return new Integer(p2.getPrioridad()).compareTo(p1.getPrioridad());
                }
        });

        lista.get(0).setEstado("Corriendo");
        if (this.getAnterior() == null) {
            this.setAnterior(lista.get(0));
        }

        if (!(this.getAnterior() == lista.get(0))) {
            this.setAnterior(lista.get(0));
            ejecucion.setConmutacion(ejecucion.getTcp());
        }
        if (lista.size()>1) {
            for (int i = 1; i < lista.size(); i++) {
                lista.get(i).setEstado("Listo");
            }
        }
        
        return lista.get(0);
    }

    public PrioridadExterna() {
        this.setTipo("Prioridad Externa");
    }
    
}
