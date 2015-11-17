
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bid",
    "filetype"
})
@XmlRootElement(name = "TestDown")
public class TestDown {

    protected int bid;
    protected String filetype;

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
     * 获取filetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * 设置filetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiletype(String value) {
        this.filetype = value;
    }

}
