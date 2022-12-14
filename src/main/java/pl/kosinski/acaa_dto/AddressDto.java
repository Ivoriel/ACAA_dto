package pl.kosinski.acaa_dto;

import lombok.Data;

@Data
public class AddressDto {

    private long id;
    private String country;
    private String municipality;
    private String region;
    private String zipCode;
    private String street;
    private String buildingNumber;
    private String additionalIdentifier;

}
