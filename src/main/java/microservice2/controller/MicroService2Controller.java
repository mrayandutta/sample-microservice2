package microservice2.controller;

import microservice2.proxy.MicroService1Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MicroService2Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(MicroService2Controller.class);

    @Autowired
    private MicroService1Proxy proxy;

    @GetMapping("/microservice2")
    public String getResponseFromMicroService1() {

        LOGGER.info("Received Request in getResponseFromMicroService1 ...............");
        String response = proxy.getResponseFromMicroservice1();
        String finalResponse = "From micro service 2 ...From micro service1="+response;
        return finalResponse;
    }

}
