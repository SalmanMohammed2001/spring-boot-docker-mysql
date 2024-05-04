package docker.springbootdocker.util.mapper;



import docker.springbootdocker.dto.core.CustomerDto;
import docker.springbootdocker.dto.response.ResponseCustomerDto;
import docker.springbootdocker.entity.Customer;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CustomerMapper {
    Customer toCustomer(CustomerDto customerDto);
    ResponseCustomerDto toResponseCustomerDto(Customer customer);
    List<ResponseCustomerDto> toResponseCustomerDtoList(Page<Customer> page);
}
