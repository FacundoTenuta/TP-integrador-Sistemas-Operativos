/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpintegrador;

/**
 *
 * @author facuu
 */
public class Proceso {
    private int cant_rafaga_cpu;
    private String nombre;
    private String estado;
    private int prioridad;
    private int arribo;
    private int duracion_rafaga_cpu;
    private int duracion_rafaga_entrada;
    private int tr;
    private float trn;
    private int t_listo;
    private int restanteBloqueo;
    private int restanteUsoCPU;
    private int restanteQuantum;
    private int tiempoServicio;
    private int usoCPU;

    public int getUsoCPU() {
        return usoCPU;
    }

    public void calcularUsoCPU(){
        this.usoCPU = this.cant_rafaga_cpu * this.duracion_rafaga_cpu;
    }
    public void setUsoCPU(int usoCPU) {
        this.usoCPU = usoCPU;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }


    public int getT_listo() {
        return t_listo;
    }

    public void setT_listo(int t_listo) {
        this.t_listo = t_listo;
    }

    public int getRestanteQuantum() {
        return restanteQuantum;
    }

    public void setRestanteQuantum(int restanteQuantum) {
        this.restanteQuantum = restanteQuantum;
    }

    public int getRestanteUsoCPU() {
        return restanteUsoCPU;
    }

    public void setRestanteUsoCPU(int restanteUsoCPU) {
        this.restanteUsoCPU = restanteUsoCPU;
    }

    public int getRestanteBloqueo() {
        return restanteBloqueo;
    }

    public void setRestanteBloqueo(int duracionBloqueo) {
        this.restanteBloqueo = duracionBloqueo;
    }

    public int getTr() {
        return tr;
    }

    public void setTrp(int tr) {
        this.tr = tr;
    }

    public float getTrn() {
        return trn;
    }

    public void setTrn(float trn) {
        this.trn = trn;
    }

    public int getCant_rafaga_cpu() {
        return cant_rafaga_cpu;
    }

    public void setCant_rafaga_cpu(int cant_rafaga_cpu) {
        this.cant_rafaga_cpu = cant_rafaga_cpu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getArribo() {
        return arribo;
    }

    public void setArribo(int arribo) {
        this.arribo = arribo;
    }

    public int getDuracion_rafaga_cpu() {
        return duracion_rafaga_cpu;
    }

    public void setDuracion_rafaga_cpu(int duracion_rafaga_cpu) {
        this.duracion_rafaga_cpu = duracion_rafaga_cpu;
        this.restanteUsoCPU = duracion_rafaga_cpu;
    }

    public int getDuracion_rafaga_entrada() {
        return duracion_rafaga_entrada;
    }

    public void setDuracion_rafaga_entrada(int duracion_rafaga_entrada) {
        this.duracion_rafaga_entrada = duracion_rafaga_entrada;
        this.restanteBloqueo = duracion_rafaga_entrada;
    }

    public Proceso(int cant_rafaga_cpu, String nombre, int prioridad, int arribo, int duracion_rafaga_cpu, int duracion_rafaga_entrada) {
        this.cant_rafaga_cpu = cant_rafaga_cpu;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.arribo = arribo;
        this.duracion_rafaga_cpu = duracion_rafaga_cpu;
        this.duracion_rafaga_entrada = duracion_rafaga_entrada;
        this.restanteUsoCPU = duracion_rafaga_cpu;
//        this.usoCPU = this.cant_rafaga_cpu * this.duracion_rafaga_cpu;
    }

    public Proceso() {
        
//        this.estado = "Nuevo";
//        this.t_listo = 0;
    }
    
    
}
