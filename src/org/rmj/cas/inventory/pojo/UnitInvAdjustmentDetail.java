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
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Inv_Adjustment_Detail")

/**
 * Inv_Transfer_Detail table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInvAdjustmentDetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Id
    @Basic(optional = false)
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nCredtQty")
    private Number nCredtQty;
    
    @Column(name = "nDebitQty")
    private Number nDebitQty;
    
    @Column(name = "nInvCostx")
    private Number nInvCostx;
    
    @Basic(optional = false)
    @Column(name = "dExpiryDt")
    @Temporal(TemporalType.DATE)
    private Date dExpiryDt;
   
    @Column(name = "sRemarksx")
    private String sRemarksx;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    private void initRecord(){
        this.sTransNox = "";
        this.nEntryNox = -1;
        this.sStockIDx = "";
        this.nCredtQty = 0.00;
        this.nDebitQty = 0.00;
        this.nInvCostx = 0.00;
        this.dExpiryDt = java.util.Calendar.getInstance().getTime();
        this.sRemarksx = "";
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("nCredtQty");
        laColumns.add("nDebitQty");
        laColumns.add("nInvCostx");
        laColumns.add("dExpiryDt");
        laColumns.add("sRemarksx");
        laColumns.add("dModified");
    }
    
    public UnitInvAdjustmentDetail(){
        initRecord();
    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
       
    public void setStockIDx(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockIDx(){
        return sStockIDx;
    }
        
    public void setCreditQTY(Number nCredtQty){
        this.nCredtQty = nCredtQty;
    }
    public Number getCreditQTY(){
        return nCredtQty;
    }
    
    public void setDebitQTY(Number nDebitQty){
        this.nDebitQty = nDebitQty;
    }
    public Number getDebitQTY(){
        return nDebitQty;
    }
    
    public void setInvCostx(Number nInvCostx){
        this.nInvCostx = nInvCostx;
    }
    public Number getInvCostx(){
        return nInvCostx;
    }
    
    public void setDateExpiry(Date dExpiryDt){
        this.dExpiryDt = dExpiryDt;
    }
    public Date getDateExpiry(){
        return dExpiryDt;
    }
    
    public void setRemarks(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarks(){
        return sRemarksx;
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
        if (!(object instanceof UnitInvTransferDetail)) {
            return false;
        }
        UnitInvAdjustmentDetail other = (UnitInvAdjustmentDetail) object;
        return !((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox)) ||
                (this.nEntryNox == -1 && other.nEntryNox != -1) || (this.nEntryNox != -1 && this.nEntryNox != other.nEntryNox));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvTransferDetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sStockIDx;
            case 4: return nCredtQty;
            case 5: return nDebitQty;
            case 6: return nInvCostx;
            case 7: return dExpiryDt;
            case 8: return sRemarksx;
            case 9: return dModified;
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
        return "Inv_Adjustment_Detail";
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
            case 2: nEntryNox = (int) foValue; break;
            case 3: sStockIDx = (String) foValue; break;
            case 4: nCredtQty = (Number) foValue; break;
            case 5: nDebitQty = (Number) foValue; break;
            case 6: nInvCostx = (Number) foValue; break;
            case 7: dExpiryDt = (Date) foValue; break;
            case 8: sRemarksx = (String) foValue; break;
            case 9: dModified = (Date) foValue; break;
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
