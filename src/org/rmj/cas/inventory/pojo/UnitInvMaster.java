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
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Inv_Master")

/**
 * Inv_Master table POJO
 * @author Michael Torres Cuison
 * @since 2018.07.13
 */
public class UnitInvMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "sLocatnCd")
    private String sLocatnCd;
    
    @Column(name = "nBinNumbr")
    private int nBinNumbr;
    
    @Basic(optional = false)
    @Column(name = "dAcquired")
    @Temporal(TemporalType.DATE)
    private Date dAcquired;
    
    @Basic(optional = false)
    @Column(name = "dBegInvxx")
    @Temporal(TemporalType.DATE)
    private Date dBegInvxx;
    
    @Column(name = "nBegQtyxx")
    private Number nBegQtyxx;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "nMinLevel")
    private Number nMinLevel;
    
    @Column(name = "nMaxLevel")
    private Number nMaxLevel;
    
    @Column(name = "nAvgMonSl")
    private Number nAvgMonSl;
    
    @Column(name = "nAvgCostx")
    private Number nAvgCostx;
    
    @Column(name = "cClassify")
    private String cClassify;
    
    @Column(name = "nBackOrdr")
    private Number nBackOrdr;
    
    @Column(name = "nResvOrdr")
    private Number nResvOrdr;
    
    @Column(name = "nFloatQty")
    private Number nFloatQty;
    
    @Column(name = "nLedgerNo")
    private int nLedgerNo;
    
    @Basic(optional = false)
    @Column(name = "dLastTran")
    @Temporal(TemporalType.DATE)
    private Date dLastTran;
    
    @Column(name = "cRecdStat")
    private String cRecdStat;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvMaster(){
        this.sStockIDx = "";
        this.sBranchCd = "";
        this.sLocatnCd = "";
        this.nBinNumbr = 0;
        this.dAcquired = null;
        this.dBegInvxx = null;
        this.nBegQtyxx = 0;
        this.nQtyOnHnd = 0;
        this.nMinLevel = 0;
        this.nMaxLevel = 0;
        this.nAvgMonSl = 0;
        this.nAvgCostx = 0.00;
        this.cClassify = "F";
        this.nBackOrdr = 0;
        this.nResvOrdr = 0;
        this.nFloatQty = 0;
        this.nLedgerNo = 0;
        this.dLastTran = null;
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("sBranchCd");
        laColumns.add("sLocatnCd");
        laColumns.add("nBinNumbr");
        laColumns.add("dAcquired");
        laColumns.add("dBegInvxx");
        laColumns.add("nBegQtyxx");
        laColumns.add("nQtyOnHnd");
        laColumns.add("nMinLevel");
        laColumns.add("nMaxLevel");
        laColumns.add("nAvgMonSl");
        laColumns.add("nAvgCostx");	
        laColumns.add("cClassify");
        laColumns.add("nBackOrdr");
        laColumns.add("nResvOrdr");
        laColumns.add("nFloatQty");
        laColumns.add("nLedgerNo");
        laColumns.add("dLastTran");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
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
    
    public void setLocatnCd(String sLocatnCd){
        this.sLocatnCd = sLocatnCd;
    }
    public String getLocatnCd(){
        return sLocatnCd;
    }
    
    public void setBinNumbr(int nBinNumbr){
        this.nBinNumbr = nBinNumbr;
    }
    
    public int getBinNumbr(){
        return nBinNumbr;
    }
    
    public void setAcquired(Date dAcquired){
        this.dAcquired = dAcquired;
    }
    
    public Date getAcquired(){
        return dAcquired;
    }
    
    public void setBegInvxx(Date dBegInvxx){
        this.dBegInvxx = dBegInvxx;
    }
    
    public Date getBegInvxx(){
        return dBegInvxx;
    }
    
    public void setBegQtyxx(Number nBegQtyxx){
        this.nBegQtyxx = nBegQtyxx;
    }
    
    public Number getBegQtyxx(){
        return nBegQtyxx;
    }
    
    public void setQtyOnHnd(Number nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    
    public Number getQtyOnHnd(){
        return nQtyOnHnd;
    }
    
    public void setMinLevel(Number nMinLevel){
        this.nMinLevel = nMinLevel;
    }
    
    public Number getMinLevel(){
        return nMinLevel;
    }
    
    public void setMaxLevel(Number nMaxLevel){
        this.nMaxLevel = nMaxLevel;
    }
    
    public Number getMaxLevel(){
        return nMaxLevel;
    }
    
    public void setAvgMonSl(Number nAvgMonSl){
        this.nAvgMonSl = nAvgMonSl;
    }
    
    public Number getAvgMonSl(){
        return nAvgMonSl;
    }
    
    public void setAvgCostx(Number nAvgCostx){
        this.nAvgCostx = nAvgCostx;
    }
    
    public Number getAvgCostx(){
        return nAvgCostx;
    }
    
    public void setClassify(String cClassify){
        this.cClassify = cClassify;
    }
    
    public String getClassify(){
        return cClassify;
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
    
    public void setLedgerNo(int nLedgerNo){
        this.nLedgerNo = nLedgerNo;
    }
    
    public int getLedgerNo(){
        return nLedgerNo;
    }
    
    public void setLastTran(Date dLastTran){
        this.dLastTran = dLastTran;
    }
    
    public Date getLastTran(){
        return dLastTran;
    }
    
    public void setRecdStat(String cRecdStat){
        this.cRecdStat = cRecdStat;
    }
    public String getRecdStat(){
        return cRecdStat;
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
        hash += (sStockIDx != null ? sStockIDx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvMaster)) {
            return false;
        }
        UnitInvMaster other = (UnitInvMaster) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)) ||
                (this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvMaster[sStockIDx=" + sStockIDx + " AND sBranchCd=" + sBranchCd +"]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return sBranchCd;
            case 3: return sLocatnCd;
            case 4: return nBinNumbr;
            case 5: return dAcquired;
            case 6: return dBegInvxx;
            case 7: return nBegQtyxx;
            case 8: return nQtyOnHnd;
            case 9: return nMinLevel;
            case 10: return nMaxLevel;
            case 11: return nAvgMonSl;
            case 12: return nAvgCostx;
            case 13: return cClassify;
            case 14: return nBackOrdr;
            case 15: return nResvOrdr;
            case 16: return nFloatQty;
            case 17: return nLedgerNo;
            case 18: return dLastTran;
            case 19: return cRecdStat;
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
        return "Inv_Master";
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
            case 3: sLocatnCd = (String) foValue; break;
            case 4: nBinNumbr = (int) foValue; break;
            case 5: dAcquired = (Date) foValue; break;
            case 6: dBegInvxx = (Date) foValue; break;
            case 7: nBegQtyxx = (Number) foValue; break;
            case 8: nQtyOnHnd = (Number) foValue; break;
            case 9: nMinLevel = (Number) foValue; break;
            case 10: nMaxLevel = (Number) foValue; break;
            case 11: nAvgMonSl = (Number) foValue; break;
            case 12: nAvgCostx = (Number) foValue; break;
            case 13: cClassify = (String) foValue; break;
            case 14: nBackOrdr = (Number) foValue; break;
            case 15: nResvOrdr = (Number) foValue; break;
            case 16: nFloatQty = (Number) foValue; break;
            case 17: nLedgerNo = (int) foValue; break;
            case 18: dLastTran = (Date) foValue; break;
            case 19: cRecdStat = (String) foValue; break;
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
