package com.godfrey;

import com.godfrey.dto.EmployeeDTO;
import com.godfrey.pojo.Department;
import com.godfrey.pojo.Employee;
import com.godfrey.pojo.User;
import com.godfrey.service.DepartmentService;
import com.godfrey.service.EmployeeService;
import com.godfrey.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    EmployeeService employeeService;

    @Test
    void contextLoads() throws SQLException {
        System.out.println("数据源>>>>>>" + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("连接>>>>>>>>>" + connection);
        System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());
        connection.close();
    }

    @Test
    public void test(){
        List<EmployeeDTO> employees = employeeService.selectAllEmployeeDTO();
        for (EmployeeDTO employee : employees) {
            System.out.println(employee);
        }
    }
    @Test
    public void test2(){
        Employee employee = employeeService.selectEmployeeById(1);
        System.out.println(employee);
    }

    @Test
    public void test3(){
        Employee employee = new Employee();
        employee.setId(6);
        employee.setEmployeeName("test");
        employee.setEmail("123@qq.com");
        employee.setDepartmentId(2);
        Date date = new Date(2020-02-02);
        employee.setDate(date);
        employeeService.addEmployee(employee);
        Employee employee1 = employeeService.selectEmployeeById(6);
        System.out.println(employee1);
        //Employee(id=6, employeeName=test, email=123@qq.com, gender=0, departmentId=2, date=1970-01-01)
    }

    @Test
    public void test4(){
        Employee employee = new Employee();
        employee.setId(6);
        employee.setEmployeeName("test");
        employee.setEmail("123@qq.com");
        employee.setDepartmentId(3);
        Date date = new Date(2020-02-02);
        employee.setDate(date);
        employeeService.updateEmployee(employee);
        Employee employee1 = employeeService.selectEmployeeById(6);
        System.out.println(employee1);
        //Employee(id=6, employeeName=test, email=123@qq.com, gender=0, departmentId=3, date=1970-01-01)
    }

    @Test
    public void test05(){
        employeeService.deleteEmployee(6);
    }

    @Autowired
    private UserService userService;
    @Test
    public void test06(){
        User admin = userService.selectPasswordByName("admin","123456");
        System.out.println(admin);
        //User(id=1, name=admin, password=123456)
    }

    @Autowired
    private DepartmentService departmentService;
    @Test
    public void test07(){
        List<Department> departments = departmentService.selectAllDepartment();
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
