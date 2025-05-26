package models;

import com.badlogic.gdx.utils.Json;

public class EntityBan {


    public EntityBan() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static EntityBan fromJson(String json) {
        return new Json().fromJson(EntityBan.class, json);
    }
}
