package smarthome.Model;
import org.springframework.data.annotation.Id;
/**
 * Created by lixiaox5 on 6/16/15.
 */

public class Appliance {
    @Id
    private long serialNum;
    private String manufacturer;
    private String modelNum;
    private String firmwareV;
    private int memoryLevel;
    private int batteryLevel;
    private String bootstrapURI;
    private String registrationURI;


    public Appliance(long serialNum, String manufacturer, String modelNum, String firmwareV,
                     int memoryLevel, int batteryLevel, String bootstrapURI, String registrationURI) {
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





}