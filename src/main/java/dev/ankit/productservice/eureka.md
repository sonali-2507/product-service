### Add dependency
```xml
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
			<version>4.1.0</version>
		</dependency>
```
### Add configuration in application.properties
```properties
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
spring.application.name=productservice
```

### Add RestTemplateConfig class in config package
```java 
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
```
### Inject RestTemplate in FakeStoreProductService
```java
    @Autowired
    public FakeStoreProductService(FakeStoreProductClient fakeStoreProductClient,RedisTemplate redisTemplate,
                                   RestTemplate restTemplate) {
        this.fakeStoreProductClient = fakeStoreProductClient;
        this.redisTemplate = redisTemplate;
        this.restTemplate = restTemplate;
    }
```
### Run the application and check in Eureka dashboard
```url
### To create different instances of same application simultaneously
* ProductServiceApplication ->Edit configuration->Assign port number->top left click on copy(3 times)->change the ports no.s
* Run All the applications
* Check in Eureka dashboard ->localhost/8761
```
