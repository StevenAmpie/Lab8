package logica;

import java.util.ArrayList;

public class Cedulas {
	
	private static final int MAX_ESTUDIANTES = 100;
    private ArrayList<Estudiantes> estudiantes;

    public Cedulas() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiantes estudiante) {
        if (estudiantes.size() < MAX_ESTUDIANTES) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("No se puede agregar más estudiantes. Límite alcanzado.");
        }
    }

    public ArrayList<String> obtenerEstudiantesPorCedula() {
        ArrayList<String> estudiantesCedula = new ArrayList<>();

        for (Estudiantes estudiante : estudiantes) {
        	estudiantesCedula.add(estudiante.getCedula());
        }

        return estudiantesCedula;
        
    }


	
}
