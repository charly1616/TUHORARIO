package THlogica;

public class Hopcion {

    private String horario;
    private int diastogo;
    private int HMAX;
    private int HMIN;
    private int huecos;

    public Hopcion sig;
    public Hopcion ant;

    public Hopcion(String horario, int diastogo, int HMAX, int HMIN, int huecos) {
        this.horario = horario;
        this.diastogo = diastogo;
        this.HMAX = HMAX;
        this.HMIN = HMIN;
        this.huecos = huecos;
        //System.out.println(horario);
    }

    public int[] tovector() {
        
        int[] vec = new int[horario.length()];

        for (int i = 0; i < horario.length(); i++) {
            vec[i] = (int) (horario.charAt(i)) - 97;
        }
        return vec;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getDiastogo() {
        return diastogo;
    }

    public void setDiastogo(int diastogo) {
        this.diastogo = diastogo;
    }

    public int getHMAX() {
        return HMAX;
    }

    public void setHMAX(int HMAX) {
        this.HMAX = HMAX;
    }

    public int getHMIN() {
        return HMIN;
    }

    public void setHMIN(int HMIN) {
        this.HMIN = HMIN;
    }

    public int getHuecos() {
        return huecos;
    }

    public void setHuecos(int huecos) {
        this.huecos = huecos;
    }
    
    
    
}
