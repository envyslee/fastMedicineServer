
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfingBusinessCreditModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingBusinessCreditModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BusinessInfoBaseModel">
 *       &lt;sequence>
 *         &lt;element name="UsedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingBusinessCreditModel", propOrder = {
    "usedCredit"
})
public class SurfingBusinessCreditModel
    extends BusinessInfoBaseModel
{

    @XmlElement(name = "UsedCredit", required = true)
    protected BigDecimal usedCredit;

    /**
     * 获取usedCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedCredit() {
        return usedCredit;
    }

    /**
     * 设置usedCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedCredit(BigDecimal value) {
        this.usedCredit = value;
    }

}
