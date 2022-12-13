package org.iesch.ad.ej3;

public class Main {
    public static void main(String[] args) {

        //while (true) {

            System.out.println("Bienvenido a nuestro sistema Control de terceros");
            System.out.println("1-> Inserta un tercero\n2-> Inserta un inmueble\n3-> Busca un inmueble a apartir de la referencia (id)\n4-> Busca uno o varios terceros a partir de su apellido\n5->Salir\n>");



            //Opción 1
            System.out.println("Introduce los datos del tercero");
            System.out.println("Introduce el DNI");
            System.out.println("Introduce el nombre");
            System.out.println("Introduce los apellidos");
            //...
            //Debes controlar si el tercero existe
            System.out.println("Error: El tercero ya existe en la BBDD");


            //Opción 2
            System.out.println("Dando de alta un inmueble:");
            System.out.println("Introduce la referencia catastral (id)");
            System.out.println("Introduce la dirección:");
            System.out.println("Introduce el CP");
            System.out.println("Introduce la fecha de adquisición (YYYYMMDD): ");
            //Se procederá a asociar el inmueble con un tercero
            //Muestra una lista de dnis existentes en BBDD

            System.out.println("Introduce el dni del dueño");
            //DNI existente en BBDD
            System.out.println("Inmueble dado de alta y asociado con el cliente");
            //DNI no existente en BBDD
            System.out.println("El DNI introducido no corresponde con ningún tercero. Se procede a dar de alta al tercero");
            System.out.println("Introduce el nombre");
            System.out.println("Introduce los apellidos");
            //Guardamos el inmueble en BBDD.


            //opción 3
            //Buscamos por referencia (id)
            System.out.println("Introduce la referencia catastral por la que buscar.");
            //Mostramos los datos del inmueble (toString)

            //opción 4
            System.out.println("Introduce el apellido del tercero");
            //buscamos y mostramos una lista de terceros con ese apellido, con las propiedades de cada uno. (toString)

            //opción 5
            System.out.println("Pasa un buen día");
        //}




    }
}