import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.*;
import java.util.*;
import java.util.Stack;
import java.lang.String;
import javax.swing.border.*;

class sincalculator extends JFrame 
{
    JPanel p1,p2,p3,p4;
    JToggleButton tb;
    JButton num[],ab,fun[];
    JTextField in,out;
    Double res;
    String te;
    sincalculator()
    {
        super("Scientific Calculator");
        Image icon = Toolkit.getDefaultToolkit().getImage("callogo.png");
        setIconImage(icon);
        setSize(765,465);
        setLocation(400,190);
        setLayout(new BorderLayout(5,5));

        num=new JButton[11];
        fun=new JButton[23];
        tb = new JToggleButton();
        
        p1=new JPanel(new GridLayout(2,1,10,30));//upper
        p2=new JPanel(new GridLayout(4,3,10,10));//center
        p3=new JPanel(new GridLayout(4,2,10,10));//right
        p4=new JPanel(new GridLayout(4,4,10,10));//left
        
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.EAST);
        add(p4,BorderLayout.WEST);
        
        p1.setBackground(new Color(60,3,38));
        p1.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        p1.setPreferredSize(new Dimension(73, 171));

        p2.setBackground(new Color(81, 15, 15));
        p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        p3.setBackground(new Color(27, 72, 72));
        p3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        p4.setBackground(new Color(26, 44, 73));
        p4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p4.setPreferredSize(new Dimension(346, 214));

        num[7]=new JButton("7");
        num[7].setFont(new Font("SansSerif",1,24));
        num[7].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"7");
        }});
        num[7].setFocusPainted(false);
        num[7].setBorderPainted(false);
        p2.add(num[7]);

        num[8]=new JButton("8");
        num[8].setFont(new Font("SansSerif",1,24));
        num[8].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"8");
        }});
        num[8].setFocusPainted(false);
        num[8].setBorderPainted(false);
        p2.add(num[8]);

        num[9]=new JButton("9");
        num[9].setFont(new Font("SansSerif",1,24));
        num[9].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"9");
        }});
        num[9].setFocusPainted(false);
        num[9].setBorderPainted(false);
        p2.add(num[9]);

        num[4]=new JButton("4");
        num[4].setFont(new Font("SansSerif",1,24));
        num[4].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"4");
        }});
        num[4].setFocusPainted(false);
        num[4].setBorderPainted(false);
        p2.add(num[4]);

        num[5]=new JButton("5");
        num[5].setFont(new Font("SansSerif",1,24));
        num[5].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"5");
        }});
        num[5].setFocusPainted(false);
        num[5].setBorderPainted(false);
        p2.add(num[5]);
        
        num[6]=new JButton("6");
        num[6].setFont(new Font("SansSerif",1,24));
        num[6].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"6");
        }});
        num[6].setFocusPainted(false);
        num[6].setBorderPainted(false);
        p2.add(num[6]);

        num[1]=new JButton("1");
        num[1].setFont(new Font("SansSerif",1,24));
        num[1].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"1");
        }});
        num[1].setFocusPainted(false);
        num[1].setBorderPainted(false);
        p2.add(num[1]);
        
        num[2]=new JButton("2");
        num[2].setFont(new Font("SansSerif",1,24));
        num[2].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"2");
        }});
        num[2].setFocusPainted(false);
        num[2].setBorderPainted(false);
        p2.add(num[2]);

        num[3]=new JButton("3");
        num[3].setFont(new Font("SansSerif",1,24));
        num[3].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"3");
        }});
        num[3].setFocusPainted(false);
        num[3].setBorderPainted(false);
        p2.add(num[3]);

        num[10]=new JButton(".");
        num[10].setFont(new Font("SansSerif",1,25));
        num[10].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+".");
        }});
        num[10].setFocusPainted(false);
        num[10].setBorderPainted(false);
        p2.add(num[10]);

        num[0]=new JButton("0");
        num[0].setFont(new Font("SansSerif",1,24));
        num[0].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"0");
        }});
        num[0].setFocusPainted(false);
        num[0].setBorderPainted(false);
        p2.add(num[0]);

        tb.setBackground(new Color(81, 15, 15));
        tb.setFont(new Font("Tahoma", 1, 18));
        tb.setForeground(new Color(0, 144, 48));
        tb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {                                               
            if(tb.isSelected()==true)
            {
                ImageIcon oni = new ImageIcon(new ImageIcon("off.png").getImage().getScaledInstance(68,30,Image.SCALE_SMOOTH));
                tb.setIcon(oni);
                tb.setVerticalAlignment(SwingConstants.CENTER);  
                off();
            }
            else
            {
                ImageIcon oni = new ImageIcon(new ImageIcon("on.png").getImage().getScaledInstance(68,30,Image.SCALE_SMOOTH));
                tb.setIcon(oni);
                tb.setVerticalAlignment(SwingConstants.CENTER);
                on();    
            }
        }});
        tb.setFocusPainted(false);
        tb.setBorderPainted(false); 
        p2.add(tb);
        
        
        fun[0]=new JButton("AC");
        fun[0].setFont(new Font("SansSerif", 1, 24));
        fun[0].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText("");
            out.setText("0.");
        }});
        fun[0].setFocusPainted(false);
        fun[0].setBorderPainted(false);
        p3.add(fun[0]);

        fun[1]=new JButton("\u2190");
        fun[1].setFont(new Font("SansSerif", 1, 24));
        fun[1].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText().substring(0,in.getText().length()-1));
        }});
        fun[1].setFocusPainted(false);
        fun[1].setBorderPainted(false);
        p3.add(fun[1]);

        fun[2]=new JButton("+");
        fun[2].setFont(new Font("SansSerif", 1, 24));
        fun[2].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"+");
        }});
        fun[2].setFocusPainted(false);
        fun[2].setBorderPainted(false);
        p3.add(fun[2]);

        fun[3]=new JButton("-");
        fun[3].setFont(new Font("SansSerif", 1, 24));
        fun[3].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"-");
        }});
        fun[3].setFocusPainted(false);
        fun[3].setBorderPainted(false);
        p3.add(fun[3]);

        fun[4]=new JButton("*");
        fun[4].setFont(new Font("SansSerif", 1, 24));
        fun[4].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"*");
        }});
        fun[4].setFocusPainted(false);
        fun[4].setBorderPainted(false);
        p3.add(fun[4]);

        fun[5]=new JButton("/");
        fun[5].setFont(new Font("SansSerif", 1, 24));
        fun[5].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"/");
        }});
        fun[5].setFocusPainted(false);
        fun[5].setBorderPainted(false);
        p3.add(fun[5]);

        fun[6]=new JButton("=");
        fun[6].setFont(new Font("SansSerif", 1, 24));
        fun[6].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) { 
            te=in.getText()+":";
            if(te.length()>40)
            {
                JOptionPane.showMessageDialog(new JFrame(),"Expression is too lengthy to calculate","Error",2);
                te="0.0:";
            }
            te=te.replace("sin","@");
            te=te.replace("cos", "#");
            te=te.replace("tan", "&");
            te=te.replace("log", ";");
            te=te.replace("ln", "$");                     
            te=te.replace("abs", "?");
            te=te.replace("pi", "~");
            special(te);
            out.setText(String.valueOf(res));
        }});
        fun[6].setFocusPainted(false);
        fun[6].setBorderPainted(false);
        p3.add(fun[6]);

        ab = new JButton("i");
        ab.setFont(new Font("Century Schoolbook", 3, 24));
        ab.setBackground(new Color(27, 72, 72));
        ab.setForeground(new Color(204, 255, 204));
        ab.setToolTipText("About");
        ab.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JFrame(),"PROJECT BY- \n-STANISLAUS\n-PRAVEEN VUDDAGIRI\n-NABINOY BAROI\nUNDER GUIDANCE OF - \n-ASMA RANI (AP-CSE)","About",1); 
        }});
        ab.setFocusPainted(false);
        ab.setBorderPainted(false);
        p3.add(ab);

        fun[7]=new JButton("(");
        fun[7].setFont(new Font("SansSerif", 1, 24));
        fun[7].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"(");
            te=in.getText();
        }});
        fun[7].setFocusPainted(false);
        fun[7].setBorderPainted(false);
        p4.add(fun[7]);

        fun[8]=new JButton(")");
        fun[8].setFont(new Font("SansSerif", 1, 24));
        fun[8].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+")");
        }});
        fun[8].setFocusPainted(false);
        fun[8].setBorderPainted(false);
        p4.add(fun[8]);

        fun[9]=new JButton("\u03c0");
        fun[9].setFont(new Font("SansSerif", 1, 24));
        fun[9].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"pi");
        }});
        fun[9].setFocusPainted(false);
        fun[9].setBorderPainted(false);
        p4.add(fun[9]);

        fun[10]=new JButton("x!");
        fun[10].setFont(new Font("SansSerif", 1, 24));
        fun[10].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String fac = in.getText();
            in.setText(in.getText()+"!");

        }});
        fun[10].setFocusPainted(false);
        fun[10].setBorderPainted(false);
        p4.add(fun[10]);

        fun[11]=new JButton("sin");
        fun[11].setFont(new Font("SansSerif", 1, 24));
        fun[11].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"sin(");
        }});
        fun[11].setBorderPainted(false);
        fun[11].setFocusPainted(false);
        p4.add(fun[11]);

        fun[12]=new JButton("cos");
        fun[12].setFont(new Font("SansSerif", 1, 23));
        fun[12].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"cos(");
        }});
        fun[12].setBorderPainted(false);
        fun[12].setFocusPainted(false);
        p4.add(fun[12]);

        fun[13]=new JButton("tan");
        fun[13].setFont(new Font("SansSerif", 1, 24));
        fun[13].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"tan(");
        }});
        fun[13].setBorderPainted(false);
        fun[13].setFocusPainted(false);
        p4.add(fun[13]);

        fun[14]=new JButton("abs");
        fun[14].setFont(new Font("SansSerif", 1, 23));
        fun[14].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"abs(");
        }});
        fun[14].setBorderPainted(false);
        fun[14].setFocusPainted(false);
        p4.add(fun[14]);

        fun[15]=new JButton("log");
        fun[15].setFont(new Font("SansSerif", 1, 24));
        fun[15].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"log(");
        }});
        fun[15].setBorderPainted(false);
        fun[15].setFocusPainted(false);
        p4.add(fun[15]);

        fun[16]=new JButton("e\u02E3");
        fun[16].setFont(new Font("SansSerif", 1, 24));
        fun[16].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"e^");
        }});
        fun[16].setBorderPainted(false);
        fun[16].setFocusPainted(false);
        p4.add(fun[16]);

        fun[17]=new JButton("ln");
        fun[17].setFont(new Font("SansSerif", 1, 24));
        fun[17].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"ln(");
        }});
        fun[17].setBorderPainted(false);
        fun[17].setFocusPainted(false);
        p4.add(fun[17]);

        fun[18]=new JButton("x\u00B2");
        fun[18].setFont(new Font("SansSerif", 1, 24));
        fun[18].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String x2 = in.getText();
            in.setText(in.getText()+"^2");
        }});
        fun[18].setBorderPainted(false);
        fun[18].setFocusPainted(false);
        p4.add(fun[18]);

        fun[19]=new JButton("x\u02B8");
        fun[19].setFont(new Font("SansSerif", 1, 24));
        fun[19].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"^");
        }});
        fun[19].setBorderPainted(false);
        fun[19].setFocusPainted(false);
        p4.add(fun[19]);

        fun[20]=new JButton("\u221Ax");
        fun[20].setFont(new Font("SansSerif", 1, 24));
        fun[20].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"^0.5");
        }});
        fun[20].setBorderPainted(false);
        fun[20].setFocusPainted(false);
        p4.add(fun[20]);

        fun[21]=new JButton("\u221Bx");
        fun[21].setFont(new Font("SansSerif", 1, 24));
        fun[21].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"^0.333");
        }});
        fun[21].setBorderPainted(false);
        fun[21].setFocusPainted(false);
        p4.add(fun[21]);

        fun[22]=new JButton("1/x");
        fun[22].setFont(new Font("SansSerif", 1, 24));
        fun[22].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            in.setText(in.getText()+"1/");
        }});
        fun[22].setBorderPainted(false);
        fun[22].setFocusPainted(false);
        p4.add(fun[22]);

        in=new JTextField();
        in.setFont(new Font("SansSerif", 1, 36));
        in.setHorizontalAlignment(JTextField.RIGHT);
        in.setToolTipText("Input");
        out =new JTextField();
        out.setFont(new Font("SansSerif", 1, 36));
        out.setHorizontalAlignment(JTextField.RIGHT);
        out.setToolTipText("Output");
        out.setEditable(false);
        p1.add(in);
        p1.add(out);
        
        tb.setSelected(true);
        ImageIcon oni = new ImageIcon(new ImageIcon("off.png").getImage().getScaledInstance(68,30,Image.SCALE_SMOOTH));
        tb.setIcon(oni);
        tb.setVerticalAlignment(SwingConstants.CENTER); 
        tb.setFocusPainted(false);
        tb.setToolTipText("On/Off");
        tb.setContentAreaFilled(false);
        off();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    public void on()
    {
        in.setEnabled(true);
        in.setBackground(new Color(194, 182, 182));
        in.setForeground(new Color(0,0,0));

        out.setEnabled(true);
        out.setBackground(new Color(194, 182, 182));
        out.setForeground(new Color(0,0,0));
        out.setText("0.");

        num[0].setBackground(new Color(225,12,12));
        num[0].setForeground(new Color(0,0,0));
        num[0].setEnabled(true);
        num[1].setBackground(new Color(225,12,12));
        num[1].setForeground(new Color(0,0,0));
        num[1].setEnabled(true);
        num[2].setBackground(new Color(225,12,12));
        num[2].setForeground(new Color(0,0,0));
        num[2].setEnabled(true);
        num[3].setBackground(new Color(225,12,12));
        num[3].setForeground(new Color(0,0,0));
        num[3].setEnabled(true);
        num[4].setBackground(new Color(225,12,12));
        num[4].setForeground(new Color(0,0,0));
        num[4].setEnabled(true);
        num[5].setBackground(new Color(225,12,12));
        num[5].setForeground(new Color(0,0,0));
        num[5].setEnabled(true);
        num[6].setBackground(new Color(225,12,12));
        num[6].setForeground(new Color(0,0,0));
        num[6].setEnabled(true);
        num[7].setBackground(new Color(225,12,12));
        num[7].setForeground(new Color(0,0,0));
        num[7].setEnabled(true);
        num[8].setBackground(new Color(225,12,12));
        num[8].setForeground(new Color(0,0,0));
        num[8].setEnabled(true);
        num[9].setBackground(new Color(225,12,12));
        num[9].setForeground(new Color(0,0,0));
        num[9].setEnabled(true);
        num[10].setBackground(new Color(225,12,12));
        num[10].setForeground(new Color(0,0,0));
        num[10].setEnabled(true);
                
        fun[0].setBackground(new Color(22, 146, 146));
        fun[0].setForeground(new Color(0,0,0));
        fun[0].setEnabled(true);
        fun[1].setBackground(new Color(22, 146, 146));
        fun[1].setForeground(new Color(0,0,0));
        fun[1].setEnabled(true);
        fun[2].setBackground(new Color(22, 146, 146));
        fun[2].setForeground(new Color(0,0,0));
        fun[2].setEnabled(true);
        fun[3].setBackground(new Color(22, 146, 146));
        fun[3].setForeground(new Color(0,0,0));
        fun[3].setEnabled(true);
        fun[4].setBackground(new Color(22, 146, 146));
        fun[4].setForeground(new Color(0,0,0));
        fun[4].setEnabled(true);
        fun[5].setBackground(new Color(22, 146, 146));
        fun[5].setForeground(new Color(0,0,0));
        fun[5].setEnabled(true);
        fun[6].setBackground(new Color(22, 146, 146));
        fun[6].setForeground(new Color(0,0,0));
        fun[6].setEnabled(true);
                
        fun[7].setBackground(new Color(55, 128, 246));
        fun[7].setForeground(new Color(0,0,0));
        fun[7].setEnabled(true);
        fun[8].setBackground(new Color(55, 128, 246));
        fun[8].setForeground(new Color(0,0,0));
        fun[8].setEnabled(true);
        fun[9].setBackground(new Color(55, 128, 246));
        fun[9].setForeground(new Color(0,0,0));
        fun[9].setEnabled(true);
        fun[10].setBackground(new Color(55, 128, 246));
        fun[10].setForeground(new Color(0,0,0));
        fun[10].setEnabled(true);
        fun[11].setBackground(new Color(55, 128, 246));
        fun[11].setForeground(new Color(0,0,0));
        fun[11].setEnabled(true);
        fun[12].setBackground(new Color(55, 128, 246));
        fun[12].setForeground(new Color(0,0,0));
        fun[12].setEnabled(true);
        fun[13].setBackground(new Color(55, 128, 246));
        fun[13].setForeground(new Color(0,0,0));
        fun[13].setEnabled(true);
        fun[14].setBackground(new Color(55, 128, 246));
        fun[14].setForeground(new Color(0,0,0));
        fun[14].setEnabled(true);
        fun[15].setBackground(new Color(55, 128, 246));
        fun[15].setForeground(new Color(0,0,0));
        fun[15].setEnabled(true);
        fun[16].setBackground(new Color(55, 128, 246));
        fun[16].setForeground(new Color(0,0,0));
        fun[16].setEnabled(true);
        fun[17].setBackground(new Color(55, 128, 246));
        fun[17].setForeground(new Color(0,0,0));
        fun[17].setEnabled(true);
        fun[18].setBackground(new Color(55, 128, 246));
        fun[18].setForeground(new Color(0,0,0));
        fun[18].setEnabled(true);
        fun[19].setBackground(new Color(55, 128, 246));
        fun[19].setForeground(new Color(0,0,0));
        fun[19].setEnabled(true);
        fun[20].setBackground(new Color(55, 128, 246));
        fun[20].setForeground(new Color(0,0,0));
        fun[20].setEnabled(true);
        fun[21].setBackground(new Color(55, 128, 246));
        fun[21].setForeground(new Color(0,0,0));
        fun[21].setEnabled(true);
        fun[22].setBackground(new Color(55, 128, 246));
        fun[22].setForeground(new Color(0,0,0));
        fun[22].setEnabled(true);
    }
    public void off()
    {
        in.setEnabled(false);
        in.setBackground(new Color(102,102,102));
        in.setText("");

        out.setEnabled(false);
        out.setBackground(new Color(102,102,102));
        out.setText("");

        num[0].setBackground(new Color(102,102,102));
        num[0].setEnabled(false);
        num[1].setBackground(new Color(102,102,102));
        num[1].setEnabled(false);
        num[2].setBackground(new Color(102,102,102));
        num[2].setEnabled(false);
        num[3].setBackground(new Color(102,102,102));
        num[3].setEnabled(false);
        num[4].setBackground(new Color(102,102,102));
        num[4].setEnabled(false);
        num[5].setBackground(new Color(102,102,102));
        num[5].setEnabled(false);
        num[6].setBackground(new Color(102,102,102));
        num[6].setEnabled(false);
        num[7].setBackground(new Color(102,102,102));
        num[7].setEnabled(false);
        num[8].setBackground(new Color(102,102,102));
        num[8].setEnabled(false);
        num[9].setBackground(new Color(102,102,102));
        num[9].setEnabled(false);
        num[10].setBackground(new Color(102,102,102));
        num[10].setEnabled(false);

        fun[0].setBackground(new Color(102,102,102));
        fun[0].setEnabled(false);
        fun[1].setBackground(new Color(102,102,102));
        fun[1].setEnabled(false);
        fun[2].setBackground(new Color(102,102,102));
        fun[2].setEnabled(false);
        fun[3].setBackground(new Color(102,102,102));
        fun[3].setEnabled(false);
        fun[4].setBackground(new Color(102,102,102));
        fun[4].setEnabled(false);
        fun[5].setBackground(new Color(102,102,102));
        fun[5].setEnabled(false);
        fun[6].setBackground(new Color(102,102,102));
        fun[6].setEnabled(false);
        fun[7].setBackground(new Color(102,102,102));
        fun[7].setEnabled(false);
        fun[8].setBackground(new Color(102,102,102));
        fun[8].setEnabled(false);
        fun[9].setBackground(new Color(102,102,102));
        fun[9].setEnabled(false);
        fun[10].setBackground(new Color(102,102,102));
        fun[10].setEnabled(false);
        fun[11].setBackground(new Color(102,102,102));
        fun[11].setEnabled(false);
        fun[12].setBackground(new Color(102,102,102));
        fun[12].setEnabled(false);
        fun[13].setBackground(new Color(102,102,102));
        fun[13].setEnabled(false);
        fun[14].setBackground(new Color(102,102,102));
        fun[14].setEnabled(false);
        fun[15].setBackground(new Color(102,102,102));
        fun[15].setEnabled(false);
        fun[16].setBackground(new Color(102,102,102));
        fun[16].setEnabled(false);
        fun[17].setBackground(new Color(102,102,102));
        fun[17].setEnabled(false);
        fun[18].setBackground(new Color(102,102,102));
        fun[18].setEnabled(false);
        fun[19].setBackground(new Color(102,102,102));
        fun[19].setEnabled(false);
        fun[20].setBackground(new Color(102,102,102));
        fun[20].setEnabled(false);
        fun[21].setBackground(new Color(102,102,102));
        fun[21].setEnabled(false);
        fun[22].setBackground(new Color(102,102,102));
        fun[22].setEnabled(false);
    }

    double postfix(String te)
    {
        char ch;                
        String post="";
        Stack <Character> num=new Stack<Character>();
        for(int i=0;i<te.length();i++)
        {
            ch=te.charAt(i);
            if(Character.isDigit(ch)||ch=='.')
            {
                post+=ch;
                if(!((te.length()-1)<i))
                {
                   if(!(Character.isDigit(te.charAt(i+1))||te.charAt(i+1)=='.'))
                    {
                        post+='|';
                    }
                }
            }
            else if(ch=='(')
            {
                num.push(ch);
            }
            else if(ch==')')
            {
                while(num.peek()!='(')
                {
                    post+=num.pop();
                }
                num.pop();
            }
            else 
            {
                while(!num.isEmpty()&&!(num.peek()=='(')&&priority(ch)<=priority(num.peek()))
                {
                    post+=num.pop();
                }
                num.push(ch);
            }
      
        }
            while(!num.isEmpty())
            {
                post+=num.pop();
            }
            double res=evaluatepostfix(post);
            return(res);
    }
    double evaluatepostfix(String post)
    {
        double res=0;
        char ch;
        String d="";
        Stack<Double> num=new Stack<Double>();
        for(int j=0;j<post.length();j++)
        {
            ch=post.charAt(j);
            if(Character.isDigit(ch)||ch=='.'||ch=='|')
            {
                if(ch!='|')
                    d+=ch;
                if(ch=='|')
                {
                    num.push(Double.parseDouble(d));
                    d="";
                }
            }
            else if(ch!=':')
            {
                double n1,n2;   
                n1=num.pop();
                if(num.isEmpty())
                {
                    n2=0;
                }
                else
                    n2=num.pop();
                switch(ch)
                {
                    case '+':
                        num.push(n2+n1);
                        break;
                    case '-':
                        num.push(n2-n1);
                        break;
                    case '*':
                        num.push(n2*n1);
                        break;
                    case '/':
                        num.push(n2/n1);
                        break;
                    case '^':
                        double power;
                        power=Math.pow(n2,n1);
                        num.push(power);
                        break;
                }
            }
        }
            res=num.pop();
        return res;
    }
    int priority(char ch)
    {
        if(ch=='+'||ch=='-')
            return 1;
        if(ch=='*'||ch=='/')
            return 2;
        if(ch=='^')
            return 3;
        return 0;
    }

    void special(String te)
    {
        char c;
        String temp="";
        String rev=new StringBuffer(te).reverse().toString();
        int k=0;
        boolean flag=true;
        int sin,cos,tan,log,ln,abs,pi;
        try{
        if((sin=rev.indexOf("@"))!=-1)
        {
            sin=te.length()-sin-1;
            c=te.charAt(sin);
            for(int i=1;;i++)
            {
                c=te.charAt(sin+i);
                temp+=c;
                if(c==')')
                {
                    k=i;
                    break;
                }
            }
            while(flag==true)
            {
                if(count(temp,'(')!=count(temp,')'))
                {
                    for(int j=k+1;;j++)
                    {
                        c=te.charAt(sin+j);
                        temp+=c;
                        if(c==')')
                        {
                            break;
                        }
                    }
                }
                else
                    flag=false;
            }
            Double m = Math.sin(postfix((temp+":")));
            String med;
            if(m<0.0){
                med = "(0.0"+String.valueOf(m)+")";
            }
            else{
            med=String.valueOf(Math.sin(postfix((temp+":"))));
            }
            temp="@"+temp;
            te=te.replace(temp,med);
            temp="";
            flag=true;
        } 
        if((cos=rev.indexOf("#"))!=-1)
        {
            cos=te.length()-cos-1;
            c=te.charAt(cos);
            for(int i=1;;i++)
            {
                c=te.charAt(cos+i);
                temp+=c;
                if(c==')')
                {
                    k=i;
                    break;
                }
            }

            while(flag==true)
            {
                if(count(temp,'(')!=count(temp,')'))
                {
                for(int j=k+1;;j++)
                {
                    c=te.charAt(cos+j);
                    temp+=c;
                    if(c==')')
                    {
                        break;
                    }
                }

                }
                else
                {
                    flag=false;
                }
                   
            }
            Double m = Math.cos(postfix((temp+":")));
            String med;
            if(m<0.0){
                med = "(0.0"+String.valueOf(m)+")";
            }
            else{
            med=String.valueOf(Math.cos(postfix((temp+":"))));
            }
            temp="#"+temp;
            te=te.replace(temp,med);
            temp="";
            flag=true;
        } 

        if((tan=rev.indexOf("&"))!=-1)
        {
            tan=te.length()-tan-1;
            c=te.charAt(tan);
            for(int i=1;;i++)
            {
                c=te.charAt(tan+i);
                temp+=c;
                if(c==')')
                {
                    k=i;
                    break;
                }
            }
            
            while(flag==true)
            {
                if(count(temp,'(')!=count(temp,')'))
                {
                for(int j=k+1;;j++)
                {
                    c=te.charAt(tan+j);
                    temp+=c;
                    if(c==')')
                    {
                        break;
                    }
                }
                }
                else
                    flag=false;
                    
            }
            Double m = Math.tan(postfix((temp+":")));
            String med;
            if(m<0.0){
                med = "(0.0"+String.valueOf(m)+")";
            }
            else{
            med=String.valueOf(Math.tan(postfix((temp+":"))));
            }
            temp="&"+temp;
            te=te.replace(temp,med);
            temp="";
            flag=true;
        } 

        if((log=rev.indexOf(";"))!=-1)
        {
            log=te.length()-log-1;
            c=te.charAt(log);
            for(int i=1;;i++)
            {
                c=te.charAt(log+i);
                temp+=c;
                if(c==')')
                {
                    k=i;
                    break;
                }
                
            }
            
            while(flag==true)
            {
                if(count(temp,'(')!=count(temp,')'))
                {
                for(int j=k+1;;j++)
                {
                    c=te.charAt(log+j);
                    temp+=c;
                    if(c==')')
                    {
                        
                        break;
                    }
                }

                }
                else
                flag=false;
            }
            String med=String.valueOf(Math.log10(postfix((temp+":"))));
            temp=";"+temp;
            te=te.replace(temp,med);
            temp="";
            flag=true;
        } 

        if((ln=rev.indexOf("$"))!=-1)
        {
            ln=te.length()-ln-1;
            c=te.charAt(ln);
            for(int i=1;;i++)
            {
                c=te.charAt(ln+i);
                temp+=c;
                if(c==')')
                {
                    k=i;
                    break;
                }
                
            }
            
           while(flag==true)
           {
                if(count(temp,'(')!=count(temp,')'))
                {
                for(int j=k+1;;j++)
                {
                    c=te.charAt(ln+j);
                    temp+=c;
                    if(c==')')
                    {
                        break;
                    }
                }

                }
                else
                flag=false;
                    flag=false;
            }
            String med=String.valueOf(Math.log(postfix((temp+":"))));
            temp="$"+temp;
            te=te.replace(temp,med);
            temp="";
            flag=true;
        } 

        if((abs=rev.indexOf("?"))!=-1)
        {
            abs=te.length()-abs-1;
            c=te.charAt(abs);
            for(int i=1;;i++)
            {
                c=te.charAt(abs+i);
                temp+=c;
                if(c==')')
                {
                    k=i;
                    break;
                }
            }
            
            while(flag==true)
            {
                if(count(temp,'(')!=count(temp,')'))
                {
                for(int j=k+1;;j++)
                {
                    c=te.charAt(abs+j);
                    temp+=c;
                    if(c==')')
                    {
                        break;
                    }
                }

                }
                else
                flag=false;
            }
            String med=String.valueOf(Math.abs(postfix((temp+":"))));
            temp="?"+temp;
            te=te.replace(temp,med);
            temp="";
            flag=true;
        } 

        if((pi=rev.indexOf("~"))!=-1)
        {
            te=te.replace("~",String.valueOf(Math.PI));
            temp="";
            flag=true;
        } 

        if((pi=rev.indexOf("e"))!=-1)
        {
            te=te.replace("e",String.valueOf(Math.exp(1)));
            temp="";
            flag=true;
        } 

        if((pi=te.indexOf("!"))!=-1)
        {
            c=te.charAt(pi-1);
            temp=c+"!";
            int f=Character.getNumericValue(c);
            if(te.length()>3)
            {
                c=te.charAt(pi-2);
                if(Character.isDigit(c)||c=='.')
                {
                    JOptionPane.showMessageDialog(new JFrame(),"Factorial Value Overflow!","Error",JOptionPane.WARNING_MESSAGE);
                    in.setText("");
                    te="0.00:";
                }
            }
            te=te.replace(temp,String.valueOf(factorial(f)));
            temp="";
            flag=true;
        } 

        res=postfix(te);
        }catch(Exception ep){
            JOptionPane.showMessageDialog(new JFrame(),"Invalid Expresssion!!!","Error",2);
            out.setText("0.");
        }
    }
    long factorial(int f)
    {
        long fact=1;
        for(int i=1;i<=f;i++)
        {
            fact*=i;
        }
        return fact;
    }
    int count(String temp,char c)
    {
        int i=0;
        for(char ch:temp.toCharArray())
        {
            if(ch==c)
                i++;
        }
        return i;
    }
    public static void main(String[] args)
    {
        new sincalculator();
    }
}