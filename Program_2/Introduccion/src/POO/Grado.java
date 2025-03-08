/*Crea una clase Grado (nombre, estudiantes)
que tenga un array de objetos de la clase
Estudiante (nombre, dni, curso, matricula) que
tenga un array de objetos de la clase
Asignatura (nombre, codigo, curso, creditos)


//Preguntar por qué no puedo poner public class a las clases estudiante y asignatura

package POO;

//Creacion de la clase Grado
  class Grado {
	  String nombre;
	  Estudante[] estudiantes = new Estudiante[5]; 
	  
 //Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(String[] estudiante) {
		this.estudiante = estudiante;
	}
	
	 
}
//Creacion de la clase estudiante
  class Estudiante{
	  private String nombre;
	  private String dni;
	  private String curso;
 	  private Asignatura[]matricula;
	  private int contadorAsignaturas;
	  
 //Constructor de instancias para estudiante
	  public Estudiante(String nombre, String dni, String curso) {
		  this.nombre=nombre;
		  this.dni=dni;
		  this.curso=curso;
		  this.matricula = new Asignatura[5];
		  this.contadorAsignaturas = 0;
	  	}
//Metodo que comprueba si hay espacio en el array de asignaturas
	  void asignaturaLibre(Asignatura matricula) {
		  if (contadorAsignaturas < matricula.length) { 
	            matricula[contadorAsignaturas] = matricula; 
	            contadorAsignaturas++; 
	            System.out.println("Asignatura agregada: " + asignatura.getNombre());
	        } else {
	            System.out.println("No caben mas asignaturas");
	        }
	  }
//Metodo que muestra las asignaturas en las que esta matriculado un estudiante
	  void mostrarAsignaturas(Asignatura matricula) {
		  System.out.println("Asignaturas de " + nombre + ":");
		  for (int i = 0; i < contadorAsignaturas; i++) {
			  System.out.println("- " + matricula[i].get.Nombre() + matricula[i].getCodigo + ")");
		  }
	  }
 	  
 //Getters y setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public Asignatura[] getMatricula() {
			return matricula;
		}
		public void setMatricula(Asignatura[] matricula) {
			this.matricula = matricula;
		}
	
 }
  
  //Creacion de la clase Asignatura
  class Asignatura{
	  String nombre;
	  int codigo;
	  String curso;
	  int creditos;
	
 //Getters y setters
  public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
}
  */




package POO;

// Clase Grado
class Grado {
    private String nombre;
    private Estudiante[] estudiantes; // Cambiado a array de Estudiante
    private int contadorEstudiantes;

    public Grado(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[5]; // Tamaño fijo
        this.contadorEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
            System.out.println("Estudiante agregado: " + estudiante.getNombre());
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el grado " + nombre + ":");
        for (int i = 0; i < contadorEstudiantes; i++) {
            System.out.println("- " + estudiantes[i].getNombre());
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// Clase Estudiante
class Estudiante {
    private String nombre;
    private String dni;
    private String curso;
    private Asignatura[] matricula;
    private int contadorAsignaturas;

    public Estudiante(String nombre, String dni, String curso) {
        this.nombre = nombre;
        this.dni = dni;
        this.curso = curso;
        this.matricula = new Asignatura[5];
        this.contadorAsignaturas = 0;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        if (contadorAsignaturas < matricula.length) {
            this.matricula[contadorAsignaturas] = asignatura;
            contadorAsignaturas++;
            System.out.println("Asignatura agregada: " + asignatura.getNombre());
        } else {
            System.out.println("No se pueden agregar más asignaturas. Límite alcanzado.");
        }
    }

    public void mostrarAsignaturas() {
        System.out.println("Asignaturas de " + nombre + ":");
        for (int i = 0; i < contadorAsignaturas; i++) {
            System.out.println("- " + matricula[i].getNombre() + " (" + matricula[i].getCodigo() + ")");
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCurso() {
        return curso;
    }
}

// Clase Asignatura
class Asignatura {
    private String nombre;
    private int codigo;
    private String curso;
    private int creditos;

    public Asignatura(String nombre, int codigo, String curso, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    public int getCreditos() {
        return creditos;
    }
}