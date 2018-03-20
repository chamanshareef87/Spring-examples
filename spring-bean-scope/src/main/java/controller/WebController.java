package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bean.Customer;

@RestController
public class WebController {
	@Autowired
	private Customer customer;
 
	@RequestMapping("/name")
	public String name() {
		String result = customer.getCustomerName();
		customer.setCustomerName("Jhon", "Smith");
		System.out.println("Singleton demo");
		System.out.println("As we have a single bean, if we change value then actual bean value gets changes");
		System.out.println("init Data: " + result + "|-----| modified Data: " + customer.getCustomerName());
		return "init Data: " + result + "|-----| modified Data: " + customer.getCustomerName();
	}
 
	@RequestMapping("/namecheck")
	public String namecheck() {
		return "check Data: " + customer.getCustomerName();
	}
 
	@RequestMapping("/language")
	public String language() {
		String result = customer.getCustomerLanguage();
		System.out.println("initial lang");
		customer.setCustomerLanguage("French"); //this command creates new instance of Language
		System.out.println("Lang updated to french");
		return "init Data: " + result + "|-----| modified Data: " + customer.setCustomerLanguage("French");
	}
 
	@RequestMapping("/languagecheck")
	public String languagecheck() {
		System.out.println("Each time you request a bean it will be created a fresh and returned back");
		return "check Data: " + customer.getCustomerLanguage();
	}
 
	@RequestMapping("/address")
	public String address() {
		String result = customer.getCustomerAddress();
		customer.setCustomerAddress("EU");
		return "init Data: " + result + "|-----| modified Data: " + customer.getCustomerAddress();
	}
 
	@RequestMapping("/addresscheck")
	public String addresscheck() {
		return "check Data: " + customer.getCustomerAddress();
	}
	
	@RequestMapping("/age")
	public String age() {
		String result = customer.getCustomerAge();
		customer.setCustomerAge("25");
		return "init Data: " + result + "|-----| modified Data: " + customer.getCustomerAge();
	}
 
	@RequestMapping("/agecheck")
	public String agecheck() {
		return "check Data: " + customer.getCustomerAge();
	}
	
}
