package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="UnitInvRequestMaster")

public class UnitInvRequestMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Column(name = "sIssNotes")
    private String sIssNotes;
    
    @Column(name = "nCurrInvx")
    private Number nCurrInvx;
    
    @Column(name = "nEstInvxx")
    private Number nEstInvxx;
    
    @Column(name = "sApproved")
    private String sApproved;
    
    @Column(name = "dApproved")
    @Temporal(TemporalType.DATE)
    private Date dApproved;
    
    @Column(name = "sAprvCode")
    private String sAprvCode;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "cConfirmd")
    private String cConfirmd;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvRequestMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.sInvTypCd = "";
        this.dTransact = null;
        this.sReferNox = "";
        this.sRemarksx = "";
        this.sIssNotes = "";
        this.nCurrInvx = 0;
        this.nEstInvxx = 0;
        this.sApproved = "";
        this.dApproved = null;
        this.sAprvCode = "";
        this.nEntryNox = -1;
        this.sSourceNo = "";
        this.sSourceCd = "";                    
        this.cConfirmd = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("dTransact");
        laColumns.add("sBranchCd");
        laColumns.add("sInvTypCd");
        laColumns.add("sReferNox");
        laColumns.add("sIssNotes");
        laColumns.add("sRemarksx");
        laColumns.add("nCurrInvx");
        laColumns.add("nEstInvxx");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
        laColumns.add("sAprvCode");
        laColumns.add("nEntryNox");
        laColumns.add("sSourceNo");
        laColumns.add("sSourceCd");
        laColumns.add("cConfirmd");  
        laColumns.add("cTranStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setInvTypeCd(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypeCd(){
        return sInvTypCd;
    }
    
    public void setDateTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getDateTransact(){
        return dTransact;
    }
    
    public void setReferNo(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferNo(){
        return sReferNox;
    }
    
    public void setRemarks(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarks(){
        return sRemarksx;
    }
    
    public void setIssNotes(String sIssNotes){
        this.sIssNotes= sIssNotes;
    }
    public String getIssNotes(){
        return sIssNotes;
    }
    
    public void setCurrInvx(Number nCurrInvx){
        this.nCurrInvx = nCurrInvx;
    }
    public Number getCurrInvx(){
        return nCurrInvx;
    }
    
    public void setEstInvxx(Number nEstInvxx){
        this.nEstInvxx = nEstInvxx;
    }
    public Number getEstInvxx(){
        return nEstInvxx;
    }
    
    public void setApprovedBy(String sApproved){
        this.sApproved = sApproved;
    }
    public String getApprovedBy(){
        return sApproved;
    }
    
    public void setDateApproved(Date dApproved){
        this.dApproved = dApproved;
    }
    public Date getDateApproved(){
        return dApproved;
    }
    
    public void setApprovalCode(String sAprvCode){
        this.sAprvCode = sAprvCode;
    }
    public String getApprovalCode(){
        return sAprvCode;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    public String getSourceNo(){
        return sSourceNo;
    }
    
    public void setSourceCd(String sSourceCd){
        this.sSourceCd = sSourceCd;
    }
    public String getSourceCd(){
        return sSourceCd;
    }
    
    public void setConfirmd(String cConfirmd){
        this.cConfirmd = cConfirmd;
    }
    public String getConfirmd(){
        return cConfirmd;
    }
    
    public void setTranStat(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStat(){
        return cTranStat;
    }
    
    public void setModifiedBy(String sModified){
        this.sModified = sModified;
    }
    public String getModifiedBy(){
        return sModified;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvRequestMaster)) {
            return false;
        }
        UnitInvRequestMaster other = (UnitInvRequestMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPOMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return dTransact;
            case 3: return sBranchCd;
            case 4: return sInvTypCd;
            case 5: return sReferNox;
            case 6: return sIssNotes;
            case 7: return sRemarksx;
            case 8: return nCurrInvx;
            case 9: return nEstInvxx;
            case 10: return sApproved;
            case 11: return dApproved;
            case 12: return sAprvCode;
            case 13: return nEntryNox;
            case 14: return sSourceNo;
            case 15: return sSourceCd;
            case 16: return cConfirmd;
            case 17: return cTranStat;
            case 18: return sModified;
            case 19: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Inv_Stock_Request_Master";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: dTransact = (Date) foValue; break;
            case 3: sBranchCd = (String) foValue; break;
            case 4: sInvTypCd = (String) foValue; break;
            case 5: sReferNox = (String) foValue; break;
            case 6: sIssNotes = (String) foValue; break;
            case 7: sRemarksx = (String) foValue; break;
            case 8: nCurrInvx = (Number) foValue; break;
            case 9: nEstInvxx = (Number) foValue; break;
            case 10: sApproved = (String) foValue; break;
            case 11: dApproved = (Date) foValue; break;
            case 12: sAprvCode = (String) foValue; break;
            case 13: nEntryNox = (int) foValue; break;
            case 14: sSourceNo = (String) foValue; break;
            case 15: sSourceCd = (String) foValue; break;
            case 16: cConfirmd = (String) foValue; break;
            case 17: cTranStat = (String) foValue; break;
            case 18: sModified = (String) foValue; break;
            case 19: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
