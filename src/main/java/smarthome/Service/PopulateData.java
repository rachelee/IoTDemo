package smarthome.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import smarthome.Model.Appliance;

/**
 * Created by lixiaox5 on 6/25/15.
 */
@SpringBootApplication
public class PopulateData implements CommandLineRunner{
    @Autowired
    private ApplianceRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(PopulateData.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();
        //Database
//        private String manufacturer;
//        private String modelNum;
//        private long serialNum;
//        private String firmwareV;
//        private int memoryLevel;
//        private int batteryLevel;
//        private String bootstrapURI;
//        private String registrationURI;

        // save a couple of customers
        repository.save(new Appliance(10000, "Samsung", "A1", "1.0a", 10, 10, "http://localhost:8080/bootstrap",
                "http://localhost:8080/registration"));

        repository.save(new Appliance(10001, "Samsung", "A2", "1.0a", 10, 10, "http://localhost:8080/bootstrap",
                "http://localhost:8080/registration"));

        repository.save(new Appliance(20001, "HP", "B1", "2.0a", 10, 10, "http://localhost:8080/bootstrap",
                "http://localhost:8080/registration"));

        repository.save(new Appliance(20002, "HP", "B1","3.0a", 10, 10, "http://localhost:8080/bootstrap",
                "http://localhost:8080/registration"));

        repository.save(new Appliance(30200, "GE", "A1","1.2a", 10, 10, "http://localhost:8080/bootstrap",
                "http://localhost:8080/registration"));
    }
}
