package com.company.demo.endpoint;

import com.company.demo.document.Employee;
import com.company.demo.request.GradeRequest;
import com.company.demo.service.EmployeeMethodNameQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("employee")
@RequiredArgsConstructor
@RestController
public class EmployeeController {
    private final EmployeeMethodNameQueryService employeeService;

    @GetMapping
    public List<Employee> getEmployeeList(){
        return employeeService.getEmployeeList();
    }

    @GetMapping("/page")
    public List<Employee> getEmployeeList(@RequestParam int pageNo, @RequestParam int pageSize){
        return employeeService.getEmployeeList(pageNo, pageSize);
    }

    @GetMapping("/sorted")
    public List<Employee> getEmployeeListSorted(){
        return employeeService.getEmployeeListSorted();
    }

    @GetMapping("/page-sorted")
    public List<Employee> getEmployeeListPagedSorted(@RequestParam int pageNo, @RequestParam int pageSize){
        return employeeService.getEmployeeListSorted(pageNo, pageSize);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PostMapping(value = "/grades")
    public List<Employee> findGrades(@RequestBody GradeRequest gradeRequest){
/*        List<String> grades = new ArrayList<>();
        grades.add("Senior");
        grades.add("Consultant");*/
        return employeeService.findByGrades(gradeRequest.getGrades());
    }

    @GetMapping("/salary")
    public List<Employee> findByMinSalary(@RequestParam Integer salary){
      //  Integer salary = 3000;
        return employeeService.findBySalaryGraterThan(salary);
    }

    @GetMapping("/salary-grade")
    public List<Employee> findBySalaryOrGrade(@RequestParam Integer salary, @RequestParam String grade){
/*        Integer salary = 2000;
        String gradeName = "Consultant";*/
        return employeeService.findBySalaryOrGrade(salary, grade);
    }

}
