package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="UnitInvRequestDetail")

public class UnitInvRequestDetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
        
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "cClassify")
    private String cClassify;
    
    @Column(name = "nRecOrder")
    private Number nRecOrder;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "nResvOrdr")
    private Number nResvOrdr;
    
    @Column(name = "nBackOrdr")
    private Number nBackOrdr;
    
    @Column(name = "nOnTranst")
    private Number nOnTranst;
    
    @Column(name = "nAvgMonSl")
    private Number nAvgMonSl;
    
    @Column(name = "nMaxLevel")
    private Number nMaxLevel;
    
    @Column(name = "nApproved")
    private Number nApproved;
    
    @Column(name = "nCancelld")
    private Number nCancelld;
    
    @Column(name = "nIssueQty")
    private Number nIssueQty;
    
    @Column(name = "nOrderQty")
    private Number nOrderQty;
    
    @Column(name = "nAllocQty")
    private Number nAllocQty;
    
    @Column(name = "nReceived")
    private Number nReceived;
    
    @Column(name = "sNotesxxx")
    private String sNotesxxx;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;
          
    LinkedList laColumns = null;
    
    public UnitInvRequestDetail(){
        this.sTransNox = "";
        this.nEntryNox = -1;
        this.sStockIDx = "";
        this.nQuantity = 0;
        this.cClassify = "";
        this.nRecOrder = 0;
        this.nQtyOnHnd = 0;
        this.nResvOrdr = 0;
        this.nBackOrdr = 0;
        this.nOnTranst = 0;
        this.nAvgMonSl = 0;
        this.nMaxLevel = 0;
        this.nApproved = 0;
        this.nCancelld = 0;
        this.nIssueQty = 0;
        this.nOrderQty = 0;
        this.nAllocQty = 0;
        this.nReceived = 0;
        this.sNotesxxx = "";
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("nQuantity");
        laColumns.add("cClassify");
        laColumns.add("nRecOrder");
        laColumns.add("nQtyOnHnd");
        laColumns.add("nResvOrdr");
        laColumns.add("nBackOrdr");
        laColumns.add("nOnTranst");
        laColumns.add("nAvgMonSl");
        laColumns.add("nMaxLevel");
        laColumns.add("nApproved");
        laColumns.add("nCancelld");
        laColumns.add("nIssueQty");
        laColumns.add("nOrderQty");
        laColumns.add("nAllocQty");
        laColumns.add("nReceived");
        laColumns.add("sNotesxxx");
        laColumns.add("dModified");
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
    
    public void setStockID(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockID(){
        return sStockIDx;
    }
     
    public void setQuantity(Number nQuantity){
        this.nQuantity = nQuantity;
    }
    public Number getQuantity(){
        return nQuantity;
    }
    
    public void setClassify(String cClassify){
        this.cClassify = cClassify;
    }
    public String getClassify(){
        return cClassify;
    }
    
    public void setRecOrder(Number nRecOrder){
        this.nRecOrder = nRecOrder;
    }
    public Number setRecOrder(){
        return nRecOrder;
    }
    
    public void setQtyOnHnd(Number nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    public Number setQtyOnHnd(){
        return nQtyOnHnd;
    }
    
    public void setResvOrdr(Number nResvOrdr){
        this.nResvOrdr = nResvOrdr;
    }
    public Number setResvOrdr(){
        return nResvOrdr;
    }
    
    public void setBackOrdr(Number nBackOrdr){
        this.nBackOrdr = nBackOrdr;
    }
    public Number setBackOrdr(){
        return nResvOrdr;
    }
    
    public void setOnTranst(Number nOnTranst){
        this.nOnTranst = nOnTranst;
    }
    public Number setOnTranst(){
        return nOnTranst;
    }
    
    public void setAvgMonSl(Number nAvgMonSl){
        this.nAvgMonSl = nAvgMonSl;
    }
    public Number setAvgMonSl(){
        return nAvgMonSl;
    }
    
    public void setMaxLevel(Number nMaxLevell){
        this.nMaxLevel = nMaxLevel;
    }
    public Number setMaxLevel(){
        return nMaxLevel;
    }
    
    public void setApproved(Number nApproved){
        this.nApproved = nApproved;
    }
    public Number setApproved(){
        return nApproved;
    }
    
    public void setCancelld(int nCancelld){
        this.nCancelld = nCancelld;
    }
    public Number setCancelld(){
        return nCancelld;
    }
    
    public void setIssueQty(Number nIssueQty){
        this.nIssueQty = nIssueQty;
    }
    public Number setIssueQty(){
        return nIssueQty;
    }
    
    public void setOrderQty(Number nOrderQty){
        this.nOrderQty = nOrderQty;
    }
    public Number setOrderQty(){
        return nOrderQty;
    }
    
    public void setAllocQty(Number nAllocQty){
        this.nAllocQty = nAllocQty;
    }
    public Number setAllocQty(){
        return nAllocQty;
    }
    
    public void setReceived(Number nReceived){
        this.nReceived = nReceived;
    }
    public Number setReceived(){
        return nReceived;
    }
    
    public void setNotesxxx(String sNotesxxx){
        this.sNotesxxx = sNotesxxx;
    }
    public String getNotesxxx(){
        return sNotesxxx;
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
        if (!(object instanceof UnitInvRequestDetail)) {
            return false;
        }
        UnitInvRequestDetail other = (UnitInvRequestDetail) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.cas.inventory.pojo.UnitInvRequestDetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sStockIDx;
            case 4: return nQuantity;
            case 5: return cClassify;
            case 6: return nRecOrder;
            case 7: return nQtyOnHnd;
            case 8: return nResvOrdr;
            case 9: return nBackOrdr;
            case 10: return nOnTranst;
            case 11: return nAvgMonSl;
            case 12: return nMaxLevel;
            case 13: return nApproved;
            case 14: return nCancelld;
            case 15: return nIssueQty;
            case 16: return nOrderQty;
            case 17: return nAllocQty;
            case 18: return nReceived;
            case 19: return sNotesxxx;
            case 20: return dModified;
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
        return "Inv_Stock_Request_Detail";
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
            case 4: nQuantity = (Number) foValue; break;
            case 5: cClassify = (String) foValue; break;
            case 6: nRecOrder = (Number) foValue; break;
            case 7: nQtyOnHnd = (Number) foValue; break;
            case 8: nResvOrdr = (Number) foValue; break;
            case 9: nBackOrdr = (Number) foValue; break;
            case 10: nOnTranst = (Number) foValue; break;
            case 11: nAvgMonSl = (Number) foValue; break;
            case 12: nMaxLevel = (Number) foValue; break;
            case 13: nApproved = (Number) foValue; break;
            case 14: nCancelld = (Number) foValue; break;
            case 15: nIssueQty = (Number) foValue; break;
            case 16: nOrderQty = (Number) foValue; break;
            case 17: nAllocQty = (Number) foValue; break;
            case 18: nReceived = (Number) foValue; break;
            case 19: sNotesxxx = (String) foValue; break;
            case 20: dModified = (Date) foValue; break;
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

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
