
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfingSinglePeriodAdvCloanModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingSinglePeriodAdvCloanModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}AdvCloanBaseModel">
 *       &lt;sequence>
 *         &lt;element name="Capital" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DayInterest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LoanDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HandlingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OtherCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "SurfingSinglePeriodAdvCloanModel", propOrder = {
    "capital",
    "dayInterest",
    "loanDays",
    "handlingCharge",
    "otherCharge",
    "doAdvRemainTimes"
})
public class SurfingSinglePeriodAdvCloanModel
    extends AdvCloanBaseModel
{

    @XmlElement(name = "Capital", required = true)
    protected BigDecimal capital;
    @XmlElement(name = "DayInterest", required = true)
    protected BigDecimal dayInterest;
    @XmlElement(name = "LoanDays")
    protected int loanDays;
    @XmlElement(name = "HandlingCharge", required = true)
    protected BigDecimal handlingCharge;
    @XmlElement(name = "OtherCharge", required = true)
    protected BigDecimal otherCharge;
    @XmlElement(name = "DoAdvRemainTimes")
    protected int doAdvRemainTimes;

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
     * 获取dayInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayInterest() {
        return dayInterest;
    }

    /**
     * 设置dayInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayInterest(BigDecimal value) {
        this.dayInterest = value;
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
     * 获取otherCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCharge() {
        return otherCharge;
    }

    /**
     * 设置otherCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCharge(BigDecimal value) {
        this.otherCharge = value;
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
