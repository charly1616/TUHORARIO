package THlogica;

import javax.swing.JOptionPane;

public class Listacursos {
    
    int actions = 0;
    action headact;
    action actacti;
    
    curso cabeza;
    curso act;
    public int ncursos = 0;

    private int[] diastogo = new int[6]; 

    public Listacursos() {
    }
    
    public void deletecurso(String name) {
        curso actual = cabeza;
        while (actual != null && !(actual.nombre.equals(name))) {
            actual = actual.sig;
        }
        if (actual != null) {
            if (actual == cabeza){
                cabeza = actual.sig;
            }
            if (actual == act){
                this.act = actual.ant;
            }
            if (actual.ant != null) {
                actual.ant.sig = actual.sig;
                actual.ant = null;
            }
            if (actual.sig != null) {
                actual.sig.ant = actual.ant;
                actual.sig = null;
            }
        }
        System.out.println("SE ELIMINO" + actual.nombre);
        newaction(actual, "deleted");
        actual.mostrarcurso();
        contarcursos();
    }
    
    
    public void newaction(curso curso, String action){
        if (curso == null) return;
        action nuevo;
        nuevo = new action(action, curso);
        if (headact == null){
            headact = nuevo;
            actacti = nuevo;
        } else {
           if (actions > 31){
               headact = headact.sig;
               headact.ant = null;
           }
           nuevo.ant = actacti;
           actacti.sig = nuevo;
           actacti = nuevo;
        }
        actions++;
    }
    
    
    public void contarcursos() { //contador de cursos
        ncursos = 0;
        curso actual = cabeza;
        while (actual != null) {
            ncursos++;
            actual = actual.sig;
        }
    }

    public void nuevocurso() {
        curso nuevo = new curso(pedirname(), pedirndia(), this);
        
        if (cabeza == null) {
            this.cabeza = nuevo;
            this.act = nuevo;
        } else {
            nuevo.ant = this.act;
            nuevo.sig = null;
            this.act.sig = nuevo;
            this.act = nuevo;
        }
        newaction(nuevo, "added");
        
    }

    public void nuevocurso(curso nuevo) {
        if (cabeza == null) {
            this.cabeza = nuevo;
            this.act = nuevo;
        } else {
            nuevo.ant = this.act;
            this.act.sig = nuevo;
            this.act = nuevo;
        }
        newaction(nuevo, "added");
    }
    
    
    
    private void undodelete(String name) {
        curso actual = cabeza;
        while (actual != null && !(actual.nombre.equals(name))) {
            actual = actual.sig;
        }
        if (actual != null) {
            if (actual == cabeza){
                cabeza = actual.sig;
            }
            if (actual == act){
                this.act = actual.ant;
            }
            if (actual.ant != null) {
                actual.ant.sig = actual.sig;
                actual.ant = null;
            }
            if (actual.sig != null) {
                actual.sig.ant = actual.ant;
                actual.sig = null;
            }
        }
        contarcursos();
    }
    
   private void undonew(curso nuevo) {
        if (cabeza == null) {
            curso localact = nuevo;
            while (localact.sig != null){
                localact = localact.sig;
            }
            this.cabeza = nuevo;
            this.act = localact;
        } else {
            curso localact = nuevo;
            while (localact.sig != null){
                localact = localact.sig;
            }
            nuevo.ant = this.act;
            this.act.sig = nuevo;
            this.act = localact;
        }
        nuevo.mostrarcurso();
        listacursos();
        contarcursos();
    }
    
    
    
    public void Undo(){
        if (actacti == null) return;
        if (actacti.type.equals("added")){
            undodelete(actacti.cenvolved.nombre);
        } else{
            undonew(actacti.cenvolved);
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
    
    
    public String pedirname() {
       
        String nombre = JOptionPane.showInputDialog("Dijite el nombre (Máximo 10 letras)");
   

        while (nombre.length() > 10) {
            nombre = JOptionPane.showInputDialog("Dijite nuevamente, el nombre es muy largo ");
        }
        while (dupname(nombre)) {
            JOptionPane.showMessageDialog(null, "Ese nombre está repetido");
        }
        return nombre;
       
        
    }
    

    public int pedirndia() {
        
        int Day=0;
        String[] days = {"1", "2", "3", "4"};
        String n = (String)JOptionPane.showInputDialog(null, "Cantidad de dias del curso:", 
                "CANTIDAD DE DIAS", JOptionPane.PLAIN_MESSAGE, null, days, days[0]);
        Day = Integer.parseInt(n);
        return Day;
    }

    public void listacursos() {
        String show = "";
        int cont = 0;
        curso actual = cabeza;
        while (actual != null) {
            cont++;
            show += cont + ": " + actual.nombre + " " + actual.listaopc.nopciones + "opciones\n";
            actual = actual.sig;
        }
        JOptionPane.showMessageDialog(null, show);
    }

    public void listahorario() {
        String show = "";
        int cont = 0;
        curso actual = cabeza;
        while (actual != null) {
            cont++;
            show += actual.nombre + "\n";
            show += (actual.chosenone != null) ? actual.chosenone.mostrar() + "\n" : "";
            actual = actual.sig;
        }
        JOptionPane.showMessageDialog(null, show);
    }

    public boolean dupID(String id) {
        curso actual = cabeza;
        while (actual != null) {
            if (actual.ID.equals(id)) {
                return true;
            }
            actual = actual.sig;
        }
        return false;
    }

    public boolean dupname(String na) {
        curso actual = cabeza;
        while (actual != null) {
            if (actual.nombre.equals(na)) {
                return true;
            }
            actual = actual.sig;
        }
        return false;
    }

    public int howmanydays() {
        actudias();
        int conti = 0;
        for (int i = 0; i < 6; i++) {
            if (diastogo[i] != 0) {
                conti++;
            }
        }
        return conti;
    }

    private void actudias() {
        int[] diasss = new int[6];

        curso actual = cabeza;
        opcion opci = (actual != null) ? actual.chosenone : null;
        while (actual != null) {
            if (opci == null) {
                continue;
            }

            int[] dis = opci.DIAS();
            for (int i = 0; i < 6; i++) {
                diasss[i] += dis[i];
            }
            actual = actual.sig;
            opci = (actual != null) ? actual.chosenone : null;;
        }

        this.diastogo = diasss;

    }

    public int minhour() {
        int horamin = 25;

        curso actual = cabeza;
        opcion opci = (actual != null) ? actual.chosenone : null;
        while (actual != null) {
            if (opci == null) {
                continue;
            }

            int horacomp = opci.HORAMIN();
            if (horacomp < horamin) {
                horamin = horacomp;
            }

            actual = actual.sig;
            opci = (actual != null) ? actual.chosenone : null;;
        }

        return horamin;
    }

    public int maxhour() {
        int horamax = 0;

        curso actual = cabeza;
        opcion opci = (actual != null) ? actual.chosenone : null;
        while (actual != null) {
            if (opci == null) {
                continue;
            }

            int horacomp = opci.HORAMAX();
            if (horamax < horacomp) {
                horamax = horacomp;
            }

            actual = actual.sig;
            opci = (actual != null) ? actual.chosenone : null;;
        }

        return horamax;
    }

    public int huecosdeldia(int dia) {
        int[][] horasddia = horasdeldia(dia);
        int hueco = 0;
        for (int i = 0; i < horasddia[0].length - 1; i++) {
            hueco += Math.abs(horasddia[1][i] - horasddia[0][i + 1]);
        }

        return hueco;
    }

    public int[][] horasdeldia(int dia) {
        int[][] vecto = new int[2][30];
        int actu = 0;

        curso actual = cabeza;
        opcion escogida = (actual != null) ? actual.chosenone : null;
        dia eldia = (escogida != null) ? escogida.act : null;
        while (actual != null) {
            while (eldia != null) {
                if (eldia.getDia() == dia) {
                    vecto[0][actu] = eldia.getHd();
                    vecto[1][actu] = eldia.getHds();
                    actu++;
                }
                eldia = eldia.ant;
            }
            actual = actual.sig;
            escogida = (actual != null) ? actual.chosenone : null;
            eldia = (escogida != null) ? escogida.act : null;
        }

        for (int i = 0; i < 30; i++) {
            if (vecto[0][i] == 0) {
                break;
            }
            for (int j = i; j < 30; j++) {
                if (vecto[0][j] == 0) {
                    continue;
                }
                if (vecto[0][j] < vecto[0][i]) {
                    int b = vecto[0][j];
                    vecto[0][j] = vecto[0][i];
                    vecto[0][i] = b;
                    b = vecto[1][j];
                    vecto[1][j] = vecto[1][i];
                    vecto[1][i] = b;
                }
            }
        }

        int[][] truevector = new int[2][actu];
        for (int i = 0; i < actu; i++) {
            truevector[0][i] = vecto[0][i];
            truevector[1][i] = vecto[1][i];
        }

        return truevector;
    }

     public String toText(){
        String text = "";
        curso actual = this.cabeza;
        while (actual != null){
            text += "`"+actual.toText();
            actual = actual.sig;
        }
        return text;
    }

    public int getNcursos() {
        return ncursos;
    }

    

}
