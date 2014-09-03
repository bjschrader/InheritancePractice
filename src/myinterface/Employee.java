package myinterface;

/**
 *
 * @author schra_000
 */
public interface Employee {



    public abstract String getFirstName();
    public abstract void setFirstName(String firstName); 

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    //public abstract double getWage();

    public abstract int getEmpNum();

    public abstract void setEmpNum(int empNum);

    public abstract String getEmpName();

    public abstract void setEmpName(String empName);

}
