package Barthmalemew.dev.Pokedex.Pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/pokedex")
public class PokedexController {

    private final PokedexService pokedexService;

    @Autowired
    public PokedexController(PokedexService pokedexService) {
        this.pokedexService = pokedexService;
    }
    @GetMapping
    public List<Pokemon> getPokemon(){
        return pokedexService.getPokemon();
    }
}
