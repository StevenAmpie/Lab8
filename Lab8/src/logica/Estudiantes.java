package logica;



public class Estudiantes {
	private String nombre;
    private double indiceAcademico;
    private String sexo;
    private String cedula;

    public Estudiantes(String nombre, String cedula, String carrera, double indiceAcademico, String sexo) {
        this.nombre = nombre;
        this.indiceAcademico = indiceAcademico;
        this.cedula = cedula;
        this.sexo=sexo;
    }

    public double getIndiceAcademico() {
        return indiceAcademico;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getCedula() {
    	
    	return cedula;
    	
    }
    
    
    public String getSexo() {
    	
    	
    	return sexo;
    }

}
