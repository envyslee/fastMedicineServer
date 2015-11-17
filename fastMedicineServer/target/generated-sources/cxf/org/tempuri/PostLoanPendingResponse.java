
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
 *         &lt;element name="PostLoanPendingResult" type="{http://tempuri.org/}ResponseData" minOccurs="0"/>
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
    "postLoanPendingResult"
})
@XmlRootElement(name = "PostLoanPendingResponse")
public class PostLoanPendingResponse {

    @XmlElement(name = "PostLoanPendingResult")
    protected ResponseData postLoanPendingResult;

    /**
     * 获取postLoanPendingResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseData }
     *     
     */
    public ResponseData getPostLoanPendingResult() {
        return postLoanPendingResult;
    }

    /**
     * 设置postLoanPendingResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseData }
     *     
     */
    public void setPostLoanPendingResult(ResponseData value) {
        this.postLoanPendingResult = value;
    }

}
