package tuhorario;

import javax.swing.JOptionPane;
import static tuhorario.dia.convertirHora;

public class horario extends Listacursos {
    
    private String name;
    
    Listacursos loscursos;
    
    Hopcion hhead;
    Hopcion hact;

    public int cont = 0;
    public int diasmax = 6;
    public int horamaxm = 23;
    public int horaminm = 2;
    public int huecomax = 12;
    private boolean[] diasrestrin = new boolean[6]; //{true,false,false,false,false,true}

    public horario(Listacursos loscursos) {
        this.loscursos = loscursos;
        
    }
    
    public void limpiarcurs(){
        newaction(cabeza, "deleted");
        cabeza = null;
        act=null;
    }
    
    private boolean overlapopcions(opcion ths) {
        curso actual = cabeza;
        while (actual != null && actual.chosenone != ths) {
            dia thisdia = ths.act;
            while (thisdia != null) {
                if (actual.chosenone != null && actual.chosenone.checkoverlap(thisdia.getDia(), thisdia.getHd(), thisdia.getHds())) {
                    return true;
                }
                thisdia = thisdia.ant;
            }
            actual = actual.sig;
        }
        return false;
    }
    
    public String[] nombrecursos(){
        contarcursos();
        String[] n =new String[ncursos];
        int ct=0;
         curso actual = cabeza;
        while (actual != null) {
            n[ct]=actual.nombre;
            actual = actual.sig;
            ct++;
        }
        return n;
    }
    
    private int huecosdelhorario() {
        int mayor = 0;
        int ac = 0;
        double prom = 0;
        int diastogo = loscursos.howmanydays();
        for (int i = 0; i < 6; i++) {
            int ne = huecosdeldia(i);
            ac += ne;
            if (mayor < ne) {
                mayor = ne;
            }
        }
        prom = ac / (diastogo + 0.0);
        return mayor;
    }
    
    public void nuevocurso(String name, int ndias, Listacursos list, String code) {
        curso nuevo = new curso(name, ndias, list);
        if (cabeza == null) {
            this.cabeza = nuevo;
            this.act = nuevo;
        } else {
            nuevo.ant = this.act;
            this.act.sig = nuevo;
            this.act = nuevo;
        }
        loscursos.nuevocurso(nuevo);
        nuevo.listaopc.deencript(code);
        newaction(nuevo, "added");
    }
    
    
    private String showrestring() { //DIAS RESTRINGIDO 
        String show = "";
        for (int i = 0; i < 6; i++) {
            show += i + " " + dia.nombreDia(i) + "  ";
            show += (diasrestrin[i]) ? "Restringido" : " Sin restriccion ";
            show += "\n";
        }
        return show;
    }

    public void diarest() { //Metodo para restringir dias
        int op1 = Integer.parseInt(JOptionPane.showInputDialog(showrestring() + "Quieres cambiar un dia?  1=si , 2= no"));
        while (op1 == 1) {
            int dia = Integer.parseInt(JOptionPane.showInputDialog(showrestring() + "Que dia quieres cambiar?"));
            while (dia > 6 || dia < 0) {
                dia = Integer.parseInt(JOptionPane.showInputDialog(showrestring() + "Digita un dia valido"));
            }
            diasrestrin[dia] = !diasrestrin[dia];
            op1 = Integer.parseInt(JOptionPane.showInputDialog(showrestring() + "Quieres cambiar un dia?  1=si , otro no"));
        }
    }

    private void eraseallh() {
        hhead = null;
        hact = null;
    }

    private void nuevoHorario(int diastogo, int HMAX, int HMIN, int huecos) {
        String code = "";
        curso actual = cabeza;
        while (actual != null) {
            code += (char) (actual.chosenonenum() + 97);
            actual = actual.sig;
        }

        if (checkhDUP(code)) {
            return;
        }

        Hopcion nuevo = new Hopcion(code, diastogo, HMAX, HMIN, huecos);
        if (hhead == null) {
            hhead = nuevo;
            hact = nuevo;
        } else {
            nuevo.ant = hact;
            hact.sig = nuevo;
            hact = nuevo;
        }
    }

    private boolean checkhDUP(String code) {
        Hopcion actual = hhead;
        while (actual != null) {
            if (actual.horario.equals(code)) {
                return true;
            }
            actual = actual.sig;
        }
        return false;
    }

    private boolean checkdias() {
        curso actual = cabeza;
        while (actual != null) {
            if (actual.chosenone != null) {
                dia actu = actual.chosenone.act;
                while (actu != null) {
                    if (diasrestrin[actu.getDia()]) {
                        return false;
                    }
                    actu = actu.ant;
                }
            }
            actual = actual.sig;
        }

        return true;
    }

    public void mostrarelH(int n) {
        Hopcion actual = hhead;
        for (int i = 1; i < n; i++) {
            if (actual != null) {
                actual = actual.sig;
            }
        }
        if (actual == null) {
            JOptionPane.showMessageDialog(null, "No se ha generado ningun horario con ese numero", "HORARIO NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int[] vect = actual.tovector();
        curso cursoac = cabeza;
        for (int i = 0; i <= vect.length; i++) {
            if (cursoac != null) {
                cursoac.choose(vect[i]);
                cursoac = cursoac.sig;
            }
        }
        listahorario();

        cursoac = cabeza;
        while (cursoac != null) {
            cursoac.chosenone = null;
            cursoac = cursoac.sig;
        }
    }

    public curso getcurso(String name) {
        curso actual = cabeza;
        while (actual != null) {
            if (actual.nombre.equals(name)) {
                return actual;
            }
            actual = actual.sig;
        }
        return null;
    }

    private void setH(Hopcion Hori) {
        int[] vecto = Hori.tovector();
    }

    private void mostrarallh() {
        String show = "";
        int conta = 1;
        Hopcion actual = hhead;
        while (actual != null) {
            show += conta + " |  " + mostrarHopc(actual) + "\n";
            conta++;
            actual = actual.sig;

            if (conta % 10 == 0) {
                JOptionPane.showMessageDialog(null, show, "== HORARIOS ENCONTRADOS: " + cont + " ==", JOptionPane.PLAIN_MESSAGE);
                show = "";
            }
        }
        if (show.equals("")) {
            return;
        }
        JOptionPane.showMessageDialog(null, show, "== HORARIOS ENCONTRADOS: " + cont + " ==", JOptionPane.PLAIN_MESSAGE);
    }

    private String mostrarHopc(Hopcion Hori) { //Mostrar opcion escogida
        String show = "";
        show += Hori.diastogo + " Dias  |                               " + Hori.huecos + " horas con hueco |\n   | Entrada MIN: " + dia.convertirHora(Hori.HMIN) + "               Salida MAX: " + dia.convertirHora(Hori.HMAX);
        show += " |\n   |---------------------------------------------------------------|";
        return show;
    }

    public void generarH() {
        cont = 0;
        eraseallh();
        permutate(null);
        mostrarallh();
    }

    public void ehoramax() {
        int edit;
        edit = Integer.parseInt(JOptionPane.showInputDialog("Que hora máxima desea?"));
        setHoramaxm(edit);
    }

    public void setHoramaxm(int horamaxm) {
        this.horamaxm = horamaxm;
    }

    public void ehoramin() {
        int edit;
        edit = Integer.parseInt(JOptionPane.showInputDialog("Que hora minima desea?"));
        setHoraminm(edit);
    }

    public void setHoraminm(int horaminm) {
        this.horaminm = horaminm;
    }

    public void ehuecosmax() {
        int edit;
        edit = Integer.parseInt(JOptionPane.showInputDialog("Que hueco máximo desea?"));
        setHuecomax(edit);
    }

    public void setHuecomax(int huecomax) {
        this.huecomax = huecomax;
    }

    public void ediasmax() {
        int edit;
        edit = Integer.parseInt(JOptionPane.showInputDialog("Que dias máximos desea?"));
        setDiasmax(edit);
    }

    public void setDiasmax(int diasmax) {
        this.diasmax = diasmax;
    }

    public int getDiasmax() {
        return diasmax;
    }

    public int getHoramaxm() {
        return horamaxm;
    }

    public int getHoraminm() {
        return horaminm;
    }

    public int getHuecomax() {
        return huecomax;
    }
    
    public void Limpiarfilt(){
         this.diasmax=6;
         this.horamaxm=22;
         this.horaminm=6;
         this.huecomax=12;
         this.diasrestrin=new boolean[6];
     
    }

    public void filt() {
        int filtro;
        do {

            String filtroo = JOptionPane.showInputDialog(null,"Ingrese su opción: \n1. Hora Máxima          " + convertirHora(getHoramaxm())
                    + " \n2. Hora Mínima             " + convertirHora(getHoraminm()) + " \n3. Huec.Máximo           " + getHuecomax() + " horas \n4. Dias Máximos       "
                    + "   " + getDiasmax() + " \n5. Dias Restringidos  \n6. Limpiar \n\n. Digite una de las opciones", "FILTRAR LOS HORARIOS",JOptionPane.PLAIN_MESSAGE);
            if (filtroo == null) return;
            filtro = Integer.parseInt(filtroo);
            switch (filtro) {
                case 1:
                    ehoramax();
                    break;
                case 2:
                    ehoramin();
                    break;
                case 3:
                    ehuecosmax();
                    break;
                case 4:
                    ediasmax();
                    break;
                case 5:
                    diarest();
                    break;
                case 6:
                    Limpiarfilt();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (true);
    }
    
    
    private void permutate(curso cursoact) {
        if (cursoact == null) {
            cursoact = cabeza;
        } else if (cursoact.sig == null) {
            //System.out.println("encontrado" + cursoact.nombre);
            int diastogo = loscursos.howmanydays();
            int horasmax = loscursos.maxhour();
            int horasmin = loscursos.minhour();
            int huecosd = huecosdelhorario();
            if (diastogo <= diasmax) //System.out.println((loscursos.maxhour()<= horamaxm) +""+ (loscursos.minhour() >= horaminm) + "  -  "+loscursos.maxhour()+"    "+loscursos.minhour());
            {
                if (diastogo <= diasmax && horasmax <= horamaxm && horasmin >= horaminm && huecosd <= huecomax && checkdias()) {
                    nuevoHorario(diastogo, horasmax, horasmin, huecosd);
                    cont++;
                }
            }
            return;
        } else {
            cursoact = cursoact.sig;
        }

        opcion opcact = cursoact.listaopc.cabeza;
        //JOptionPane.showMessageDialog(null, opcact.mostrar());
        while (opcact != null) {
            //System.out.println(cursoact.nombre);
            if (!overlapopcions(opcact)) {
                cursoact.chosenone = opcact;
                permutate(cursoact);
            }
            opcact = opcact.sig;
        }
        cursoact.chosenone = null;
    }
    
    
    public String toedit(){
        String show = "";
        int cont = 0;
        curso actual = cabeza;
        while (actual != null) {
            cont++;
            show += cont + ": " + actual.nombre + " ➜ " + actual.listaopc.nopciones + " opciones\n";
            actual = actual.sig;
        }
        show += "-------------------------------------------\n";
        return show;
    }
    
    
    
    
    
}
