
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfingDeductFillResultModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurfingDeductFillResultModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsClearCloan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfingDeductFillResultModel", propOrder = {
    "businessID",
    "fillResult",
    "errorInfo",
    "releaseAmt",
    "isClearCloan"
})
public class SurfingDeductFillResultModel {

    @XmlElement(name = "BusinessID")
    protected int businessID;
    @XmlElement(name = "FillResult")
    protected int fillResult;
    @XmlElement(name = "ErrorInfo")
    protected String errorInfo;
    @XmlElement(name = "ReleaseAmt", required = true)
    protected BigDecimal releaseAmt;
    @XmlElement(name = "IsClearCloan")
    protected boolean isClearCloan;

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

    /**
     * 获取fillResult属性的值。
     * 
     */
    public int getFillResult() {
        return fillResult;
    }

    /**
     * 设置fillResult属性的值。
     * 
     */
    public void setFillResult(int value) {
        this.fillResult = value;
    }

    /**
     * 获取errorInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * 设置errorInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

    /**
     * 获取releaseAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReleaseAmt() {
        return releaseAmt;
    }

    /**
     * 设置releaseAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReleaseAmt(BigDecimal value) {
        this.releaseAmt = value;
    }

    /**
     * 获取isClearCloan属性的值。
     * 
     */
    public boolean isIsClearCloan() {
        return isClearCloan;
    }

    /**
     * 设置isClearCloan属性的值。
     * 
     */
    public void setIsClearCloan(boolean value) {
        this.isClearCloan = value;
    }

}
