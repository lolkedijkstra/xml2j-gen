package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * CreditTransferTransaction22 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class CreditTransferTransaction22 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CreditTransferTransaction22.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CreditTransferTransaction22(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CreditTransferTransaction22.
	 */
	static class Allocator implements TypeAllocator<CreditTransferTransaction22> {
		/**
		 * method for getting a new instance of type CreditTransferTransaction22.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CreditTransferTransaction22 newInstance(String elementName, ComplexDataType parent) {
			return new CreditTransferTransaction22(elementName, parent);
		}
	}
	
	/** instance of allocator class for this data class. */
	private static Allocator allocator = new Allocator();
	
	/**
	 * Get Allocator for this data class.
	 * This method is used by the handler class.
	 *
	 * @return instance of Allocator
	 */
	static public Allocator getAllocator() {
		return allocator;
	}
	
  	
  
	/** element item for PmtId element. 
	 *  @serial
	 */	
	private PaymentIdentification1 m_pmtId = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation19 m_pmtTpInf = null;
	
	/** element item for Amt element. 
	 *  @serial
	 */	
	private AmountType4Choice m_amt = null;
	
	/** element item for ChrgBr element. 
	 *  @serial
	 */	
	private String m_chrgBr = null;
	
	/** element item for ChqInstr element. 
	 *  @serial
	 */	
	private Cheque7 m_chqInstr = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
	/** element item for IntrmyAgt1 element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_intrmyAgt1 = null;
	
	/** element item for IntrmyAgt2 element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_intrmyAgt2 = null;
	
	/** element item for IntrmyAgt3 element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_intrmyAgt3 = null;
	
	/** element item for CdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_cdtrAgt = null;
	
	/** element item for Cdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtr = null;
	
	/** element item for CdtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAcct = null;
	
	/** element item for UltmtCdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtCdtr = null;
	
	/** list of InstrForCdtrAgt element. 
	 *  @serial
	 */	
	private List<InstructionForCreditorAgent1> m_instrForCdtrAgtList = new ArrayList<InstructionForCreditorAgent1>();
	
	/** element item for Purp element. 
	 *  @serial
	 */	
	private Purpose2Choice m_purp = null;
	
	/** list of RgltryRptg element. 
	 *  @serial
	 */	
	private List<RegulatoryReporting3> m_rgltryRptgList = new ArrayList<RegulatoryReporting3>();
	
	/** element item for Tax element. 
	 *  @serial
	 */	
	private TaxInformation3 m_tax = null;
	
	/** list of RltdRmtInf element. 
	 *  @serial
	 */	
	private List<RemittanceLocation4> m_rltdRmtInfList = new ArrayList<RemittanceLocation4>();
	
	/** element item for RmtInf element. 
	 *  @serial
	 */	
	private RemittanceInformation11 m_rmtInf = null;
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded PmtId element.
	 * @return the item.
	 */
	public PaymentIdentification1 getPmtId() {
		return m_pmtId;
	}
		
	/**
	 * This method sets (overwrites) the element PmtId.
	 * @param data the item that needs to be added.
	 */
	void setPmtId(PaymentIdentification1 data) {
		m_pmtId = data;
	}
		
	/**
	 * Get the embedded PmtTpInf element.
	 * @return the item.
	 */
	public PaymentTypeInformation19 getPmtTpInf() {
		return m_pmtTpInf;
	}
		
	/**
	 * This method sets (overwrites) the element PmtTpInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtTpInf(PaymentTypeInformation19 data) {
		m_pmtTpInf = data;
	}
		
	/**
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public AmountType4Choice getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(AmountType4Choice data) {
		m_amt = data;
	}
		
	/**
	 * Get the embedded ChrgBr element.
	 * @return the item.
	 */
	public String getChrgBr() {
		return m_chrgBr;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgBr.
	 * @param data the item that needs to be added.
	 */
	void setChrgBr(String data) {
		m_chrgBr = data;
	}
		
	/**
	 * Get the embedded ChqInstr element.
	 * @return the item.
	 */
	public Cheque7 getChqInstr() {
		return m_chqInstr;
	}
		
	/**
	 * This method sets (overwrites) the element ChqInstr.
	 * @param data the item that needs to be added.
	 */
	void setChqInstr(Cheque7 data) {
		m_chqInstr = data;
	}
		
	/**
	 * Get the embedded UltmtDbtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getUltmtDbtr() {
		return m_ultmtDbtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtDbtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtDbtr(PartyIdentification43 data) {
		m_ultmtDbtr = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt1 element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt1() {
		return m_intrmyAgt1;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt1.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification5 data) {
		m_intrmyAgt1 = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt2 element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt2() {
		return m_intrmyAgt2;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt2.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification5 data) {
		m_intrmyAgt2 = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt3 element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt3() {
		return m_intrmyAgt3;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt3.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt3(BranchAndFinancialInstitutionIdentification5 data) {
		m_intrmyAgt3 = data;
	}
		
	/**
	 * Get the embedded CdtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getCdtrAgt() {
		return m_cdtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_cdtrAgt = data;
	}
		
	/**
	 * Get the embedded Cdtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getCdtr() {
		return m_cdtr;
	}
		
	/**
	 * This method sets (overwrites) the element Cdtr.
	 * @param data the item that needs to be added.
	 */
	void setCdtr(PartyIdentification43 data) {
		m_cdtr = data;
	}
		
	/**
	 * Get the embedded CdtrAcct element.
	 * @return the item.
	 */
	public CashAccount24 getCdtrAcct() {
		return m_cdtrAcct;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAcct.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAcct(CashAccount24 data) {
		m_cdtrAcct = data;
	}
		
	/**
	 * Get the embedded UltmtCdtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getUltmtCdtr() {
		return m_ultmtCdtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtCdtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtCdtr(PartyIdentification43 data) {
		m_ultmtCdtr = data;
	}
		
	/**
	 * Get the embedded list of InstrForCdtrAgt elements.
	 * @return list of items.
	 */
	public List<InstructionForCreditorAgent1> getInstrForCdtrAgts() {
		return m_instrForCdtrAgtList;
	}
		
	/**
	 * This method adds data to the list of InstrForCdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstrForCdtrAgt(InstructionForCreditorAgent1 data) {
		m_instrForCdtrAgtList.add(data);
	}
		
	/**
	 * Get the embedded Purp element.
	 * @return the item.
	 */
	public Purpose2Choice getPurp() {
		return m_purp;
	}
		
	/**
	 * This method sets (overwrites) the element Purp.
	 * @param data the item that needs to be added.
	 */
	void setPurp(Purpose2Choice data) {
		m_purp = data;
	}
		
	/**
	 * Get the embedded list of RgltryRptg elements.
	 * @return list of items.
	 */
	public List<RegulatoryReporting3> getRgltryRptgs() {
		return m_rgltryRptgList;
	}
		
	/**
	 * This method adds data to the list of RgltryRptg.
	 * @param data the item that needs to be added.
	 */
	void setRgltryRptg(RegulatoryReporting3 data) {
		m_rgltryRptgList.add(data);
	}
		
	/**
	 * Get the embedded Tax element.
	 * @return the item.
	 */
	public TaxInformation3 getTax() {
		return m_tax;
	}
		
	/**
	 * This method sets (overwrites) the element Tax.
	 * @param data the item that needs to be added.
	 */
	void setTax(TaxInformation3 data) {
		m_tax = data;
	}
		
	/**
	 * Get the embedded list of RltdRmtInf elements.
	 * @return list of items.
	 */
	public List<RemittanceLocation4> getRltdRmtInfs() {
		return m_rltdRmtInfList;
	}
		
	/**
	 * This method adds data to the list of RltdRmtInf.
	 * @param data the item that needs to be added.
	 */
	void setRltdRmtInf(RemittanceLocation4 data) {
		m_rltdRmtInfList.add(data);
	}
		
	/**
	 * Get the embedded RmtInf element.
	 * @return the item.
	 */
	public RemittanceInformation11 getRmtInf() {
		return m_rmtInf;
	}
		
	/**
	 * This method sets (overwrites) the element RmtInf.
	 * @param data the item that needs to be added.
	 */
	void setRmtInf(RemittanceInformation11 data) {
		m_rmtInf = data;
	}
		
	/**
	 * Get the embedded list of SplmtryData elements.
	 * @return list of items.
	 */
	public List<SupplementaryData1> getSplmtryDatas() {
		return m_splmtryDataList;
	}
		
	/**
	 * This method adds data to the list of SplmtryData.
	 * @param data the item that needs to be added.
	 */
	void setSplmtryData(SupplementaryData1 data) {
		m_splmtryDataList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_pmtId, ((CreditTransferTransaction22)that).m_pmtId))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, ((CreditTransferTransaction22)that).m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_amt, ((CreditTransferTransaction22)that).m_amt))
			return false;
		
		if (!Compare.equals(m_chrgBr, ((CreditTransferTransaction22)that).m_chrgBr))
			return false;
		
		if (!Compare.equals(m_chqInstr, ((CreditTransferTransaction22)that).m_chqInstr))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, ((CreditTransferTransaction22)that).m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_intrmyAgt1, ((CreditTransferTransaction22)that).m_intrmyAgt1))
			return false;
		
		if (!Compare.equals(m_intrmyAgt2, ((CreditTransferTransaction22)that).m_intrmyAgt2))
			return false;
		
		if (!Compare.equals(m_intrmyAgt3, ((CreditTransferTransaction22)that).m_intrmyAgt3))
			return false;
		
		if (!Compare.equals(m_cdtrAgt, ((CreditTransferTransaction22)that).m_cdtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtr, ((CreditTransferTransaction22)that).m_cdtr))
			return false;
		
		if (!Compare.equals(m_cdtrAcct, ((CreditTransferTransaction22)that).m_cdtrAcct))
			return false;
		
		if (!Compare.equals(m_ultmtCdtr, ((CreditTransferTransaction22)that).m_ultmtCdtr))
			return false;
		
		if (!Compare.equals(m_instrForCdtrAgtList, ((CreditTransferTransaction22)that).m_instrForCdtrAgtList))
			return false;
		
		if (!Compare.equals(m_purp, ((CreditTransferTransaction22)that).m_purp))
			return false;
		
		if (!Compare.equals(m_rgltryRptgList, ((CreditTransferTransaction22)that).m_rgltryRptgList))
			return false;
		
		if (!Compare.equals(m_tax, ((CreditTransferTransaction22)that).m_tax))
			return false;
		
		if (!Compare.equals(m_rltdRmtInfList, ((CreditTransferTransaction22)that).m_rltdRmtInfList))
			return false;
		
		if (!Compare.equals(m_rmtInf, ((CreditTransferTransaction22)that).m_rmtInf))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, ((CreditTransferTransaction22)that).m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
}