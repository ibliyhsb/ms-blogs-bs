package cl.duoc.ms_blogs_bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cl.duoc.ms_blogs_bs.client")
public class MsBlogsBsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBlogsBsApplication.class, args);
    }

}
package cl.duoc.ms_blogs_bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsBlogsBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBlogsBsApplication.class, args);
	}

}
