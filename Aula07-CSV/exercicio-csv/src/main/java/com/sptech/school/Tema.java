package com.sptech.school;

public class Tema {

    int id;
    String modeloCamera;
    Double quantRede;
    int quantCamera;

    public Double getQuantCPU() {
        return quantCPU;
    }

    public boolean isLimiteRede() {
        return limiteRede;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getQuantCamera() {
        return quantCamera;
    }

    public Double getQuantRede() {
        return quantRede;
    }

    public String getModeloCamera() {
        return modeloCamera;
    }

    public int getId() {
        return id;
    }

    boolean ligado;
    boolean limiteRede;
    Double quantCPU;

    public Tema(int id, String modeloCamera, Double quantRede,
                int quantCamera, boolean ligado, boolean limiteRede, Double quantCPU) {

        this.id = id;
        this.modeloCamera = modeloCamera;
        this.quantRede = quantRede;
        this.quantCamera = quantCamera;
        this.ligado = ligado;
        this.limiteRede = limiteRede;
        this.quantCPU = quantCPU;

    }


}
