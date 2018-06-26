package p10_family_tree;

import java.util.LinkedList;

class Person {
    private static LinkedList<Person> DEFAULT_VALUE = new LinkedList<>();

    private String name;
    private String date;
    private LinkedList<Person> children;
    private LinkedList<Person> parents;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
        this.children = DEFAULT_VALUE;
        this.parents = DEFAULT_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LinkedList<Person> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Person> children) {
        this.children = children;
    }

    public LinkedList<Person> getParents() {
        return parents;
    }

    public void setParents(LinkedList<Person> parents) {
        this.parents = parents;
    }
}
