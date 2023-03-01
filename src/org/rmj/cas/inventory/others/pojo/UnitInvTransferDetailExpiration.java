package org.rmj.cas.inventory.others.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

/**
 * Inv_Transfer_Detail other info table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.22
 */
public class UnitInvTransferDetailExpiration implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "sDescript")
    private String sDescript;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "nReceived")
    private Number nReceived;
    
    @Basic(optional = false)
    @Column(name = "dExpiryDt")
    @Temporal(TemporalType.DATE)
    private Date dExpiryDt;
    
    LinkedList laColumns = null;
    
    private void initRecord(){
        this.nEntryNox = 0;
        this.sStockIDx = "";
        this.sDescript = "";
        this.nQtyOnHnd = 0;
        this.nQuantity = 0;
        this.nReceived = 0;
        this.dExpiryDt = null;
        
        laColumns = new LinkedList();
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("sDescript");
        laColumns.add("nQtyOnHnd");
        laColumns.add("nQuantity");
        laColumns.add("nReceived");
        laColumns.add("dExpiryDt");
    }
    
    public UnitInvTransferDetailExpiration(){
        initRecord();
    }
    
    public int getnEntryNox(){
       return nEntryNox;
    }
   
    public void setEntryNox(int fnEntryNox){
        this.nEntryNox = fnEntryNox;
    }
    
    public String getStockIDx(){
        return sStockIDx;
    }
   
    public void setStockIDx(String fsStockIDx){
        this.sStockIDx = fsStockIDx;
    }
    
    public String getDescript(){
        return sDescript;
    }
    
    public void setDescription(String fsDescript){
        this.sDescript = fsDescript;
    }
    
    public Number getnQtyOnHnd(){
        return nQtyOnHnd;
    }
    
    public void setQuantityOnHand(Number fnQtyOnHand){
        this.nQtyOnHnd = fnQtyOnHand;
    }
    
    public Number getQuantity(){
        return nQuantity;
    }
    
    public void setQuantity(Number fnQuantity){
        this.nQuantity = fnQuantity;
    }
    
    public Number getNReceived(){
        return nReceived;
    }
    
    public void setNReceived(Number fnReceived){
        this.nReceived = fnReceived;
    }
    
    public Date getDExpiryDt(){
        return dExpiryDt;
    }
    
    public void setDExpiryDt(Date fDExpiryDt){
        this.dExpiryDt = fDExpiryDt;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sStockIDx != null ? sStockIDx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UnitInvTransferDetailExpiration)) {
            return false;
        }
        UnitInvTransferDetailExpiration other = (UnitInvTransferDetailExpiration) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.others.pojo.UnitInvTransferDetailOthers[sStockIDx=" + sStockIDx + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return nEntryNox;
            case 2: return sStockIDx;
            case 3: return sDescript;
            case 4: return nQtyOnHnd;
            case 5: return nQuantity;
            case 6: return nReceived;
            case 7: return dExpiryDt;
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
            case 1: nEntryNox = (int)foValue; break; 
            case 2: sStockIDx = (String)foValue; break; 
            case 3: sDescript = (String)foValue; break; 
            case 4: nQtyOnHnd = (Number) foValue; break; 
            case 5: nQuantity = (Number) foValue; break; 
            case 6: nReceived = (Number) foValue; break; 
            case 7: dExpiryDt = (Date) foValue; break; 
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