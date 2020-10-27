package com.example.actionmode;


public class Item {

    private String name;//显示的选项名
    private boolean bo;//记录是否被选中

    public Item(){
        super();
    }


    public Item(String name, boolean bo){
        super();
        this.name = name;
        this.bo = bo;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isBo() {
        return bo;
    }
    public void setBo(boolean bo) {
        this.bo = bo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ",bo=" + bo +
                '}';
    }
}