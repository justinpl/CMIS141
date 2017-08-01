/**
 * File Name   : HeadPhone.java
 * Author      : Justin Luce
 * Created on  : 31-07-2017
 * Description : 
 **/
import java.awt.Color;

public class HeadPhone {
    // declare constants
    static final int HIGH = 3;
    static final int MEDIUM = 2;
    static final int LOW = 1;
    // declare variables
    private static int volume = MEDIUM;
    private static boolean pluggedIn = false;
    private static String manufacturer;
    private static String headPhoneModel;
    private static Color headPhoneColor = new Color(255,255,255);
    // constructor   
    public HeadPhone() {
        HeadPhone.volume = MEDIUM;
        HeadPhone.pluggedIn = false;
        HeadPhone.manufacturer = "";
        HeadPhone.headPhoneModel = "";
        HeadPhone.headPhoneColor = new Color(255,255,255);
    }
    public HeadPhone(int volume, boolean pluggedIn, String manufacturer, String headPhoneModel, int x, int y, int z) {
        HeadPhone.volume = volume;
        HeadPhone.pluggedIn = pluggedIn;
        HeadPhone.manufacturer = manufacturer;
        HeadPhone.headPhoneModel = headPhoneModel;
        HeadPhone.headPhoneColor = new Color(x,y,z);
    }
    
    // getter methods
    public static int getVolume() {
        return volume;
    } 
    public static boolean getPluggedIn() {
        return pluggedIn;
    } 
    public static String getManufacturer() {
        return manufacturer;
    } 
    public static String getHeadPhoneModel() {
        return headPhoneModel;
    } 
    public static Color getHeadPhoneColor() {
        return headPhoneColor;
    } 

    // setter methods
    public void changeVolume(int volume) {
        HeadPhone.volume = volume;
    }
    public void setPluggedIn(boolean pluggedIn) {
        HeadPhone.pluggedIn = pluggedIn;
    }
    public void setManufacturer(String manufacturer) {
        HeadPhone.manufacturer = manufacturer;
    }
    public void setHeadPhoneModel(String headPhoneModel) {
        HeadPhone.headPhoneModel = headPhoneModel;
    }
    public void setHeadPhoneColor(int x, int y, int z) {
        HeadPhone.headPhoneColor = new Color(x,y,z);
    }
    //to string method
    public String toString() {
        String str = ("Volume: " + HeadPhone.getVolume() +
        "\nPlugged In?: " + HeadPhone.getPluggedIn() +
        "\nManufacturer: " + HeadPhone.getManufacturer() +
        "\nModel: " + HeadPhone.getHeadPhoneModel() +
        "\nColor: " + HeadPhone.getHeadPhoneColor() +"\n");
        return str;
    }
    
}
