class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }

    public Object cloneObject() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class ClonedDemo 
{
    public static void main(String arg[])
    {
        try{
            Employee eobj1 = new Employee(100,"Rahul",11000);
            Employee eobj2 = (Employee)eobj1.cloneObject();
            
            System.out.println("Name of first employee : "+eobj1.Name);
            System.out.println("Name of Second employee : "+eobj2.Name);
            
            System.out.println("Salary of first employee : "+eobj1.Salary);
            System.out.println("Salary of Second employee : "+eobj2.Salary);

            eobj1.Name="Sagar";

            System.out.println("Name of first employee : "+eobj1.Name);
            System.out.println("Name of Second employee : "+eobj2.Name);
        }
        catch(Exception obj)
        {}
    }
}
