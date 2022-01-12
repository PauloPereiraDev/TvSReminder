/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TVSR;

import GUI.pop_;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Paulo
 */
public class Treminder implements Runnable,Serializable {

    private static User user;

    public Treminder(User u) {
        System.out.println("axapei a thread");
        user = u;
    }

    @Override
    public void run() {
        Som sonoro = new Som();
        if (user.getEventos().isEmpty()) {
            user.stopremind();
        } else {
            while (true) {

                int aux = 0;
                //vai buscar hora sistema
                Calendar cal = Calendar.getInstance();
                cal.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String s = sdf.format(cal.getTime());
                StringTokenizer st = new StringTokenizer(s, ":");
                int h = Integer.valueOf(st.nextToken());
                int m = Integer.valueOf(st.nextToken());
                //vai buscar data sistema
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                Date d = new Date();

                StringTokenizer data = new StringTokenizer(df.format(d), "/");
                int aa, mm, dd;
                aa = Integer.valueOf(data.nextToken());
                mm = Integer.valueOf(data.nextToken());
                dd = Integer.valueOf(data.nextToken());
                //vai buscar a data do proximo evento
                data = new StringTokenizer(user.getEventos().get(0).getData(), "-");
                int ano, mes, dia;
                ano = Integer.valueOf(data.nextToken());
                mes = Integer.valueOf(data.nextToken());
                dia = Integer.valueOf(data.nextToken());
                //vai buscar a hora do proximo evento
                st = new StringTokenizer(user.getEventos().get(0).getHora(), ":");
                int hora = Integer.valueOf(st.nextToken());
                int min = Integer.valueOf(st.nextToken());
                aux = min - 10;
                if (aux < 0) {
                    hora--;
                    if(hora<0)
                        hora=23;
                    min = 60 + aux;
                } else {
                    min = min - 10;
                }
                System.out.println("data evento"+ano+"-"+mes+"-"+dia+"  "+hora+":"+min);
                System.out.println("data sistema"+aa+"-"+mm+"-"+dd+"  "+h+":"+m);
                if (ano == aa && mes == mm && dia == dd && h == hora && m == min) {
                    System.out.println("axapa evento");
                    if (user.isSom()) {
                        sonoro.play();
                    }
                    if (user.isPop()) {
                        new pop_(user.getEventos().get(0).getNome(), user.getEventos().get(0).getCanal(),user.getEventos().get(0).getHora()).setVisible(true);
                    }
                    //remove ultimo evento
                    user.getEventos().remove(0);
                }
                try {
                    Thread.currentThread().sleep(20000);
                    sonoro.stop();
                    Thread.currentThread().sleep(40000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Treminder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
