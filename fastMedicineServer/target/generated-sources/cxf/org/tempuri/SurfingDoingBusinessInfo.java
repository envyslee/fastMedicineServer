
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SurfingDoingBusinessInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingDoingBusinessInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BusinessInfoBaseModel">
 *       &lt;sequence>
 *         &lt;element name="IsInstallment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CurrentPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RepayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NextBillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextBillDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsOverDue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingDoingBusinessInfo", propOrder = {
    "isInstallment",
    "currentPeriod",
    "repayAmount",
    "nextBillDate",
    "nextBillDateStr",
    "loanDays",
    "interest",
    "isOverDue"
})
public class SurfingDoingBusinessInfo
    extends BusinessInfoBaseModel
{

    @XmlElement(name = "IsInstallment")
    protected boolean isInstallment;
    @XmlElement(name = "CurrentPeriod")
    protected int currentPeriod;
    @XmlElement(name = "RepayAmount", required = true)
    protected BigDecimal repayAmount;
    @XmlElement(name = "NextBillDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextBillDate;
    @XmlElement(name = "NextBillDateStr")
    protected String nextBillDateStr;
    @XmlElement(name = "LoanDays")
    protected int loanDays;
    @XmlElement(name = "Interest", required = true)
    protected BigDecimal interest;
    @XmlElement(name = "IsOverDue")
    protected boolean isOverDue;

    /**
     * 获取isInstallment属性的值。
     * 
     */
    public boolean isIsInstallment() {
        return isInstallment;
    }

    /**
     * 设置isInstallment属性的值。
     * 
     */
    public void setIsInstallment(boolean value) {
        this.isInstallment = value;
    }

    /**
     * 获取currentPeriod属性的值。
     * 
     */
    public int getCurrentPeriod() {
        return currentPeriod;
    }

    /**
     * 设置currentPeriod属性的值。
     * 
     */
    public void setCurrentPeriod(int value) {
        this.currentPeriod = value;
    }

    /**
     * 获取repayAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    /**
     * 设置repayAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayAmount(BigDecimal value) {
        this.repayAmount = value;
    }

    /**
     * 获取nextBillDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextBillDate() {
        return nextBillDate;
    }

    /**
     * 设置nextBillDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextBillDate(XMLGregorianCalendar value) {
        this.nextBillDate = value;
    }

    /**
     * 获取nextBillDateStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextBillDateStr() {
        return nextBillDateStr;
    }

    /**
     * 设置nextBillDateStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextBillDateStr(String value) {
        this.nextBillDateStr = value;
    }

    /**
     * 获取loanDays属性的值。
     * 
     */
    public int getLoanDays() {
        return loanDays;
    }

    /**
     * 设置loanDays属性的值。
     * 
     */
    public void setLoanDays(int value) {
        this.loanDays = value;
    }

    /**
     * 获取interest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * 设置interest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }

    /**
     * 获取isOverDue属性的值。
     * 
     */
    public boolean isIsOverDue() {
        return isOverDue;
    }

    /**
     * 设置isOverDue属性的值。
     * 
     */
    public void setIsOverDue(boolean value) {
        this.isOverDue = value;
    }

}
