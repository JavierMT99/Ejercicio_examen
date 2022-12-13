package org.iesch.ad.ej2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class Persona {

    int id;
    String nombre;
    String apellidos;
    String curso;
    int nota;
    int edad;

}
