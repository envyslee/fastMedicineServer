
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdvCloanBaseModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdvCloanBaseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvCloanBaseModel", propOrder = {
    "businessID"
})
@XmlSeeAlso({
    SurfingDoAdvCloanModel.class,
    SurfingSinglePeriodAdvCloanModel.class,
    SurfingMultiplePeriodAdvCloanModel.class
})
public class AdvCloanBaseModel {

    @XmlElement(name = "BusinessID")
    protected int businessID;

    /**
     * 获取businessID属性的值。
     * 
     */
    public int getBusinessID() {
        return businessID;
    }

    /**
     * 设置businessID属性的值。
     * 
     */
    public void setBusinessID(int value) {
        this.businessID = value;
    }

}
