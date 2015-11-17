
package org.tempuri;

import java.math.BigDecimal;
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
 *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="surfingRescode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surfingResmsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surfingDeductkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="deductAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vbsDeductKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bid",
    "surfingRescode",
    "surfingResmsg",
    "surfingDeductkey",
    "requestAmt",
    "deductAmount",
    "vbsDeductKey",
    "requestTime"
})
@XmlRootElement(name = "FillCloanFin")
public class FillCloanFin {

    protected int bid;
    protected String surfingRescode;
    protected String surfingResmsg;
    protected String surfingDeductkey;
    @XmlElement(required = true)
    protected BigDecimal requestAmt;
    @XmlElement(required = true)
    protected BigDecimal deductAmount;
    protected String vbsDeductKey;
    protected String requestTime;

    /**
     * 获取bid属性的值。
     * 
     */
    public int getBid() {
        return bid;
    }

    /**
     * 设置bid属性的值。
     * 
     */
    public void setBid(int value) {
        this.bid = value;
    }

    /**
     * 获取surfingRescode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfingRescode() {
        return surfingRescode;
    }

    /**
     * 设置surfingRescode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfingRescode(String value) {
        this.surfingRescode = value;
    }

    /**
     * 获取surfingResmsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfingResmsg() {
        return surfingResmsg;
    }

    /**
     * 设置surfingResmsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfingResmsg(String value) {
        this.surfingResmsg = value;
    }

    /**
     * 获取surfingDeductkey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfingDeductkey() {
        return surfingDeductkey;
    }

    /**
     * 设置surfingDeductkey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfingDeductkey(String value) {
        this.surfingDeductkey = value;
    }

    /**
     * 获取requestAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestAmt() {
        return requestAmt;
    }

    /**
     * 设置requestAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestAmt(BigDecimal value) {
        this.requestAmt = value;
    }

    /**
     * 获取deductAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductAmount() {
        return deductAmount;
    }

    /**
     * 设置deductAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductAmount(BigDecimal value) {
        this.deductAmount = value;
    }

    /**
     * 获取vbsDeductKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbsDeductKey() {
        return vbsDeductKey;
    }

    /**
     * 设置vbsDeductKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbsDeductKey(String value) {
        this.vbsDeductKey = value;
    }

    /**
     * 获取requestTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTime() {
        return requestTime;
    }

    /**
     * 设置requestTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTime(String value) {
        this.requestTime = value;
    }

}
