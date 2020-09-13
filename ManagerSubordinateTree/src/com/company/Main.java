package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add("Tony", "Bill");
        tree.add("Tony", "Arvind");
        tree.add("Bill", "Suditi");
        tree.add("Suditi", "RK");
        tree.add("Suditi", "Akansha");
        tree.add("Suditi", "Surekha");
        tree.add("Suditi", "Suman");
        tree.add("Suditi", "Arojit");
        tree.add("RK", "Ram");
        tree.add("RK", "Sam");
        tree.display();
    }
}
