
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
 *         &lt;element name="QueryOrderDetailResult" type="{http://tempuri.org/}ResponseDataOfSurfingBusinessDetailsInfoModel" minOccurs="0"/>
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
    "queryOrderDetailResult"
})
@XmlRootElement(name = "QueryOrderDetailResponse")
public class QueryOrderDetailResponse {

    @XmlElement(name = "QueryOrderDetailResult")
    protected ResponseDataOfSurfingBusinessDetailsInfoModel queryOrderDetailResult;

    /**
     * 获取queryOrderDetailResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfSurfingBusinessDetailsInfoModel }
     *     
     */
    public ResponseDataOfSurfingBusinessDetailsInfoModel getQueryOrderDetailResult() {
        return queryOrderDetailResult;
    }

    /**
     * 设置queryOrderDetailResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfSurfingBusinessDetailsInfoModel }
     *     
     */
    public void setQueryOrderDetailResult(ResponseDataOfSurfingBusinessDetailsInfoModel value) {
        this.queryOrderDetailResult = value;
    }

}
