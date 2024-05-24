package com.careerit.sb;

import com.careerit.sb.jdbc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class LearningSpringBootApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private PlayerDao playerDao;

  public static void main(String[] args) {
    SpringApplication.run(LearningSpringBootApplication.class, args);
  }

	@Override
	public void run(String... args) throws Exception {
		//employeeDao.createTable();
		/*long id = employeeDao.addEmployee("Suresh", 55000);
		System.out.println("Employee id : "+id);*/

//		employeeDao.updateEmployee(3, 5000);

		Employee employee = employeeDao.getEmployeeById(3);

		System.out.println(employee);

		List<Player> players = playerDao.getPlayers("CSK", "Batsman", 1000000);
		players.forEach(System.out::println);

		List<TeamAmountStats> teamAmountStats = playerDao.getTeamAmountStats();
		teamAmountStats.forEach(System.out::println);



	}


}
