package com.example.branko.tester.model;

public class Photo {

    private String id;
    private String secret;
    private String server;
    private int farm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    @Override
    public String toString() {
        return String.format("id: %s, secret: %s, server: %s, farm: %d",id,secret,server,farm);
    }
}