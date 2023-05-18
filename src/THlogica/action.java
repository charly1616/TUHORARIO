package THlogica;

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
      public action(String type, opcion oenvolved) { 
        this.type = type;
        this.oenvolved = oenvolved;
    }
      
    public action(String type, grupo genvolved) { 
        this.type = type;
        this.oenvolved = oenvolved;
    }
}