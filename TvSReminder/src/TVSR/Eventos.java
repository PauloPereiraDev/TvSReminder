/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TVSR;

import java.io.Serializable;

/**
 *
 * @author Paulo
 */
public class Eventos implements Serializable {

    private String nome;
    private String data;
    private String canal;
    private String hora;

    public Eventos(String n, String d, String h, String c) {
        nome = n;
        data = d;
        canal = c;
        hora = h;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
}
