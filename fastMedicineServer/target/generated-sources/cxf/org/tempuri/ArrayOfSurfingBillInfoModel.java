
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSurfingBillInfoModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSurfingBillInfoModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurfingBillInfoModel" type="{http://tempuri.org/}SurfingBillInfoModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSurfingBillInfoModel", propOrder = {
    "surfingBillInfoModel"
})
public class ArrayOfSurfingBillInfoModel {

    @XmlElement(name = "SurfingBillInfoModel", nillable = true)
    protected List<SurfingBillInfoModel> surfingBillInfoModel;

    /**
     * Gets the value of the surfingBillInfoModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfingBillInfoModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfingBillInfoModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfingBillInfoModel }
     * 
     * 
     */
    public List<SurfingBillInfoModel> getSurfingBillInfoModel() {
        if (surfingBillInfoModel == null) {
            surfingBillInfoModel = new ArrayList<SurfingBillInfoModel>();
        }
        return this.surfingBillInfoModel;
    }

}
