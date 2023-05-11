package THlogica;

import javax.swing.JOptionPane;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;

public class grupos {
    int actions = 0;
    action headact;
    action actacti;
    private grupo act;
    private grupo head;
    private int cant = 0;
     public int ngrupos = 0;
    
    public grupos(){
    }
    
    public void newaction(grupo grupo, String action){
        if (grupo == null) return;
        action nuevo;
        nuevo = new action(action, grupo);
        if (headact == null){
            headact = nuevo;
            actacti = nuevo;
        } else {
           if (actions > 31){
               headact = headact.sig;
               headact.ant = null;
           }
           nuevo.ant = actacti;
           actacti.sig= nuevo;
           actacti = nuevo;
        }
        actions++;
    }
    
     private void undodelete(String name) {
        grupo actual = head;
        while (actual != null && !(actual.getName().equals(name))) {
            actual = actual.next;
        }
        if (actual != null) {
            if (actual == head){
                head = actual.next;
            }
            if (actual == act){
                this.act = actual.ant;
            }
            if (actual.ant != null) {
                actual.ant.next = actual.next;
                actual.ant = null;
            }
            if (actual.next!= null) {
                actual.next.ant = actual.ant;
                actual.next = null;
            }
        }
        contargrupos();
    }
    
   private void undonew(grupo nuevo) {
        if (head == null) {
            grupo localact = nuevo;
            while (localact.next != null){
                localact = localact.next;
            }
            this.head = nuevo;
            this.act = localact;
        } else {
            grupo localact = nuevo;
            while (localact.next != null){
                localact = localact.next;
            }
            nuevo.ant = this.act;
            this.act.next = nuevo;
            this.act = localact;
        }
        
        contargrupos();
    }
    
    
    
    public void Undo(){
        if (actacti == null) return;
        if (actacti.type.equals("added")){
            undodelete(actacti.genvolved.getName());
        } else{
            undonew(actacti.genvolved);
        }
        if (actacti == headact){
            headact = null;
            actacti = null;
        }else{
            actacti = actacti.ant;
            actacti.sig = null;
        }
        actions--;
    }
    
    public void newgrupo(String name){
        grupo nuevo = new grupo(name);
        if (head == null){
            head = nuevo;
            act = nuevo;
        } else{
            act.next = nuevo;
            nuevo.ant = act;
            this.act = nuevo;
        }
        nuevo.toText();
        newaction(nuevo, "added");
        contargrupos();
    }
    
    
    public void contargrupos() { //contador de cursos
        ngrupos = 0;
        grupo actual = head;
        while (actual != null) {
            ngrupos++;
            actual = actual.next;
        }
        
    }
     
    public String[] nombregrupos(){
        contargrupos();
        String[] n =new String[ngrupos];
        int ct=0;
         grupo actual = head;
        while (actual != null) {
            n[ct]=actual.getName();
            actual = actual.next;
            ct++;
        }
        return n;
    }
   public void deletegrupo(String name) {
        grupo actual = head;
        while (actual != null && !(actual.getName().equals(name))) {
            actual = actual.next;
        }
        if (actual != null) {
            if (actual == head){
                head = actual.next;
            }
            if (actual == act){
                this.act = actual.ant;
            }
            if (actual.ant != null) {
                actual.ant.next = actual.next;
                actual.ant = null;
            }
            if (actual.next != null) {
                actual.next.ant = actual.ant;
                actual.next = null;
            }
        }
        newaction(actual, "deleted");
        contargrupos();
    }
    
    public void contar(){
        int cont = 0;
        
        grupo actual = head;
        while(actual != null){
            cont++;
            actual = actual.next;
        }
        this.cant = cont;
    }
    
    
    public String[] toopciones(){
        contar();
        String[] opciones = new String[this.cant];
        grupo actual = head;
        int cont = 0;
        while(actual != null && cont < this.cant){
            opciones[cont] = cont + " " + actual.getName();
            cont++;
            actual = actual.next;
        }
        return opciones;
    }
    
    
    public static String askforname(){
        String name = (String) JOptionPane.showInputDialog(null, "Escribir nombre del grupo", "",JOptionPane.PLAIN_MESSAGE);
        if (name == null) return"";
        while (name.length() > 15){
            name = JOptionPane.showInputDialog(null, "Escribir nombre no tan largo del grupo", "",JOptionPane.PLAIN_MESSAGE);
        }
        return name;
    }
    
    
    public void menuof(int nu){
        contar();
        if (this.cant < nu){
            return;
        }
        
        grupo actual = head;
        for (int i=0; i < nu; i++){
            actual = actual.next;
        }
        
        actual.menu();
    }
    
    
    public void ReadGrupos(){
        String ruta ="Grupos.txt";
        
        try {
            FileReader reader = new FileReader(ruta);
            BufferedReader buffer = new BufferedReader(reader);
            String line;
            String txt = "";
            while ((line = buffer.readLine()) != null) {
                txt += line + "\n";
            }
            readText(txt);
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    
    public void SaveGrupos(){
        try {
            String ruta ="Grupos.txt";
            FileWriter Saver = new FileWriter(ruta,true);
            ClearGrupos();
            Saver.append(toText());
            Saver.close();
        } catch (IOException e){
            System.out.println("ERROR");
        }
        
    }
    
    public void ClearGrupos(){
        File archivo = new File("Grupos.txt");
        
        try {
            PrintWriter writer = new PrintWriter(archivo);
            writer.print("");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error mientras se limpiaba el archivo: " + e.getMessage());
        }
    }
    
    
    public String toText(){
        String text = "";
        grupo actual = this.head;
        while (actual != null){
            text += actual.toText() + "\n";
            actual = actual.next;
        }
        return text;
    }
    
    public void readText(String text){
        String[] datos = text.split("\n");
        grupo ant = null;
        for (int i = 0; i < datos.length; i++) {
            System.out.println("creando: "+datos[i]);
            String [] separado = datos[i].split("\\:");
            if (separado.length != 3) continue;
            System.out.println("creando: "+datos[i]);
            newgrupo(separado[0]);
            grupo nuevo = this.act;
            System.out.println(separado[1]);
            nuevo.setSemestre(separado[1]);
            nuevo.getHor().readText(separado[2],nuevo.getList());
            
            this.act = nuevo;
            contargrupos();
        }
    }

    public grupo getAct() {
        return act;
    }

    public void setAct(grupo act) {
        this.act = act;
    }

    public grupo getHead() {
        return head;
    }

    public void setHead(grupo head) {
        this.head = head;
    }

    public int getCant() {
        return cant;
    }
    
    
    
    
}
