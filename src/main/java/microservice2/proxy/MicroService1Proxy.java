package microservice2.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice1", url = "http://localhost:8000")
public interface MicroService1Proxy {
    @GetMapping("/")
    public String getResponseFromMicroservice1();
}
