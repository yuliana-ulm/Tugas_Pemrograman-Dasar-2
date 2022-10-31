class Programmer extends Person{
    String skill;

    void coding(){
        System.out.println("Programmer sedang membuat project");
    }

    public void setSkill(String skill){
        this.skill = skill;
    }

    String getSkill(){
        return this.skill;
    }
}