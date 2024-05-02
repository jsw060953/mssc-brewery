package guru.springframework.msscbrewery.services;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto);
    CustomerDto deleteById(UUID id);
}
