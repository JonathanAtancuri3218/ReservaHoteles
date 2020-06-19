package scm.modelo;

/**
 *
 * @author Jonathan Atancuri
 */
public class Consulta {
    
    private int id;
    private Cita cita;
    private String sintomas;
    private String diagnostico;
    private float presionArterial;
    private float frecuenciaCardiaca;
    private float frecuenciaRespiratoria;
    private float temperaturaCorporal;
    private float peso;
    private float altura;
    private float indiceMasa;
    private String receta;
    private String indicaciones;
   

    public Consulta(int id, Cita cita, String sintomas, String diagnostico,
                    float presionArterial, float frecuenciaCardiaca,
                    float frecuenciaRespiratoria, float temperaturaCorporal,
                    float peso, float altura, String receta, String indicaciones) {
        this.id = id;
        this.cita = cita;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.presionArterial = presionArterial;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperaturaCorporal = temperaturaCorporal;
        this.peso = peso;
        this.altura = altura;
        this.indiceMasa = calcularIndiceMasa();
        this.receta = receta;
        this.indicaciones = indicaciones;

    }

    public int getId() {
        return id;
    }

    public Cita getCita() {
        return cita;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public float getPresionArterial() {
        return presionArterial;
    }

    public float getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public float getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float getIndiceMasa() {
        return indiceMasa;
    }
    
    public String getReceta() {
        return receta;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    //Calculo IMC
    private float calcularIndiceMasa() {
        return (float) (peso / (altura*altura));
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", cita=" + cita + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico + ", presionArterial=" + presionArterial + ", frecuenciaCardiaca=" + frecuenciaCardiaca + ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperaturaCorporal=" + temperaturaCorporal + ", peso=" + peso + ", altura=" + altura + ", indiceMasa=" + indiceMasa + ", receta=" + receta + ", indicaciones=" + indicaciones + '}';
    }
}