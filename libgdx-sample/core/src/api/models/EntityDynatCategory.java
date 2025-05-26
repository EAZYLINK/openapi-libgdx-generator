package models;

import com.badlogic.gdx.utils.Json;

public class EntityDynatCategory {


    public EntityDynatCategory() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static EntityDynatCategory fromJson(String json) {
        return new Json().fromJson(EntityDynatCategory.class, json);
    }
}
