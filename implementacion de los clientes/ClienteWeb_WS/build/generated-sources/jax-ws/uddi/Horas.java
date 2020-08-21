
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for horas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="horas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="h1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="h2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="h3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="h4" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="h5" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="h6" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="h7" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horas", propOrder = {
    "h1",
    "h2",
    "h3",
    "h4",
    "h5",
    "h6",
    "h7"
})
public class Horas {

    protected double h1;
    protected double h2;
    protected double h3;
    protected double h4;
    protected double h5;
    protected double h6;
    protected double h7;

    /**
     * Gets the value of the h1 property.
     * 
     */
    public double getH1() {
        return h1;
    }

    /**
     * Sets the value of the h1 property.
     * 
     */
    public void setH1(double value) {
        this.h1 = value;
    }

    /**
     * Gets the value of the h2 property.
     * 
     */
    public double getH2() {
        return h2;
    }

    /**
     * Sets the value of the h2 property.
     * 
     */
    public void setH2(double value) {
        this.h2 = value;
    }

    /**
     * Gets the value of the h3 property.
     * 
     */
    public double getH3() {
        return h3;
    }

    /**
     * Sets the value of the h3 property.
     * 
     */
    public void setH3(double value) {
        this.h3 = value;
    }

    /**
     * Gets the value of the h4 property.
     * 
     */
    public double getH4() {
        return h4;
    }

    /**
     * Sets the value of the h4 property.
     * 
     */
    public void setH4(double value) {
        this.h4 = value;
    }

    /**
     * Gets the value of the h5 property.
     * 
     */
    public double getH5() {
        return h5;
    }

    /**
     * Sets the value of the h5 property.
     * 
     */
    public void setH5(double value) {
        this.h5 = value;
    }

    /**
     * Gets the value of the h6 property.
     * 
     */
    public double getH6() {
        return h6;
    }

    /**
     * Sets the value of the h6 property.
     * 
     */
    public void setH6(double value) {
        this.h6 = value;
    }

    /**
     * Gets the value of the h7 property.
     * 
     */
    public double getH7() {
        return h7;
    }

    /**
     * Sets the value of the h7 property.
     * 
     */
    public void setH7(double value) {
        this.h7 = value;
    }

}
