package POO;

public class GradoApp {

	public static void main(String[] args) {
	
        Asignatura mat1 = new Asignatura("Matemáticas", 101, "Primero", 5);
        Asignatura pro1 = new Asignatura("Programación", 102, "Primero", 6);
        Asignatura alg2 = new Asignatura("Algebra",103,"Segundo",6);
        
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Markel", "12345678A", "Primero");
        estudiante1.agregarAsignatura(mat1);
        estudiante1.agregarAsignatura(pro1);
        Estudiante estudiante2 = new Estudiante("Gorka", "47812046K", "Segundo");
        estudiante2.agregarAsignatura(alg2);
        
        // Printear asignaturas de cada estudiante
        estudiante1.mostrarAsignaturas();
        estudiante2.mostrarAsignaturas();
        
        
        // Crear grado
        Grado grado1 = new Grado("Ingeniería Informática");
        grado1.agregarEstudiante(estudiante1);
        grado1.agregarEstudiante(estudiante2);
        
        // Printear los estudiantes de cada grado
        grado1.mostrarEstudiantes();
		
	}

}
