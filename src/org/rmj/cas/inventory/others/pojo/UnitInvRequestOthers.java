package org.rmj.cas.inventory.others.pojo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import org.rmj.appdriver.iface.GEntity;

/**
 * Inv_Request_Detail other info table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.22
 */
public class UnitInvRequestOthers implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "xQtyOnHnd")
    private Number xQtyOnHnd;
    
    @Column(name = "nResvOrdr")
    private Number nResvOrdr;
    
    @Column(name = "nBackOrdr")
    private Number nBackOrdr;
    
    @Column(name = "nReorderx")
    private Number nReorderx;
    
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
    
    @Column(name = "sOrderNox")
    private String sOrderNox;
    
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
        this.nQtyOnHnd = 0;
        this.xQtyOnHnd = 0;
        this.nResvOrdr = 0;
        this.nBackOrdr = 0;
        this.nReorderx = 0;
        this.nLedgerNo = 0;
        this.sBarCodex = "";
        this.sDescript = "";
        this.sOrigCode = ""; //original bar code
        this.sOrigDesc = ""; //original description
        this.sOrderNox = ""; //order transaction number
        this.sParentID = ""; //parent unit stock id
        this.xParntQty = 0; //parent quanity used
        this.xQuantity = 0; //equivalent qty of this item to the parent
        this.sInvTypNm = "";
        this.sMeasurNm = "";
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("nQtyOnHnd");
        laColumns.add("xQtyOnHnd");
        laColumns.add("nResvOrdr");
        laColumns.add("nBackOrdr");
        laColumns.add("nReorderx");
        laColumns.add("nLedgerNo");
        laColumns.add("sBarCodex");
        laColumns.add("sDescript");
        laColumns.add("sOrigCode");
        laColumns.add("sOrigDesc");
        laColumns.add("sOrderNox");
        laColumns.add("sParentID");
        laColumns.add("xParntQty");
        laColumns.add("xQuantity");
        laColumns.add("xQuantity");
        laColumns.add("sInvTypNm");
        laColumns.add("sMeasurNm");
    }
    
    public UnitInvRequestOthers(){
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
        if (!(object instanceof UnitInvRequestOthers)) {
            return false;
        }
        UnitInvRequestOthers other = (UnitInvRequestOthers) object;
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
            case 4: return nResvOrdr;
            case 5: return nBackOrdr;
            case 6: return nReorderx;
            case 7: return nLedgerNo;
            case 8: return sBarCodex;
            case 9: return sDescript;
            case 10: return sOrigCode;
            case 11: return sOrigDesc;
            case 12: return sOrderNox;
            case 13: return sParentID;
            case 14: return xParntQty;
            case 15: return xQuantity;
            case 16: return xQuantity;
            case 17: return sInvTypNm;
            case 18: return sMeasurNm;
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
            case 4: nResvOrdr = (Number) foValue; break; 
            case 5: nBackOrdr = (Number) foValue; break; 
            case 6: nReorderx = (Number) foValue; break; 
            case 7: nLedgerNo = (int) foValue; break; 
            case 8: sBarCodex = (String) foValue; break; 
            case 9: sDescript = (String) foValue; break; 
            case 10: sOrigCode = (String) foValue; break;
            case 11: sOrigDesc = (String) foValue; break;
            case 12: sOrderNox = (String) foValue; break;
            case 13: sParentID = (String) foValue; break;
            case 14: xParntQty = (int) foValue; break;
            case 15: xQuantity = (int) foValue; break;
            case 16: xQuantity = (int) foValue; break;
            case 17: sInvTypNm = (String) foValue; break;
            case 18: sMeasurNm = (String) foValue; break;
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