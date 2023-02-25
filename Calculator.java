import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class Calculator implements ActionListener {    
    JLabel numberLabel;    
    JTextField textField;    
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, dot, c, plus, minus, multi, divide, expro, mod, percent, back, equal, all;    
    JFrame window;
    CalNumber cal;    
    public Calculator() {          
        window = new JFrame("Programm Calculator Number");       
        Container container = window.getContentPane();       
        container.setLayout( new FlowLayout() );           
        numberLabel = new JLabel( "Show Number : " );       
        container.add( numberLabel );       
        textField = new JTextField( 15 );       
        container.add( textField );       
        
        mod = new JButton("mod");       
        mod.addActionListener(this);
        container.add( mod );
        percent = new JButton("%");       
        percent.addActionListener(this);
        container.add( percent );
        all = new JButton("+/-");       
        all.addActionListener(this);
        container.add( all );
        c = new JButton("c");       
        c.addActionListener(this);
        container.add( c );
        back = new JButton(" ce ");       
        back.addActionListener(this);
        container.add( back );
        
        btn9 = new JButton("   9   ");       
        btn9.addActionListener(this);       
        container.add( btn9 );       
        btn8 = new JButton("   8   ");       
        btn8.addActionListener(this);       
        container.add( btn8 );       
        btn7 = new JButton("   7   ");       
        btn7.addActionListener(this);       
        container.add( btn7 ); 
        divide = new JButton("      /      ");       
        divide.addActionListener(this);
        container.add( divide );

        btn6 = new JButton("   6  ");       
        btn6.addActionListener(this);       
        container.add( btn6 ); 
        btn5 = new JButton("   5   ");       
        btn5.addActionListener(this);       
        container.add( btn5 ); 
        btn4 = new JButton("   4   ");       
        btn4.addActionListener(this);       
        container.add( btn4 );
        multi = new JButton("      *      ");       
        multi.addActionListener(this);
        container.add( multi );

        btn3 = new JButton("   3   ");       
        btn3.addActionListener(this);       
        container.add( btn3 ); 
        btn2 = new JButton("   2   ");       
        btn2.addActionListener(this);       
        container.add( btn2 ); 
        btn1 = new JButton("   1   ");       
        btn1.addActionListener(this);       
        container.add( btn1 );  
        minus = new JButton("      -      ");       
        minus.addActionListener(this);
        container.add( minus );

        btn0 = new JButton(" 0 ");       
        btn0.addActionListener(this);       
        container.add( btn0 );
        dot = new JButton(".");       
        dot.addActionListener(this);       
        container.add( dot ); 
        equal = new JButton("=");       
        equal.addActionListener(this);       
        container.add( equal );
        expro = new JButton("^");       
        expro.addActionListener(this);
        container.add( expro );
        plus = new JButton("      +      ");       
        plus.addActionListener(this);
        container.add( plus );      
                 
        window.setSize(310,250);       
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        window.setVisible(true);    
    } 

    public void actionPerformed( ActionEvent event ){
        
        if (event.getSource() == c) {
            cal.setValue1(0.0);
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == back) {
            cal.change();
            textField.setText(cal.toString());

        }else if (event.getSource() == plus) {
            cal.setValue2(textField.getText());
            cal.setOpt("+");
            cal.setFree();
            textField.setText(cal.toString());


        }else if (event.getSource() == minus) {
            cal.setValue2(textField.getText());
            cal.setOpt("-");
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == multi) {
            cal.setValue2(textField.getText());
            cal.setOpt("*");
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == divide) {
            cal.setValue2(textField.getText());
            cal.setOpt("/");
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == mod) {
            cal.setValue2(textField.getText());
            cal.setOpt("mod");
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == expro) {
            cal.setValue2(textField.getText());
            cal.setOpt("^");
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == percent) {
            cal.setValue2(textField.getText());
            cal.setOpt("%");
            cal.setFree();
            textField.setText(cal.toString());

        }else if (event.getSource() == btn1) {
            cal.addValue("1");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn2) {
            cal.addValue("2");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn3) {
            cal.addValue("3");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn4) {
            cal.addValue("4");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn5) {
            cal.addValue("5");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn6) {
            cal.addValue("6");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn7) {
            cal.addValue("7");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn8) {
            cal.addValue("8");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn9) {
            cal.addValue("9");
            textField.setText(cal.toString());

        }else if (event.getSource() == btn0) {
            cal.addValue("0");
            textField.setText(cal.toString());

        }else if (event.getSource() == dot) {
            cal.addValue(".");
            textField.setText(cal.toString());

        }else if(event.getSource() == equal){
            cal.Cal_Value(textField.getText());
            textField.setText(cal.toString());
        }
    }

    public static void main(String[] args) {
        Calculator e1 = new Calculator();
        e1.cal = new CalNumber();
        e1.textField.setText(e1.cal.toString());
    }
}