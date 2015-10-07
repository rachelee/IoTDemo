package smarthome.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import smarthome.Model.Registration;

/**
 * Created by lixiaox5 on 6/27/15.
 */
public interface RegistrationRepository extends MongoRepository<Registration, String>{
        Registration findBySerialNum(long serialNum);
}
