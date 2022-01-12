/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TVSR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Paulo
 */
public class Ficheiros {
    static private ObjectInputStream abreFObjectosLeitura(File f)
            throws IOException {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(f));
            return in;
        } catch (IOException e) {
            System.out.println("Erro ao abrir o ficheiro " + f.getName());
            throw e;
        }
    }

    static private ObjectOutputStream abreFObjectosEscrita(File f, boolean ap)
            throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(f, ap));
            return out;
        } catch (IOException e) {
            System.out.println("Erro ao abrir o ficheiro " + f.getName());
            throw e;
        }
    }


    static public User4save ler(File f) {
        ObjectInputStream in = null;
        User4save o = null;
        try {
            in = abreFObjectosLeitura(f);// throws FileNotFoundException

            if (in == null) {
                return null;
            }
            o = (User4save) in.readObject();
            //int ordem = (int) in.readObject();
            
            if (o == null) {
                return null;
            }
            System.out.println("Ficheiro " + f.getName() + " lido");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o ficheiro:" + f.getName());
            return null;
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ler: " + cnfe);
            return null;
        } catch (IOException ioe) {
            System.out.println("ler: " + ioe);
            return null;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o ficheiro " + f.getName()+e);
            }
        }
        return o;
    }
static public boolean gravar(User4save o, File f) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(f,false));
            if (out == null) {
                return false;
            }
           
            out.writeObject(o);
            
            System.out.println("Ficheiro " + f.getName() + " gravado");
        } catch (IOException ioe) {
            System.out.println("Erro ao gravar o ficheiro " + f.getName()+ioe);
            
            return false;
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o ficheiro " + f.getName());
            }
        }
        return true;
    }
}
