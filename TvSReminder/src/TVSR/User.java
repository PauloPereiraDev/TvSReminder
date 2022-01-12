/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TVSR;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public class User implements Serializable {

    private boolean som, pop;
    private static ArrayList<Eventos> eventos = new ArrayList<Eventos>();
    private static Thread tshut;
    private static Thread tremind;
    private int Hora, Min;

    public int getHora() {
        return Hora;
    }

    public int getMin() {
        return Min;
    }

    public User() {
        som = true;
        pop = false;
    }

    public void matashut() {
        if (tshut != null) {
            if (tshut.isAlive()) {
                tshut.stop();
            }
        }
    }
     public void mataremind() {
        if (tremind != null) {
            if (tremind.isAlive()) {
                tremind.stop();
            }
        }
    }

    public boolean tshutalive() {
        
        if (tshut!=null &&tshut.isAlive()) {
            return true;
        } else {
            return false;
        }
    }

    public void launchtshut(int hh, int mm) {
        Hora = hh;
        Min = mm;
        //codigo pa axapar thread
        tshut = new Thread(new Tsuspender(hh, mm, this));
        tshut.start();
    }

    public void launchtremind() {
        if(tshut==null || !tremind.isAlive()){
           tremind=new Thread(new Treminder(this));
           tremind.start();
        }
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public boolean isPop() {
        return pop;
    }

    public void setPop(boolean pop) {
        this.pop = pop;
    }

    public ArrayList<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Eventos> eventos) {
        this.eventos = eventos;
    }

    public void stopsuspende() {
        tshut.stop();
    }

    public void stopremind() {
        tremind.stop();
    }
}
