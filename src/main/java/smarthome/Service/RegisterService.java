package smarthome.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiaox5 on 6/16/15.
 */
@Service
public class RegisterService {
    //private static RegisterService instance = null;
    private static Map<Long, String> appliances = new HashMap<>();

    public void putRecords(long id, String name){
        appliances.put(id, name);
    }
    public Map<Long, String> getRecords(){
        return appliances;
    }
}
