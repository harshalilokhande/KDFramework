package com.testingshastra.stepdefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterization {

	int x, y, result;
	String string1, string2;
	Double f1, f2, addition;
	List<Integer> numbers;

	@Then("print result")
	public void print_result() {
		System.out.println("Result= " + result);
	}

	@When("I add them")
	public void m2() {
		result= x+y;
	}

	@Given("I have integers {int} and {int}")
	public void ihave_and(Integer int1, Integer int2) {
		x = int1;
		y = int2;

	}

	@Given("I have {word} and {word}")
	public void i_have_and(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}

	@Then("print them in alphabetic order")
	public void print_them_in_alphabetic_order() {
		if (string1.compareTo(string2) == 0) {
			System.out.println("Strings are identical");
		} else if (string1.compareTo(string2) > 0) {
			System.out.println(string1 + " " + string2);
		} else {
			System.out.println(string2 + " " + string1);
		}

	}

	@Given("I have two float numbers {double} and {double}") // we can write float or double also
	public void i_have_two_float_numbers_and(Double double1, Double double2) {
		this.f1 = double1;
		this.f2 = double2;
	}

	@Then("add both float numbers")
	public void add_both_float_numbers() {
		addition = f1 + f2;
	}

	@Then("Print float result")
	public void print_float_result() {
		System.out.println(addition);
	}

	@Given("I have following numbers:")
	public void i_have_following_numbers(io.cucumber.datatable.DataTable dataTable) {

		numbers = dataTable.asList(Integer.class);
	}

	@Then("print all numbers from list")
	public void Print_all_numbers_from_list() {
		for (Integer integer : numbers) {

			System.out.println(integer);
		}
	}
	@Given("I have following table:")
	public void i_have_following_table(DataTable Table) {
		System.out.println(Table); //one way to print table
		Map m=Table.asMap(String.class, List.class);//get all list in table
		System.out.println("Map: "+m);
		List l = Table.row(0);//get perticular row
		System.out.println("first row:"+l);
	}

	@Then("print all numbers from table")
	public void print_all_numbers_from_table() {
		
	}

	@Then("Verify if result is prime")
	public void verify_if_result_is_prime() {
		int count = 0;
		for (int i =1; i<result; i++) {
			if (result%i== 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Result is not prime: " + result);
		} else {
			System.out.println("Result is prime: " + result);
		}
	}
	@Given("I have two numbers from {int}")
	public void readNumbersFromExcel(int rowNum) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/Feature/numbers.xlsx");
		try (XSSFWorkbook book = new XSSFWorkbook(fis)) {
			Sheet sheet = book.getSheetAt(0);
			x=(int)sheet.getRow(rowNum).getCell(1).getNumericCellValue();
			y=(int)sheet.getRow(rowNum).getCell(2).getNumericCellValue();
		}

	}
}
