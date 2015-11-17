
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSurfingBusinessCreditModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSurfingBusinessCreditModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurfingBusinessCreditModel" type="{http://tempuri.org/}SurfingBusinessCreditModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSurfingBusinessCreditModel", propOrder = {
    "surfingBusinessCreditModel"
})
public class ArrayOfSurfingBusinessCreditModel {

    @XmlElement(name = "SurfingBusinessCreditModel", nillable = true)
    protected List<SurfingBusinessCreditModel> surfingBusinessCreditModel;

    /**
     * Gets the value of the surfingBusinessCreditModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfingBusinessCreditModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfingBusinessCreditModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfingBusinessCreditModel }
     * 
     * 
     */
    public List<SurfingBusinessCreditModel> getSurfingBusinessCreditModel() {
        if (surfingBusinessCreditModel == null) {
            surfingBusinessCreditModel = new ArrayList<SurfingBusinessCreditModel>();
        }
        return this.surfingBusinessCreditModel;
    }

}
