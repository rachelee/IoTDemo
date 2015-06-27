package smarthome.Model;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by lixiaox5 on 6/27/15.
 */
public class Registration {
    @Id
    private long serialNum;
    private String manufacturer;
    private String modelNum;
    private String firmwareV;
    private int memoryLevel;
    private int batteryLevel;
    private String bootstrapURI;
    private String registrationURI;

    public Registration(long serialNum, String manufacturer, String modelNum, String firmwareV,
                     int memoryLevel, int batteryLevel) {
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
        this.modelNum = modelNum;
        this.firmwareV = firmwareV;
        this.memoryLevel = memoryLevel;
        this.batteryLevel = batteryLevel;
        this.bootstrapURI = bootstrapURI;
        this.registrationURI = registrationURI;
    }

    public long getSerialNum(){return serialNum;}
    public String getManufacturer(){return manufacturer;}
    public String getModelNum(){return modelNum;}
    public String getFirmwareV() {
        return firmwareV;
    }
    public int getMemoryLevel(){
        return memoryLevel;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public String getBootstrapURI() {
        return bootstrapURI;
    }
    public String getRegistrationURI() {
        return registrationURI;
    }
//    @Override
//    public String toString() {
//        return String.format(
//                "Appliance[id=%s, name='%s', description='%s']",
//                id, name, description);
//    }



}
