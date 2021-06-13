package cu.fizzspringboot.fizzbuzz.fizzbuzznumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="api/fizzbuzz")
public class FizzbuzzNumberController{

    private  final FizzbuzzNumberService fizzbuzzNumberService;

    @Autowired
    public FizzbuzzNumberController(FizzbuzzNumberService fizzbuzzNumberService){
        this.fizzbuzzNumberService = fizzbuzzNumberService;
    }

    @GetMapping(path="/{stringNumber}")
    public FizzbuzzNumber getFizzbuzzNumber(@PathVariable String stringNumber) {
        double number = Double.parseDouble(stringNumber);
        return fizzbuzzNumberService.getFizzbuzzNumber(number);
    }

    @GetMapping(path="/random")
    public FizzbuzzNumber getRandomFizzbuzzNumber (){
        return fizzbuzzNumberService.getFizzbuzzNumber(((Math.random() * 99) + 1));
    }

    @GetMapping
    public List<FizzbuzzNumber> getAllFizzbuzzNumber (@RequestParam(value = "_page", defaultValue = "1") int page, @RequestParam(value = "_limit", defaultValue = "100") int limit ){
        List<FizzbuzzNumber> list = new ArrayList<FizzbuzzNumber>();
        int min = page * limit - limit + 1;
        int max = page * limit;
        for(int i=min;i<=max;i++)
            list.add(new FizzbuzzNumber(i));
        return list;
    }
    
}