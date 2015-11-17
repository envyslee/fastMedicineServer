
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
 *         &lt;element name="TYKKDInsertVBSResult" type="{http://tempuri.org/}ResponseDataOfWithdrawCash" minOccurs="0"/>
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
    "tykkdInsertVBSResult"
})
@XmlRootElement(name = "TYKKDInsertVBSResponse")
public class TYKKDInsertVBSResponse {

    @XmlElement(name = "TYKKDInsertVBSResult")
    protected ResponseDataOfWithdrawCash tykkdInsertVBSResult;

    /**
     * 获取tykkdInsertVBSResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfWithdrawCash }
     *     
     */
    public ResponseDataOfWithdrawCash getTYKKDInsertVBSResult() {
        return tykkdInsertVBSResult;
    }

    /**
     * 设置tykkdInsertVBSResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfWithdrawCash }
     *     
     */
    public void setTYKKDInsertVBSResult(ResponseDataOfWithdrawCash value) {
        this.tykkdInsertVBSResult = value;
    }

}
