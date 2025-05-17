package dev.rohitahuja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.shell.command.annotation.CommandScan;

@ImportRuntimeHints(HintsRegistrar.class)
@CommandScan
@SpringBootApplication
public class SpringaiPgvectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaiPgvectorApplication.class, args);
	}

}
