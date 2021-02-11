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
public abstract class Estrategia {
    private String tipo;
    private Proceso anterior;
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Proceso getAnterior() {
        return anterior;
    }

    public void setAnterior(Proceso anterior) {
        this.anterior = anterior;
    }
    
    abstract public Proceso sigProceso(ArrayList <Proceso> lista, ParametrosForm ejecucion);

}
