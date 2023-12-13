package com.musicplayer.musicplayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAspectJAutoProxy
public class MusicplayerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MusicplayerApplication.class, args);
	}
}