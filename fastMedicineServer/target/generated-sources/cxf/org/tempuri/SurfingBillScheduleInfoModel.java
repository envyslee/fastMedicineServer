
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfingBillScheduleInfoModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingBillScheduleInfoModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BillInfoBaseModel">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CompositeFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingBillScheduleInfoModel", propOrder = {
    "index",
    "compositeFee"
})
public class SurfingBillScheduleInfoModel
    extends BillInfoBaseModel
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "CompositeFee", required = true)
    protected BigDecimal compositeFee;

    /**
     * 获取index属性的值。
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * 获取compositeFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompositeFee() {
        return compositeFee;
    }

    /**
     * 设置compositeFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompositeFee(BigDecimal value) {
        this.compositeFee = value;
    }

}
