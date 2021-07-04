package net.javaguides.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;

@Controller
public class EmployeeController 
{

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) 
{
		
		// create model 
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) 
	
{
		// save employee 
		employeeService.saveEmployee(employee);
		return "redirect:/";
}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) 
{
		
		// get employee
		Employee employee = employeeService.getEmployeeById(id);
		
		// set employee 
		model.addAttribute("employee", employee);
		return "update_employee";
}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) 
{
		
		//  delete employee
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}
	
	
	
}
