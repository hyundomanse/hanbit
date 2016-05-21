package lotto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LotteryUI extends JFrame implements ActionListener {
	Lottery lottery;
	JButton btn;
	JPanel panNorth, panSouth;
	ImageIcon icon;
	List<JButton> btns; // List가 인터페이스이다. 꺽쇠 안에 들어가는 것을 제네릭이라고 한다.(인터페이스의 타입을 정의)

	public LotteryUI() {
		lottery = new Lottery();
		btn = new JButton("로또번호추첨");
		panNorth = new JPanel();
		panSouth = new JPanel();
		btns = new ArrayList<JButton>(); // ArrayList의 List는 implements한것.
		btn.addActionListener(this);  
		panNorth.add(btn);
		this.add(panNorth,BorderLayout.NORTH);
		this.add(panSouth,BorderLayout.SOUTH);
		this.setBounds(300, 400, 1200, 300);
		// 300, 400 은 x, y 좌표값
		// 1200, 300 은 픽셀크기
		this.setVisible(true); // 화면에 보여줘라      29~34줄의 this.은 생략가능
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 기능
		if (btns.size() == 0) {
			JButton btn = null;
			for (int i = 0; i < 6; i++) {
				btn = new JButton();
				btns.add(btn);
				panSouth.add(btn);
		}
		
		}
		int[] lotto = lottery.getLotto();
		for (int i = 0; i < lotto.length; i++) {
		System.out.print(lotto[i]+"\t");
		btns.get(i).setIcon(this.getIcon(lotto[i]));
		}
	}
	private Icon getIcon(int i){
		String img = "src/img/"+Integer.toString(i)+".gif";
		ImageIcon icon = new ImageIcon(img);
		return icon;
		
	}
	
	
}
