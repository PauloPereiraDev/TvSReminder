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
public class User4save implements Serializable {

    private boolean som, pop;
    private ArrayList<Eventos> eventos = new ArrayList<Eventos>();

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

    public void setEventos(ArrayList<Eventos> ev) {
        eventos = ev;
    }
    
}
