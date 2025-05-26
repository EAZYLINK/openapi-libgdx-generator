package models;

import com.badlogic.gdx.utils.Json;

public class Error {


    public Error() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static Error fromJson(String json) {
        return new Json().fromJson(Error.class, json);
    }
}
