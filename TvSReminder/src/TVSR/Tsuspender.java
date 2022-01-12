/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TVSR;

import GUI.TvScheduleReminder;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo
 */
public class Tsuspender implements Runnable,Serializable {

    private int Hora, Min;
    private static User user;

    public Tsuspender(int h, int m, User u) {
        Hora = h;
        Min = m;
        user = u;
    }

    

    public void suspende() {
        try {
            Runtime.getRuntime().exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
            user.stopsuspende();
        } catch (IOException ex) {
            Logger.getLogger(TvScheduleReminder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String s = sdf.format(cal.getTime());
            if (Hora == 24) {
                Hora = 0;
            }
            StringTokenizer st = new StringTokenizer(s, ":");
            int h = Integer.valueOf(st.nextToken());
            int m = Integer.valueOf(st.nextToken());
            
            if (h == Hora) {
                if (m == Min) {
                    suspende();
                    return;
                }
            }
            try {
                Thread.currentThread().sleep(60000);
                
            } catch (InterruptedException ex) {
                user.stopsuspende();
            }
        }
    }
}
