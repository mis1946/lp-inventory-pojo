package org.rmj.cas.inventory.others.pojo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import org.rmj.appdriver.iface.GEntity;

/**
 * Daily_Production_Inventory other info table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.26
 */
public class UnitDailyProductionInvOthers implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "sBarCodex")
    private String sBarCodex;
    
    @Column(name = "sDescript")
    private String sDescript;
    
    @Column(name = "sMeasurNm")
    private String sMeasurNm;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    
    @Column(name = "sBrandNme")
    private String sBrandNme;

    LinkedList laColumns = null;
    
    private void initRecord(){
        this.sStockIDx = "";
        this.sBarCodex = "";
        this.sDescript = "";
        this.sMeasurNm = "";
        this.nQtyOnHnd = 0;
        this.sBrandNme = "";
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("sBarCodex");
        laColumns.add("sDescript");
        laColumns.add("sMeasurNm");
        laColumns.add("nQtyOnHnd");
        laColumns.add("sBrandNme");
    }
    
    public UnitDailyProductionInvOthers(){
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
        if (!(object instanceof UnitDailyProductionInvOthers)) {
            return false;
        }
        UnitDailyProductionInvOthers other = (UnitDailyProductionInvOthers) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.others.pojo.UnitInvTransferInvOthers[sStockIDx=" + sStockIDx + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return sBarCodex;
            case 3: return sDescript;
            case 4: return sMeasurNm;
            case 5: return nQtyOnHnd;
            case 6: return sBrandNme;
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
            case 2: sBarCodex = (String) foValue; break; 
            case 3: sDescript = (String) foValue; break; 
            case 4: sMeasurNm = (String) foValue; break; 
            case 5: nQtyOnHnd = (Number) foValue; break;
            case 6: sBrandNme = (String) foValue; break; 
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
