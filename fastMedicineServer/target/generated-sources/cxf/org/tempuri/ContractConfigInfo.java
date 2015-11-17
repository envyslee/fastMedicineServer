
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContractConfigInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContractConfigInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanSide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceSide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuarSide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanSideNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceSideNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuarSideNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractConfigInfo", propOrder = {
    "loanSide",
    "serviceSide",
    "guarSide",
    "loanSideNo",
    "serviceSideNo",
    "guarSideNo"
})
public class ContractConfigInfo {

    @XmlElement(name = "LoanSide")
    protected String loanSide;
    @XmlElement(name = "ServiceSide")
    protected String serviceSide;
    @XmlElement(name = "GuarSide")
    protected String guarSide;
    @XmlElement(name = "LoanSideNo")
    protected String loanSideNo;
    @XmlElement(name = "ServiceSideNo")
    protected String serviceSideNo;
    @XmlElement(name = "GuarSideNo")
    protected String guarSideNo;

    /**
     * 获取loanSide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanSide() {
        return loanSide;
    }

    /**
     * 设置loanSide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanSide(String value) {
        this.loanSide = value;
    }

    /**
     * 获取serviceSide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSide() {
        return serviceSide;
    }

    /**
     * 设置serviceSide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSide(String value) {
        this.serviceSide = value;
    }

    /**
     * 获取guarSide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarSide() {
        return guarSide;
    }

    /**
     * 设置guarSide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarSide(String value) {
        this.guarSide = value;
    }

    /**
     * 获取loanSideNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanSideNo() {
        return loanSideNo;
    }

    /**
     * 设置loanSideNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanSideNo(String value) {
        this.loanSideNo = value;
    }

    /**
     * 获取serviceSideNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSideNo() {
        return serviceSideNo;
    }

    /**
     * 设置serviceSideNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSideNo(String value) {
        this.serviceSideNo = value;
    }

    /**
     * 获取guarSideNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarSideNo() {
        return guarSideNo;
    }

    /**
     * 设置guarSideNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarSideNo(String value) {
        this.guarSideNo = value;
    }

}
