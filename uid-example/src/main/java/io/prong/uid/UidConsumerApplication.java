package io.prong.uid;

import io.prong.uid.worker.DisposableWorkerIdAssigner;
import io.prong.uid.worker.WorkerIdAssigner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * 平台管理微服务
 * 
 * @author tangyz
 *
 */
@SpringBootApplication
public class UidConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UidConsumerApplication.class, args);
	}

	@Bean
	@ConditionalOnMissingBean
	WorkerIdAssigner workerIdAssigner() {
		return new DisposableWorkerIdAssigner();
	}
}
