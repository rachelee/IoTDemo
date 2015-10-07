package smarthome.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import smarthome.Model.Appliance;
import smarthome.Service.ApplianceRepository;


/**
 * Created by lixiaox5 on 6/25/15.
 */
@RestController
public class BootstrapController{
    @Autowired
    private ApplianceRepository repository;

    @RequestMapping(value="/bootstrap", method = RequestMethod.GET)
    public Appliance bootstrap(@RequestParam(value="serialNum", defaultValue= "10000") long serialNum) {

        // fetch an individual customer
        System.out.println("Appliance found with findBySerialNum():");
        System.out.println("--------------------------------");
        Appliance res = repository.findBySerialNum(serialNum);


        return res;

    }
}
