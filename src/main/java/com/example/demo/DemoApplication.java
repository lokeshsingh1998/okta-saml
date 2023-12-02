package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		//testConnection();
		SpringApplication.run(DemoApplication.class, args);
	}

//	public static void testConnection() {
//		try
//        {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
//            Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.29.58.53:56412;databaseName=BMS_UAT;instanceName=SQL",
//            		"sa","Mind@1234");
//            System.out.println("test");
//            Statement sta = conn.createStatement();
//            String Sql = "select 1";
//            ResultSet rs = sta.executeQuery(Sql);
//
//            System.out.println(rs.next());
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//	}
	
	
}
