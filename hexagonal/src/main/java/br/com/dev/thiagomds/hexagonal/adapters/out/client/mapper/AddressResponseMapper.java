package br.com.dev.thiagomds.hexagonal.adapters.out.client.mapper;

import br.com.dev.thiagomds.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.dev.thiagomds.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toADdress(AddressResponse addressResponse);


}
