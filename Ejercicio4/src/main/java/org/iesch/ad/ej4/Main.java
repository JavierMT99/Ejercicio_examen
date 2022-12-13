package org.iesch.ad.ej4;

import org.iesch.ad.ej4.dao.Dao;
import org.iesch.ad.ej4.modelo.IdCard;
import org.iesch.ad.ej4.modelo.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 4 !");
        Dao dao = new Dao();

        Person person = Person.builder().dni("18445996L").name("Pedro").lastname("López").build();
        IdCard idCard = IdCard.builder().activo(true).fechaCaducidad(LocalDate.now().plusYears(3)).numero(1205).titulo("Ingenieria Informática").build();
        person.setTarjeta(idCard);
        idCard.setPerson(person);
        //Parte 1: Se produce un error. Soluciona este error!
        dao.guarda(person);


        //Parte 2:
        //Cuando hayas conseguido hacer la inserción, comenta lo anterior, no necesitamos más inserciones;
        //haz un update:
        // La persona cambia de sexo y ahora es "Luisa"
        // Luisa decidió dejar ingenieria informática y ahora estudia psicología
        // Se valorará un menor numero de intrucciones Java al hacer este update (Usa Mapeos de hibernate, no se permite usar querys JPQL o HSL, ni native Query)

        //Trae de BBDD la persona

        //Muestra la persona traida de BBDD
        System.out.println(/*PersonaTraida*/);
        //Haz el update


        //Muestra la persona tras el update
        System.out.println(/*PersonaTraida*/);






    }
}