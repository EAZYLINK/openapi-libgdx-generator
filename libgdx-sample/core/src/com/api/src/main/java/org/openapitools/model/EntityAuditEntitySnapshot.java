package org.openapitools.model;

import com.badlogic.gdx.utils.Json;

public class EntityAuditEntitySnapshot {


    public EntityAuditEntitySnapshot() {}

    public String toJson() {
        return new Json().toJson(this);
    }

    public static EntityAuditEntitySnapshot fromJson(String json) {
        return new Json().fromJson(EntityAuditEntitySnapshot.class, json);
    }
}
