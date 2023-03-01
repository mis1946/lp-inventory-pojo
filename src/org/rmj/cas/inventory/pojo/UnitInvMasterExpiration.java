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
@Table(name="Inv_Master_Expiration")

/**
 * Inv_Ledger table POJO
 * @author Michael Torres Cuison
 * @since 2018.07.13
 */
public class UnitInvMasterExpiration implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
       
    @Basic(optional = false)
    @Column(name = "dBegInvxx")
    @Temporal(TemporalType.DATE)
    private Date dBegInvxx;
    
    @Basic(optional = false)
    @Column(name = "dExpiryDt")
    @Temporal(TemporalType.DATE)
    private Date dExpiryDt;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "nQtyInxxx")
    private Number nQtyInxxx;
    
    @Column(name = "nQtyOutxx")
    private Number nQtyOutxx;
        
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "cNewParts")
    private String cNewParts;
    
    @Basic(optional = false)
    @Column(name = "dTimeStmp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dTimeStmp;

    LinkedList laColumns = null;
    
    public UnitInvMasterExpiration(){
        this.sStockIDx = "";
        this.sBranchCd = "";
        this.dBegInvxx = null;
        this.dExpiryDt = null;
        this.nQuantity = 0;
        this.nQtyInxxx = 0;
        this.nQtyOutxx = 0;
        this.nQtyOnHnd = 0;
        this.cNewParts = "0";
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("sBranchCd");
        laColumns.add("dBegInvxx");
        laColumns.add("dExpiryDt");
        laColumns.add("nQuantity");
        laColumns.add("nQtyInxxx");
        laColumns.add("nQtyOutxx");
        laColumns.add("nQtyOnHnd");
        laColumns.add("cNewParts");
        laColumns.add("dTimeStmp");
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
    
    public void setBegInventory(Date dBegInvxx){
        this.dBegInvxx = dBegInvxx;
    }
    
    public Date getBegInventory(){
        return dBegInvxx;
    }
    
    public void setDateExpiry(Date dExpiryDt){
        this.dExpiryDt = dExpiryDt;
    }
    
    public Date getDateExpiry(){
        return dExpiryDt;
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
    
    public void setQtyOnHnd(Number nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    
    public Number getQtyOnHnd(){
        return nQtyOnHnd;
    }
    
    public void IsNewParts(String cNewParts){
        this.cNewParts = cNewParts;
    }
    public String IsNewParts(){
        return cNewParts;
    }
    
    public void setTimeStmp(Date dTimeStmp){
        this.dTimeStmp = dTimeStmp;
    }
    
    public Date getTimeStmp(){
        return dTimeStmp;
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
        if (!(object instanceof UnitInvMasterExpiration)) {
            return false;
        }
        UnitInvMasterExpiration other = (UnitInvMasterExpiration) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)) ||
                (this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvMasterExpiration[sStockIDx=" + sStockIDx + " AND sBranchCd=" + sBranchCd +"]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return sBranchCd;
            case 3: return dBegInvxx;
            case 4: return dExpiryDt;
            case 5: return nQuantity;
            case 6: return nQtyInxxx;
            case 7: return nQtyOutxx;
            case 8: return nQtyOnHnd;
            case 9: return cNewParts;
            case 10: return dTimeStmp;
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
        return "Inv_Master_Expiration";
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
            case 3: dBegInvxx = (Date) foValue; break;
            case 4: dExpiryDt = (Date) foValue; break;
            case 5: nQuantity = (Number) foValue; break;
            case 6: nQtyInxxx = (Number) foValue; break;
            case 7: nQtyOutxx = (Number) foValue; break;
            case 8: nQtyOnHnd = (Number) foValue; break;
            case 9: cNewParts = (String) foValue; break;
            case 10: dTimeStmp = (Date) foValue; break;
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