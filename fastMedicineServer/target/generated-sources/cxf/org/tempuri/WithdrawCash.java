
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WithdrawCash complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WithdrawCash">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawCash", propOrder = {
    "bid",
    "contractNo"
})
public class WithdrawCash {

    @XmlElement(name = "Bid")
    protected int bid;
    @XmlElement(name = "ContractNo")
    protected String contractNo;

    /**
     * 获取bid属性的值。
     * 
     */
    public int getBid() {
        return bid;
    }

    /**
     * 设置bid属性的值。
     * 
     */
    public void setBid(int value) {
        this.bid = value;
    }

    /**
     * 获取contractNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置contractNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

}
