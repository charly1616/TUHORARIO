package THlogica;


public class opciones {

    public int nopciones = 0;
    
    int actions = 0;
    action headact;
    action actacti;
    
    
    public int ndias;
    opcion cabeza;
    opcion act;

    public opciones(int ndias) { //CONSTRUCTOR
        this.ndias = ndias;
    }
    
    
    public void clearopcions(){
        newaction(cabeza, "deleted");
        cabeza = null;
        act = null;
    }
    
    public void deleteopcion(int n) { //ELIMINA UNA OPCION
        if (n > nopciones) {
            return;
        }
        opcion actual = cabeza;
        for (int i = 1; i < n; i++) {
            actual = actual.sig;
        }
        
        if (actual == cabeza){
            cabeza = actual.sig;
        }
        if (actual == this.act){
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
        
        newaction(actual,"deleted");
        System.out.println("Opcion eliminada: " + actual.mostrar());
        contaropciones();
    }
    
    
    public void deleteopcion(opcion n){
        deleteopcion(this.number(n));
    }
    
    private void newaction(opcion opcion, String action){ // CREA UNA NUEVA ACCION
        if (opcion == null) return;
        action nuevo;
        nuevo = new action(action, opcion);
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
    
    
    private void undodelete(opcion var) {
        opcion actual = cabeza;
        while (actual != null && !(actual.equals(var))) {
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
        this.contaropciones();
    }
    
   private void undonew(opcion var) {
        if (cabeza == null) {
            opcion localact = var;
            while (localact.sig != null){
                localact = localact.sig;
            }
            this.cabeza = var;
            this.act = localact;
        } else {
            opcion localact = var;
            while (localact.sig != null){
                localact = localact.sig;
            }
            var.ant = this.act;
            this.act.sig = var;
            this.act = localact;
        }
        
        this.contaropciones();
    }
    
    public void Undo(){
        
        if (actacti == null) return;
        if (actacti.type.equals("added")){
            undodelete(actacti.oenvolved);
        } else{
            System.out.println("ADIING");
            undonew(actacti.oenvolved);
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
    
    
    public String[] opcioncont(){ // DEVUELVE TODAS LAS OPCIONES QUE EXISTEN EN UN VECTOR
        contaropciones();
        String [] n =new String[nopciones];
       int ct=0;
        opcion actual = cabeza;
        while (actual != null) {
            n[ct]=ct+1+"";
            actual = actual.sig;
            ct++;
        }
        return n;
    }
    
    public void contaropciones() { //CUENTA CUANTAS OPCIONES
        nopciones = 0;
        opcion actual = cabeza;
        while (actual != null) {
            nopciones++;
            actual = actual.sig;
        }
    }

    public opcion nuevaopcion(boolean ini) { //CREA UNA NUEVA OPCION, PIDIENDO O NO PIDIENDO LOS DATOS
        opcion nueva = new opcion(ndias, ini);
        if (cabeza == null) {
            cabeza = nueva;
            act = nueva;
        } else {
            act.sig = nueva;
            nueva.ant = act;
            act = nueva;
        }
        newaction(nueva,"added");
        contaropciones();
        return nueva;
    }

    public String ListaOpciones() { // CREA UNA LISTA DE OPCIONES PARA MOSTRAE
        String Most = "";
        int cont = 1;
        opcion actual = cabeza;
        while (actual != null) {
            Most += cont + "  "+actual.mostrar() + "\n";
            cont++;
            actual = actual.sig;
        }
        return Most;
    }

    public String encript() { //ENCRIPTA LAS OPCIONES QUE EXISTEN
        String code = "[";
        opcion actu = cabeza;
        while (actu != null) {
            code += actu.encript();
            actu = actu.sig;
        }
        code += "]";
        System.out.println(code);
        return code;
    }

    public boolean deencript(String code) {  // SE DESENCRIPTA LAS OPCIONES
        String regex = "\\[(.)\\]";
        String[] subcadenas = code.split(regex);
        subcadenas[0] = subcadenas[0].substring(1, subcadenas[0].length() - 1);

        if (subcadenas.length != 1) {
            return false;
        }

        //System.out.println(subcadenas[0]);
        DNCopcions(subcadenas[0]);

        return true;
    }

    public int number(opcion which) { // DEVUELVE EL NUMERO DE UNA OPCION
        int cont = 1;
        opcion actual = cabeza;
        while (actual != null) {
            if (actual == which) {
                return cont;
            }
            cont++;
            actual = actual.sig;
        }
        return 0;
    }

    private boolean DNCopcions(String code) { // DESENCRIPTA CADA OPCION

        String[] componentes = code.split("\\.");

        if (componentes.length < 1) {
            System.out.println("NO SE ENCONTRO OPCIONES");
            return false;
        }

        for (int i = componentes.length - 1; i >= 0; i--) {
            DNCdays(componentes[i]);
        }

        return true;
    }

    private boolean DNCdays(String code) { // (   abc,abc,   . )  DESENCRIPTA CADA DIA
        String[] componentes = code.split("\\,");
        if (componentes.length != ndias) {
           
            System.out.println(componentes.length + "   Numero de opciones no valida:  " + ndias);
            return false;
        }

        opcion nu = nuevaopcion(false);

        for (int i = 0; i < componentes.length; i++) {
            DNCsingle(componentes[i], nu);
        }
        newaction(nu,"added");
        return true;
    }

    private boolean DNCsingle(String code, opcion nueva) { //    abc   |   DESENCRIPTA FINALMENTE TODO

        try {
            int num1 = (int) (code.charAt(0)) - 97;
            int num2 = (int) (code.charAt(1)) - 97;
            int num3 = (int) (code.charAt(2)) - 97;

            //System.out.println(num1+" "+num2+" "+num3);
            return (nueva.creardia(num1, num2, num3));

        } catch (NumberFormatException e) {
            return false;
        }
    }

    public opcion getCabeza() {
        return cabeza;
    }
    
    
    
    
}