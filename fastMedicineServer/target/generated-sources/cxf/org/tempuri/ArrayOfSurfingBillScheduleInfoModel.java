
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSurfingBillScheduleInfoModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSurfingBillScheduleInfoModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurfingBillScheduleInfoModel" type="{http://tempuri.org/}SurfingBillScheduleInfoModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSurfingBillScheduleInfoModel", propOrder = {
    "surfingBillScheduleInfoModel"
})
public class ArrayOfSurfingBillScheduleInfoModel {

    @XmlElement(name = "SurfingBillScheduleInfoModel", nillable = true)
    protected List<SurfingBillScheduleInfoModel> surfingBillScheduleInfoModel;

    /**
     * Gets the value of the surfingBillScheduleInfoModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfingBillScheduleInfoModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfingBillScheduleInfoModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfingBillScheduleInfoModel }
     * 
     * 
     */
    public List<SurfingBillScheduleInfoModel> getSurfingBillScheduleInfoModel() {
        if (surfingBillScheduleInfoModel == null) {
            surfingBillScheduleInfoModel = new ArrayList<SurfingBillScheduleInfoModel>();
        }
        return this.surfingBillScheduleInfoModel;
    }

}
