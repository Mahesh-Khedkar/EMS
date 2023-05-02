package org.Jspiders.EmployeeInfo.Controller;

import org.Jspiders.EmployeeInfo.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class EmployeeController
{
    List<Employee> empList=new ArrayList<Employee>();

    @GetMapping("/")
    public String getWelcome()
    {
        return "welcome";
    }
    @GetMapping("/welcome")
    public String home()
    {
        return "welcome";
    }

    @GetMapping("/display")
    public String getStoreInfo(Model model)
    {
        model.addAttribute("records",empList);
        return "display";
    }

    @GetMapping("/addemployee")
    public String productform(Model model)
    {
        model.addAttribute("emp",new Employee());
        return "addemployee";
    }
    @PostMapping("/save")
    public String insertProduct(Employee emp)
    {
        empList.add(emp);
        return "redirect:/display";
    }

}
