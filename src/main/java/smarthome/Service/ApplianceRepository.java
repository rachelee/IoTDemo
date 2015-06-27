package smarthome.Service;

import smarthome.Model.Appliance;
//import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by lixiaox5 on 6/25/15.
 */
public interface ApplianceRepository extends MongoRepository<Appliance, String>{
    Appliance findBySerialNum(long serialNum);
    //public List<Appliance> findByLastName(String lastName);
}
