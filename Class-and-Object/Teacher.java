class Teacher extends Person{
    int nip;
    String mapel;

    void teaching(){
        System.out.println("Teacher sedang mengajar");
    }

    void setNip(int nip){
        this.nip = nip;
    }

    void setMapel(String mapel){
        this.mapel = mapel;
    }

    int getNip(){
        return this.nip;
    }

    String getMapel(){
        return this.mapel;
    }
}