package com.company.model;

/**
 * Created by pvmeira on 15/08/2017.
 */
public abstract class Entity {

    private Long id;

    public Entity(Long id) {
        this.id = id;
    }

    public Entity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
