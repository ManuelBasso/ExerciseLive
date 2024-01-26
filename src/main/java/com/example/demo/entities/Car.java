package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class Car {

    private String marca;
    private String modello;
    private int numPorte;
    private int cilindrata;

    private UUID id;

    public Car(String marca, String modello, int numPorte, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.numPorte = numPorte;
        this.cilindrata = cilindrata;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
