package org.com.studies;

public class Cliente {

    private String name;
    private String id;
    private TypesServices service;

    public Cliente(String name, String id, TypesServices service) {
        this.name = name;
        this.id = id;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypesServices getService() {
        return service;
    }

    public void setService(TypesServices service) {
        this.service = service;
    }
}
