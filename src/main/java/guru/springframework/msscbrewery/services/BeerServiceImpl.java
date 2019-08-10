package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById ( UUID beerId ) {
        return BeerDto.builder ( )
                .id(UUID.randomUUID ( ) )
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer ( BeerDto beerDto ) {
        return BeerDto.builder ( )
                .id ( UUID.randomUUID ( ) )
                .build ( );
    }

    @Override
    public void updateBeer ( UUID beerId, BeerDto beerDto ) {
        //   Do something here
    }

    @Override
    public void deleteBeer ( UUID beerId ) {
        //   Delete beer here
    }
}
