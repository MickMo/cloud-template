package cn.tycoding.api.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 分布式监控中心 SpringBootAdmin 服务端
 *
 * @author tycoding
 * @date 2019-05-21
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class MonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
