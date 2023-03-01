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
@Table(name="Inv_Serial")

/**
 * Inv_Serial table POJO
 * @author Michael Torres Cuison
 * @since 2018.07.13
 */
public class UnitInvSerial implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sSerialID")
    private String sSerialID;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
           
    @Column(name = "sSerial01")
    private String sSerial01;
    
    @Column(name = "sSerial02")
    private String sSerial02;
    
    @Column(name = "nUnitPrce")
    private Number nUnitPrce;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "cLocation")
    private String cLocation;
    
    @Column(name = "cSoldStat")
    private String cSoldStat;
    
    @Column(name = "cUnitType")
    private String cUnitType;
    
    @Column(name = "sCompnyID")
    private String sCompnyID;
    
    @Column(name = "sWarranty")
    private String sWarranty;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvSerial(){
        this.sSerialID = "";
        this.sBranchCd = "";
        this.sSerial01 = "";
        this.sSerial02 = "";
        this.nUnitPrce = 0.00;
        this.sStockIDx = "";
        this.cLocation = "";
        this.cSoldStat = "0";
        this.cUnitType = "1";
        this.sCompnyID = "";
        this.sWarranty = "";
        
        laColumns = new LinkedList();
        laColumns.add("sSerialID");
        laColumns.add("sBranchCd");
        laColumns.add("sSerial01");
        laColumns.add("sSerial02");
        laColumns.add("nUnitPrce");
        laColumns.add("sStockIDx");
        laColumns.add("cLocation");
        laColumns.add("cSoldStat");
        laColumns.add("cUnitType");
        laColumns.add("sCompnyID");
        laColumns.add("sWarranty");
        laColumns.add("dModified");
    }
    
    public void setSerialID(String sSerialID){
        this.sSerialID = sSerialID;
    }
    public String getSerialID(){
        return sSerialID;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setSerial01(String sSerial01){
        this.sSerial01 = sSerial01;
    }
    public String getSerial01(){
        return sSerial01;
    }
    
    public void setSerial02(String sSerial02){
        this.sSerial02 = sSerial02;
    }
    public String setSerial02(){
        return sSerial02;
    }
    
    public void setUnitPrce(Number nUnitPrce){
        this.nUnitPrce = nUnitPrce;
    }
    
    public Number getUnitPrce(){
        return nUnitPrce;
    }
    
    public void setStockIDx(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockIDx(){
        return sStockIDx;
    }
    
    public void setLocaton(String cLocation){
        this.cLocation = cLocation;
    }
    public String getLocaton(){
        return cLocation;
    }
    
    public void setSoldStat(String cSoldStat){
        this.cSoldStat = cSoldStat;
    }
    public String getSoldStat(){
        return cSoldStat;
    }
    
    public void setUnitType(String cUnitType){
        this.cUnitType = cUnitType;
    }
    public String getUnitType(){
        return cUnitType;
    }
    
    public void setCompanyID(String sCompnyID){
        this.sCompnyID = sCompnyID;
    }
    public String getCompanyID(){
        return sCompnyID;
    }
    
    public void setWarranty(String sWarranty){
        this.sWarranty = sWarranty;
    }
    public String getWarranty(){
        return sWarranty;
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
        hash += (sSerialID != null ? sSerialID.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvSerial)) {
            return false;
        }
        UnitInvSerial other = (UnitInvSerial) object;
        return !((this.sSerialID == null && other.sSerialID != null) || (this.sSerialID != null && !this.sSerialID.equals(other.sSerialID)) ||
                (this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvSerial[sSerialID=" + sSerialID + " AND sBranchCd=" + sBranchCd +"]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sSerialID;
            case 2: return sBranchCd;
            case 3: return sSerial01;
            case 4: return sSerial02;
            case 5: return nUnitPrce;
            case 6: return sStockIDx;
            case 7: return cLocation;
            case 8: return cSoldStat;
            case 9: return cUnitType;
            case 10: return sCompnyID;
            case 11: return sWarranty;
            case 12: return dModified;
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
        return "Inv_Serial";
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
            case 1: sSerialID = (String) foValue; break;
            case 2: sBranchCd = (String) foValue; break;
            case 3: sSerial01 = (String) foValue; break;
            case 4: sSerial02 = (String) foValue; break;
            case 5: nUnitPrce = (Number) foValue; break;
            case 6: sStockIDx = (String) foValue; break;
            case 7: cLocation = (String) foValue; break;
            case 8: cSoldStat = (String) foValue; break;
            case 9: cUnitType = (String) foValue; break;
            case 10: sCompnyID = (String) foValue; break;
            case 11: sWarranty = (String) foValue; break;
            case 12: dModified = (Date) foValue; break;
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
