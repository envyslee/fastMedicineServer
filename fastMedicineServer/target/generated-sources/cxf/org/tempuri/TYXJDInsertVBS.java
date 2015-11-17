
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyLoanMoney" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="cashCardBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formalitiesMoney" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dayRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="isByStages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "name",
    "identityNo",
    "mobile",
    "applyLoanMoney",
    "cashCardBank",
    "cashCardNo",
    "loanPeriod",
    "formalitiesMoney",
    "createTime",
    "monthlyInterestRate",
    "dayRate",
    "isByStages",
    "orderId"
})
@XmlRootElement(name = "TYXJDInsertVBS")
public class TYXJDInsertVBS {

    protected String name;
    protected String identityNo;
    protected String mobile;
    @XmlElement(required = true)
    protected BigDecimal applyLoanMoney;
    protected String cashCardBank;
    protected String cashCardNo;
    protected int loanPeriod;
    @XmlElement(required = true)
    protected BigDecimal formalitiesMoney;
    protected String createTime;
    @XmlElement(required = true)
    protected BigDecimal monthlyInterestRate;
    @XmlElement(required = true)
    protected BigDecimal dayRate;
    protected int isByStages;
    protected String orderId;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取identityNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * 设置identityNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityNo(String value) {
        this.identityNo = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取applyLoanMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApplyLoanMoney() {
        return applyLoanMoney;
    }

    /**
     * 设置applyLoanMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApplyLoanMoney(BigDecimal value) {
        this.applyLoanMoney = value;
    }

    /**
     * 获取cashCardBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardBank() {
        return cashCardBank;
    }

    /**
     * 设置cashCardBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardBank(String value) {
        this.cashCardBank = value;
    }

    /**
     * 获取cashCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCardNo() {
        return cashCardNo;
    }

    /**
     * 设置cashCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCardNo(String value) {
        this.cashCardNo = value;
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
     * 获取formalitiesMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFormalitiesMoney() {
        return formalitiesMoney;
    }

    /**
     * 设置formalitiesMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFormalitiesMoney(BigDecimal value) {
        this.formalitiesMoney = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取monthlyInterestRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    /**
     * 设置monthlyInterestRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyInterestRate(BigDecimal value) {
        this.monthlyInterestRate = value;
    }

    /**
     * 获取dayRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayRate() {
        return dayRate;
    }

    /**
     * 设置dayRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayRate(BigDecimal value) {
        this.dayRate = value;
    }

    /**
     * 获取isByStages属性的值。
     * 
     */
    public int getIsByStages() {
        return isByStages;
    }

    /**
     * 设置isByStages属性的值。
     * 
     */
    public void setIsByStages(int value) {
        this.isByStages = value;
    }

    /**
     * 获取orderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

}
