package es.ieslosmontecillos.democontroles;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Introspeccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombreClase;
        String className;
        Constructor<?>[] constructors;
        Method[] methods;
        Field[] fields;
        System.out.println("Nombre de la clase: ");
        nombreClase = sc.nextLine();
        try
        {
            Class<?> clase = Class.forName(nombreClase);
            /* Devuelve el nombre de la clase */
            className = clase.getName();
            System.out.println("\nNombre de la clase: " + className);
            /* Devuelve el modificador de la clase */
            int mod = clase.getModifiers();
            switch (mod)
            {
                case Modifier.PUBLIC:
                    System.out.println("\nModificador: public");
                    break;
                case Modifier.PRIVATE:
                    System.out.println("\nModificador: private");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("\nModificador: protected");
                    break;
                case Modifier.STATIC:
                    System.out.println("\nModificador: static");
                    break;
                case Modifier.FINAL:
                    System.out.println("\nModificador: final");
                    break;
            }
            /* Devuelve los constructores de la clase */
            constructors = clase.getDeclaredConstructors();
            System.out.println("\nConstructor(es) de la clase: ");
            for (Constructor<?> c : constructors)
            {
                System.out.println(c.toString());
            }
            /* Devuelve los métodos de la clase */
            methods = clase.getDeclaredMethods();
            System.out.println("\nMetodo(s) de la clase:");
            for(Method m : methods)
            {
                System.out.println(m.toString());
            }
            /* Devuelve los atributos de la clase */
            fields = clase.getDeclaredFields();
            System.out.println("\nAtributo(s) de la clase:");
            for(Field f : fields)
            {
                System.out.println(f.getName());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrado. " + e.getMessage());
        }catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}
