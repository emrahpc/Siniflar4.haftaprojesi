
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



       Manager manager=new Manager(1,"Emre",5000,"arge",200);
       Developer developer=new Developer(2,"zehra",7000,"arge","400");

        System.out.println("manager info ");
        manager.Info();
        System.out.println("bonus para " + manager.CalculateBonus());
        System.out.println("Develepor info ");
        developer.Info();
        System.out.println("bonus para " + developer.CalculateBonus());

    }
}