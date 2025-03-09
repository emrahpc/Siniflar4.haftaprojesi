public class Manager extends Employee{

    private int Teamsize;

    public Manager(){


    }
    public Manager(int id,String name,int Salary,String Department,int Teamsize){
        super( id, name, Salary,Department);
        this.Teamsize=Teamsize;

    }



    public int getTeamsize() {
        return Teamsize;
    }

    public void setTeamsize(int teamsize) {
        Teamsize = teamsize;
    }

    @Override
    public int CalculateBonus() {
        return super.CalculateBonus() *20/100;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println( "teamsize " +Teamsize);
    }
}
