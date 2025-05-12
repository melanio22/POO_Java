import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeneradorEtiquetasTexto {

    public static String crearNombreArchivoValido(String nombre) {
        // Normaliza caracteres (quita acentos)
        String normalized = Normalizer.normalize(nombre, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");

        // Reemplaza caracteres no permitidos
        return normalized.replaceAll("[^a-zA-Z0-9]", "_") + ".txt";
    }

    public static List<String> procesarIngredientes(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }

    public static String formatearIngredientes(List<String> ingredientes) {
        return ingredientes.stream()
                .map(ing -> "- " + ing)
                .collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("\n=== GENERADOR DE ETIQUETAS MEJORADO ===");

        // Solicitar datos
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Ingredientes (separados por comas): ");
        String inputIngredientes = scanner.nextLine();
        List<String> ingredientes = procesarIngredientes(inputIngredientes);

        System.out.print("Alérgenos: ");
        String alergenos = scanner.nextLine();

        System.out.print("Número de producto: ");
        String numero = scanner.nextLine();

        // Crear nombre de archivo válido
        String nombreArchivo = crearNombreArchivoValido(nombre);

        // Crear contenido formateado
        String contenido = String.format(
                "NOMBRE:\n%s\n\nINGREDIENTES:\n%s\n\nALÉRGENOS:\n%s\n\nN°: %s",
                nombre,
                formatearIngredientes(ingredientes),
                alergenos,
                numero
        );

        // Mostrar resumen
        System.out.println("\n--- RESUMEN ---");
        System.out.println("Producto: " + nombre);
        System.out.println("N° ingredientes: " + ingredientes.size());
        System.out.println("Alérgenos: " + (alergenos.isEmpty() ? "Ninguno" : alergenos));
        System.out.println("Número: " + numero);

        // Guardar archivo
        try (PrintWriter out = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(nombreArchivo),
                        StandardCharsets.UTF_8))) {

            out.println(contenido);
            System.out.println("\nÉXITO: Archivo creado como '" + nombreArchivo + "'");
            System.out.println("Puedes abrir este archivo con el software DYMO Label");

        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}