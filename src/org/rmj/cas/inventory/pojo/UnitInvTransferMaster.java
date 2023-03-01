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
@Table(name="Inv_Transfer_Master")

/**
 * Inv_Transfer_Master table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInvTransferMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
        
    @Basic(optional = false)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
        
    @Column(name = "sDestinat")
    private String sDestinat;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;       
    
    @Column(name = "sTruckIDx")
    private String sTruckIDx;    
    
    @Column(name = "nFreightx")
    private Number nFreightx;
    
    @Column(name = "sReceived")
    private String sReceived;    
    
    @Basic(optional = true)
    @Column(name = "dReceived")
    @Temporal(TemporalType.DATE)
    private Date dReceived;
    
    @Column(name = "sApproved")
    private String sApproved;    
    
    @Column(name = "sApprvCde")
    private String sApprvCde;    
    
    @Column(name = "nTranTotl")
    private Number nTranTotl;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "cDeliverd")
    private String cDeliverd;
    
    @Column(name = "sDeliverd")
    private String sDeliverd;
    
    @Basic(optional = true)
    @Column(name = "dDeliverd")
    @Temporal(TemporalType.DATE)
    private Date dDeliverd;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sOrderNox")
    private String sOrderNox;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvTransferMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.sDestinat = "";
        this.sRemarksx = "";
        this.sTruckIDx = "";
        this.nFreightx = 0.00;
        this.sReceived = "";
        this.dReceived = null;
        this.sApproved = "";
        this.sApprvCde = "";
        this.nTranTotl = 0.00;
        this.nDiscount = 0.00;
        this.cDeliverd = "";
        this.sDeliverd = "";
        this.dDeliverd = null;
        this.nEntryNox = -1;
        this.sOrderNox = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("sDestinat");
        laColumns.add("sRemarksx");
        laColumns.add("sTruckIDx");
        laColumns.add("nFreightx");
        laColumns.add("sReceived");
        laColumns.add("dReceived");
        laColumns.add("sApproved");
        laColumns.add("sApprvCde");
        laColumns.add("nTranTotl");
        laColumns.add("nDiscount");
        laColumns.add("cDeliverd");
        laColumns.add("sDeliverd");
        laColumns.add("dDeliverd");
        laColumns.add("nEntryNox");
        laColumns.add("sOrderNox");
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
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getTransact(){
        return dTransact;
    }
    
    public void setDestinat(String sDestinat){
        this.sDestinat = sDestinat;
    }
    public String getDestinat(){
        return sDestinat;
    }
    
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String setRemarksx(){
        return sRemarksx;
    }
    
    public void setTruckIDx(String sTruckIDx){
        this.sTruckIDx = sTruckIDx;
    }
    public String setTruckIDx(){
        return sTruckIDx;
    }
    
    public void setFreightx(Number nFreightx){
        this.nFreightx = nFreightx;
    }
    public Number getFreightx(){
        return nFreightx;
    }
    
    public void setReceived(String sReceived){
        this.sReceived = sReceived;
    }
    public String getReceived(){
        return sReceived;
    }
    
    public void setDateReceived(Date dReceived){
        this.dReceived = dReceived;
    }
    public Date getDateReceived(){
        return dReceived;
    }
    
    public void setApproved(String sApproved){
        this.sApproved = sApproved;
    }
    public String getApproved(){
        return sApproved;
    }
    
    public void setApprvCde(String sApprvCde){
        this.sApprvCde = sApprvCde;
    }
    public String getApprvCde(){
        return sApprvCde;
    }
    
    public void setTranTotl(Number nTranTotl){
        this.nTranTotl = nTranTotl;
    }
    public Number setTranTotl(){
        return nTranTotl;
    }
    
    public void setDiscount(Number nDiscount){
        this.nDiscount = nDiscount;
    }
    public Number getDiscount(){
        return nDiscount;
    }
    
    public void isDeliverd(String cDeliverd){
        this.cDeliverd = cDeliverd;
    }
    public String isDeliverd(){
        return cDeliverd;
    }
    
    public void setDeliverd(String sDeliverd){
        this.sDeliverd = sDeliverd;
    }
    public String getDeliverd(){
        return sDeliverd;
    }
    
    public void setDateDeliverd(Date dDeliverd){
        this.dDeliverd = dDeliverd;
    }
    public Date getDateDeliverd(){
        return dDeliverd;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setOrderNox(String sOrderNox){
        this.sOrderNox = sOrderNox;
    }
    public String setOrderNox(){
        return sOrderNox;
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
        if (!(object instanceof UnitInvTransferMaster)) {
            return false;
        }
        UnitInvTransferMaster other = (UnitInvTransferMaster) object;
        return !((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvTransferMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sDestinat;
            case 5: return sRemarksx;
            case 6: return sTruckIDx;
            case 7: return nFreightx;
            case 8: return sReceived;
            case 9: return dReceived;
            case 10: return sApproved;
            case 11: return sApprvCde;
            case 12: return nTranTotl;
            case 13: return nDiscount;
            case 14: return cDeliverd;
            case 15: return sDeliverd;
            case 16: return dDeliverd;
            case 17: return nEntryNox;
            case 18: return sOrderNox;
            case 19: return cTranStat;
            case 20: return sModified;
            case 21: return dModified;
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
        return "Inv_Transfer_Master";
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
            case 2: sBranchCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: sDestinat = (String) foValue; break;
            case 5: sRemarksx = (String) foValue; break;
            case 6: sTruckIDx = (String) foValue; break;
            case 7: nFreightx = (Number) foValue; break;
            case 8: sReceived = (String) foValue; break;
            case 9: dReceived = (Date) foValue; break;
            case 10: sApproved = (String) foValue; break;
            case 11: sApprvCde = (String) foValue; break;
            case 12: nTranTotl = (Number) foValue; break;
            case 13: nDiscount = (Number) foValue; break;
            case 14: cDeliverd = (String) foValue; break;
            case 15: sDeliverd = (String) foValue; break;
            case 16: dDeliverd = (Date) foValue; break;
            case 17: nEntryNox = (int) foValue; break;
            case 18: sOrderNox = (String) foValue; break;
            case 19: cTranStat = (String) foValue; break;
            case 20: sModified = (String) foValue; break;
            case 21: dModified = (Date) foValue; break;
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
