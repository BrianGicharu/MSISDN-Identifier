package workingArea;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Frame extends javax.swing.JFrame {

    public static JSONArray eList;

    private JTextField countryDialCodeQueried = new JTextField();
    private JTextField CountryNameLbl;
    private JPanel bottomPanel;
    private JTextField countryCodeQueried;
    private JTextField countryNameQueried;
    private JPanel dataEntryPanel;
    private JButton fetchDataJbtn;
    private JLabel foundCountryLbl;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JPanel mapsOrJsonView;
    private JTextField searchByCodeLbl;
    private JPanel squarePanel;
    private JButton viewChangeBtn;

    public Frame() {
        initComponents();
        showValues();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        dataEntryPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CountryNameLbl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchByCodeLbl = new javax.swing.JTextField();
        fetchDataJbtn = new javax.swing.JButton();
        foundCountryLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        countryNameQueried = new javax.swing.JTextField();
        squarePanel = new javax.swing.JPanel();
        countryCodeQueried = new javax.swing.JTextField();
        mapsOrJsonView = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        viewChangeBtn = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(850, 450));

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Search By Country");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("SearchByCodeLbl");

        fetchDataJbtn.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        fetchDataJbtn.setText("Check");
        fetchDataJbtn.setToolTipText("");
        fetchDataJbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fetchDataJbtnMouseClicked(evt);
            }
        });

        foundCountryLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        foundCountryLbl.setText("Country Name");

        countryDialCodeQueried.setEditable(false);
        countryDialCodeQueried.setBackground(new java.awt.Color(255, 255, 255));
        countryDialCodeQueried.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        countryDialCodeQueried.setText("+000");
        countryDialCodeQueried.setToolTipText("");
        countryDialCodeQueried.setDragEnabled(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Country Code");

        countryNameQueried.setEditable(false);
        countryNameQueried.setBackground(new java.awt.Color(255, 255, 255));
        countryNameQueried.setDragEnabled(true);

        javax.swing.GroupLayout squarePanelLayout = new javax.swing.GroupLayout(squarePanel);
        squarePanel.setLayout(squarePanelLayout);
        squarePanelLayout.setHorizontalGroup(
                squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        squarePanelLayout.setVerticalGroup(
                squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 256, Short.MAX_VALUE)
        );

        countryCodeQueried.setEditable(false);
        countryCodeQueried.setBackground(new java.awt.Color(255, 255, 255));
        countryCodeQueried.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        countryCodeQueried.setText("_");
        countryCodeQueried.setDragEnabled(true);

        javax.swing.GroupLayout dataEntryPanelLayout = new javax.swing.GroupLayout(dataEntryPanel);
        dataEntryPanel.setLayout(dataEntryPanelLayout);
        dataEntryPanelLayout.setHorizontalGroup(
                dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dataEntryPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(squarePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(dataEntryPanelLayout.createSequentialGroup()
                                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataEntryPanelLayout.createSequentialGroup()
                                                                .addComponent(foundCountryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(countryNameQueried, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataEntryPanelLayout.createSequentialGroup()
                                                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(CountryNameLbl)
                                                                        .addComponent(searchByCodeLbl))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fetchDataJbtn))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataEntryPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(5, 5, 5)
                                                                .addComponent(countryDialCodeQueried, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(countryCodeQueried, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)))
                                                .addGap(5, 5, 5))))
        );
        dataEntryPanelLayout.setVerticalGroup(
                dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dataEntryPanelLayout.createSequentialGroup()
                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(dataEntryPanelLayout.createSequentialGroup()
                                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CountryNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(searchByCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(fetchDataJbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(foundCountryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(countryNameQueried, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dataEntryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(countryDialCodeQueried)
                                        .addComponent(countryCodeQueried))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(squarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        viewChangeBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewChangeBtn.setText("TABLE VIEW");
        viewChangeBtn.setToolTipText("Switch to Map or Table View");
        viewChangeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewChangeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mapsOrJsonViewLayout = new javax.swing.GroupLayout(mapsOrJsonView);
        mapsOrJsonView.setLayout(mapsOrJsonViewLayout);
        mapsOrJsonViewLayout.setHorizontalGroup(
                mapsOrJsonViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mapsOrJsonViewLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(viewChangeBtn)
                                .addGap(0, 253, Short.MAX_VALUE))
        );
        mapsOrJsonViewLayout.setVerticalGroup(
                mapsOrJsonViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(mapsOrJsonViewLayout.createSequentialGroup()
                                .addComponent(viewChangeBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
                bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
                bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dataEntryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mapsOrJsonView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dataEntryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mapsOrJsonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void fetchDataJbtnMouseClicked(java.awt.event.MouseEvent evt) {
        fetchData();
    }

    private void viewChangeBtnMouseClicked(java.awt.event.MouseEvent evt) {
        changeView();
    }

    private static void fetchData(){

    }
    private void changeView(){
        if(viewChangeBtn.getText().equals("TABLE VIEW"))
            viewChangeBtn.setText("MAPS VIEW");
        else if(viewChangeBtn.getText().equals("MAPS VIEW"))
            viewChangeBtn.setText("TABLE VIEW");
        else
            viewChangeBtn.setText("");
    }
    private static void parseEmpObj(JSONObject emp){
        JSONObject  empObj = (JSONObject) emp.get("data");
        String countryName, dialCode, code;
        countryName = (String) empObj.get("name");
        dialCode = (String) empObj.get("dial_code");
        code = (String) empObj.get("code");
    }

    public static void showValues(){
        StringBuilder contents= new StringBuilder(); String content = "", name = "";
        String fileName = "src/main/java/workingArea/dialCodes.json"; BufferedReader bf; JSONObject jb=null, jOb = null;
        File file; JSONArray arr;

        JSONParser parser = new JSONParser();
        try {
            file = new File(fileName);
            FileReader reader = new FileReader(file.getAbsolutePath());
            bf = new BufferedReader(new FileReader(fileName));
            while (bf.readLine()!=null) {
                contents.append(bf.readLine()).append("\n");
            }
            content = contents.toString();
            Object obj = parser.parse(content);
            jOb = (JSONObject) obj;
            arr = (JSONArray) obj;
            jb = (JSONObject) arr.get(1);

            //name = jOb.get("name").toString();
            String code = (String) jb.get("name");
            System.out.println(code);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println(name);

    }

}














