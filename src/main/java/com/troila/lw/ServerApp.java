package com.troila.lw;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServerApp {

	public static void main(String[] args) {

		new SpringApplicationBuilder(ServerApp.class).web(true).run(args);
		//同時，配置文件中對應的服務器名稱的slave1、slave2來源於hosts文件。
		//下面這種是為了應對配置文件中有多套信息時使用的，根據控制台輸入的spring.profiles名稱，決定啟動哪一個服務
		//比如application.yml中的slaveA或slaveB
		
		//同時注意的是，第一個啟動的那個服務，一定會有報錯，這是因為兩台服務器需要互相註冊，但第二個還沒有啟動的緣故。
//		Scanner scan = new Scanner(System.in);
//		String profiles = scan.nextLine();
//		new SpringApplicationBuilder(ServerApp.class).profiles(profiles).run(args);
	}

}
