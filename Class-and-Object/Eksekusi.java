public class Eksekusi{
    public static void main(String[] args){
        Programmer objstudent = new Programmer();
        objstudent.setSkill("Ngoding");
        objstudent.setNama("Abdul");
        objstudent.setDesc("Mahasiswa Pilkom");

        System.out.println("Skill = " + objstudent.getSkill());
        System.out.println("Nama = " + objstudent.getNama());
        System.out.println("Deskripsi = " + objstudent.getDesc());
    }
}