
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfingBillInfoModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingBillInfoModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BillInfoBaseModel">
 *       &lt;sequence>
 *         &lt;element name="BillIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsOverdue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OverDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Capital" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="HandlingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Loandays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAdvCloan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsOutBill" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingBillInfoModel", propOrder = {
    "billIndex",
    "isOverdue",
    "overDueAmount",
    "capital",
    "handlingCharge",
    "interest",
    "loandays",
    "isAdvCloan",
    "isOutBill"
})
public class SurfingBillInfoModel
    extends BillInfoBaseModel
{

    @XmlElement(name = "BillIndex")
    protected int billIndex;
    @XmlElement(name = "IsOverdue")
    protected boolean isOverdue;
    @XmlElement(name = "OverDueAmount", required = true)
    protected BigDecimal overDueAmount;
    @XmlElement(name = "Capital", required = true)
    protected BigDecimal capital;
    @XmlElement(name = "HandlingCharge", required = true)
    protected BigDecimal handlingCharge;
    @XmlElement(name = "Interest", required = true)
    protected BigDecimal interest;
    @XmlElement(name = "Loandays")
    protected int loandays;
    @XmlElement(name = "IsAdvCloan")
    protected boolean isAdvCloan;
    @XmlElement(name = "IsOutBill")
    protected boolean isOutBill;

    /**
     * 获取billIndex属性的值。
     * 
     */
    public int getBillIndex() {
        return billIndex;
    }

    /**
     * 设置billIndex属性的值。
     * 
     */
    public void setBillIndex(int value) {
        this.billIndex = value;
    }

    /**
     * 获取isOverdue属性的值。
     * 
     */
    public boolean isIsOverdue() {
        return isOverdue;
    }

    /**
     * 设置isOverdue属性的值。
     * 
     */
    public void setIsOverdue(boolean value) {
        this.isOverdue = value;
    }

    /**
     * 获取overDueAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverDueAmount() {
        return overDueAmount;
    }

    /**
     * 设置overDueAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverDueAmount(BigDecimal value) {
        this.overDueAmount = value;
    }

    /**
     * 获取capital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * 设置capital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapital(BigDecimal value) {
        this.capital = value;
    }

    /**
     * 获取handlingCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHandlingCharge() {
        return handlingCharge;
    }

    /**
     * 设置handlingCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHandlingCharge(BigDecimal value) {
        this.handlingCharge = value;
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
     * 获取loandays属性的值。
     * 
     */
    public int getLoandays() {
        return loandays;
    }

    /**
     * 设置loandays属性的值。
     * 
     */
    public void setLoandays(int value) {
        this.loandays = value;
    }

    /**
     * 获取isAdvCloan属性的值。
     * 
     */
    public boolean isIsAdvCloan() {
        return isAdvCloan;
    }

    /**
     * 设置isAdvCloan属性的值。
     * 
     */
    public void setIsAdvCloan(boolean value) {
        this.isAdvCloan = value;
    }

    /**
     * 获取isOutBill属性的值。
     * 
     */
    public boolean isIsOutBill() {
        return isOutBill;
    }

    /**
     * 设置isOutBill属性的值。
     * 
     */
    public void setIsOutBill(boolean value) {
        this.isOutBill = value;
    }

}
