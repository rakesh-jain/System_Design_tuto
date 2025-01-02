package creationpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
 private List<String> emplist;
 Employee(){
     emplist=new ArrayList<>();
 }
 Employee(List<String> list){
     this.emplist=list;
 }
 public void loadData(){
     emplist.add("Rakesh jain");
     emplist.add("Vishwas");
     emplist.add("Preetham");
 }
 public List<String> getEmplist(){
     return emplist;
 }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp=new ArrayList<>();
        for(String s:this.getEmplist()){
            temp.add(s);
        }
        return new Employee(temp);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee=new Employee();
        employee.loadData();
        Employee employee1=(Employee) employee.clone();
        Employee employee2=(Employee) employee.clone();
        List<String> list=employee1.getEmplist();
        list.add("Ramesh");
        List<String>list1=employee2.getEmplist();
        list.remove("Ramesh jain");
        System.out.println(employee.getEmplist());

        System.out.println(list);
        System.out.println(list1);

    }
}
