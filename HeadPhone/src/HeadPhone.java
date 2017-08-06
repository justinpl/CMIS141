/**
 * File Name   : HeadPhone.java
 * Author      : Justin Luce
 * Created on  : 31-07-2017
 * Description : 
 **/
import java.awt.Color;

public class HeadPhone {
    // declare constants
    final int HIGH = 3;
    final int MEDIUM = 2;
    final int LOW = 1;
    // declare variables
    private int volume = MEDIUM;
    private boolean pluggedIn = false;
    private String manufacturer;
    private String headPhoneModel;
    private Color headPhoneColor = new Color(255,255,255);
    // constructor   
    public HeadPhone() {
        this.volume = MEDIUM;
        this.pluggedIn = false;
        this.manufacturer = "";
        this.headPhoneModel = "";
        this.headPhoneColor = new Color(255,255,255);
    }
    public HeadPhone(int volume, boolean pluggedIn, String manufacturer, String headPhoneModel, int x, int y, int z) {
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
        this.headPhoneModel = headPhoneModel;
        this.headPhoneColor = new Color(x,y,z);
    }
    
    // getter methods
    public int getVolume() {
        return volume;
    } 
    public boolean getPluggedIn() {
        return pluggedIn;
    } 
    public String getManufacturer() {
        return manufacturer;
    } 
    public String getHeadPhoneModel() {
        return headPhoneModel;
    } 
    public Color getHeadPhoneColor() {
        return headPhoneColor;
    } 

    // setter methods
    public void changeVolume(int volume) {
        this.volume = volume;
    }
    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setHeadPhoneModel(String headPhoneModel) {
        this.headPhoneModel = headPhoneModel;
    }
    public void setHeadPhoneColor(int x, int y, int z) {
        this.headPhoneColor = new Color(x,y,z);
    }
    //to string method
    public String toString() {
        String str = ("Volume: " + this.getVolume() +
        "\nPlugged In?: " + this.getPluggedIn() +
        "\nManufacturer: " + this.getManufacturer() +
        "\nModel: " + this.getHeadPhoneModel() +
        "\nColor: " + this.getHeadPhoneColor() +"\n");
        return str;
    }
    
}
