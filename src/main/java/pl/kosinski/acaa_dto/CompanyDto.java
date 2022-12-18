package pl.kosinski.acaa_dto;

import lombok.Data;

@Data
public class CompanyDto {

    private long id;
    private String name;
    private ClientDto client;
    private AddressDto address;

}
