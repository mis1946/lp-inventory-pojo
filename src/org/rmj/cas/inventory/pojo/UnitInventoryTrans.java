package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="tmpTable")

/**
 * Inventory Transaction temporary table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.17
 */

public class UnitInventoryTrans implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "nQtyInxxx")
    private Number nQtyInxxx;
    
    @Column(name = "nQtyOutxx")
    private Number nQtyOutxx;
    
    @Column(name = "nQtyOrder")
    private Number nQtyOrder;
    
    @Column(name = "nQtyIssue")
    private Number nQtyIssue;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "nBackOrdr")
    private Number nBackOrdr;
    
    @Column(name = "nResvOrdr")
    private Number nResvOrdr;
    
    @Column(name = "nFloatQty")
    private Number nFloatQty;
    
    @Column(name = "nReorderx")
    private Number nReorderx;
    
    @Column(name = "nLedgerNo")
    private int nLedgerNo;
    
    @Column(name = "dAcquired")
    private Date dAcquired;
    
    @Column(name = "dBegInvxx")
    private Date dBegInvxx;
    
    @Column(name = "dLastTran")
    private Date dLastTran;
    
    @Column(name = "dExpiryDt")
    private Date dExpiryDt;
    
    @Column(name = "nPurPrice")
    private double nPurPrice;
    
    @Column(name = "cUnitType")
    private String cUnitType;
    
    @Column(name = "sReplacID")
    private String sReplacID;
    
    @Column(name = "cNewParts")
    private String cNewParts;
    
    @Column(name = "cHsSerial")
    private String cHsSerial;

    @Column(name = "cRecdStat")
    private String cRecdStat;
    
    LinkedList laColumns = null;
    
    public UnitInventoryTrans(){
        this.sStockIDx = "";
        this.sBranchCd = "";
        this.nQuantity = 0;
        this.nQtyInxxx = 0;
        this.nQtyOutxx = 0;
        this.nQtyOrder = 0;
        this.nQtyIssue = 0;
        this.nQtyOnHnd = 0;
        this.nBackOrdr = 0;
        this.nResvOrdr = 0;
        this.nFloatQty = 0;
        this.nReorderx = 0;
        this.nLedgerNo = 0;
        this.dAcquired = null;
        this.dBegInvxx = null;
        this.dLastTran = null;
        this.dExpiryDt = null;
        this.nPurPrice = 0.00;
        this.cUnitType = "1";   
        this.cNewParts = "0";
        this.sReplacID = "";
        this.cHsSerial = "0";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("sBranchCd");
        laColumns.add("nQuantity");
        laColumns.add("nQtyInxxx");
        laColumns.add("nQtyOutxx");
        laColumns.add("nQtyOrder");
        laColumns.add("nQtyIssue");
        laColumns.add("nQtyOnHnd");
        laColumns.add("nBackOrdr");
        laColumns.add("nResvOrdr");
        laColumns.add("nFloatQty");
        laColumns.add("nReorderx");
        laColumns.add("nLedgerNo");
        laColumns.add("dAcquired");
        laColumns.add("dBegInvxx");
        laColumns.add("dLastTran");
        laColumns.add("dExpiryDt");
        laColumns.add("nPurPrice");
        laColumns.add("cUnitType");   
        laColumns.add("cNewParts");
        laColumns.add("sReplacID");
        laColumns.add("cHsSerial");
        laColumns.add("cRecdStat");
    }
    
    public void setStockIDx(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockIDx(){
        return sStockIDx;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setQuantity(Number nQuantity){
        this.nQuantity = nQuantity;
    }
    public Number getQuantity(){
        return nQuantity;
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
    
    public void setQtyOnHnd(Number nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    public Number getQtyOnHnd(){
        return nQtyOnHnd;
    }
    
    public void setBackOrdr(Number nBackOrdr){
        this.nBackOrdr = nBackOrdr;
    }
    public Number getBackOrdr(){
        return nBackOrdr;
    }
    
    public void setResvOrdr(Number nResvOrdr){
        this.nResvOrdr = nResvOrdr;
    }
    public Number getResvOrdr(){
        return nResvOrdr;
    }
    
    public void setFloatQty(Number nFloatQty){
        this.nFloatQty = nFloatQty;
    }
    public Number getFloatQty(){
        return nFloatQty;
    }
    
    public void setReorderx(Number nReorderx){
        this.nReorderx = nReorderx;
    }
    public Number getReorderx(){
        return nReorderx;
    }
    
    public void setLedgerNo(int nLedgerNo){
        this.nLedgerNo = nLedgerNo;
    }
    public int getLedgerNo(){
        return nLedgerNo;
    }
    
    public void setDateLastTran(Date dLastTran){
        this.dLastTran = dLastTran;
    }
    public Date getDateLastTran(){
        return dLastTran;
    }
    
    public void setDateAcquired(Date dAcquired){
        this.dAcquired = dAcquired;
    }
    public Date getDateAcquired(){
        return dAcquired;
    }
    
    public void setDateBegInvxx(Date dBegInvxx){
        this.dBegInvxx = dBegInvxx;
    }
    public Date getDateBegInvxx(){
        return dLastTran;
    }
    
    public void setDateExpire(Date dExpiryDt){
        this.dExpiryDt = dExpiryDt;
    }
    public Date getDateExpire(){
        return dExpiryDt;
    }
    
    public void setPurchase(double nPurPrice){
        this.nPurPrice = nPurPrice;
    }
    public double getPurchase(){
        return nPurPrice;
    }
    
    public void setUnitType(String cUnitType){
        this.cUnitType = cUnitType;
    }
    public String getUnitType(){
        return cUnitType;
    }
    
    public void IsNewParts(String cNewParts){
        this.cNewParts = cNewParts;
    }
    public String IsNewParts(){
        return cNewParts;
    }
    
    public void setReplacID(String sReplacID){
        this.sReplacID = sReplacID;
    }
    public String getReplacID(){
        return sReplacID;
    }
    
    public void setHsSerial(String cHsSerial){
        this.cHsSerial = cHsSerial;
    }
    public String getHsSerial(){
        return cHsSerial;
    }
    
    public void setRecdStat(String cRecdStat){
        this.cRecdStat = cRecdStat;
    }
    public String getRecdStat(){
        return cRecdStat;
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
        if (!(object instanceof UnitInventoryTrans)) {
            return false;
        }
        UnitInventoryTrans other = (UnitInventoryTrans) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)) ||
                (this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInventoryTrans[sStockIDx=" + sStockIDx + " AND sBranchCd=" + sBranchCd +"]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return sBranchCd;
            case 3: return nQuantity;
            case 4: return nQtyInxxx;
            case 5: return nQtyOutxx;
            case 6: return nQtyOrder;
            case 7: return nQtyIssue;
            case 8: return nQtyOnHnd;
            case 9: return nBackOrdr;
            case 10: return nResvOrdr;
            case 11: return nFloatQty;
            case 12: return nReorderx;
            case 13: return nLedgerNo;
            case 14: return dAcquired;
            case 15: return dBegInvxx;
            case 16: return dLastTran;
            case 17: return dExpiryDt;
            case 18: return nPurPrice;
            case 19: return cUnitType;
            case 20: return cNewParts;
            case 21: return sReplacID;
            case 22: return cHsSerial;
            case 23: return cRecdStat;
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
        return "tmpTable";
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
            case 3: nQuantity = (Number) foValue; break;
            case 4: nQtyInxxx = (Number) foValue; break;
            case 5: nQtyOutxx = (Number) foValue; break;
            case 6: nQtyOrder = (Number) foValue; break;
            case 7: nQtyIssue = (Number) foValue; break;
            case 8: nQtyOnHnd = (Number) foValue; break;
            case 9: nBackOrdr = (Number) foValue; break;
            case 10: nResvOrdr = (Number) foValue; break;
            case 11: nFloatQty = (Number) foValue; break;
            case 12: nReorderx = (Number) foValue; break;
            case 13: nLedgerNo = (int) foValue; break;
            case 14: dAcquired = (Date) foValue; break;
            case 15: dBegInvxx = (Date) foValue; break;
            case 16: dLastTran = (Date) foValue; break;
            case 17: dExpiryDt = (Date) foValue; break;
            case 18: nPurPrice = (double) foValue; break;
            case 19: cUnitType = (String) foValue; break;
            case 20: cNewParts = (String) foValue; break;
            case 21: sReplacID = (String) foValue; break;
            case 22: cHsSerial = (String) foValue; break;
            case 23: cRecdStat = (String) foValue; break;
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
