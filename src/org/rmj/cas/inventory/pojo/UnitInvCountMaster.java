package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
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
@Table(name="Inv_Count_Master")

/**
 * Inv_Count_Master table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInvCountMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
        
    @Basic(optional = false)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
        
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;       
    
    @Column(name = "nEntryNox")
    private int nEntryNox;    
    
    @Column(name = "sVerified")
    private String sVerified;
       
    @Basic(optional = true)
    @Column(name = "dVerified")
    @Temporal(TemporalType.DATE)
    private Date dVerified;
    
    @Column(name = "sApproved")
    private String sApproved;    
    
    @Basic(optional = true)
    @Column(name = "dApproved")
    @Temporal(TemporalType.DATE)
    private Date dApproved;
    
    @Column(name = "cBalFrwrd")
    private String cBalFrwrd;
    
    @Basic(optional = true)
    @Column(name = "dCutOffxx")
    @Temporal(TemporalType.DATE)
    private Date dCutOffxx;
       
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvCountMaster(){
        this.sTransNox = "";
        this.sInvTypCd = "";
        this.dTransact = null;
        this.sReferNox = "";
        this.sRemarksx = "";
        this.nEntryNox = -1;
        this.sVerified = "";
        this.dVerified = null;
        this.sApproved = "";
        this.dApproved = null;
        this.cBalFrwrd = "";
        this.dCutOffxx = null;
        this.cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sInvTypCd");
        laColumns.add("dTransact");
        laColumns.add("sReferNox");
        laColumns.add("sRemarksx");
        laColumns.add("nEntryNox");
        laColumns.add("sVerified");
        laColumns.add("dVerified");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
        laColumns.add("cBalFrwrd");
        laColumns.add("dCutOffxx");
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
    
    public void setInvTypCd(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypCd(){
        return sInvTypCd;
    }
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getTransact(){
        return dTransact;
    }
    
    public void setReferNox(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferNox(){
        return sReferNox;
    }
    
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String setRemarksx(){
        return sRemarksx;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setVerified(String sVerified){
        this.sVerified = sVerified;
    }
    public String getVerified(){
        return sVerified;
    }
    
    public void setDateVerified(Date dVerified){
        this.dVerified = dVerified;
    }
    public Date getDateVerified(){
        return dVerified;
    }
    
    public void setApproved(String sApproved){
        this.sApproved = sApproved;
    }
    public String getApproved(){
        return sApproved;
    }
    
    public void setDateApproved(Date dApproved){
        this.dApproved = dApproved;
    }
    public Date getDateApproved(){
        return dApproved;
    }
    
    public void isBalFrwrd(String cBalFrwrd){
        this.cBalFrwrd = cBalFrwrd;
    }
    public String isBalFrwrd(){
        return cBalFrwrd;
    }
    
    public void setCutOffxx(Date dCutOffxx){
        this.dCutOffxx = dCutOffxx;
    }
    public Date getCutOffxx(){
        return dCutOffxx;
    }
    
    public void setTranStat(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStat(){
        return cTranStat;
    }
    
    public void setModified(String sModified){
        this.sModified = sModified;
    }
    public String getModified(){
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
        if (!(object instanceof UnitInvCountMaster)) {
            return false;
        }
        UnitInvCountMaster other = (UnitInvCountMaster) object;
        return !((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvCountMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sInvTypCd;
            case 3: return dTransact;
            case 4: return sReferNox;
            case 5: return sRemarksx;
            case 6: return nEntryNox;
            case 7: return sVerified;
            case 8: return dVerified;
            case 9: return sApproved;
            case 10: return dApproved;
            case 11: return cBalFrwrd;
            case 12: return dCutOffxx;
            case 13: return cTranStat;
            case 14: return sModified;
            case 15: return dModified;
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
        return "Inv_Count_Master";
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
            case 2: sInvTypCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: sReferNox = (String) foValue; break;
            case 5: sRemarksx = (String) foValue; break;
            case 6: nEntryNox = (int) foValue; break;
            case 7: sVerified = (String) foValue; break;
            case 8: dVerified = (Date) foValue; break;
            case 9: sApproved = (String) foValue; break;
            case 10: dApproved = (Date) foValue; break;
            case 11: cBalFrwrd = (String) foValue; break;
            case 12: dCutOffxx = (Date) foValue; break;
            case 13: cTranStat = (String) foValue; break;
            case 14: sModified = (String) foValue; break;
            case 15: dModified = (Date) foValue; break;
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
    
    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }
}
