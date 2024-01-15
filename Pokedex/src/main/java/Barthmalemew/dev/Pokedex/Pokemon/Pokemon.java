package Barthmalemew.dev.Pokedex.Pokemon;

import java.util.List;

public class Pokemon {
    private String entry;
    private String name;
    private List<String> Type;
    private List<String> Weakness;

    public Pokemon(String name, List<String> type, List<String> weakness) {
        this.name = name;
        Type = type;
        Weakness = weakness;
    }

    public Pokemon(String entry, String name, List<String> type, List<String> weakness) {
        this.entry = entry;
        this.name = name;
        Type = type;
        Weakness = weakness;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return Type;
    }

    public void setType(List<String> type) {
        Type = type;
    }

    public List<String> getWeakness() {
        return Weakness;
    }

    public void setWeakness(List<String> weakness) {
        Weakness = weakness;
    }
}
