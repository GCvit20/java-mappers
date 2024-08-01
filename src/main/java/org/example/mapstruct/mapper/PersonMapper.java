package org.example.mapstruct.mapper;

import org.example.mapstruct.dto.PersonCustomDTO;
import org.example.mapstruct.entities.Person;
import org.example.mapstruct.dto.PersonDefaultDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper  {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDTO personToPersonDefaultDTO(Person person);

    @Mapping(source = "id", target = "idDTO") //source (desde donde sale: Necesitamos en este caso que salga desde id) / target (hasta donde llega: en este caso debe llegar a idDTO)
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "email", target = "emailDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDTO personToPersonaCustomDTO(Person person);

}
