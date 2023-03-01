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
@Table(name="Inv_Transfer_Detail")

/**
 * Inv_Transfer_Detail table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInvTransferDetail implements Serializable, GEntity {
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
    
    @Column(name = "sOrigIDxx")
    private String sOrigIDxx;
    
    @Column(name = "sOrderNox")
    private String sOrderNox;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "nInvCostx")
    private Number nInvCostx;
    
    @Column(name = "sRecvIDxx")
    private String sRecvIDxx;
    
    @Column(name = "nReceived")
    private Number nReceived;
    
    @Basic(optional = false)
    @Column(name = "dExpiryDt")
    @Temporal(TemporalType.DATE)
    private Date dExpiryDt;
    
    @Column(name = "sNotesxxx")
    private String sNotesxxx;
    
    @Column(name = "sParentID")
    private String sParentID;
    
    @Column(name = "nParntQty")
    private Number nParntQty;
    
//    @Basic(optional = false)
//    @Column(name = "dParntExp")
//    @Temporal(TemporalType.DATE)
//    private Date dParntExp;
    
    @Column(name = "nSbItmQty")
    private Number nSbItmQty;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    private void initRecord(){
        this.sTransNox = "";
        this.nEntryNox = -1;
        this.sStockIDx = "";
        this.sOrigIDxx = "";
        this.sOrderNox = "";
        this.nQuantity = 0.00;
        this.nInvCostx = 0.00;
        this.sRecvIDxx = "";
        this.nReceived = 0.00;
        this.dExpiryDt = java.util.Calendar.getInstance().getTime();
        this.sNotesxxx = "";
        this.sParentID = "";
        this.nParntQty = 0.00;
//        this.dParntExp = null;
        this.nSbItmQty = 0.00;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("sOrigIDxx");
        laColumns.add("sOrderNox");
        laColumns.add("nQuantity");
        laColumns.add("nInvCostx");
        laColumns.add("sRecvIDxx");
        laColumns.add("nReceived");
        laColumns.add("dExpiryDt");
        laColumns.add("sNotesxxx");
        laColumns.add("sParentID");
        laColumns.add("nParntQty");
//        laColumns.add("dParntExp");
        laColumns.add("nSbItmQty");
        laColumns.add("dModified");
    }
    
    public UnitInvTransferDetail(){
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
    
    public void setOrigIDxx(String sOrigIDxx){
        this.sOrigIDxx = sOrigIDxx;
    }
    public String getOrigIDxx(){
        return sOrigIDxx;
    }
    
    public void setOrderNox(String sOrderNox){
        this.sOrderNox = sOrderNox;
    }
    public String getOrderNox(){
        return sOrderNox;
    }
    
    public void setQuantity(Number nQuantity){
        this.nQuantity = nQuantity;
    }
    public Number getQuantity(){
        return nQuantity;
    }
    
    public void setInvCostx(Number nInvCostx){
        this.nInvCostx = nInvCostx;
    }
    public Number getInvCostx(){
        return nInvCostx;
    }
    
    public void setRecvIDxx(String sRecvIDxx){
        this.sRecvIDxx = sRecvIDxx;
    }
    public String getRecvIDxx(){
        return sRecvIDxx;
    }
    
    public void setReceived(Number nReceived){
        this.nReceived = nReceived;
    }
    public Number getReceived(){
        return nReceived;
    }
    
    public void setDateExpiry(Date dExpiryDt){
        this.dExpiryDt = dExpiryDt;
    }
    public Date getDateExpiry(){
        return dExpiryDt;
    }
    
    public void setNotesxxx(String sNotesxxx){
        this.sNotesxxx = sNotesxxx;
    }
    public String getNotesxxx(){
        return sNotesxxx;
    }
    
    public void setParentID(String sParentID){
        this.sParentID = sParentID;
    }
    public String getParentID(){
        return sParentID;
    }
    
    public void setParntQty(Number nParntQty){
        this.nParntQty = nParntQty;
    }
    public Number getParnQty(){
        return nParntQty;
    }
    
//    public void setParntExp(Date dParntExp){
//        this.dParntExp = dParntExp;
//    }
//    public Date getParntExp(){
//        return dParntExp;
//    }
    
    public void setSbItmQty(Number nSbItmQty){
        this.nSbItmQty = nSbItmQty;
    }
    public Number getSbItmQty(){
        return nSbItmQty;
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
        UnitInvTransferDetail other = (UnitInvTransferDetail) object;
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
            case 4: return sOrigIDxx;
            case 5: return sOrderNox;
            case 6: return nQuantity;
            case 7: return nInvCostx;
            case 8: return sRecvIDxx;
            case 9: return nReceived;
            case 10: return dExpiryDt;
            case 11: return sNotesxxx;
            case 12: return sParentID;
            case 13: return nParntQty;
//            case 14: return dParntExp;
            case 14: return nSbItmQty;
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
        return "Inv_Transfer_Detail";
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
            case 4: sOrigIDxx = (String) foValue; break;
            case 5: sOrderNox = (String) foValue; break;
            case 6: nQuantity = (Number) foValue; break;
            case 7: nInvCostx = (Number) foValue; break;
            case 8: sRecvIDxx = (String) foValue; break;
            case 9: nReceived = (Number) foValue; break;
            case 10: dExpiryDt = (Date) foValue; break;
            case 11: sNotesxxx = (String) foValue; break;
            case 12: sParentID = (String) foValue; break;
            case 13: nParntQty = (Number) foValue; break;
//            case 14: dParntExp = (Date) foValue; break;
            case 14: nSbItmQty = (Number) foValue; break;
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
