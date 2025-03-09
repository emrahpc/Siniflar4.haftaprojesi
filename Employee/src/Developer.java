public class Developer extends Employee{

    private String about;

    public Developer(){


    }

    public Developer(int id,String name,int Salary,String Department,String about){
        super(id, name, Salary, Department);
        this.about=about;
    }


    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public int CalculateBonus() {

        return super.CalculateBonus()*10/100;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("about "+ about);
    }
}
