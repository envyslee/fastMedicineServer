
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
 * <p>BillInfoBaseModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BillInfoBaseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BillID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreateTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillInfoBaseModel", propOrder = {
    "businessID",
    "billID",
    "billAmount",
    "createTime",
    "createTimeStr",
    "billStatus"
})
@XmlSeeAlso({
    SurfingBillInfoModel.class,
    SurfingBillScheduleInfoModel.class
})
public class BillInfoBaseModel {

    @XmlElement(name = "BusinessID")
    protected int businessID;
    @XmlElement(name = "BillID")
    protected long billID;
    @XmlElement(name = "BillAmount", required = true)
    protected BigDecimal billAmount;
    @XmlElement(name = "CreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "CreateTimeStr")
    protected String createTimeStr;
    @XmlElement(name = "BillStatus")
    protected int billStatus;

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
     * 获取billID属性的值。
     * 
     */
    public long getBillID() {
        return billID;
    }

    /**
     * 设置billID属性的值。
     * 
     */
    public void setBillID(long value) {
        this.billID = value;
    }

    /**
     * 获取billAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    /**
     * 设置billAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillAmount(BigDecimal value) {
        this.billAmount = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * 获取createTimeStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTimeStr() {
        return createTimeStr;
    }

    /**
     * 设置createTimeStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimeStr(String value) {
        this.createTimeStr = value;
    }

    /**
     * 获取billStatus属性的值。
     * 
     */
    public int getBillStatus() {
        return billStatus;
    }

    /**
     * 设置billStatus属性的值。
     * 
     */
    public void setBillStatus(int value) {
        this.billStatus = value;
    }

}
