
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
 *         &lt;element name="GetContractConfigInfoResult" type="{http://tempuri.org/}ResponseDataOfContractConfigInfo" minOccurs="0"/>
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
    "getContractConfigInfoResult"
})
@XmlRootElement(name = "GetContractConfigInfoResponse")
public class GetContractConfigInfoResponse {

    @XmlElement(name = "GetContractConfigInfoResult")
    protected ResponseDataOfContractConfigInfo getContractConfigInfoResult;

    /**
     * 获取getContractConfigInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfContractConfigInfo }
     *     
     */
    public ResponseDataOfContractConfigInfo getGetContractConfigInfoResult() {
        return getContractConfigInfoResult;
    }

    /**
     * 设置getContractConfigInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfContractConfigInfo }
     *     
     */
    public void setGetContractConfigInfoResult(ResponseDataOfContractConfigInfo value) {
        this.getContractConfigInfoResult = value;
    }

}
