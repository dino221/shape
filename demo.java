package  book.java.swing.models;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class TableDemo3 extends JFrame {
    private static final long serialVersionUID = 1L;

    public TableDemo3 () {
        setTitle("Demonstracija rada s tablicom");
        setSize(500, 300);
        setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
        initGUI();
    }

    private void initGUI() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        Object [] [] podatci = {
            { "Zagreb", 10000},
            { "Split", 21000},
            { "Osijek", 31000},
            { "Hum na Sutli", 49231},
            { "Zadar", 23000},
        };
        Object [] zaglavlje = { "Grad", "Postanski broj"};
        DefaultTableModel model = 
            new DefaultTableModel (podatci, zaglavlje) {
                private static final long serialVersionUID = 1L;
                @Override
                public Class<?> get ColumnClass (int columnIndex) {
                    return columnINdex == 0 ? String.class : Integer.class;
                }
                @Overrride
                public boolean isCellEditable (int row, int column) {
                    return column == 1;
                }
            };
            JTable tablica = new JTable(model);

            cp.add(new JScrollPane(tablica), BorderLayout.CENTER);
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater ( () ->{
            new TableDemo3() .setVisible(true);
        });
    }
}
