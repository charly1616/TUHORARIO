package tuhorario;

import javax.swing.JOptionPane;

public class TUHORARIO {
    
    public static void main(String[] args) {
        
        
        
        
        
        grupos grupos = new grupos();
        grupos.newgrupo("ING SISTEMAS II");
        int opcion = 0;
        do {
            String[] opciones = {"1 Entrar a grupo","2. Crear grupo","3. Eliminar grupo"};
            String chose = (String) JOptionPane.showInputDialog(null,"Ingrese su opción", "MENU DE OPCIONES PARA LOS GRUPOS",JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (chose == null) return;
            opcion = Character.getNumericValue(chose.charAt(0));
            switch (opcion){
                case 1:
                    String[] opciones1 = grupos.toopciones();
                    String chose1 = (String) JOptionPane.showInputDialog(null,"Ingrese su opción", "MENU PARA ESCOGER GRUPO",JOptionPane.PLAIN_MESSAGE, null, opciones1, null);
                    if (chose1 == null) break;
                    int opcion2 = Character.getNumericValue(chose1.charAt(0));
                    grupos.menuof(opcion2);
                    break;
                case 2:
                    String nom = JOptionPane.showInputDialog(null,"Digite el nombre del curso a crear: ", "CREAR GRUPO", JOptionPane.PLAIN_MESSAGE);
                    if (nom==null) break;
                    grupos.newgrupo(nom);
                    break;
                case 3:
                    int j= JOptionPane.showConfirmDialog(null, "¿Estás seguro??", "CONFIRMACIÓN",
                JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (j!=0) {
                       return;
                    }
                    grupos.deletegrupo(grupos.askforname());
                    break;
            }
        } while (true);
    }
}