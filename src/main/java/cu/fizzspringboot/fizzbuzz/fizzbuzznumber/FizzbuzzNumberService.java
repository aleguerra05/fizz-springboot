package cu.fizzspringboot.fizzbuzz.fizzbuzznumber;

import org.springframework.stereotype.Service;

@Service 
public class FizzbuzzNumberService{
    public FizzbuzzNumber getFizzbuzzNumber (double number){
        return new FizzbuzzNumber((int) number);
    }
}