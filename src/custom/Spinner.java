
package custom;
import java.awt.Color;
import javax.swing.JSpinner;

public class Spinner extends JSpinner {

    public void setLabelText(String text) {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        editor.setLabelText(text);
    }

    public String getLabelText() {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        return editor.getLabelText();
    }

    public Spinner() {
        setOpaque(false);
        
        SpinnerUI juan = new SpinnerUI();
        juan.setBGcolor(BGcolor);
        juan.setFcolor(Fcolor);
        juan.setBtnFcolor(BtnFcolor);
        juan.setBtnFcolor(BtnFcolor);
        setUI(juan);
    }
    
    private Color BGcolor = new Color(255,255,255);
    private Color Fcolor =  new Color(255,255,0);
    private Color Btncolor = new Color(255,0,255);
    private Color BtnFcolor =  new Color(0,255,255);

    public Color getBGcolor() {
        return BGcolor;
    }

    public void setBGcolor(Color BGcolor) {
        this.BGcolor = BGcolor;
    }

    public Color getFcolor() {
        return Fcolor;
    }

    public void setFcolor(Color Fcolor) {
        this.Fcolor = Fcolor;
    }

    public Color getBtncolor() {
        return Btncolor;
    }

    public void setBtncolor(Color Btncolor) {
        this.Btncolor = Btncolor;
    }

    public Color getBtnFcolor() {
        return BtnFcolor;
    }

    public void setBtnFcolor(Color BtnFcolor) {
        this.BtnFcolor = BtnFcolor;
    }
    
    
    
    
}