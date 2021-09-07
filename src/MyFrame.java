import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame{
    Calendar calendar;
    SimpleDateFormat twentyFourTimeFormat;
    SimpleDateFormat twentyFourDateFormat;
    JLabel twentyFourTimeLabel;
    JLabel twentyFourDateLabel;
    String twentyFourTime;
    String twentyFourDate;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("simpleClock");
        this.setLayout(new FlowLayout());
        this.setSize(200, 100);
        this.setResizable(false);

        twentyFourTimeFormat = new SimpleDateFormat("HH:mm:ss z");
        twentyFourDateFormat = new SimpleDateFormat("MMMMM dd yyyy");
        twentyFourTimeLabel = new JLabel();
        twentyFourTimeLabel.setFont(new Font("Monospaced",Font.BOLD, 20));
        twentyFourTime = twentyFourTimeFormat.format(Calendar.getInstance().getTime());
        twentyFourTimeLabel.setText(twentyFourTime);
        twentyFourDateLabel = new JLabel();
        twentyFourDateLabel.setFont(new Font("Monospaced",Font.BOLD, 15));

        this.add(twentyFourDateLabel);
        this.add(twentyFourTimeLabel);
        this.setVisible(true);

        set24Time();

    }

    public void set24Time() {
        while(true) {
            twentyFourTime = twentyFourTimeFormat.format(Calendar.getInstance().getTime());
            twentyFourTimeLabel.setText(twentyFourTime);
            twentyFourDate = twentyFourDateFormat.format(Calendar.getInstance().getTime());
            twentyFourDateLabel.setText(twentyFourDate);

            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
