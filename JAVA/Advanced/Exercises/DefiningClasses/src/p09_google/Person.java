package p09_google;

import java.util.LinkedList;

class Person {
    private String name;
    private Company company;
    private Car car;
    private LinkedList<Pokemon> pokemons;
    private LinkedList<Parent> parents;
    private LinkedList<Child> children;

    public Person(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(String name, LinkedList<Pokemon> pokemons, String pokemon) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public Person(String name, LinkedList<Parent> parents, int numb) {
        this.name = name;
        this.parents = parents;
    }

    public Person(String name, LinkedList<Child> children, double num) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LinkedList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(LinkedList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public LinkedList<Parent> getParents() {
        return parents;
    }

    public void setParents(LinkedList<Parent> parents) {
        this.parents = parents;
    }

    public LinkedList<Child> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Child> children) {
        this.children = children;
    }
}
