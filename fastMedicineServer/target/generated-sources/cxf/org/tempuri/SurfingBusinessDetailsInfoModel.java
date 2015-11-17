
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SurfingBusinessDetailsInfoModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingBusinessDetailsInfoModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BusinessInfoBaseModel">
 *       &lt;sequence>
 *         &lt;element name="ApplyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ApplyTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepayBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RepayBeginDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepayEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RepayEndDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClearLoanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ClearLoanDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingBusinessDetailsInfoModel", propOrder = {
    "applyTime",
    "applyTimeStr",
    "cardNo",
    "repayBeginDate",
    "repayBeginDateStr",
    "repayEndDate",
    "repayEndDateStr",
    "clearLoanDate",
    "clearLoanDateStr"
})
public class SurfingBusinessDetailsInfoModel
    extends BusinessInfoBaseModel
{

    @XmlElement(name = "ApplyTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyTime;
    @XmlElement(name = "ApplyTimeStr")
    protected String applyTimeStr;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "RepayBeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repayBeginDate;
    @XmlElement(name = "RepayBeginDateStr")
    protected String repayBeginDateStr;
    @XmlElement(name = "RepayEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repayEndDate;
    @XmlElement(name = "RepayEndDateStr")
    protected String repayEndDateStr;
    @XmlElement(name = "ClearLoanDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearLoanDate;
    @XmlElement(name = "ClearLoanDateStr")
    protected String clearLoanDateStr;

    /**
     * 获取applyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyTime() {
        return applyTime;
    }

    /**
     * 设置applyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyTime(XMLGregorianCalendar value) {
        this.applyTime = value;
    }

    /**
     * 获取applyTimeStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTimeStr() {
        return applyTimeStr;
    }

    /**
     * 设置applyTimeStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTimeStr(String value) {
        this.applyTimeStr = value;
    }

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
     * 获取repayBeginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepayBeginDate() {
        return repayBeginDate;
    }

    /**
     * 设置repayBeginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepayBeginDate(XMLGregorianCalendar value) {
        this.repayBeginDate = value;
    }

    /**
     * 获取repayBeginDateStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayBeginDateStr() {
        return repayBeginDateStr;
    }

    /**
     * 设置repayBeginDateStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayBeginDateStr(String value) {
        this.repayBeginDateStr = value;
    }

    /**
     * 获取repayEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepayEndDate() {
        return repayEndDate;
    }

    /**
     * 设置repayEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepayEndDate(XMLGregorianCalendar value) {
        this.repayEndDate = value;
    }

    /**
     * 获取repayEndDateStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayEndDateStr() {
        return repayEndDateStr;
    }

    /**
     * 设置repayEndDateStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayEndDateStr(String value) {
        this.repayEndDateStr = value;
    }

    /**
     * 获取clearLoanDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClearLoanDate() {
        return clearLoanDate;
    }

    /**
     * 设置clearLoanDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClearLoanDate(XMLGregorianCalendar value) {
        this.clearLoanDate = value;
    }

    /**
     * 获取clearLoanDateStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearLoanDateStr() {
        return clearLoanDateStr;
    }

    /**
     * 设置clearLoanDateStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearLoanDateStr(String value) {
        this.clearLoanDateStr = value;
    }

}
