
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfingMultiplePeriodAdvCloanModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingMultiplePeriodAdvCloanModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}AdvCloanBaseModel">
 *       &lt;sequence>
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidualCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrentInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OverDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EconomicalInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="HandlingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ProceduresAmout" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DoAdvRemainTimes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingMultiplePeriodAdvCloanModel", propOrder = {
    "cardNo",
    "bankName",
    "residualCapital",
    "currentInterest",
    "overDueAmount",
    "economicalInterest",
    "handlingCharge",
    "proceduresAmout",
    "doAdvRemainTimes"
})
public class SurfingMultiplePeriodAdvCloanModel
    extends AdvCloanBaseModel
{

    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "ResidualCapital", required = true)
    protected BigDecimal residualCapital;
    @XmlElement(name = "CurrentInterest", required = true)
    protected BigDecimal currentInterest;
    @XmlElement(name = "OverDueAmount", required = true)
    protected BigDecimal overDueAmount;
    @XmlElement(name = "EconomicalInterest", required = true)
    protected BigDecimal economicalInterest;
    @XmlElement(name = "HandlingCharge", required = true)
    protected BigDecimal handlingCharge;
    @XmlElement(name = "ProceduresAmout", required = true)
    protected BigDecimal proceduresAmout;
    @XmlElement(name = "DoAdvRemainTimes")
    protected int doAdvRemainTimes;

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取bankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置bankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * 获取residualCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidualCapital() {
        return residualCapital;
    }

    /**
     * 设置residualCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidualCapital(BigDecimal value) {
        this.residualCapital = value;
    }

    /**
     * 获取currentInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInterest() {
        return currentInterest;
    }

    /**
     * 设置currentInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInterest(BigDecimal value) {
        this.currentInterest = value;
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
     * 获取economicalInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEconomicalInterest() {
        return economicalInterest;
    }

    /**
     * 设置economicalInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEconomicalInterest(BigDecimal value) {
        this.economicalInterest = value;
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
     * 获取proceduresAmout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProceduresAmout() {
        return proceduresAmout;
    }

    /**
     * 设置proceduresAmout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProceduresAmout(BigDecimal value) {
        this.proceduresAmout = value;
    }

    /**
     * 获取doAdvRemainTimes属性的值。
     * 
     */
    public int getDoAdvRemainTimes() {
        return doAdvRemainTimes;
    }

    /**
     * 设置doAdvRemainTimes属性的值。
     * 
     */
    public void setDoAdvRemainTimes(int value) {
        this.doAdvRemainTimes = value;
    }

}
