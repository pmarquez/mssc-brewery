package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder ( )
                .id(UUID.randomUUID ( ) )
                .customerName("Fred Flintstone")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id ( UUID.randomUUID ( ) )
                .build ( );
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //   Do some Update code Here
    }

    @Override
    public void deleteCustomer ( UUID customerId ) {
        //   Delete customer here
    }
}
