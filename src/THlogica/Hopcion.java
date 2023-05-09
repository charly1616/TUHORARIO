package THlogica;

public class Hopcion {

    String horario;
    int diastogo;
    int HMAX;
    int HMIN;
    int huecos;

    Hopcion sig;
    Hopcion ant;

    public Hopcion(String horario, int diastogo, int HMAX, int HMIN, int huecos) {
        this.horario = horario;
        this.diastogo = diastogo;
        this.HMAX = HMAX;
        this.HMIN = HMIN;
        this.huecos = huecos;
        System.out.println(horario);
    }

    public int[] tovector() {
        
        int[] vec = new int[horario.length()];

        for (int i = 0; i < horario.length(); i++) {
            vec[i] = (int) (horario.charAt(i)) - 97;
        }
        return vec;
    }

}
