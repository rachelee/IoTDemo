package smarthome.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import smarthome.Model.Registration;
import smarthome.Service.RegistrationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

/**
 * Created by lixiaox5 on 6/27/15.
 */

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationRepository repository;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity<Registration> register(@RequestBody Registration reg){

        Date date = new Date();
        reg.setDate(date);
        repository.save(reg);
        return new ResponseEntity<Registration>(reg, HttpStatus.OK);

    }


}