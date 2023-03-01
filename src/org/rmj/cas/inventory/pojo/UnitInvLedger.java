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
@Table(name="Inv_Ledger")

/**
 * Inv_Ledger table POJO
 * @author Michael Torres Cuison
 * @since 2018.07.13
 */
public class UnitInvLedger implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "nLedgerNo")
    private int nLedgerNo;
    
    @Basic(optional = false)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
        
    @Id
    @Basic(optional = false)
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "nQtyInxxx")
    private Number nQtyInxxx;
    
    @Column(name = "nQtyOutxx")
    private Number nQtyOutxx;
    
    @Column(name = "nQtyOrder")
    private Number nQtyOrder;
    
    @Column(name = "nQtyIssue")
    private Number nQtyIssue;
    
    @Column(name = "nUnitPrce")
    private Number nUnitPrce;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvLedger(){
        this.sStockIDx = "";
        this.sBranchCd = "";
        this.nLedgerNo = 0;
        this.dTransact = null;
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.nQtyInxxx = 0;
        this.nQtyOutxx = 0;
        this.nQtyOrder = 0;
        this.nQtyIssue = 0;
        this.nUnitPrce = 0.00;
        this.nQtyOnHnd = 0;
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("sBranchCd");
        laColumns.add("nLedgerNo");
        laColumns.add("dTransact");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("nQtyInxxx");
        laColumns.add("nQtyOutxx");
        laColumns.add("nQtyOrder");
        laColumns.add("nQtyIssue");
        laColumns.add("nUnitPrce");
        laColumns.add("nQtyOnHnd");
        laColumns.add("dModified");
    }
    
    public void setStockID(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockID(){
        return sStockIDx;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setLedgerNo(int nLedgerNo){
        this.nLedgerNo = nLedgerNo;
    }
    public int getLedgerNo(){
        return nLedgerNo;
    }
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    
    public Date getTransact(){
        return dTransact;
    }
    
    public void setSourceCd(String sSourceCd){
        this.sSourceCd = sSourceCd;
    }
    
    public String getSourceCd(){
        return sSourceCd;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    
    public String getSourceNo(){
        return sSourceNo;
    }
    
    public void setQtyInxxx(Number nQtyInxxx){
        this.nQtyInxxx = nQtyInxxx;
    }
    
    public Number getQtyInxxx(){
        return nQtyInxxx;
    }
    
    public void setQtyOutxx(Number nQtyOutxx){
        this.nQtyOutxx = nQtyOutxx;
    }
    
    public Number getQtyOutxx(){
        return nQtyOutxx;
    }
    
    public void setQtyOrder(Number nQtyOrder){
        this.nQtyOrder = nQtyOrder;
    }
    
    public Number getQtyOrder(){
        return nQtyOrder;
    }
    
    public void setQtyIssue(Number nQtyIssue){
        this.nQtyIssue = nQtyIssue;
    }
    
    public Number getQtyIssue(){
        return nQtyIssue;
    }
    
    public void setUnitPrce(Number nUnitPrce){
        this.nUnitPrce = nUnitPrce;
    }
    
    public Number getUnitPrce(){
        return nUnitPrce;
    }
    
    public void setQtyOnHnd(Number nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    
    public Number getQtyOnHnd(){
        return nQtyOnHnd;
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
        hash += (sStockIDx != null ? sStockIDx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvLedger)) {
            return false;
        }
        UnitInvLedger other = (UnitInvLedger) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)) ||
                (this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvLedger[sStockIDx=" + sStockIDx + " AND sBranchCd=" + sBranchCd +"]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return sBranchCd;
            case 3: return nLedgerNo;
            case 4: return dTransact;
            case 5: return sSourceCd;
            case 6: return sSourceNo;
            case 7: return nQtyInxxx;
            case 8: return nQtyOutxx;
            case 9: return nQtyOrder;
            case 10: return nQtyIssue;
            case 11: return nUnitPrce;
            case 12: return nQtyOnHnd;
            case 13: return dModified;
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
        return "Inv_Ledger";
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
            case 1: sStockIDx = (String) foValue; break;
            case 2: sBranchCd = (String) foValue; break;
            case 3: nLedgerNo = (int) foValue; break;
            case 4: dTransact = (Date) foValue; break;
            case 5: sSourceCd = (String) foValue; break;
            case 6: sSourceNo = (String) foValue; break;
            case 7: nQtyInxxx = (Number) foValue; break;
            case 8: nQtyOutxx = (Number) foValue; break;
            case 9: nQtyOrder = (Number) foValue; break;
            case 10: nQtyIssue = (Number) foValue; break;
            case 11: nUnitPrce = (Number) foValue; break;
            case 12: nQtyOnHnd = (Number) foValue; break;
            case 13: dModified = (Date) foValue; break;
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
