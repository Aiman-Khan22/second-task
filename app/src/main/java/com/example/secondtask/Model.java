package com.example.secondtask;

import java.util.List;

public class Model {
    String a;
    private List<Model2> model2List;

    public Model(String a, List<Model2> model2List) {
        this.a = a;
        this.model2List = model2List;
    }

    public List<Model2> getModel2List() {
        return model2List;
    }

    public void setModel2List(List<Model2> model2List) {
        this.model2List = model2List;
    }


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Model(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Model{" +
                "a='" + a + '\'' +
                ", model2List=" + model2List +
                '}';
    }
}
