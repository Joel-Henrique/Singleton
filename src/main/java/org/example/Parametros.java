package org.example;

public class Parametros {
    private Parametros(){};
    private static Parametros instance = new Parametros();
    public static  Parametros getInstance(){
        return instance;
    }
    private String nomeLocadoradeVeiculos;
    private int qntVeiculos;

    public String getNomeLocadoradeVeiculos(){
        return nomeLocadoradeVeiculos;
    }
    public void setNomeLocadoradeVeiculos(String nomeLocadoradeVeiculos){
        this.nomeLocadoradeVeiculos = nomeLocadoradeVeiculos;
    }
    public int getQntVeiculos(){
        return qntVeiculos;
    }
    public void setQntVeiculos(int qntVeiculos){
        this.qntVeiculos = qntVeiculos;
    }
}
