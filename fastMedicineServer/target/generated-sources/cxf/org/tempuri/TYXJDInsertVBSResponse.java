
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
 *         &lt;element name="TYXJDInsertVBSResult" type="{http://tempuri.org/}ResponseDataOfWithdrawCash" minOccurs="0"/>
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
    "tyxjdInsertVBSResult"
})
@XmlRootElement(name = "TYXJDInsertVBSResponse")
public class TYXJDInsertVBSResponse {

    @XmlElement(name = "TYXJDInsertVBSResult")
    protected ResponseDataOfWithdrawCash tyxjdInsertVBSResult;

    /**
     * 获取tyxjdInsertVBSResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfWithdrawCash }
     *     
     */
    public ResponseDataOfWithdrawCash getTYXJDInsertVBSResult() {
        return tyxjdInsertVBSResult;
    }

    /**
     * 设置tyxjdInsertVBSResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfWithdrawCash }
     *     
     */
    public void setTYXJDInsertVBSResult(ResponseDataOfWithdrawCash value) {
        this.tyxjdInsertVBSResult = value;
    }

}
