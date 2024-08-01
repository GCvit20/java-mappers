package org.example.modelmapper;

import org.example.modelmapper.dto.PersonCustomDTO;
import org.example.modelmapper.dto.PersonDefaultDTO;
import org.example.modelmapper.entities.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {

    /*Model Mappper - Default*/
    /*public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        Person person = new Person(1L, "Gaston", "Cvitanich", (byte)25, 'M', "gaston123@gmail.com");
        System.out.println(person);

        PersonDefaultDTO personDefaultDTO = modelMapper.map(person, PersonDefaultDTO.class);
        System.out.println(personDefaultDTO);
    }*/

    /*Model Mapper - Custom*/
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        /*Como los parametros de Person y PersonCustom son diferentes, debemos crear nuestro mapa personalizado*/
        TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);

        /*Seteamos todos los atributos*/
        propertyMapper.addMapping(Person::getId, PersonCustomDTO::setIdDTO);
        propertyMapper.addMapping(Person::getName, PersonCustomDTO::setNameDTO);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
        propertyMapper.addMapping(Person::getAge, PersonCustomDTO::setAgeDTO);
        propertyMapper.addMapping(Person::getEmail, PersonCustomDTO::setEmailDTO);
        propertyMapper.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);


        Person person = new Person(1L, "Gaston", "Cvitanich", (byte)25, 'M', "gaston123@gmail.com");
        System.out.println(person);

        PersonCustomDTO personCustomDTO = propertyMapper.map(person);
        System.out.println(personCustomDTO);
    }
}