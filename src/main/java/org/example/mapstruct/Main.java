package org.example.mapstruct;


import org.example.mapstruct.dto.PersonCustomDTO;
import org.example.mapstruct.dto.PersonDefaultDTO;
import org.example.mapstruct.entities.Person;
import org.example.mapstruct.mapper.PersonMapper;


public class Main {

    /*Mapstruct - Default*/
    /*public static void main(String[] args) {

        Person person = new Person(1L, "Gaston", "Cvitanich", (byte)25, 'M', "gaston123@gmail.com");
        System.out.println(person);

        PersonDefaultDTO personDefaultDTO = PersonMapper.INSTANCE.personToPersonDefaultDTO(person);
        System.out.println(personDefaultDTO);
    }*/

    public static void main(String[] args) {
        Person person = new Person(1L, "Gaston", "Cvitanich", (byte)25, 'M', "gaston123@gmail.com");
        System.out.println(person);

        PersonCustomDTO personCustomDTO = PersonMapper.INSTANCE.personToPersonaCustomDTO(person);
        System.out.println(personCustomDTO);

    }
}
