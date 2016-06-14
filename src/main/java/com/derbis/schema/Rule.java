//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 02:01:55 PM EDT 
//


package com.derbis.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" use="required" type="{urn:epcglobal:tdt:xsd:1}ModeList" /&gt;
 *       &lt;attribute name="inputFormat" use="required" type="{urn:epcglobal:tdt:xsd:1}InputFormatList" /&gt;
 *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="newFieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="characterSet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="padChar" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="padDir" type="{urn:epcglobal:tdt:xsd:1}PadDirectionList" /&gt;
 *       &lt;attribute name="bitPadDir" type="{urn:epcglobal:tdt:xsd:1}PadDirectionList" /&gt;
 *       &lt;attribute name="bitLength" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="decimalMinimum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="decimalMaximum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="function" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tableURL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tableParams" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tableXPath" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tableSQL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rule", namespace = "urn:epcglobal:tdt:xsd:1")
public class Rule {

    @XmlAttribute(name = "type", required = true)
    protected ModeList type;
    @XmlAttribute(name = "inputFormat", required = true)
    protected InputFormatList inputFormat;
    @XmlAttribute(name = "seq", required = true)
    protected BigInteger seq;
    @XmlAttribute(name = "newFieldName", required = true)
    protected String newFieldName;
    @XmlAttribute(name = "characterSet", required = true)
    protected String characterSet;
    @XmlAttribute(name = "padChar")
    protected String padChar;
    @XmlAttribute(name = "padDir")
    protected PadDirectionList padDir;
    @XmlAttribute(name = "bitPadDir")
    protected PadDirectionList bitPadDir;
    @XmlAttribute(name = "bitLength")
    protected BigInteger bitLength;
    @XmlAttribute(name = "decimalMinimum")
    protected String decimalMinimum;
    @XmlAttribute(name = "decimalMaximum")
    protected String decimalMaximum;
    @XmlAttribute(name = "length")
    protected String length;
    @XmlAttribute(name = "function", required = true)
    protected String function;
    @XmlAttribute(name = "tableURL")
    protected String tableURL;
    @XmlAttribute(name = "tableParams")
    protected String tableParams;
    @XmlAttribute(name = "tableXPath")
    protected String tableXPath;
    @XmlAttribute(name = "tableSQL")
    protected String tableSQL;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ModeList }
     *     
     */
    public ModeList getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeList }
     *     
     */
    public void setType(ModeList value) {
        this.type = value;
    }

    /**
     * Gets the value of the inputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormatList }
     *     
     */
    public InputFormatList getInputFormat() {
        return inputFormat;
    }

    /**
     * Sets the value of the inputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormatList }
     *     
     */
    public void setInputFormat(InputFormatList value) {
        this.inputFormat = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

    /**
     * Gets the value of the newFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFieldName() {
        return newFieldName;
    }

    /**
     * Sets the value of the newFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFieldName(String value) {
        this.newFieldName = value;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSet(String value) {
        this.characterSet = value;
    }

    /**
     * Gets the value of the padChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadChar() {
        return padChar;
    }

    /**
     * Sets the value of the padChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadChar(String value) {
        this.padChar = value;
    }

    /**
     * Gets the value of the padDir property.
     * 
     * @return
     *     possible object is
     *     {@link PadDirectionList }
     *     
     */
    public PadDirectionList getPadDir() {
        return padDir;
    }

    /**
     * Sets the value of the padDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link PadDirectionList }
     *     
     */
    public void setPadDir(PadDirectionList value) {
        this.padDir = value;
    }

    /**
     * Gets the value of the bitPadDir property.
     * 
     * @return
     *     possible object is
     *     {@link PadDirectionList }
     *     
     */
    public PadDirectionList getBitPadDir() {
        return bitPadDir;
    }

    /**
     * Sets the value of the bitPadDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link PadDirectionList }
     *     
     */
    public void setBitPadDir(PadDirectionList value) {
        this.bitPadDir = value;
    }

    /**
     * Gets the value of the bitLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBitLength() {
        return bitLength;
    }

    /**
     * Sets the value of the bitLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBitLength(BigInteger value) {
        this.bitLength = value;
    }

    /**
     * Gets the value of the decimalMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalMinimum() {
        return decimalMinimum;
    }

    /**
     * Sets the value of the decimalMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalMinimum(String value) {
        this.decimalMinimum = value;
    }

    /**
     * Gets the value of the decimalMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalMaximum() {
        return decimalMaximum;
    }

    /**
     * Sets the value of the decimalMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalMaximum(String value) {
        this.decimalMaximum = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the tableURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableURL() {
        return tableURL;
    }

    /**
     * Sets the value of the tableURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableURL(String value) {
        this.tableURL = value;
    }

    /**
     * Gets the value of the tableParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableParams() {
        return tableParams;
    }

    /**
     * Sets the value of the tableParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableParams(String value) {
        this.tableParams = value;
    }

    /**
     * Gets the value of the tableXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableXPath() {
        return tableXPath;
    }

    /**
     * Sets the value of the tableXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableXPath(String value) {
        this.tableXPath = value;
    }

    /**
     * Gets the value of the tableSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableSQL() {
        return tableSQL;
    }

    /**
     * Sets the value of the tableSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableSQL(String value) {
        this.tableSQL = value;
    }

}