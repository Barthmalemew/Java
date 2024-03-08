package Barthmalemew.dev.Pokedex.Pokemon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonRestController {

    @GetMapping("/")
    public String home(){
        return "Welcome home Trainer";
    }

}
