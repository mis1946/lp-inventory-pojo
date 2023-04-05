package org.rmj.cas.inventory.others.pojo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import org.rmj.appdriver.iface.GEntity;

/**
 * Inv_Transfer_Detail other info table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.22
 */
public class UnitInvAdjustmentOthers implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "xQtyOnHnd")
    private Number xQtyOnHnd;
    
    @Column(name = "nLedgerNo")
    private int nLedgerNo;
    
    @Column(name = "sBarCodex")
    private String sBarCodex;
    
    @Column(name = "sDescript")
    private String sDescript;
    
    @Column(name = "sOrigCode")
    private String sOrigCode;
    
    @Column(name = "sOrigDesc")
    private String sOrigDesc;
    
    @Column(name = "sParentID")
    private String sParentID;
    
    @Column(name = "xParntQty")
    private Number xParntQty;
    
    @Column(name = "xQuantity")
    private Number xQuantity;
    
    @Column(name = "sInvTypNm")
    private String sInvTypNm;
    
    @Column(name = "sMeasurNm")
    private String sMeasurNm;
    
    LinkedList laColumns = null;
    
    private void initRecord(){
        this.sStockIDx = "";
        this.nQtyOnHnd = 0.00;
        this.xQtyOnHnd = 0.00;
        this.nLedgerNo = 0;
        this.sBarCodex = "";
        this.sDescript = "";
        this.sOrigCode = ""; //original bar code
        this.sOrigDesc = ""; //original description
        this.sParentID = ""; //parent unit stock id
        this.xParntQty = 0.00; //parent quanity used
        this.xQuantity = 0.00; //equivalent qty of this item to the parent
        this.sInvTypNm = "";
        this.sMeasurNm = "";
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("nQtyOnHnd");
        laColumns.add("xQtyOnHnd");
        laColumns.add("nLedgerNo");
        laColumns.add("sBarCodex");
        laColumns.add("sDescript");
        laColumns.add("sOrigCode");
        laColumns.add("sOrigDesc");
        laColumns.add("sParentID");
        laColumns.add("xParntQty");
        laColumns.add("xQuantity");
        laColumns.add("xQuantity");
        laColumns.add("sInvTypNm");
        laColumns.add("sMeasurNm");
    }
    
    public UnitInvAdjustmentOthers(){
        initRecord();
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sStockIDx != null ? sStockIDx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UnitInvAdjustmentOthers)) {
            return false;
        }
        UnitInvAdjustmentOthers other = (UnitInvAdjustmentOthers) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.others.pojo.UnitInvTransferDetailOthers[sStockIDx=" + sStockIDx + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return nQtyOnHnd;
            case 3: return xQtyOnHnd;
            case 4: return nLedgerNo;
            case 5: return sBarCodex;
            case 6: return sDescript;
            case 7: return sOrigCode;
            case 8: return sOrigDesc;
            case 9: return sParentID;
            case 10: return xParntQty;
            case 11: return xQuantity;
            case 12: return sInvTypNm;
            case 13: return sMeasurNm;
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
            case 1: sStockIDx = (String)foValue; break; 
            case 2: nQtyOnHnd = (Number) foValue; break; 
            case 3: xQtyOnHnd = (Number) foValue; break; 
            case 4: nLedgerNo = (int) foValue; break; 
            case 5: sBarCodex = (String) foValue; break; 
            case 6: sDescript = (String) foValue; break; 
            case 7: sOrigCode = (String) foValue; break;
            case 8: sOrigDesc = (String) foValue; break;
            case 9: sParentID = (String) foValue; break;
            case 10: xParntQty = (Number) foValue; break;
            case 11: xQuantity = (Number) foValue; break;
            case 12: sInvTypNm = (String) foValue; break;
            case 13: sMeasurNm = (String) foValue; break;
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