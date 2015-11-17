
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
 *         &lt;element name="DoAdvCloanInfoResult" type="{http://tempuri.org/}ResponseDataOfSurfingDoAdvCloanModel" minOccurs="0"/>
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
    "doAdvCloanInfoResult"
})
@XmlRootElement(name = "DoAdvCloanInfoResponse")
public class DoAdvCloanInfoResponse {

    @XmlElement(name = "DoAdvCloanInfoResult")
    protected ResponseDataOfSurfingDoAdvCloanModel doAdvCloanInfoResult;

    /**
     * 获取doAdvCloanInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfSurfingDoAdvCloanModel }
     *     
     */
    public ResponseDataOfSurfingDoAdvCloanModel getDoAdvCloanInfoResult() {
        return doAdvCloanInfoResult;
    }

    /**
     * 设置doAdvCloanInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfSurfingDoAdvCloanModel }
     *     
     */
    public void setDoAdvCloanInfoResult(ResponseDataOfSurfingDoAdvCloanModel value) {
        this.doAdvCloanInfoResult = value;
    }

}
