
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SurfingSimpleBusinessInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingSimpleBusinessInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BusinessInfoBaseModel">
 *       &lt;sequence>
 *         &lt;element name="ApplyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ApplyTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingSimpleBusinessInfo", propOrder = {
    "applyTime",
    "applyTimeStr"
})
public class SurfingSimpleBusinessInfo
    extends BusinessInfoBaseModel
{

    @XmlElement(name = "ApplyTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyTime;
    @XmlElement(name = "ApplyTimeStr")
    protected String applyTimeStr;

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

}
