
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
 *         &lt;element name="GetBusinessBillInfoResult" type="{http://tempuri.org/}ResponseData" minOccurs="0"/>
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
    "getBusinessBillInfoResult"
})
@XmlRootElement(name = "GetBusinessBillInfoResponse")
public class GetBusinessBillInfoResponse {

    @XmlElement(name = "GetBusinessBillInfoResult")
    protected ResponseData getBusinessBillInfoResult;

    /**
     * 获取getBusinessBillInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseData }
     *     
     */
    public ResponseData getGetBusinessBillInfoResult() {
        return getBusinessBillInfoResult;
    }

    /**
     * 设置getBusinessBillInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseData }
     *     
     */
    public void setGetBusinessBillInfoResult(ResponseData value) {
        this.getBusinessBillInfoResult = value;
    }

}
