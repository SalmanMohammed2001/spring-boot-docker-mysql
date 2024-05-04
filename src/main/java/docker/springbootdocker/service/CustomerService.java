package docker.springbootdocker.service;


import docker.springbootdocker.dto.request.RequestCustomerDto;
import docker.springbootdocker.dto.response.ResponseCustomerDto;
import docker.springbootdocker.dto.response.paginated.model.CustomerPaginatedDto;

public interface CustomerService {
        public ResponseCustomerDto createCustomer(RequestCustomerDto dto);
        public ResponseCustomerDto findCustomer(Long id);
        public ResponseCustomerDto updateCustomer(RequestCustomerDto dto,long id) throws ClassNotFoundException;
        public void deleteCustomer(Long id);

        public CustomerPaginatedDto searchAllCustomer(int page, int size, String searchText);
}
