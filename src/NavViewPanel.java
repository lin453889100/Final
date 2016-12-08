

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jrimland
 */
public class NavViewPanel extends JPanel{

    NavViewBottomMenuPanel menu;
    NavViewSplashPanel splash;
    
    OptionsView o_view;
    InstructionView i_view;
    MainView m_view;
    CreditView c_view;
    GameView g_view;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavViewSplashPanel();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
    
    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    
    
    public void addOptions(OptionsView o_view)
    {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
    
    public void addSplash(NavView n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addInstruction(InstructionView i_view)
    {
        this.i_view = i_view;
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addCredit(CreditView c_view)
    {
        this.c_view = c_view;
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addStart(GameView g_view) {
        this.g_view = g_view;
        add(g_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeOptions()
    {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeInstruction()
    {
        if (this.i_view != null)
            remove(this.i_view);
    }
    
    public void removeCredit()
    {
        if (this.c_view != null)
            remove(this.c_view);
    }
    
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }    
    
    public void removeSplash()
    {
        remove(splash);
    }
    
    public void removeGame() {
        if (this.g_view != null) {
            remove(this.g_view);
        }
    }
            
}
