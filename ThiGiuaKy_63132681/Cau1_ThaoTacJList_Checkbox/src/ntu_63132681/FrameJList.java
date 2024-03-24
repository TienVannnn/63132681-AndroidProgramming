package ntu_63132681;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class FrameJList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameJList frame = new FrameJList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameJList() {
		setTitle("Thao tác");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 748, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Thao tác trên JList - Checkbox");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(60, 196, 73), 2, true), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahomo", Font.BOLD, 15), new Color(0, 0, 0)));
		panel_3.setBounds(0, 49, 279, 362);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Tô đen số chẵn");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(10, 28, 247, 38);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tô đen số lẻ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 74, 247, 38);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tô đen số nguyên tố");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(10, 122, 247, 38);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Bỏ tô đen");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(10, 170, 247, 38);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Xóa giá trị tô đen");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(10, 218, 247, 38);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Tổng giá trị trong list");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(10, 266, 247, 38);
		panel_3.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 314, 247, 38);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(128, 0, 0), 2, true), "Nh\u1EADp th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahomo", Font.BOLD, 15), new Color(0, 0, 0)));
		panel_4.setBounds(278, 49, 470, 362);
		panel_4.setLayout(null);
		panel.add(panel_4);
		
		JButton btnNewButton_7 = new JButton("Thêm");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_7.setBounds(26, 36, 114, 41);
		panel_4.add(btnNewButton_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(156, 43, 102, 28);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cho nhập số âm");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(282, 46, 168, 21);
		panel_4.add(chckbxNewCheckBox);
		
		JList list = new JList();
		list.setBounds(10, 87, 450, 265);
		panel_4.add(list);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_2.setBounds(0, 415, 748, 67);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Đóng chương trình");
		btnNewButton_6.setBounds(239, 10, 267, 39);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel_2.add(btnNewButton_6);
	}
}
