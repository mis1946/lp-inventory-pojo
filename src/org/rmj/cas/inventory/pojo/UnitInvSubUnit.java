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
@Table(name="Inventory_Sub_Unit")

/**
 * Inv_Sub_Unit table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInvSubUnit implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Id
    @Basic(optional = false)
    @Column(name = "nEntryNox")
    private int nEntryNox;
           
    @Column(name = "sItmSubID")
    private String sItmSubID;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvSubUnit(){
        this.sStockIDx = "";
        this.nEntryNox = -1;
        this.sItmSubID = "";
        this.nQuantity = 0;
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("nEntryNox");
        laColumns.add("sItmSubID");
        laColumns.add("nQuantity");
        laColumns.add("dModified");
    }
        
    public void setStockIDx(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockIDx(){
        return sStockIDx;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setItmSubID(String sItmSubID){
        this.sItmSubID = sItmSubID;
    }
    public String getItmSubID(){
        return sItmSubID;
    }    
    
    public void setQuantity(Number nQuantity){
        this.nQuantity = nQuantity;
    }
    public Number getQuantity(){
        return nQuantity;
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
        if (!(object instanceof UnitInvSubUnit)) {
            return false;
        }
        UnitInvSubUnit other = (UnitInvSubUnit) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)) ||
                (this.nEntryNox == -1 && other.nEntryNox != -1) || (this.nEntryNox != -1 && this.nEntryNox !=(other.nEntryNox)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvSubUnit[sSerialID=" + sStockIDx + " AND nEntryNox=" + nEntryNox +"]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return nEntryNox;
            case 3: return sItmSubID;
            case 4: return nQuantity;
            case 5: return dModified;
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
        return "Inventory_Sub_Unit";
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
            case 2: nEntryNox = (int) foValue; break;
            case 3: sItmSubID = (String) foValue; break;
            case 4: nQuantity = (Number) foValue; break;
            case 5: dModified = (Date) foValue; break;
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
