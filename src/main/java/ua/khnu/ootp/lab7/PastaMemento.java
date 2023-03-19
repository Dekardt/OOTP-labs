package ua.khnu.ootp.lab7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ua.khnu.ootp.core.food.Pasta;

public class PastaMemento {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private String backup;

    public void save(Pasta p) {
        try {
            this.backup = MAPPER.writeValueAsString(p);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Can't serialize: " + p.toString(), e);
        }
    }

    public Pasta restore() {
        try {
            return MAPPER.readValue(this.backup, Pasta.class);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Can't deserialize: " + this.backup, e);
        }
    }
}
