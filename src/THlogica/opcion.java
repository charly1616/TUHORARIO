package THlogica;

import javax.swing.JOptionPane;

public class opcion {
    // ID DE LA OPCION

    public int ndias;
    dia act;

    opcion sig;
    opcion ant;

    public opcion(int ndias, boolean inici) {
        this.ndias = ndias;
        if (inici) {
            init();
        }
    }

    //CODIGO DE INICIALIZACIÓN
    private void init() {
        for (int i = 0; i < ndias; i++) {
            nuevodia();
            System.out.println("TIMES");
        }
    }

    public int getNdias() {
        return ndias;
    }
     
    


    private int pedirDia() {
         int dia=0;
        String[] dias = {"0 Lunes", "1 Martes", "2 Miercoles", "3 Jueves", "4 Miercoles", "5 Viernes"};
        String n = (String) JOptionPane.showInputDialog(null, "ESCOGE EL DIA", 
             "DIAS DE LA SEMANA",  JOptionPane.QUESTION_MESSAGE, null, dias, dias[0]);
        dia = Character.getNumericValue(n.charAt(0));
        return dia;
    }

    public static boolean goodia(int day) { //Validacion de dias
        return (day >= 0 && day < 6);
    }

    public static boolean goodhora(int ho) { //validacion de hora
        return (ho > 5 && ho < 22);
    }
    
     private int pedirHora(String mensaje) {
        int hora = 0;
        boolean valido = false;
        do {
            String entrada = JOptionPane.showInputDialog(null, mensaje, "Pedir número", JOptionPane.QUESTION_MESSAGE);
            try {
                hora = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!valido || !goodhora(hora));

        return hora;
    }

    public void nuevodia() {
        int day = pedirDia();
        int hor = pedirHora("Ingrese hora de entrada");
        while (!goodhora(hor) || hor > 19) {
            hor = pedirHora("INGRESE UNA HORA DE ENTRADA CORRECTA");
        }
        int hor2 = pedirHora("Ingrese hora de salida");

        while (!goodhora(hor) || hor2 <= hor) {
            hor2 = pedirHora("Ingrese hora de salida valida");
        }

        creardia(day, hor, hor2);
    }

    public boolean creardia(int day, int hd, int hds) {
        if (!goodia(day)) {
            System.out.println("DIA NO EXISTE");
            return false;
        }
        if (!goodhora(hd) || !goodhora(hds)) {
            System.out.println("HORA NO SE PUEDE");
            return false;
        }
        if (hd > hds) {
            System.out.println("INCONSISTENCIA DE HORAS");
            return false;
        }

        dia nuevo = new dia(day, hd, hds);

        if (act != null) {
            nuevo.ant = act;
            act.sig = nuevo;
            act = nuevo;
        } else {
            act = nuevo;
        }
        return true;
    }

    public String mostrar() {   
        String Most = "";
        dia actual = act;
        while (actual != null) {
            Most += actual.nombreDia(actual.getDia());
            Most += " → ";
            Most += actual.convertirHora(actual.getHd());
            Most += " - ";
            Most += actual.convertirHora(actual.getHds());
            Most += (actual.ant != null) ? "\n" : " \n-------------------------------------------";
            System.out.println("");
            actual = actual.ant;
        }
        return Most;
    }
    
    public int[] getDias(){
        int[] diass = new int [3];
        int cont = 0;
        dia actu = act;
        while (actu != null) {
            diass[cont] = actu.getDia();
            cont++;
            actu = actu.ant;
        }
        return diass;
    }
    
    public int[] getHDSS(){
        int[] diass = new int [3];
        int cont = 0;
        dia actu = act;
        while (actu != null) {
            diass[cont] = actu.getHds();
            cont++;
            actu = actu.ant;
        }
        return diass;
    }
    
    
    public int[] getHD(){
        int[] diass = new int [3];
        int cont = 0;
        dia actu = act;
        while (actu != null) {
            diass[cont] = actu.getHd();
            cont++;
            actu = actu.ant;
        }
        return diass;
    }

    public opcion getSig() {
        return sig;
    }

    public dia getAct() {
        return act;
    }

    public void setAct(dia act) {
        this.act = act;
    }
    
    
    
    
    //DETECTA SI LA HORA DADA SE CRUZA CON ALGUN DÍA
    public boolean checkoverlap(int day, int start, int end) {
        dia actu = act;
        while (actu != null) {
            if (actu.cruza(day, start, end)) {
                return true;
            } else {
                actu = actu.ant;
            }
        }
        return false;
    }

    public String encript() { 
        String code = "";
        dia actu = act;
        while (actu != null) {
            code += actu.encript() + ",";
            actu = actu.ant;
        }
        code += ".";
        return code;
    }

    public int[] DIAS() {  //vector que guarda los dias
        int[] diass = new int[6];
        dia actu = act;
        while (actu != null) {
            diass[actu.getDia()] += 1;
            actu = actu.ant;
        }
        return diass;
    }

    public int HORAMIN() {  //Para ingresar la hora minima
        int hrmn = 25;
        dia actu = act;
        while (actu != null) {
            if (actu.getHd() < hrmn) {
                hrmn = actu.getHd();
            }
            actu = actu.ant;
        }
        return hrmn;
    }

    public int HORAMAX() { // para ingresar la hora maxima
        int hrmx = 0;
        dia actu = act;
        while (actu != null) {
            if (actu.getHds() > hrmx) {
                hrmx = actu.getHds();
            }
            actu = actu.ant;
        }
        return hrmx;
    }

}