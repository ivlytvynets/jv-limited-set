package com.dev;

public class Main {
    public static void main(String[] args) {
        LimitedSet<String> set = new LimitedSetImpl<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("a");
        set.add("g");
        set.add("h");
        set.add("i");
        set.add("j");
        set.contains("a");
        set.contains("a");
        set.contains("c");
        set.contains("d");
        set.contains("e");
        set.contains("f");
        set.contains("h");
        set.contains("i");
        set.contains("j");
        set.add("k");
        set.add("l");
        set.remove("k");
    }
}
