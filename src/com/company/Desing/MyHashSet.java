package com.company.Desing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyHashSet {
    private List<Integer> list;

    //inicjalizuje liste w konstruktorze bo nie byla zainnicjalizowana i byl NullPointerException
    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key))
            list.add(key);
    }

    public void remove(int key) {
        if (contains(key)){
            list.remove(list.indexOf(key));
        }

    }

    public boolean contains(int key) {
        return list.contains(key);
    }

    @Override
    public String toString() {
        return
                "myHashSet=" + list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyHashSet)) return false;
        MyHashSet myHashSet = (MyHashSet) o;
        return Objects.equals(list, myHashSet.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */