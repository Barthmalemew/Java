package Barthmalemew.dev.Pokedex.Pokemon;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PokedexService {
    public List<Pokemon> getPokemon() {
        return List.of(
                new Pokemon(
                        "25",
                        "Pikachu",
                        List.of("Electric"),
                        List.of("Ground")
                )
        );
    }
}
