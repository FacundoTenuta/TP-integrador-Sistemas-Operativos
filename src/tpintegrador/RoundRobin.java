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
public class RoundRobin extends Estrategia {

    private int quantum;
    
    @Override
    public Proceso sigProceso(ArrayList <Proceso> lista, ParametrosForm ejecucion) {        
        Proceso siguiente = lista.get(0);

        if ((lista.get(0).getRestanteQuantum() == 0)) {
            lista.get(0).setEstado("Listo");
            lista.remove(0);
            if ((siguiente.getRestanteUsoCPU()) < quantum) {
                siguiente.setRestanteQuantum(siguiente.getRestanteUsoCPU());
            }else{
                siguiente.setRestanteQuantum(quantum);
            }
            lista.add(siguiente);
        }
        
        lista.get(0).setEstado("Corriendo");

        lista.get(0).setRestanteQuantum(lista.get(0).getRestanteQuantum()-1);
        if (this.getAnterior() == null) {
            this.setAnterior(lista.get(0));
        }
        if (!(this.getAnterior() == lista.get(0))) {
            ejecucion.setConmutacion(ejecucion.getTcp());
        }
        this.setAnterior(lista.get(0));
        return lista.get(0);
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public RoundRobin(int quantum, ArrayList <Proceso> lista) {
        this.quantum = quantum;
        this.setTipo("Round Robin");
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getDuracion_rafaga_cpu()) < quantum) {
                lista.get(i).setRestanteQuantum(lista.get(i).getDuracion_rafaga_cpu());
            }else{
                lista.get(i).setRestanteQuantum(quantum);
            }
        }
    }
    
}
