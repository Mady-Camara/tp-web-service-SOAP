package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addEtudiant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addEtudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etudiant" type="{http://service/}etudiant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEtudiant", propOrder = {
    "etudiant"
})
public class AddEtudiant {

    protected Etudiant etudiant;

    /**
     * Gets the value of the etudiant property.
     * 
     * @return
     *     possible object is
     *     {@link Etudiant }
     *     
     */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     * Sets the value of the etudiant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Etudiant }
     *     
     */
    public void setEtudiant(Etudiant value) {
        this.etudiant = value;
    }

}
