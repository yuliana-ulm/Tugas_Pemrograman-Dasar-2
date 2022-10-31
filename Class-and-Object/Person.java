class Person {
    String name;
    String desc;

    void learn(){
        System.out.println("Person sedang belajar");
    }

    void setNama(String nm){
        this.name = nm;
    }

    void setDesc(String desc){
        this.desc = desc;
    }

    String getNama(){
        return this.name;
    }

    String getDesc(){
        return this.desc;
    }
}