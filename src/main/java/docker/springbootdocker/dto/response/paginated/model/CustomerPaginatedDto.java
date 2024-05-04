package docker.springbootdocker.dto.response.paginated.model;


import docker.springbootdocker.dto.response.ResponseCustomerDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerPaginatedDto {
    private long dataCount;
    private List<ResponseCustomerDto> list;

}
