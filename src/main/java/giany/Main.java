package giany;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    Paciente paciente1 = new Paciente();


    System.out.println(paciente1);
    System.out.println(paciente1.getIdPaciente());
    System.out.println(paciente1.getNombre());
    System.out.println(paciente1.getFechaNacimiento());
    System.out.println(paciente1.getSintomas());

    paciente1.setIdPaciente(1);
    paciente1.setApellido1("Abundio");
    paciente1.setApellido2("Perez");
    paciente1.setFechaNacimiento(LocalDate.of(2004, 5,30));
    paciente1.setNombre("Abilio");
    ArrayList<String> sintomas = new ArrayList<>();
    sintomas.add("Cefalea");
    sintomas.add("Fiebre");
    sintomas.add("Nauseas");
    sintomas.add("Mucosidad");
    sintomas.add("Tos");
    paciente1.setSintomas(sintomas);
    System.out.println(paciente1);

}
}



