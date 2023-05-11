package THlogica;

import javax.swing.JOptionPane;

public class grupo {
    
    private String name;
    
    private String Semestre = "0";
    
    grupo next;
    grupo ant;
    
    
    
    private Listacursos list = new Listacursos();
    private horario hora = new horario(list);
    
    public grupo(String name){
        this.name = name;
    }
    

    public String getName() {
        return name;
    }
    
    public void conect(grupo ante){
        if (ante == null) return;
        this.ant = ante;
        ante.next = this;
    }
    
    public void menu(){
        int opcion;
        do {
            String[] opciones = {"1. Generar horarios","2. Administrar cursos"};
            String save = (String) JOptionPane.showInputDialog(null,"Ingrese su opción", "MENU DE OPCIONES PARA " + this.name,
                    JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[1]);
            if (save == null) break;
            opcion = Character.getNumericValue(save.charAt(0));
            
            switch (opcion) {
                case 1:
                    generarhorarios(hora);
                    break;
                case 2:
                    administrarcursos(hora);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (true);
    }
    
    
    
    public void generarhorarios(horario hora) {
        int menu1;

        do {
            String[] opciones = {"1. Generar Horarios","2. Filtrar Horarios","3. Ver Horario"};
            String choosen = (String)JOptionPane.showInputDialog(null,"Ingrese su opción ", "GENERAR LOS HORARIOS",
                    JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[2]);
            if (choosen == null) break;
            menu1 = Character.getNumericValue(choosen.charAt(0));

            switch (menu1) {
                case 1:
                    hora.generarH();
                    // Código 
                    break;
                case 2:
                    hora.filt();
                    break;
                case 3:
                    verhorario(hora);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (true);

    }

    public void verhorario(horario hora) {
        int n = 0;
        boolean valido = false;
        do {
            String entrada = JOptionPane.showInputDialog(null, "Ingrese el numero del horario :", "Pedir número", JOptionPane.PLAIN_MESSAGE);
            if (entrada == null) return;
            try {
                n = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (n < 0 || n > hora.cont);
        hora.mostrarelH(n);
    }

    public void administrarcursos(horario hora) {
        int menu2;

        do {String[] opciones = {"1. Crear cursos","2. Editar cursos","3. Eliminar curso","4. Devolverse","5. Limpiar "};
            String choosen = (String)JOptionPane.showInputDialog(null,hora.toedit()+"Ingrese su opción ", "ADMINISTRAR CURSOS",
                    JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[2]);
            if (choosen == null) break;
            menu2 = Character.getNumericValue(choosen.charAt(0));
            switch (menu2) {
                case 1:
                    hora.nuevocurso();
                    break;
                case 2:
                    String nb = JOptionPane.showInputDialog("Dijite el nombre del curso: ");
                    curso ncurso = hora.getcurso(nb);
                    if (ncurso == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un nombre que exista", "ERRORRR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        menucurs(ncurso);
                    }
                    break;
                case 3:
                    String[] cursos = hora.nombrecursos();
                    if (cursos.length == 0) break;
                    String c = (String)JOptionPane.showInputDialog(null,"ESCOJA EL CURSO QUE DESEE ELIMINAR ", "ELIMINANDO CURSO..",
                    JOptionPane.PLAIN_MESSAGE,null,cursos,cursos[0]);
                    if (c == null) break;
                    String nbr=c;
                    hora.deletecurso(nbr);
                    break;
                case 4:
                    hora.Undo();
                    break;
                case 5:
                    hora.limpiarcurs();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (true);

    }
    
    public horario getHor(){
        return this.hora;
    }
    
    public Listacursos getList(){
        return this.list;
    }
    
    public void menucurs(curso curso) {
        int crs;

        do {String[] mc = {"1. Editar nombre","2. Crear opcion","3. Eliminar opcion","4. Generar codigo","5. Ingresar código","6. Limpiar"};
            String choosen = (String)JOptionPane.showInputDialog(null,curso.listaopc.ListaOpciones()+"Ingrese su opción ", "OPCIONES_",
                    JOptionPane.PLAIN_MESSAGE,null,mc,mc[2]);
            if (choosen == null) break;
            crs = Character.getNumericValue(choosen.charAt(0));

            switch (crs) {
                case 1:
                    String nbb = JOptionPane.showInputDialog(null,"Dijite el nombre del curso que desea cambiar: ","CAMBIAR NOMBRE DEL CURSO " + curso.nombre,JOptionPane.PLAIN_MESSAGE);
                    curso.setNombre(nbb);
                    break;
                case 2:
                    curso.listaopc.nuevaopcion(true);
                    break;
                case 3:
                     String[] opcs = curso.listaopc.opcioncont();
                     if(opcs.length==0)break;
                     String n =(String) JOptionPane.showInputDialog(null, "Escoja la opcion que desee eliminar:", 
                        "ELIMINANDO OPC", JOptionPane.QUESTION_MESSAGE, null, opcs, opcs[0]);
                      if (n == null) break;
                     curso.listaopc.deleteopcion(Integer.parseInt(n));
                    break;
                case 4:
                    JOptionPane.showInputDialog(null, "Este es el codigo: ", "CODIGO DEL CURSO " + curso.nombre, JOptionPane.PLAIN_MESSAGE, null, null, curso.listaopc.encript());
                    break;
                case 5:
                    String code=JOptionPane.showInputDialog(null, "Escriba el código a generar:", " DESENCRIPTADOR DE CODIGOS",JOptionPane.PLAIN_MESSAGE);
                    curso.listaopc.deencript(code);
                    break;
                case 6:
                    curso.vaciarcurso();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (true);

    }
    
    
    public String toText(){
        String text = "";
        text += this.name+":";
        text += this.Semestre+":";
        text += this.hora.toText();
        System.out.println(text);
        return text;
    }
    
    
    public int contar(){
        this.hora.contarcursos();
        return this.hora.ncursos;
    }

    public horario getHora() {
        return hora;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getSemestre() {
        return Semestre;
    }

    public grupo getNext() {
        return next;
    }

    public grupo getAnt() {
        return ant;
    }
    
    
    
}
