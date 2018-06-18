package transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import transport.support.MediaTypeConstants;

@RestController
public class TransportController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaTypeConstants.APPLICATION_JSON_UTF8_VALUE)
    public String index() {
        ResponseEntity<String> test = restTemplate.getForEntity("http://telematics.oasa.gr/api/?act=webGetStops&p1=2042",
                String.class);
       // return "{\"test\" :\"Greetings from Spring Boot!\"}";
        return test.getBody();
    }

}