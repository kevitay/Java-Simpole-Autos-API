package com.galvanize.autos;

import org.springframework.stereotype.Service;

@Service
public class AutosService {

    public AutosService() {
        // default constructor
    }

    public AutosList getAutos() {
        return null;
    }

    public AutosList getAutos(String color, String make) {
        return null;
    }

    public AutosList getAutos(String searchQuery) {
        return null;
    }

    public Automobile addAuto(Automobile auto) {
        return null;
    }

    public Automobile getAuto(String vin) {
        return null;
    }

    public Automobile updateAuto(String vin, String color, String owner) {
        return null;
    }
}
