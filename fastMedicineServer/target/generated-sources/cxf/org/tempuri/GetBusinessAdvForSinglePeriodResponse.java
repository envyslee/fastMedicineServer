
package org.tempuri;

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
 *         &lt;element name="GetBusinessAdvForSinglePeriodResult" type="{http://tempuri.org/}ResponseData" minOccurs="0"/>
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
    "getBusinessAdvForSinglePeriodResult"
})
@XmlRootElement(name = "GetBusinessAdvForSinglePeriodResponse")
public class GetBusinessAdvForSinglePeriodResponse {

    @XmlElement(name = "GetBusinessAdvForSinglePeriodResult")
    protected ResponseData getBusinessAdvForSinglePeriodResult;

    /**
     * 获取getBusinessAdvForSinglePeriodResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseData }
     *     
     */
    public ResponseData getGetBusinessAdvForSinglePeriodResult() {
        return getBusinessAdvForSinglePeriodResult;
    }

    /**
     * 设置getBusinessAdvForSinglePeriodResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseData }
     *     
     */
    public void setGetBusinessAdvForSinglePeriodResult(ResponseData value) {
        this.getBusinessAdvForSinglePeriodResult = value;
    }

}
