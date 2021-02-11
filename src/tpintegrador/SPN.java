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
public class SPN extends Estrategia {
    
    private Proceso auxiliar = null;

    @Override
    public Proceso sigProceso(ArrayList <Proceso> lista, ParametrosForm ejecucion) {
        if ((this.auxiliar == null)||(this.auxiliar.getRestanteUsoCPU() == 0)) {
            int menor = lista.get(0).getDuracion_rafaga_cpu();
            this.setAuxiliar(lista.get(0));
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getDuracion_rafaga_cpu() < menor){
                    menor = lista.get(i).getCant_rafaga_cpu() * lista.get(i).getDuracion_rafaga_cpu();
                    this.setAuxiliar(lista.get(i));
                }
            }
        }
        this.getAuxiliar().setEstado("Corriendo");
        if (this.getAnterior() == null) {
            this.setAnterior(this.getAuxiliar());
        }
        if (!(this.getAuxiliar() == this.getAnterior())) {
            ejecucion.setConmutacion(ejecucion.getTcp());
            this.setAnterior(auxiliar);
        }
        return this.getAuxiliar();
    }

    public Proceso getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(Proceso auxiliar) {
        this.auxiliar = auxiliar;
    }

    public SPN() {
        this.setTipo("SPN");
    }
    
}
