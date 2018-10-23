package com.bell.b11.day15;

import java.util.Objects;

public class Country {

    String name;
    int population;
    double GDP;

    public Country(String name, int population, double GDP) {
        this.name = name;
        this.population = population;
        this.GDP = GDP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", GDP=" + GDP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getName(), country.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
