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
    private Date date;

    public Registration(){

    }
    public Registration(long serialNum, String manufacturer, String modelNum, String firmwareV,
                     int memoryLevel, int batteryLevel, Date date) {
        this.serialNum = serialNum;
        this.manufacturer = manufacturer;
        this.modelNum = modelNum;
        this.firmwareV = firmwareV;
        this.memoryLevel = memoryLevel;
        this.batteryLevel = batteryLevel;
        this.date = date;
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
    public int getBatteryLevel(){ return batteryLevel; }
    public Date getDate(){ return date;}

    public void setDate(Date date){
        this.date = date;
    }




}
