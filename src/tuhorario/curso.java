package tuhorario;

import javax.swing.JOptionPane;

public class curso {

    public String nombre;
    public String ID;

    public int ndias;

    curso sig;
    curso ant;

    Listacursos listac;
    opciones listaopc;

    opcion chosenone;

    public curso(String nombre, int ndias, Listacursos listac) {
        this.nombre = nombre;
        this.ndias = ndias;
        this.listac = listac;
        this.listaopc = new opciones(ndias);
    }
    
     public curso(String text){
        String [] partes = text.split("\\<");
        if (partes.length != 3){
            return;
        }
        this.nombre = partes[0];
        this.ndias = Integer.parseInt(partes[1]);
        this.listaopc.deencript(partes[2]);
    }
    
 public void conect(curso ante){
        if (ante == null) return;
        this.ant = ante;
        ante.sig = this;
    }
 
    public int chosenonenum() {
        if (chosenone == null) {
            return 0;
        }
        return listaopc.number(chosenone);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void choose(int n) {
        if (n == 0) {
            return;
        }
        opcion actual = listaopc.cabeza;
        for (int i = 1; i < n; i++) {
            if (actual == null) {
                return;
            }
            actual = actual.sig;
        }
        if (actual == null) {
            System.out.println("ERROR EN CHOOSE");
            return;
        }
        chosenone = actual;
    }

    public void vaciarcurso() {
        int j= JOptionPane.showConfirmDialog(null, "¿Estás seguro??", "CONFIRMACIÓN",
                JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
        if (j!=0) {
            return;
        }
        listaopc = new opciones(ndias);
        
    }

    public void mostrarcurso() {
        String titulo = nombre;
        String opciones = listaopc.ListaOpciones();

        JOptionPane.showMessageDialog(null, opciones, "===" + titulo + "===", JOptionPane.PLAIN_MESSAGE);

    }
     public String toText(){
        String text = "";
        text += this.nombre+"<";
        text += this.ndias + "<";
        text += this.listaopc.encript();
        return text;
    }
    
}
