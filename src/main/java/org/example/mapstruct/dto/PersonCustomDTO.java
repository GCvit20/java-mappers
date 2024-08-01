package org.example.mapstruct.dto;

public class PersonCustomDTO {

    private Long idDTO;
    private String nameDTO;
    private String lastNameDTO;
    private String emailDTO;
    private byte ageDTO;
    private Character genderDTO;

    public PersonCustomDTO() {
    }

    public PersonCustomDTO(Long idDTO, String nameDTO, String lastNameDTO, Character genderDTO, byte ageDTO, String emailDTO) {
        this.idDTO = idDTO;
        this.nameDTO = nameDTO;
        this.lastNameDTO = lastNameDTO;
        this.genderDTO = genderDTO;
        this.ageDTO = ageDTO;
        this.emailDTO = emailDTO;
    }

    public Long getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(Long idDTO) {
        this.idDTO = idDTO;
    }

    public String getNameDTO() {
        return nameDTO;
    }

    public void setNameDTO(String nameDTO) {
        this.nameDTO = nameDTO;
    }

    public String getLastNameDTO() {
        return lastNameDTO;
    }

    public void setLastNameDTO(String lastNameDTO) {
        this.lastNameDTO = lastNameDTO;
    }

    public String getEmailDTO() {
        return emailDTO;
    }

    public void setEmailDTO(String emailDTO) {
        this.emailDTO = emailDTO;
    }

    public Character getGenderDTO() {
        return genderDTO;
    }

    public void setGenderDTO(Character genderDTO) {
        this.genderDTO = genderDTO;
    }

    public byte getAgeDTO() {
        return ageDTO;
    }

    public void setAgeDTO(byte ageDTO) {
        this.ageDTO = ageDTO;
    }

    @Override
    public String toString() {
        return "PersonCustomDTO{" +
                "idDTO=" + idDTO +
                ", nameDTO='" + nameDTO + '\'' +
                ", lastNameDTO='" + lastNameDTO + '\'' +
                ", emailDTO='" + emailDTO + '\'' +
                ", ageDTO=" + ageDTO +
                ", genderDTO=" + genderDTO +
                '}';
    }
}
