package tuhorario;

public class action {
    String type;
    
    curso cenvolved;
    opcion oenvolved;
    grupo genvolved;
    
    
    action sig;
    action ant;

    public action(String type, curso cenvolved) { 
        this.type = type;
        this.cenvolved = cenvolved;
    }
      public action(String type, opcion cenvolved) { 
        this.type = type;
        this.oenvolved = oenvolved;
    }
      
    public action(String type, grupo cenvolved) { 
        this.type = type;
        this.oenvolved = oenvolved;
    }
}