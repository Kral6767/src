package day31_CustomClass_Constructor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;
    public ArrayList<Tester>testerList=new ArrayList<>();
    public ArrayList<Developer>developersList=new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester tester){
        testerList.add(tester);
    }
    public void addTesters(Tester[]testers){
        testerList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testerList.removeIf(p-> p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        developersList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "ProductOwner='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developers=" + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*

	create a class called ScrumTeam
	           Attributes:
	                String ProductOwner, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fields ProductOwner, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  ProductOwner name, SM name, BA name
 */