/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Luchn1k
 */
public class Mobile implements Cloneable {

    protected String mobileName;
    protected String mobileBrand;
    protected String color;
    protected String network;
    protected String display;

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Mobile Name : " + (this.getMobileName() == null ? "N/A" : this.getMobileName()) + "\n"
                + "Mobile Brand : " + (this.getMobileBrand() == null ? "N/A" : this.getMobileBrand()) + "\n"
                + "Mobile Color : " + (this.getColor() == null ? "N/A" : this.getColor()) + "\n"
                + "Display : " + (this.getDisplay() == null ? "N/A" : this.getDisplay()) + "\n"
                + "Network : " + (this.getNetwork() == null ? "N/A" : this.getNetwork())+"\n\n";
    }

    @Override
    public Mobile clone() {
        Mobile mobile = new Mobile();

        mobile.setColor(this.getColor());
        mobile.setDisplay(this.getDisplay());
        mobile.setMobileBrand(this.getMobileBrand());
        mobile.setMobileName(this.getMobileName());
        mobile.setNetwork(this.getNetwork());

        return mobile;
    }

}
