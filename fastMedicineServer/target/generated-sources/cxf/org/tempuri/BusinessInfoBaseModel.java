
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BusinessInfoBaseModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessInfoBaseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BusinessStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LoanPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LoanTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LoanTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInfoBaseModel", propOrder = {
    "businessID",
    "businessStatus",
    "amount",
    "loanPeriod",
    "loanTime",
    "loanTimeStr"
})
@XmlSeeAlso({
    SurfingBusinessCreditModel.class,
    SurfingSimpleBusinessInfo.class,
    SurfingBusinessDetailsInfoModel.class,
    SurfingDoingBusinessInfo.class
})
public class BusinessInfoBaseModel {

    @XmlElement(name = "BusinessID")
    protected int businessID;
    @XmlElement(name = "BusinessStatus")
    protected int businessStatus;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "LoanPeriod")
    protected int loanPeriod;
    @XmlElement(name = "LoanTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanTime;
    @XmlElement(name = "LoanTimeStr")
    protected String loanTimeStr;

    /**
     * 获取businessID属性的值。
     * 
     */
    public int getBusinessID() {
        return businessID;
    }

    /**
     * 设置businessID属性的值。
     * 
     */
    public void setBusinessID(int value) {
        this.businessID = value;
    }

    /**
     * 获取businessStatus属性的值。
     * 
     */
    public int getBusinessStatus() {
        return businessStatus;
    }

    /**
     * 设置businessStatus属性的值。
     * 
     */
    public void setBusinessStatus(int value) {
        this.businessStatus = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * 获取loanPeriod属性的值。
     * 
     */
    public int getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * 设置loanPeriod属性的值。
     * 
     */
    public void setLoanPeriod(int value) {
        this.loanPeriod = value;
    }

    /**
     * 获取loanTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanTime() {
        return loanTime;
    }

    /**
     * 设置loanTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanTime(XMLGregorianCalendar value) {
        this.loanTime = value;
    }

    /**
     * 获取loanTimeStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTimeStr() {
        return loanTimeStr;
    }

    /**
     * 设置loanTimeStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTimeStr(String value) {
        this.loanTimeStr = value;
    }

}
