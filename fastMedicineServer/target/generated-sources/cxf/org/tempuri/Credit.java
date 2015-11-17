
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SURFING_ORANGE_LETTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SURFING_INNET_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SURFING_ISFAMILY_USER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SURFING_MONTH_CONSUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "surfingorangeletter",
    "surfinginnettime",
    "surfingisfamilyuser",
    "surfingmonthconsum"
})
@XmlRootElement(name = "Credit")
public class Credit {

    @XmlElement(name = "SURFING_ORANGE_LETTER")
    protected String surfingorangeletter;
    @XmlElement(name = "SURFING_INNET_TIME")
    protected String surfinginnettime;
    @XmlElement(name = "SURFING_ISFAMILY_USER")
    protected int surfingisfamilyuser;
    @XmlElement(name = "SURFING_MONTH_CONSUM")
    protected String surfingmonthconsum;

    /**
     * 获取surfingorangeletter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURFINGORANGELETTER() {
        return surfingorangeletter;
    }

    /**
     * 设置surfingorangeletter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURFINGORANGELETTER(String value) {
        this.surfingorangeletter = value;
    }

    /**
     * 获取surfinginnettime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURFINGINNETTIME() {
        return surfinginnettime;
    }

    /**
     * 设置surfinginnettime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURFINGINNETTIME(String value) {
        this.surfinginnettime = value;
    }

    /**
     * 获取surfingisfamilyuser属性的值。
     * 
     */
    public int getSURFINGISFAMILYUSER() {
        return surfingisfamilyuser;
    }

    /**
     * 设置surfingisfamilyuser属性的值。
     * 
     */
    public void setSURFINGISFAMILYUSER(int value) {
        this.surfingisfamilyuser = value;
    }

    /**
     * 获取surfingmonthconsum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURFINGMONTHCONSUM() {
        return surfingmonthconsum;
    }

    /**
     * 设置surfingmonthconsum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURFINGMONTHCONSUM(String value) {
        this.surfingmonthconsum = value;
    }

}
