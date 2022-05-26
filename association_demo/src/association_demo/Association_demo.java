/**
 NAME: BINUYO SIMEON OLAJIDE
 DEPT: COMPUTER SCIENCE
 MATRIC NO: CSC/15/3045
 */package association_demo;
import java.util.ArrayList;
import java.util.List;
public class Association_demo {
 public static void main(String[] args) {
       Organization organization = new Organization();
    organization.setorganizationName("Google");
    Employee emp1 = new Employee();
    emp1.setEmployeeName("Moses");
    Employee emp2 = new Employee();
    emp2.setEmployeeName("Nancy");
       @SuppressWarnings("unchecked")
    List<Employee>emplist = new ArrayList();
    emplist.add(emp1);
    emplist.add(emp2);
   organization.setEmployees(emplist);
        System.out.println(organization.getEmployee()+" are employees of "
                +organization.getorganizationName());
 } }
class Employee{
private String employeename;
public String getEmployeeName(){
  return employeename;  }
public void setEmployeeName(String employeeName){
this.employeename = employeeName;}
public String toString(){
return employeename;}}
class Organization{
private String organizationName;
List<Employee>employees;
public String getorganizationName(){
return organizationName;}
public void setorganizationName(String organizationName){
this.organizationName = organizationName;}
public List<Employee>getEmployee(){
return employees;}
public void setEmployees(List <Employee> employees){
this.employees = employees;}}  

        
    
    

