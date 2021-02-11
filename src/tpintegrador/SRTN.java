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
public class SRTN extends Estrategia {

    @Override
    public Proceso sigProceso(ArrayList <Proceso> lista, ParametrosForm ejecucion) {
        Proceso siguiente = lista.get(0);
        int menos = siguiente.getRestanteUsoCPU();
        for (int i = 0; i < lista.size(); i++) {
            if (menos > (lista.get(i).getRestanteUsoCPU())) {
                siguiente = lista.get(i);
                menos = lista.get(i).getRestanteUsoCPU();
            }
        }
        
        siguiente.setEstado("Corriendo");
        if (this.getAnterior() == null) {
            this.setAnterior(siguiente);
        }
        if (!(this.getAnterior() == siguiente)) {
            this.getAnterior().setEstado("Listo");
            ejecucion.setConmutacion(ejecucion.getTcp());
            this.setAnterior(siguiente);
        }
        return siguiente;
    }

    public SRTN() {
        this.setTipo("SRTN");
    }
    
}
