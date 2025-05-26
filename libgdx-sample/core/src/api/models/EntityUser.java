package models;

import com.badlogic.gdx.utils.Json;

public class EntityUser {


    public EntityUser() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static EntityUser fromJson(String json) {
        return new Json().fromJson(EntityUser.class, json);
    }
}
