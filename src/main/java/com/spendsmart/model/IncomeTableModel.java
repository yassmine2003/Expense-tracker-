package com.spendsmart.model;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 1BestCsharp
 */
public class IncomeTableModel extends AbstractTableModel {

    // List to store the entries (rows) in the table
    private final List<IncomeEntry> entries;
    // Column names for the table
    private final String[] columnNames = {"Date","Description","Amount","Type"};
    
    /**
     * Constructor to initialize the table model.
     */
    public IncomeTableModel(){
        entries = new ArrayList<>();
    }
            

    /**
     * Add a new entry to the table.
     *
     * @param entry The expense or income entry to add.
     */
    public void addEntry(IncomeEntry entry){
        entries.add(entry);
        // Notify the table that a new row has been inserted
        fireTableRowsInserted(entries.size()-1, entries.size()-1);
    }
    
    
    @Override
    public int getRowCount() { return entries.size(); }

    @Override
    public int getColumnCount() { return columnNames.length;}

    @Override
    public String getColumnName(int column){ return columnNames[column]; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        IncomeEntry entry = entries.get(rowIndex);
        
        // Return the value for the cell based on the column index
        switch(columnIndex){
            case 0: return entry.getDate();
            case 1: return entry.getDescription();
            case 2: return entry.getAmount();
            case 3: return entry.getType();
            default: return null;
        }
        
        
    }
}