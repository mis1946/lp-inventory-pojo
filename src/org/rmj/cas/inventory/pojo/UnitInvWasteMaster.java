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
@Table(name="Inv_Waste_Master")

/**
 * Inv_Waste_Master table POJO
 * @author Michael Torres Cuison
 * @since 2019.06.05
 */
public class UnitInvWasteMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
        
    @Basic(optional = false)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;       
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "nTranTotl")
    private Number nTranTotl;
    
    @Column(name = "sApproved")
    private String sApproved;    
    
    @Basic(optional = true)
    @Column(name = "dApproved")
    @Temporal(TemporalType.DATE)
    private Date dApproved;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvWasteMaster(){
        this.sTransNox = "";
        this.dTransact = null;
        this.sRemarksx = "";
        this.nEntryNox = -1;
        this.nTranTotl = 0.00;
        this.sApproved = "";
        this.dApproved = null;
        this.cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("dTransact");
        laColumns.add("sRemarksx");
        laColumns.add("nEntryNox");
        laColumns.add("nTranTotl");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
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
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getTransact(){
        return dTransact;
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
    
    public void setTranTotl(Number nTranTotl){
        this.nTranTotl = nTranTotl;
    }
    public Number setTranTotl(){
        return nTranTotl;
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
        if (!(object instanceof UnitInvWasteMaster)) {
            return false;
        }
        UnitInvWasteMaster other = (UnitInvWasteMaster) object;
        return !((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvWasteMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return dTransact;
            case 3: return sRemarksx;
            case 4: return nEntryNox;
            case 5: return nTranTotl;
            case 6: return sApproved;
            case 7: return dApproved;
            case 8: return cTranStat;
            case 9: return sModified;
            case 10: return dModified;
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
        return "Inv_Waste_Master";
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
            case 3: sRemarksx = (String) foValue; break;
            case 4: nEntryNox = (int) foValue; break;
            case 5: nTranTotl = (Number) foValue; break;
            case 6: sApproved = (String) foValue; break;
            case 7: dApproved = (Date) foValue; break;
            case 8: cTranStat = (String) foValue; break;
            case 9: sModified = (String) foValue; break;
            case 10: dModified = (Date) foValue; break;
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