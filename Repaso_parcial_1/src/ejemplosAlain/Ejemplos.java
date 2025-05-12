package ejemplosAlain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Ejemplos {
	public static void main(String[] args) {
		//EJEMPLO USO SCANNER
		
        Scanner scanner = new Scanner(System.in); // Crear un Scanner para leer desde el teclado
		 // Leer una cadena
        System.out.print("Ingresa tu nombre: ");
        String nomb = scanner.nextLine(); // Lee una línea completa

        // Leer un entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); // Lee un número entero

        // Leer un número decimal
        System.out.print("Ingresa tu altura (en metros): ");
        double altura = scanner.nextDouble(); // Lee un número decimal

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nomb);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");

        scanner.close(); // Cerrar el Scanner (buena práctica)
			
	        
        //EJEMPLO USO DATES
        try {
            // --- Ejemplo 1: Obtener la fecha actual y formatearla ---
            // Crear un objeto Date que contiene la fecha y hora actuales
            Date fechaActual = new Date();

            // Crear un SimpleDateFormat con el formato deseado
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            // Formatear la fecha actual a un String
            String fechaFormateada = formato.format(fechaActual);
            System.out.println("Ejemplo 1: Fecha actual formateada: " + fechaFormateada);

            System.out.println(); // Línea en blanco para separación

            // --- Ejemplo 2: Convertir una cadena (String) a Date ---
            // Definir un formato para la fecha
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");

            // Fecha en formato String
            String fechaTexto = "2025-03-22";

            // Convertir de String a Date usando el formato
            Date fechaConvertida = formato2.parse(fechaTexto);
            System.out.println("Ejemplo 2: Fecha convertida de String: " + fechaConvertida);

            System.out.println(); // Línea en blanco para separación

            // --- Ejemplo 3: Comparar dos fechas ---
            // Crear dos fechas con el mismo formato
            Date fecha1 = formato2.parse("2025-03-20");
            Date fecha2 = formato2.parse("2025-03-22");

            // Comparación de fechas
            if (fecha1.before(fecha2)) {
                System.out.println("Ejemplo 3: fecha1 es ANTES que fecha2");
            } else if (fecha1.after(fecha2)) {
                System.out.println("Ejemplo 3: fecha1 es DESPUÉS que fecha2");
            } else {
                System.out.println("Ejemplo 3: Las fechas son IGUALES");
            }

            System.out.println(); // Línea en blanco para separación

            // --- Ejemplo 4: Calcular la diferencia en días entre dos fechas ---
            // Crear dos fechas para calcular la diferencia
            Date fechaInicio = formato2.parse("2025-03-01");
            Date fechaFin = formato2.parse("2025-03-22");

            // Calcular la diferencia en milisegundos
            long diferenciaMs = fechaFin.getTime() - fechaInicio.getTime();

            // Convertir milisegundos a días (1000 ms = 1 segundo, 60 segundos = 1 minuto, 60 minutos = 1 hora, 24 horas = 1 día)
            long diasDiferencia = diferenciaMs / (1000 * 60 * 60 * 24);

            System.out.println("Ejemplo 4: Diferencia en días entre fechaInicio y fechaFin: " + diasDiferencia);

        } catch (Exception e) { // Necesario al trabajar con Date y SimpleDateFormat
            // Capturar cualquier excepción que ocurra durante el parsing de fechas
            e.printStackTrace();
        }
			
	        
	        //EJEMLO USO ARRAYLIST
	        // --- Ejemplo 1: Crear un ArrayList y agregar elementos ---
	        ArrayList<String> listaDeNombres = new ArrayList<>();
	        
	        // Agregar elementos
	        listaDeNombres.add("Juan");
	        listaDeNombres.add("Maria");
	        listaDeNombres.add("Pedro");
	        listaDeNombres.add("Ana");

	        System.out.println("Ejemplo 1: ArrayList con nombres:");
	        
	        for (String nombre : listaDeNombres) {
	            System.out.println(nombre);
	        }

	        System.out.println(); // Línea en blanco para separación

	        // --- Ejemplo 2: Convertir un Array a un ArrayList ---
	        // Crear un Array
	        String[] arrayDeNombres = {"Carlos", "Laura", "David"};

	        // Convertir el Array a ArrayList
	        ArrayList<String> listaDesdeArray = new ArrayList<String>(Arrays.asList(arrayDeNombres)) ;
	        
	        System.out.println("Ejemplo 2: Array convertido a ArrayList:");
	        for (String nombre : listaDesdeArray) {
	            System.out.println(nombre);
	        }

	        System.out.println(); // Línea en blanco para separación

	        // --- Ejemplo 3: Convertir un ArrayList a un Array ---
	        // Convertir el ArrayList a Array
	        String[] arrayDesdeArrayList = new String[listaDeNombres.size()];
	        listaDeNombres.toArray(arrayDesdeArrayList);

	        System.out.println("Ejemplo 3: Array convertido a ArrayList:");
	        
	        
	        for (String nombre : arrayDesdeArrayList) {
	            System.out.println(nombre);
	        }

	        System.out.println(); // Línea en blanco para separación

	        // --- Ejemplo 4: Modificar un ArrayList ---
	        // Modificar un elemento de la lista
	        listaDeNombres.set(1, "Maria Clara"); // Cambiar "Maria" por "Maria Clara"
	        System.out.println("Ejemplo 4: ArrayList después de modificar un elemento:");
	        
	        for (String nombre : listaDeNombres) {
	            System.out.println(nombre);
	        }

	        System.out.println(); // Línea en blanco para separación

	        // --- Ejemplo 5: Eliminar un elemento de un ArrayList ---
	        listaDeNombres.remove("Pedro"); // Eliminar "Pedro"
	        System.out.println("Ejemplo 5: ArrayList después de eliminar un elemento:");
	        
	        for (String nombre : listaDeNombres) {
	            System.out.println(nombre);
	        }

	        // --- Ejemplo 6: Verificar si un elemento existe en el ArrayList ---
	        System.out.println("\nEjemplo 6: ¿Maria Clara está en la lista?");
	       
	        
	        if (listaDeNombres.contains("Maria Clara")) {
	            System.out.println("Sí, Maria Clara está en la lista.");
	        } 
	        
//	        else {
//	        	System.out.println("No, Maria Clara no esta en la lista");
//	        }
        }	
	}

	

