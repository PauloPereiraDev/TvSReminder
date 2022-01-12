package TVSR;


import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo
 */
public class Som {
    private AudioClip som;
    public Som(){
        som=Applet.newAudioClip(getURL("alarm.mid"));
    }

    public URL getURL(String nome){
        ClassLoader cl=this.getClass().getClassLoader();
        java.net.URL url= cl.getResource(nome);
        return url;
    }
    
    public void play(){
        if(som!=null)
            som.play();
    }
    public void stop(){
        if(som!=null){
            som.stop();
        }
    }
    public void loop(){
        if(som!=null)
            som.loop();
    }
}
