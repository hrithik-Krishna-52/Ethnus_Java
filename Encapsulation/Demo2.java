class Employee {

    private String emp_id = "007";
    private String emp_dept = "MI7";

    public String getId() {
        return emp_id;
    }

    public void setId(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getDept() {
        return emp_dept;
    }

    public void setDept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

}

public class Demo2 {  
    public static void main(String[] args) {
        Employee E = new Employee();
        String id = E.getId();
        String dept = E.getDept();
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Dept: " + dept);
    }
}