class Student extends Person{
    int nis;

    void learn(){
        System.out.println("Student sedang belajar");
    }

    void setNis(int nis){
        this.nis = nis;
    }

    int getNis(){
        return this.nis;
    }
}